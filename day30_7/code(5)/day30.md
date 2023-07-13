### 回顾

```java
1.JDBC
    Java DataBase Connectivity  使用Java代码连接数据库并对数据库的数据进行操作（增删改查）
    
2.连接数据库
    1.加载驱动
    	Class.forName("com.mysql.jdbc.Driver");//Driver这个类不是JDK给提供了，mysql提供的
		需要导入mysql的jar 包   下载一个在mvnrepository.com   搜索mysql 导入到项目中
            在src文件夹下面建一个lib文件夹，赋值jar，然后右键  add  as Libary...
    2.准备链接数据库的信息
      url : jdbc:mysql://localhost:3306/java2309?useSSL=false
			jdbc:mysql://localhost:3306/java2309?serverTimeZone=UTC
      user:root
      password
     3.获取连接数据库的对象
         Connection conection = DriverManager.getConnection(url, user, password);
      4.获取搬运工对象
          Statement statement = connection.createStatement();
    5.拿搬运工执行sql语句
        int i = statement.executeUpdate("增删改sql");
		 ResultSet resultSet  = statement.executeQuery("查sql");
		while (resultSet.next()) {
            //get方法 通过字段作为参数获取字段下面数据
        }
3.JdbcUtil这个类
    1.在src创建 db.properties文件
    2.在JdbcUtil这个类使用Properties这个类读取配置文件中 连接数据库的信息  在静态代码块中读取
    3.Connection getConnection方法
    4.close()方法
```

### 今天的内容

> 1.预处理搬运工对对象
>
> 2.SQL注入【了解】
>
> 3.JavaBean规范和Beautils这个类
>
> 4.元数据【重点】
>
> 5.封装增删改查



### 1.预处理的搬运工对象

> 昨天学的搬运工对象  statement  主要是发送SQL语句到数据库进行执行的
>
> 今天咱们学一个预处理搬运工对象，都是搬运工 都是执行SQL语句的
>
> 把搬运工对象忘掉，从今天开始使用预处理的搬运工对象

```
PreparedStatement prepareStatement(String sql)
                            throws SQLException
  创建一个PreparedStatement对象，用于将参数化的SQL语句发送到数据库。 
具有或不具有IN参数的SQL语句可以预编译并存储在PreparedStatement对象中。 然后可以使用该对象多次有效地执行此语句。 

注意：此方法针对从预编译中受益的参数化SQL语句进行了优化。 如果驱动程序支持预编译，则方法prepareStatement将将该语句发送到数据库进行预编译。 有些驱动程序可能不支持预编译。 在这种情况下，在执行PreparedStatement对象之前，该语句可能不会发送到数据库。 这对用户没有直接影响; 然而，它确实影响了哪些方法抛出某些SQLException对象。 

使用返回的PreparedStatement对象创建的结果集将默认为TYPE_FORWARD_ONLY类型，并发级别为CONCUR_READ_ONLY 。 创建的结果集的可保持性可以通过调用getHoldability()来确定 。 

参数 
sql - 可能包含一个或多个“？”的SQL语句  参数化的SQL语句
结果 
一个新的默认的 PreparedStatement对象包含预编译的SQL语句 
异常 
SQLException - 如果发生数据库访问错误或在闭合连接上调用此







void setObject(int parameterIndex,
               Object x)
        throws SQLException使用给定对象设置指定参数的值。 

JDBC规范规定了从Java Object类型到SQL类型的标准映射。 在发送给数据库之前，给定的参数将被转换为相应的SQL类型。 

请注意，此方法可能通过使用特定于驱动程序的Java类型来传递特定于数据库的抽象数据类型。 如果对象是实现接口的类的SQLData ，JDBC驱动程序应该调用方法SQLData.writeSQL将它写入SQL数据流中。 如果，在另一方面，对象是实现一类Ref ， Blob ， Clob ， NClob ， Struct ， java.net.URL ， RowId ， SQLXML或Array ，则驱动程序应当将它传递给数据库作为相应SQL类型的值。 

注意：并非所有数据库都允许将非类型的Null发送到后端。 为了最大可移植性，应使用setNull或setObject(int parameterIndex, Object x, int sqlType)方法代替setObject(int parameterIndex, Object x) 。 

注意：如果存在歧义，则此方法会引发异常，例如，如果对象是实现多个上述接口的类。 

参数 
parameterIndex - 第一个参数是1，第二个是2，... 
x - 包含输入参数值的对象 
异常 

```

> 参数化的SQL语句：insert into work（name， age, info） values(?, ?, ?)
>
> 静态的SQL语句:insert into work（name， age, info） values("狗蛋",23,"嘻嘻哒")

#### 1.2增加数据

```java
package com.qf.a_preparestatement;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //1.获取connection对象  只不过是封装好的而已
        Connection connection = JdbcUtil.getConnection();

        //2.之前是搬运工对象！！！ 现在换成预处理的搬运工对象
        //Statement statement = connection.createStatement();
        //2.1准备一个参数化的sql语句
        String sql = "insert into work (name, age, info) values(?, ?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.sql语句不完整，只是占位符而已。对sql的?占位 填上具体的值
        //使用preparedStatement 对象的set方法进行对? 进行赋值
        //void setObject(int parameterIndex, Object x) throws SQLException;
        //第一个参数:  就是?的下标
        //parameterIndex – the first parameter is 1, the second is 2, ...
        //第二个参数:   就是对?赋的值
        preparedStatement.setObject(1, "齐齐");
        preparedStatement.setObject(2, 78);
        preparedStatement.setObject(3, "你经常上你那吗");
        //4.sql语句已经准备好了，开始去执行sql语句了
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        //5.关闭资源
       JdbcUtil.close(preparedStatement, connection);


    }
}

```

#### 1.3删除数据



```java
package com.qfedu.b_preparestatemnet;

import com.qfedu.utils.JdbcUtil;

import java.sql.Connection
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 删除数据
 */
public class Demo2 {
    public static void main(String[] args) throws SQLException {
        //1.获取connection对象
        Connection connection = JdbcUtil.getConnection();
        //2.SQL语句  参数化的SQL语句  凡是放真实的值的地方咱们使用?占位来代替即可
        String sql = "delete from work where id = ?";
        //3.获取预处理的搬运工对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //4.对?设置真实的值
        preparedStatement.setObject(1, 6);
        //5.执行SQL语句
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        JdbcUtil.close(connection, preparedStatement);



    }
}

```

#### 1.4修改数据



```java 
package com.qfedu.b_preparestatemnet;

import com.qfedu.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 修改数据
 */
public class Demo3 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "update work set name=?,age=?,info=? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, "全飞");
        preparedStatement.setObject(2, 999);
        preparedStatement.setObject(3,"你就才能读");
        preparedStatement.setObject(4, 7);
        int i = preparedStatement.executeUpdate();
        JdbcUtil.close(connection, preparedStatement);

    }
}
```

#### 1.5查询数据

```java
package com.qf.b_preparestatement;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from work");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Work> list = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String info = resultSet.getString("info");
            Work work = new Work(id, name, age, info);
            list.add(work);
        }
        System.out.println(list);
        JdbcUtil.close(resultSet, preparedStatement, connection);
    }
}

```

```java 
package com.qfedu.b_preparestatemnet;

import com.qfedu.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *查询所有的数据
 */
public class Demo4 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "select * from work where name like ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1,"%飞%");
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            System.out.println(id);
            String name = resultSet.getString("name");
            System.out.println(name);
        }
        JdbcUtil.close(connection, preparedStatement, resultSet);
    }
}

```





### 2.SQL注入【了解】

> 咱们写删除和修改的SQL语句的时候有漏洞的
>
> DELETE FROM person WHERE id = 1 OR 1=1
>
> 别人想搞你的话，只需要在你的SQL语句的条件后面加 or 1=1 条件相当于没写，这叫SQL注入！！！

```java
package com.qfedu.c_zhuurusql;

import com.qfedu.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        //statementTest();
        prepareSatementTest();
    }
    //这个方法想搬运工对象的写法  预防不了SQL注入的  咱们以后不用
    public static void statementTest() throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String id = "1 or 1=1";
        String sql = "delete from person2 where id = " + id;
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate(sql);
        System.out.println(i);//3
        statement.close();
        connection.close();

    }
    //这个方法我想写一个预处理的搬运工的写法  可以防止SQL注入
    public static void prepareSatementTest() throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "delete from work where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        /*
        * 为什么预处理的搬运工对象可以防止SQL注入呢？
        * 因为咱们的SQL是预编译的，语句里面使用占位符?
        * 预编译之后规定了SQL语句的结构了
        * 一个?是一个占位
        * 2  or   1=1
        * */
        preparedStatement.setObject(1, "2 or 1=1");
        int i = preparedStatement.executeUpdate();
        connection.close();
        preparedStatement.close();
    }
}

```

### 3.JavaBean规范和Beautils这个类

#### 3.1JavaBean规范

> JavaBean 就是java的实体类，Work类  Dog  Person
>
> 咱们开发中不能太随意写类，是有一定的规范的
>
> ​	1.私有化成员变量
>
> ​	2.一定要提供一个无参数的构造
>
> ​	3.一定提供变量的setter和getter方法
>
> ​	4.每一个实体类单独成一个文件
>
> 因为咱们以后开发要这样来用，而且可以使用javaBean做一些普适性的操作！！！！

```java
package com.qfedu.entity;

/**
 * JavaBean规范
 */
public class Work {
    //1.私有化成员变量
    private int id;
    private String name;
    private int age;
    private String info;

    //无参数的构造方法默认带的有，但是一旦写上有参构造之后，默认无参构造就没有了


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}

```

#### 3.2BeanUtils类【重点】

> 思路:
>
> 1.导包：  
>
> 2.新建一个类    Person类 满足 JavaBean规范  有三个属性  id  name  age
>
> 3.BeanUtils类方法都是静态的
>
> 4.1. public static void setProperty(Object bean, String name, Object value)
> 给指定对象bean的指定name属性赋值为指定值value。
> //如果指定的属性不存在，则什么也不发生。
>
> 4.2.public static String getProperty(Object bean, String name)
> 获取指定对象bean指定name属性的值。
> //如果指定的属性不存在，则会抛出异常。
> 注意：当属性的类型是数组类型时，获取到的值数组中的第一个值。
> 5.对JavaBean的属性进行赋值和取值



> 在jdk里面找不到这个类，就证明不是jdk提供的，肯定是第三方提供的一个类
>
> 新学一个类，一定要先知道这个类是干嘛的？
>
> 这个类是基于反射的类，是对实体类进行赋值和取值的！！！
>
> 需要导包：
>
> ​		common-beanutils-1.9.3.jar
>
> ​		common-logging-1.2.jar
>
> 、	如果上面两个包还报错  还报某一个类找不到 就去百度  common-collection-版本.jar
>
> Caused by: java.lang.ClassNotFoundException：类找不到异常，大部分原因是包没有导入安全

```java 
package com.qfedu.d_beanutils;

import com.qfedu.entity.Work;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        //对实体类的属性进行赋值和取值
        //咱们使用setter和getter方法进行赋值和取值
        //现在换了一种方式对实体类进行赋值和取值的
        Work work = new Work();

        //对work对象的属性进行赋值
        //对work对象下main的属性 id 进行赋值  1
       BeanUtils.setProperty(work, "id", 1);
       BeanUtils.setProperty(work, "name", "狗蛋");

       //取值 返回值都是string类型的数据
        String id = BeanUtils.getProperty(work, "id");
        String name = BeanUtils.getProperty(work, "name");
        System.out.println(id+ ":" + name);
    }
}

```

回顾

```
1.预处理搬运工对象
	connection.prepareStatement(String sql); sql参数
	增删改查
2.sql注入【了解】
3.JavaBean规范
4.BeanUtils类  
	静态方法:  
	setProperty(Object bean, String name, Object value);  对属性进行赋值
	getProperty(Object bean, String name);
```



### 4.元数据【重点】

> 参数元数据【重点】和sql的参数有关
>
> 
>
> 结果集元数据【重点】和resulsetSet有关

#### 4.1参数元数据

> 获取预处理搬运工对象的时候，处理SQL语句，参数化的SQL语句  处理那个?的

```java 
package com.qfedu.e_metadat;

import com.qfedu.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 必用  参数元数据
 * update work set name=?,age=?,info=? where id = ?
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "update work set name=?,age=?,info=? where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        //preparestatement 有一个方法获取参数元数据对象的方法
        //1getParameterMetaData  得到参数的元数据对象
        ParameterMetaData parameterMetaData = preparedStatement.getParameterMetaData();
        //2.用来获取SQL语句参数的个数
        int parameterCount = parameterMetaData.getParameterCount();
        System.out.println(parameterCount);//4
        //获取这个参数的个数有啥用！！！循环给参数？进行赋值
        Object[] objs = {"帅栋", 12, "嘻嘻哒", 2};
        for (int i = 1; i <= parameterCount; i++) {
            /*
            * 循环第一次: 当i=1
            * preparedStatement.setObject(1, objs[0]);
            * preparedStatement.setObject(1, "帅栋");
            * 循环第二次: 当i=2
            * preparedStatement.setObject(2, objs[1]);
            * preparedStatement.setObject(2, 12);
            *   * 循环第三次: 当i=3
             * preparedStatement.setObject(3, objs[2]);
             * preparedStatement.setObject(3, “嘻嘻哒”);
             *   * 循环第四次: 当i=4
             * preparedStatement.setObject(4, objs[3]);
             * preparedStatement.setObject(4, 2);
            * */
            
            preparedStatement.setObject(i, objs[i - 1]);
        }
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        JdbcUtil.close(connection,  preparedStatement);
    }
}
```

#### 4.2结果集元数据

> ResultSetMetaData对象，是专门处理结果集的。和查询有关

```java
package com.qfedu.e_metadat;

import com.qfedu.utils.JdbcUtil;

import java.sql.*;

/**
 * 结果集元数据的
 */
public class Demo2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "select * from work";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        //只能通过resultSet对象获取结果集元数据对象  ResultSetMetaData
        ResultSetMetaData metaData = resultSet.getMetaData();
        //1.获取列（字段）的个数 getColumnCount
        int columnCount = metaData.getColumnCount();
        System.out.println(columnCount);//4个字段
        //2.结果集元数据.getColumnName();  获取列（字段）的名字
//        System.out.println(metaData.getColumnName(1));//id
//        System.out.println(metaData.getColumnName(2));//name
//        System.out.println(metaData.getColumnName(3));//age
//        System.out.println(metaData.getColumnName(4));//info
        //要id  name  age  info 这些字段名字有没有用？ 相当有用！！！因为取数据的时通过自独胆的名字取的

        /*
        * id name  age  info
        * 1  goudan 12  阿萨德
        * 2  嘻嘻   13   现在呢模拟
        * 3   大大   14   爱睡不好
        * while next()  true  外层的第一次循环：  第一行数据
        *       进入到for循环
        *       当i = 1   i <= 4
        *               sout(metaData.getColumnName(1)) id i++
        *       当i=2  i <= 4 
        *                sout(metaData.getColumnName(2)) name i++
        *        当i=3  i <= 4 true
        *               sout(metaData.getColumnName(3)) age i++
        *         i=4   i<=4  true
        *                sout(metaData.getColumnName(4)) info i++
        *           i=5 i<=4 false 内层for循环结束
        * 回到外层的循环 while  next()  true  第二行行
        *    *       进入到for循环
         *       当i = 1   i <= 4
         *               sout(metaData.getColumnName(1)) id i++
         *       当i=2  i <= 4
         *                sout(metaData.getColumnName(2)) name i++
         *        当i=3  i <= 4 true
         *               sout(metaData.getColumnName(3)) age i++
         *         i=4   i<=4  true
         *                sout(metaData.getColumnName(4)) info i++
         *           i=5 i<=4 false 内层for循环结束
        * */
        //while循环控制的是行
        //for循环控制的是列
        while (resultSet.next()) {//控制的是行
            for (int i = 1; i <= columnCount; i++) {//控制的是列
                //System.out.println(metaData.getColumnName(i));
                String columnName = metaData.getColumnName(i);//列的名字
                //通过列（字段）的名字获取数据
                //resultSet.getInt("id")
                //resultSet.getString("name")
                //resultSet.getInt("age")
                //resultSet.getString("info")
                //通过列的名字虎丘所有的数据
                System.out.print(resultSet.getObject(columnName));

            }
            System.out.println();
        }
    }
}

```

```Java
package com.qf.e_metadata;

import com.qf.utils.JdbcUtil;

import java.sql.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from work");
        ResultSet resultSet = preparedStatement.executeQuery();
        //获取ResultMetaData
        ResultSetMetaData metaData = resultSet.getMetaData();
        //ResultSetMetaData 这个对象包含了字段的各种信息
        //getColumnCount  从结果集中获取列的个数
        int columnCount = metaData.getColumnCount();
        System.out.println(columnCount);//4个字段
        while (resultSet.next()) {
            //System.out.println(metaData.getColumnName(1));id//获取第一个字段
//            System.out.println(resultSet.getObject(metaData.getColumnName(1)));
//            //System.out.println(metaData.getColumnName(2));//name
//            System.out.println(resultSet.getObject(metaData.getColumnName(2)));
//            //System.out.println(metaData.getColumnName(3));//age
//            System.out.println(resultSet.getObject(metaData.getColumnName(3)));
//            //System.out.println(metaData.getColumnName(4));//info
//            System.out.println(resultSet.getObject(metaData.getColumnName(4)));
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(resultSet.getObject(metaData.getColumnName(i)));
            }
            System.out.println("=======");
        }
    }
}

```

```Java
package com.qf.e_metadata;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from dept");
        ResultSet resultSet = preparedStatement.executeQuery();
        //获取ResultMetaData  和结果集有管
        /**
         * id deptName
         * 3	教学部
         * 4	品保部
         */
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();//列（字段）的个数
        System.out.println(columnCount);//2
        //Params:
        //column – the first column is 1, the second is 2, ...
        //Returns:
        //column name
        String columnName = metaData.getColumnName(1);//获列（字段）的名字
        System.out.println(columnName);//id
        String columnName1 = metaData.getColumnName(2);//获列（字段）的名字
        System.out.println(columnName1);//deptName
//        String columnName2 = metaData.getColumnName(3);//获列（字段）的名字
//        System.out.println(columnName2);//deptName
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(resultSet.getObject(metaData.getColumnName(i)));
            }

            System.out.println("=====");
        }

    }
}

```



### 5.封装的增删改

```Java
package com.qf.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class BaseDao {

    public int update (String sql, Object[] parametrers)  {
        //1.获取connection对象
        Connection connection = JdbcUtil.getConnection();
        //2.获取预处理的搬运工对象
        PreparedStatement preparedStatement = null;
        try {
           preparedStatement = connection.prepareStatement(sql);
            //3.获取参数元数据 对象 并获取参数？的个数
            int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
            //4.开始赋值 循环赋值。
            if (parametrers != null && parameterCount == parametrers.length) {
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, parametrers[i-1]);
                }
            }
            //5.执行sql语句
            int i = preparedStatement.executeUpdate();
            return i;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.关闭资源
            JdbcUtil.close(preparedStatement, connection);
        }
        return 0;

    }
}

```





今天作业

```
1.参数元数据
2.结果元数据必须搞懂
3.预处理的搬运工对象必须会
4.BeanUtils必须敲这个代码
5.一定要达到不看我的笔记和代码能敲出来就可以了
```

