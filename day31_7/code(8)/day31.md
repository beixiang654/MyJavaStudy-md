### 回顾

```
1.预处理搬运工对象
	PreparedStatment ps = connection.prepareStatement("select * from work where id = ?");
	ps.setObject(1, 1);
	
2.SQL注入
	
3.JavaBean规范
	1.私有化成员变量
	2.无参构造方法
	3.set和get方法
	4.实体类单独成一个文件的
	
4.BeanUtils类
	1.导包
	2.静态方法  setProperty(Object bean, String name, Object value)
	
5.t元数据
	1.参数元数据
		和 SQL的?有关系
		parameterMetaData.getParameterCount();  获取参数的个数的
	2.结果集元数据
		和结果集有关   select id, name from work;  work 表有id name  age  ifno
		metaData.getColumnCount();  获取字段的个数
		metaData.getColumnName();获取结果集字段的名字
		
	
```

### 今天的内容

> 1.封装BaseDao
>
> 2.连接池  德鲁伊druid  阿里在用的
>
> 3.事务的处理

### 1封装BaseDao

> JdbcUtil是干嘛的？
>
> ​	1.连接数据库	
>
> ​	2.关闭资源的
>
> BaseDao是干嘛的？
>
> ​	对数据库里面的数据表有增删改查的操作，现在也对其进行封装，
>
> 因为咱们使用预处理的搬运工的时候，执行sql语句也有重复的额代码，能不能简化的写？能的
>
> 新建工程的时候一定要步骤化才不不会出错：
>
> ​	1.新建一个Java工程
> ​	2.导包 mysql的jar包

```java
package com.qfedu.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * BaseDao这个类只有两个方法
 *  1完成统一的增删改的
 *  2完成统一的查询的
 */
public class BaseDao {

    /**
     * update  完成统一的增删改反复噶
     * @param sql   参数化的SQL语句  String sql = "insert into work (name, age, info) values(?,?,?)";
     * @param parameters   Object[] objs = {"欧丹", 23, "花近几年"};
     * @return  受影响的行数
     */
    public int update (String sql, Object[] parameters) throws SQLException {
        //1.获取连接数据库对象 connection   写增删改的时候得先连上数据库
        Connection connection = JdbcUtil.getConnection();
        //2.获取预处理的吧搬运工的对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.获取参数元数据对象，h获取参数的个数  ?
        //为啥要获取参数的个数？x现在在封装，你得具有普适性，因为我不知道你给我穿过来的
        //SQL到底有几个?的SQL语句
        int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
        //4.循环赋值  对?进行赋值
        //parameters != null 数组中有值，并且 ？的个数刚好和数组长度相等，这个时候我才让你去赋值
        if (parameters != null && parameterCount == parameters.length) {
            for (int i = 1; i <= parameterCount; i++) {
        /*String sql = "insert into work (name, age, info) values(?,?,?)";
            Object[] objs = {"欧丹", 23, "花近几年"};*/
                preparedStatement.setObject(i, parameters[i - 1]);
            }
        }
        //5.预处理搬运工对象 执行SQL语句
        int i = preparedStatement.executeUpdate();
        //6.关闭资源
        JdbcUtil.close(connection, preparedStatement);
        return  i;
    }
    /*
    * 完成统一的查询方法
    *   返回值是啥类型的数据？ 对象集合   List集合对象，关键字现在早知道是哪个对象吗？
    *   不知道哪个对象  一张表对应这一个类，现在知道是哪张表吗？不知道哪个类？使用泛型
    *       List<T>
        参数：
        *   1.sql语句
        *   2.数组 对参数化的SQL语句进行赋值的  ?
        *   3. 咱们需要把查询出来的数据赋值给一个实体类，要做到普适性  只能通过反射去
        *   获取实体类对象然后实例化，然后把数据库里面的全取出来以后赋值给实体类
        *   Class<T>
    *
    * */
    public <T> List<T> query (String sql, Object[] parameters, Class<T> cls) throws SQLException {
        //1.获取数据库连接对象
        Connection connection = JdbcUtil.getConnection();
        //2.获取预处理的搬运工对象
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.去处理SQL语句里面的参数
        int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
        //4.给?进行赋值
        if (parameters != null && parameterCount == parameters.length) {
            for (int i = 1; i <= parameterCount; i++) {
                preparedStatement.setObject(i, parameters[i -1]);
            }
        }
        //5.执行查询的SQL语句,查询结束不了，要将查询出来的数据赋值给对象，把对象存到集合中
        ResultSet resultSet = preparedStatement.executeQuery();

        //6.准备一个List集合
        List<T> ts = new ArrayList<>();
        //7.获取结果集元数据对象 ResultSetMetaData,获取列的个数，列的名字
        ResultSetMetaData metaData = resultSet.getMetaData();
        //8.获取列的个数  
        int columnCount = metaData.getColumnCount();
        //9.遍历结果集数据
        while (resultSet.next()) {//行
            //10.通过第三个参数 Class对象实例化当前对象 Work.class ===> Work work = new Work
            T t = null;
            try {
                t = cls.getConstructor(null).newInstance(null);

            for (int i = 1; i <= columnCount; i++) {//列
                //11.获取列的名字
                String columnName = metaData.getColumnName(i);
                //System.out.println(columnName);
                //12.通过字段获取字段下面的数据
                Object value = resultSet.getObject(columnName);
                //System.out.println(value);
                //13.取出来的数据赋值给一c实体类
                //Work work = new Work();写死了  不具有普适性  高度！！！
                //三个参数  第一个是对哪个对象赋值  第二个参数类的属性名字  第三个参数是从数据库里面获取的值
                //非常巧妙的借助于字段的名字，所以一张表对应一个类，要求类的属性的名字一定要和数据库里面的字段对应好
                BeanUtils.setProperty(t, columnName, value);
            }
            } catch (Exception e) {
                e.printStackTrace();
            }
            //14.将对象存到集合中
            ts.add(t);
        }
        //15.关闭资源
        JdbcUtil.close(connection,  preparedStatement, resultSet);

        return ts.size() != 0 ? ts : null;
    }
}
```

以上的是JDBC最难的了，弄会必须的弄会 二阶段项目得用到！！！

明天上课前回顾BaseDao  串一遍  我到时候再写一遍！！！因为今天晚上要好好弄弄

### 2.JDBC连接池

#### 2.1为什么要使用连接池

> 之前获取connection对象DriverMannager.getConnection()方法获取
>
> 获取完以后要进行close（）  关闭咱们的connection资源
>
> 每一执行业务（增删改查），每次都要去获取连接，然后再关闭，再获取再关闭。
>
> 这样操作的话，数据库服务器的压力会非常大 的
>
> 希望采用回收的方式：
>
> ​			使用连接池的功能。
>
> ​		把connection连接对象放到一个池子中，这池子中有很很多个连接对象
>
> ​		我再用connection的时候，去连接数据库获取连接对象，先不关闭close(),
>
> ​		存到池子中，等下一个业务来的时候，直接从池子中取。不用再重新连接数据库了	

#### 2.2数据库连接池需要考虑哪些问题

> 数据库的连接池是用来管理数据库的连接资源(connection)对象的。
> 数据库连接的参数：
>
> ​	url  use  password
>
> 连接池对于对象的管理：
>
> ​		1.初始化容量
>
> ​		2.最大容量
>
> ​		3.等待时间
>
> 常用连接池有哪些？
>
> ​	1.C3P0   2.DBCP   3.Druid (德鲁伊)

#### 2.3Druid 德鲁伊连接池

> 使用流程
>
> ​	1.导包   druid-1.1.10.jar
>
> ​	2.在src下面书写druid.properties
>
> ​	3.书写连接池核心类

druid.properties文件配置写法 黏贴即可

```properties
driverClassName=com.mysql.jdbc.Driver
url=jdbc:mysql://localhost:3306/java2204?useSSL=false
username=root
password=123456

initialSize=5
maxActive=20
maxWait=2000
```

```java
package com.qfedu.a_druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Properties;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("./src/druid.properties"));
        //druid核心类
        //1.创建一个Druid的数据源对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

       //2.使用datasource对象获取连接对象
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into work (name, age, info) values(?, ?,?)");
        preparedStatement.setObject(1, "阔鑫");
        preparedStatement.setObject(2, 12);
        preparedStatement.setObject(3, "阔鑫xiao");

        int i = preparedStatement.executeUpdate();

        //3.调用close方法会将connection放回连接池
        connection.close();

    }
}

```

大家想一个问题？咱们封装了JdbcUtil这个类，这个类用连接池了没？没有？现在开始换连接池的写法

```java
package com.qfedu.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;

/**
 * JdbcUtil这个类专门处理获取connection对象的还有你关闭资源的
 */
public class JdbcUtil {

    private static DataSource dataSource= null;
    //只要当前类加载，静态代码块一定执行，比对象的创建要早
    static {
        //1.创建Properties对象
        Properties properties = new Properties();

        try {
            //2./src/db.properties  相对路径
            properties.load(new FileInputStream("./src/druid.properties"));
            dataSource =  DruidDataSourceFactory.createDataSource(properties);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //获取connection对象的方法
    public static Connection getConnection () {
        Connection connection = null;
        try {
            //现在在用连接池获取connection对象，都是封装好的
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //封装一个统一的close方法
    //增删改的时候关闭两个connection statement
    //查询的时候关闭资源三个  connection  statement resultSet
    public static void close (Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close(Connection connection, Statement statement) {
        try {
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void close(Connection connection, Statement statement, ResultSet resultSet) {
        try {
            connection.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}

```

### 3.JDBC事务

> 牵涉到数据库表数据，如果在做增删改的时候，数据有可能是不安全的，这个时候可以事务来解决
>
> SQL语句的时候演示过事务的

```java
package com.qfedu.b_transaction;

import com.qfedu.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try{
            //1.获取连接数据库对象
            connection = JdbcUtil.getConnection();
            //1.1关闭自动提交SQL  语句有一个  set autocommit=0
            connection.setAutoCommit(false);
            //2.获取搬运工对象
            Statement statement = connection.createStatement();
            //没吹马驰转给 浩然100块钱
            String sql1 = "update dog set money = money - 100 where id = 1";
            String sql2 = "update dog set money = money + 100 where id = 2";
            //3.执行SQL语句
            int result1 = statement.executeUpdate(sql1);
            //假如在两个执行SQL语句的代码中间出现了异常
            int a = 10  / 0;//这个地方出现异常代码还会继续往下走吗？不会的
            //这样怎么解决？？使用事务来解决
            int result2 = statement.executeUpdate(sql2);
            ////没有异常的话,会提交
            connection.commit();
            if (result1 ==1 && result2 == 1) {
                System.out.println("转账成功");
            } else {
                System.out.println("转账失败");
            }

        } catch (Exception e) {
            //现在是有异常的情况,回滚
            connection.rollback();
        }
        //总结：就是在try里面如果有多个SQL语句执行，一旦出现了一个异常，
        //全部的SQL语句都不会执行了，
    }
}

```

#### 3.1事务的四大特性:ACID

| 事务特性             | 含义                                       |
| ---------------- | ---------------------------------------- |
| 原子性（Atomicity）   | 事务是一个不可分割的工作单位，事务的操作要么同时发生，要么同时不发生       |
| 一致性(Consistancy) | 事务前后的数据的完整性必须是保持一致的                      |
| 隔离性(Isolation)   | 是指多用户并发访问数据库的时候，一个用户不能被其他事务所干扰，不能相互影响    |
| 持久性（Drubility）   | 事务一旦被提交，他对数据库里面的数据改变是永久性，接下来数据库发生了故障，也不会对那你提交的数据有影响！！！ |

作业：

```
1.把今天的BaseDao默写！！
2.连接池  一定要加到咱们的JdbcUtil   

3.自己百度去学一个类ThreadLocal   百度 ThreadLocal详解  看看案例敲一下
#重点 BaseDao
```

