### 回顾

```
1.联表查询
	多个表，表与表之间是有约束关系的
	select * from 表1,表2  where  约束的条件
2.内连接查询
	select* from  表1 inner join  表2 on 约束的条件
3.一对一，一对多的查询  场景
4.多对多查询
	建一个中间表  场景必须要记住
5.扩展   四张表联查
6.视图不用看
7.可视化工具 SQLyog 以后天天用  工具

```

### 今天的内容

> JDBC

### 1.JDBC概述

> Java  Database  connectivity
> JDBC（Java 数据库连接）是 Java 语言中用来连接和操作关系型数据库的 API。使用 JDBC，我们可以通过编写 Java 代码来访问各种数据库，包括 MySQL、Oracle、SQL Server 等。
>
> 总结:  使用java代码去连接咱们的数据库
>
> 之前是使用小黑屏或者可视化工具，连接 数据库，创建库，创建表，插入数据等
>
> 从今天开始咱们要学习java代码连接数据库，并对数据库里面的数据进行增删改查。
>
> JDBC一个规范：
>
> ​		sun公司指定通过java代码去连接数据库的，要求数据库厂商解决连接问题
>
> JDK:
>
> ​		java.sql.*
>
> ​		javax.sql.*
>
> jdk提供 了很多的类库让咱们操作数据库
>
> 但是现在有一个很尴尬的事情，java是java  ，mysql是mysql 两个不同的厂商
>
> java要求mysql厂商你必须给我解决先连上数据库的操作，连上之后才能去操作你数句库
>
> 就好比 电脑 和移动硬盘一样  移动硬盘需要在电脑上面安装一个驱动才能读和写
>
> 如果想要连接数据库，必须让mysql数据厂商给我java提供驱动才能连上，所以咱们使用第三方的
>
> jar包，jdk还行吗?jdk是不行的，jdk只负责增删改查的操作，不负责连上数据库
>
> 第三方jar包必须得用：
>
> ​		mysql-connector-java.jar
>
> ​		如何下载第三方jar包：
>
> ​			1.百度搜一个一个网址  http://mvnrepository.com
>
> ​			2.在搜索框中搜mysql
>
> ​			3.点击一个版本去下载files里面jar包

### 2.连接数据库服务器需要哪些参数

> mysql -hlocalhost  -uroot -p123456
>
> 1.需要知道连接哪一款数据库  mysql
>
> 2.数据库的服务器的地址 localhost  本机地址
>
> 3.数据库用户名  root
>
> 4.数据库的密码  123456

### 3.借助于JDBC连接数据库的入门案例

> 在当前工程中导入第三方的jar包
>
> ​	1.在src的下面新建 一个lib文件夹
>
>  ​	2.将下载好的额那个jar包黏贴到lib文件夹下面
>
> ​	3.点上这个jar包，右键   add as Library这个按钮即可

API

```


public class DriverManager
extends Object
管理一套JDBC drivers.
注：的DataSource接口的基本服务，新的JDBC 2 API，提供了另一种方式来连接数据源。一个DataSource使用对象是连接到数据源的首选手段。

作为其初始化部分的DriverManager班将尝试加载驱动程序类的“JDBC驱动系统属性引用的。”。这允许用户定制他们的应用程序使用JDBC驱动程序。例如，在你的~ /。①/属性文件可以指定：

jdbc.drivers=foo.bah.Driver:wombat.sql.Driver:bad.taste.ourDriver
的DriverManager方法getConnection和getDrivers已得到增强，支持java标准版Service Provider机制。JDBC 4驱动程序必须包含文件META-INF/services/java.sql.Driver。这个文件包含JDBC驱动程序实现java.sql.Driver名称。例如，加载my.sql.Driver类的META-INF/services/java.sql.Driver文件将包含的条目：

my.sql.Driver
应用程序不再需要显式加载JDBC驱动程序使用Class.forName()。现有的程序目前加载JDBC驱动程序使用Class.forName()将继续工作，无需修改。

当方法getConnection称，该DriverManager将试图找到一个合适的驱动程序从那些装在初始化和那些显式使用同一个类装载器当前的applet或应用程序加载。

从java 2 SDK，标准版，1.3版，一个记录流可以设置只有在适当的许可。通常这将做工具的政策工具，可以用来给permission java.sql.SQLPermission "setLog"。


```

```
 public static Connection getConnection(String url,
 
  										String user,
                                       String password)
                                throws SQLException
试图建立一个连接到给定的数据库的网址。的 DriverManager试图选择从注册JDBC驱动程序设定一个适当的驱动程序。 
注：如果user或password财产也被指定为url的一部分，它是实现定义为价值优先。为了获得最大的可移植性，应用程序只需要指定一次属性。

参数 
url -一种形式 jdbc:subprotocol:subname数据库URL 
user -数据库用户的连接是其代表 
password -用户的密码 
结果 
连接到网址 
异常 
SQLException -如果一个数据库访问错误或URL是 null 
SQLTimeoutException -当司机已确定由 setLoginTimeout方法指定超时值已经超过，至少试图取消当前的数据库连接的尝试 

```



```java
package com.qf.a_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载mysql驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.准备一个url。
        String url = "jdbc:mysql://localhost:3306/java2309?useSSL=false";
        //3.准备用户名和，密码
        String user = "root";
        String password = "123456";
        //4.获取驱动管理器类去获取连接数据库的的对象
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);
        //connection是一个特定数据库的连接（会话）。SQL语句的执行结果是在一个连接上下文返回。
        //    throws SQLException
        //此次发布的 Connection对象的数据库和JDBC资源，而不是等待他们自动的立即释放。
        //在Connection对象已关闭调用方法close
        //
        //这是强烈推荐，应用显式提交或回滚活动事务close方法之前调用。如果close方法被调用，有一个活跃的交易，结果是实现定义。
        //5.关闭资源
        connection.close();
    }
}

```

### 4.JDBC的增删改查

> 数据库我已经连接上了，接下来开始对当前数据库下面的表里面的数据进行增删改查了

#### 4.1添加数据的案例

```java
package com.qf.b_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//添加数据到数据库
public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.准备url 和 user 和 password
        //url  连接本机的mysql服务器下面对额一个数据库
        String url = "jdbc:mysql://localhost:3306/java2309?useSSL=false";
        String user = "root";
        String password = "123456";
        //3.使用驱动管理器类    去获取连接数据库的对象
        //public static Connection getConnection(String url,
        //                                       String user,
        //                                       String password)
        //                                throws SQLException
        Connection connection = DriverManager.getConnection(url, user, password);
        //4.createStatement()
        //创建用于向数据库发送SQL语句的一 Statement对象。
        Statement statement = connection.createStatement();
        //5.Statement  SQL搬运工对象  该对象用于执行静态SQL语句并返回它产生的结果。
        //int executeUpdate(String sql)
        //           throws SQLException
        //执行给定的SQL语句，这可能是一个 INSERT， UPDATE，或 DELETE语句或SQL语句不返回值，例如SQL DDL语句。
        //注：this方法不能被称为一个PreparedStatement或CallableStatement。
        //
        //参数
        //sql -一个SQL数据操作语言（DML）语句，如 INSERT， UPDATE或 DELETE；或一个SQL语句没有返回，如DDL语句。
        //结果
        //或者（1）对于SQL数据操作语言（DML）语句行数或（2）0，不返回SQL语句
        //异常
        //SQLException -如果一个数据库访问错误发生时，这种方法被称为在一个封闭的 Statement，给定的SQL语句产生一个 ResultSet对象，调用此方法是在 PreparedStatement或 CallableStatement
        //SQLTimeoutException -当司机决定了超时值，是由 setQueryTimeout法规定已经超过，至少试图取消当前正在运行的 Statement
        String sql = "insert into work (name, age, info) values ('狗蛋', 23, '嘻嘻')";
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        //6.关闭资源
        statement.close();
        connection.close();


    }
}

```

#### 4.2删除数据

```java
package com.qf.b_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        //2.准备连接数据库相关的信息
        String url = "jdbc:mysql://localhost:3306/java2309?useSSL=false";
        String user = "root";
        String password = "123456";
        //3.使用DriverManager获取连接数据库对象
        Connection connection = DriverManager.getConnection(url, user, password);
        //4.使用connection对象 获取搬运工（Statement）对象
        //statement:  这个对象  执行sql语句
        Statement statement = connection.createStatement();
        //5.准备一个sql语句
        String sql = "delete from work  where id = 2";
        //String sql = "update work set name='嘻嘻', age = 2 where id = 3";
        //6.执行sql语句
        int i = statement.executeUpdate(sql);//返回值是受影响的行数
        System.out.println(i);
        //7.关闭资源
        statement.close();
        connection.close();



    }
}

```







#### 4.3修改数据

```java
package com.qfedu.b_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 修改一条数据
 */
public class Demo5 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.准备url 用户名  密码
        String url = "jdbc:mysql://localhost:3306/java2204?useSSL=false";
        String user = "root";
        String password = "123456";
        //3.通过DriverManaer获取连接对象
        Connection connection = DriverManager.getConnection(url, user, password);
        //4.通过connection对象获取SQL的搬运工对象  statement
        Statement statement = connection.createStatement();
        //5.使用statement搬运工兑现去执行SQL语句
        //写一个SQL语句  修改的SQL语句
        String sql = "update work set name='小骚磊', age = 78, info = '骚气稍微差那么一点' where id = 2";
        int i = statement.executeUpdate(sql);//返回值是受影响的行数
        System.out.println(i);
        //6.关闭资源
        statement.close();
        connection.close();


    }
}

```

#### 4.4查询数据

```java
package com.qf.b_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        //查询所有的数据
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.准备链接数据库的参数
        String url = "jdbc:mysql://localhost:3306/java2309?useSSL=false";
        String user = "root";
        String password = "123456";
        //3.获取连接对象
        Connection connection = DriverManager.getConnection(url, user, password);
        //4.通过connection对象 获取搬运工对象
        Statement statement = connection.createStatement();
        //5.准备sql语句
        String sql = "select * from work";
        //6.搬运工对象执行查询的sql语句
        //                throws SQLException
        //执行给定的SQL语句，返回一个 ResultSet对象。     结果集
        //注：this方法不能被称为一个PreparedStatement或CallableStatement。
        //
        //参数
        //sql -一个SQL语句发送到数据库的SQL语句，通常是一个静态的 SELECT
        //结果
        //一个 ResultSet对象包含在给定的查询产生的数据；（其实就是数据库中的数据）不 null
        ResultSet resultSet = statement.executeQuery(sql);
        System.out.println(resultSet);
        //表示数据库结果集的数据表，它通常是通过执行查询数据库的语句生成的。
        //一个ResultSet对象维护一个指针指向其当前行的数据。
        // 最初光标位于第一行之前的位置。
        // 它的next方法移动光标到下一行，
        // 因为它返回false当有在ResultSet对象没有更多的行，它
        // 可以用在while循环遍历结果集。
        /**
         * resultSet对象
         * id  name   age info           《-----
         * 3	嘻嘻	 12	是你还是等你
         * 4	老邢 	89	吃的那么借记卡
         * 5	骚磊	 82	撒娇就睡觉   《-----
         */
        while(resultSet.next()) {
            //通过字段获取行数据！！！
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("name"));
            System.out.println(resultSet.getInt("age"));
            System.out.println(resultSet.getString("info"));
            System.out.println("====");
        }
        //关闭资源
        resultSet.close();
        statement.close();
        connection.close();



    }
}

```

回顾

```
1.需要加载驱动
	Class.forName("com.mysql.jdbc.Driver");
	底层静态代码块
		DriverManager.registerDriver(new Driver());  注册驱动
2.准备链接数据库一下信息
	url =====》统一资源定位符   通过 url找到一个资源 jdbc:mysql://localhost:3306/java2309
	user====>root    数据库服务器账号名字
	password=====》123456 数据库服务器的密码
3.获取连接数据库的对象
	Connection connection = DriverManager.getConnection(url, user, password);
4.获取搬运工sql语句
	Statement statement = connection.createStatement();
5.准备sql语句
	String sql = "delete from work where id = 1";
	String sql1 = "select * from work";
6.执行sql语句
	int i = statement.executeUpdate(sql);
	ResultSet resultSet = statement.executeQuery(sql1);
	while (resultSet.next()) {
		//通过字段获取当前的行数据
		int id = resultSet.getInt("id");
		String name = resultSet.getString("name");
		
	}
7.关闭资源
	resultSet.close();
	statement.close();
	connection.close();
	
```







思考一个问题：从数据库取出来的数据就单纯的打印吗？不能打印，要把数据赋值给对象，然后把对象存到list集合中，供别人来使用

> 1.新建一个实体类，以后记住一张表对应着一个实体类，属性名字一定要和数据库里面的字段的名字保持一致！！！

```java
package com.qfedu.b_mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Demo7 {
    public static void main(String[] args) throws Exception{
        //1.加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.准备url 用户名  密码
        String url = "jdbc:mysql://localhost:3306/java2204?useSSL=false";
        String user = "root";
        String password = "123456";
        //3.通过DriverManaer获取连接对象
        Connection connection = DriverManager.getConnection(url, user, password);
        //4.通过connection对象获取SQL的搬运工对象  statement
        Statement statement = connection.createStatement();
        //5.准备SQL语句
        String sql = "select * from work";
        //6.使用statement执行上面的SQL语句
        List<Work> list = new ArrayList<Work>();//空的集合[]
        /*
        * list.add(new WOrk());
        * list.add(new WOrk());
        * list.add(new WOrk());
        * */
        ResultSet resultSet = statement.executeQuery(sql);
        //7.声明一个List集合 存work对象的
        /*
               id   name   age  info   ====》  true
               2    狗蛋     23   后加减爱书=====》true
               3     浩然    78    那就是今年=====》 true
               4    马驰      98   的内存那就买====》 false
               第一次循环：id=2  name=狗蛋  age=23  info =后加减爱书
                    Work work = new Work(2, 狗蛋, 23, 后加减爱书);
                    list.add(work)[对象1]
                第二次循环:id=3  name=浩然  age=78  info =那就是今年
                    Work work = new Work(3, 浩然, 78, 那就是今年);
                    list.add(work)[对象1, 对象2]
                第三次循环:id=4  name=马驰  age=98  info =的内存那就买
                    Work work = new Work(4, 马驰 ， 98, 的内存那就买);
                    list.add(work)[对象1, 对象2， 对象3]
         */
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String info = resultSet.getString("info");
            Work work = new Work(id, name, age, info);
           // System.out.println(work);
            list.add(work);
        }
        System.out.println(list);
    }
}

```

### 5.扩展

> 没有main主函数嫩运行代码吗？能！！！
>
> @Test
>
> 需要导入第三方的jar  Junit5.8.1  alt+enter  add  Junit5.8.1jar

```java 
package com.qfedu.b_mysql;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo9 {

    @Test
    public void testAdd() throws  Exception{
        Class.forName("com.mysql.jdbc.Driver");
        //已经选中库了  java2204这个库
        String url = "jdbc:mysql://localhost:3306/java2204?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        //与特定数据库的连接（会话对象。 目的执行SQL语句并在连接的上下文中返回结果。
        //执行一个添加数据的SQL语句
//        Statement createStatement()
//        创建一个 Statement对象，用于将SQL语句发送到数据库
        //  1.获取statement对象  是SQL语句的搬运工对象 将SQL语句发送到数据库进行执行
        Statement statement = connection.createStatement();//
        //2.执行SQL语句  参数是SQL于
        /*int executeUpdate(String sql)
        执行给定的SQL语句，这可能是 INSERT ， UPDATE ，或 DELETE语句，
        返回值是一个受影响行数
         */
        //在写SQL语句的时候 一定要保证有这个表 现在有work这个表吗？ 没有 要自己手动建
        int i = statement.executeUpdate("insert into work(name, age, info) values ('老邢', 78, '行走的猪肉')");
        System.out.println(i);
        //3.需要手动关闭一些资源
        statement.close();
        connection.close();
    }
    @Test
    public void testDelete() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java2204?useSSL=false&serverTimezone=Asia/Shanghai";
        Connection connection = DriverManager.getConnection(url, "root", "123456");
        //获取搬运工对象
        Statement statement = connection.createStatement();
        //使用搬运工对象执行SQL语句
        int i = statement.executeUpdate("delete from work where id = 5");
        System.out.println(i);
        statement.close();
        connection.close();
    }
}
```

### 6.封装

```Java
package com.qf.e_jdbc;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import java.sql.*;

/**
 * 1.获取connection对象
 * 2.关闭资源
 */
public class JdbcUtil {
    private static String url = "jdbc:mysql://localhost:3306/java2309?useSSL=false";
    private static String user = "root";
    private static String password = "123456";

    //1.只要这个JdbcUtil类加载，下面static静态代码块中的代码一定执行
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //获取connection对象的方法
    public static Connection getConnection () {
        Connection connection = null;
        try {
           connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //封装close方法
    //resultSet.close();
    //statment.close();
    //connection.close();
    public static void close (Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close (Statement statement, Connection connection) {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void close (ResultSet resultSet, Statement statement, Connection connection) {
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

```

咱们现在封装的JdbcUtils类不太好！！！ 封装的目的是不能再动代码了。但是你看上面的代码

> 1.在src下面新建一个db.properties文件
>
> 2.在配置文件中，写一个信息  driver  url   user  password
>
> ​		想一下 信息写成啥类型的合适
>
> ```properties
> driver=com.mysql.jdbc.Driver
> url=jdbc:mysql://localhost:3306/java2309?useSSL=false
> user=root
> password=123456
> ```
>
> 

```Java
package com.qf.f_jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class JdbcUtil {
    private static String driver = null;
    private static String url = null;
    private static String user = null;
    private static String password = null;
    //只要类一加载就立马执行静态代码块
    static {
        //去加载db.properties,从db.properties 读取想要的信息
        //1.用Properties这个类来读
        Properties properties = new Properties();
        try {
            //Properties可以保存到流或流中加载。属性列表中的每个键和它的相应值是一个字符串
            properties.load(new FileInputStream("src/db.properties"));
            //properties对象 里面存到db.properties中的所有的值
            //2.从properties对象 获取db.properties中的所有的值
            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            Class.forName(driver);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    //获取connection对象的方法
    public static Connection getConnection () {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    //封装close方法
    //resultSet.close();
    //statment.close();
    //connection.close();
    public static void close (Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void close (Statement statement, Connection connection) {
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void close (ResultSet resultSet, Statement statement, Connection connection) {
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

```

