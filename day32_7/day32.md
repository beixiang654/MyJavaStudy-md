### 今天的内容

> 1.dbutils框架
>
> 2.带着大家整体回顾JDBC
>
> 3.做大量练习   

### 1.DBUtils框架

> DBUtils这个框架是apache组织封装的JDBC开源库，使用这个框架可以对数据库进行CURD（增删改查）
>
> 咱们自己封装了BaseDao的类，也是增删改查的，但是咱们自己封装的没有DBUtils封装好的，
>
> 所以DBUtils可以代替咱们的BaseDao做增删改查
>
> mybatis  Hibernate   mybatis-plus   mybatis-fast  这些框架都是别人封装好的对你数据库增删改查  的框架！！！
>
> 唯一的缺点：停更了不维护了，开发人员不用他了
>
> 底层代码是个啥？咱们要看看的
>
> JdbcUtil + BaseDao  可以对数据增删改查
>
> JdbcUtil + DbUtils  可以对数据增删改查

> 1.新建工程
>
> 2.在src下面新建一个lib  导入一个包  mysql架包
>
> 3.在src下面复制一个druid.properties文件  配置文件
>
> 4.在utils文件夹下面复制黏贴JdbcUtil类顺便导入一个Druid架包
>
> 5.导入dbUtils这个jar包

```java
package com.qfedu.a_mysql;

import com.qfedu.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.BeanMapHandler;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Demo1 {
    @Test
    public void testADd() throws SQLException {
        //1.获取connection对象
        Connection connection = JdbcUtil.getConnection();
        //2.实例化DBUtils的核心类 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //3.调用增删改的方法
        //不是预处理的写法，预处理的话得是参数的化的SQL语句
        int i = queryRunner.update(connection, "insert into work(name, age, info) values('老邢', 56, '那就行那就是今年')");
        System.out.println(i);

    }
    @Test
    public void testAdd1() throws SQLException {
        //1.获取connection对象
        Connection connection = JdbcUtil.getConnection();
        //2.实例化DBUtils的核心类 QueryRunner
        QueryRunner queryRunner = new QueryRunner();

        //3.调用增删改的方法
        //是预处理的写法，预处理的话得是参数的化的SQL语句
        // Object... params  多个参数
        //int	update(Connection conn, String sql, Object... params)
        String sql = "insert into work(name, age, info) values(?, ?, ?)";
        int update = queryRunner.update(connection, sql, "骚磊", 45, "哈");
        System.out.println(update);

    }
    //查询
    //查询一条数据
    @Test
    public void testSelectOne () throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from work where id = ?";
        /*<T> T	query(Cnnection connection,String sql, Object param, ResultSetHandler<T> rsh)*/
        Work work = queryRunner.query(connection, sql, 14, new ResultSetHandler<Work>() {
           Work work = null;
            @Override
            public Work handle(ResultSet resultSet) throws SQLException {
                if (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    int age = resultSet.getInt("age");
                    String info = resultSet.getString("info");
                    work = new Work();
                    work.setId(id);
                    work.setName(name);
                    work.setAge(age);
                    work.setInfo(info);

                }
                return work;
            }
        });
        System.out.println(work);
    }
    //以上查询方式相当麻烦
    //一个简单的写法
    @Test
    public void testSeelctOne1 () throws SQLException {
        Connection connection = JdbcUtil.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from work where id = ?";
        Object[] objs = {14};
        Work query = queryRunner.query(connection, sql, objs, new BeanHandler<Work>(Work.class));
        System.out.println(query);
    }

    //查询多条数据   返回值List集合的 咱们封装的BaseDao就是返回的list集合
    @Test
    public void testSeelctAll() throws SQLException {
        Connection connection = JdbcUtil.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from work ";
        List<Work> query = queryRunner.query(connection, sql, new BeanListHandler<Work>(Work.class));
        System.out.println(query);
    }
    @Test//返回值是一个map集合的
    public void testSeelctMapAll() throws SQLException {
        Connection connection = JdbcUtil.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from work ";
        //id"  会将id的值作为map集合中的键  2=》work
        Map<Integer, Work> map = queryRunner.query(connection, sql, new BeanMapHandler<Integer, Work>(Work.class, "id"));
        System.out.println(map);

        //keySet()   values()     entrySet()
    }
    //返回的是一个数组集合  才不用的
    @Test
    public void testSelelctAll() throws SQLException {
        Connection connection = JdbcUtil.getConnection();

        QueryRunner queryRunner = new QueryRunner();
        String sql = "select * from work ";
        List<Object[]> query = queryRunner.query(connection, sql, new ArrayListHandler());
        for (Object[] objects : query) {
            System.out.println(Arrays.toString(objects));
        }
    }


}

```

总结：查询的时候，只要返回值是List集合的！！！



### 2.回顾JDBC

#### 2.1JDBC前置知识点

```
1.如何操作数据库
	使用可视化工具或者小黑屏访问数据库，需要手动建立连接，输入用户名和密码，编写SQL语句，点击执行查看执行的结果（结果集或者受影响的行数）
2.什么是JDBC
	JavaDatabase connectivity  使用java代码连接数据库的进行对数据库数据进行增删改查的
3.JDBC核心
	1.由数据库厂商提供驱动连接数据
		mysql-connector-java-5.1.x,jar  适用于数据库服务器的版本  5.x
		mysql-connector-java-8.0.x,jar  适用于数据库服务器的版本  8.x
	2.JDBC的核心类和接口
		java.sql.DriverManager 管理数据库驱动的类
		java.sql.Connection   代表数据库连接对象的，如果是个null 就证明没有练级恩上数据库
		java.sql.Statement   发送SQL语句到数据库一个工具（搬运工）
		java.sql.ResultSet    保存SQL语句查询数据库数据的一个接口
		java.sql.SQLException 处理SQL异常 的一个类
	3.关于JDBC环境搭建
		1.新建项目
		2.在src下创建 一个lib文件夹
		3.将mysql驱动文件mysql-cnnector-java-5.1.47.jar复制到项目中的lib文件夹中
		4.选中lib文件夹右键  add as library
		
4.JDBC开发步骤
	1.注册驱动
		Class.forName("com.mysql.jdbc.Driver");
	2.连接数据库获取连接对象
		1.准备url  jdbc:mysql://localhost:3306/库名
		2.准备用户名  root
		3.密码   123456
		通过DriverManager.getConnection(url, user, password);
	3.获取发送SQL的搬运工对象
    	connection.createStatement()
    4.执行SQL语句
    	DML:数据操作语言  增删改  ===》返回值是int  受影响的行数
    	DQL数据查询语言   查===》返回值的是一个ResultSet对象
    5.处理执行完SQL结果 ResultSet
    	1.受影响的行数
    	2.查询的结果集
    		迭代 依次获取获取数据 
    			resultSet.next();数据行指针在第一行前面
    			resultSet.getXXX(字段名字);根据列明获取咱们的数据
    6.释放资源
    	遵循先开后关的原则
5.SQL注入
	当用户在书写SQL语句时候，删和改的时候，写了一个条件写了or  1=1
	结果不是咱们想要的额，这种就是SQL注入
	如何预防SQL注入：
		使用预处理的搬运工对象
			prepareStatement:可以预编译，效率高，防止SQL注入
6.封装的思想【重点】
	当咱们发现咱们在写获取连接对象的时候，和数据库里面增删改查的的时候，发现有重复又的代码
	在实际开发中可以通过调用工具了来实现功能并减少冗余的代码。实现类具有重复利用的价值
	
	所以我封装了一个JdbcUtil这个类：
		1.获取Connection对象的
		2.关闭资源的
		
	封装了BaseDao:
		1.增删改的方法
		2.查询的方法
7.连接池
	JDBC每次连接连接数据库的时候，获取连接对象，每次创建一个连接对象的时候都是一个较大的资源
	会极大的浪费资源，容易内存溢出。这个时候连接池出现了
	Druid（德鲁伊）
		好处：
			1.亚秒级的查询
			2.实时数据的注入
			3.可扩展内存
			4.多环境部署
			5.有丰富的社区
	1.src下面书写druid.properties
	2.导包 druid.jar
	3.核心类：  DruidDataSourceFactory.createDataSource();

8.事务的处理
	1.开启事务（关闭自动提交）
	2.事务的提交方式
		1.提交
		2.回滚
9.Aapache组织一个框架DBUtils
	也是做增删改查的，咱们不用，因为这个组织不维护他了
	
	学习其他增删改查的框架  CURD
	mybatis   hibernate  mybatis-plus
	
```

1.创建表

```mysql
REATE TABLE `student` (
   `id` int(11) NOT NULL AUTO_INCREMENT,
   `name` varchar(32) DEFAULT NULL,
   `age` int(11) DEFAULT NULL,
   `gender` tinyint(1) DEFAULT NULL,
   `score` float(5,2) DEFAULT NULL,
   `adress` text,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8
```

2.创建数据 表对应的实体类

```JAVA 
package com.qfedu.entity;

public class Student {
    private int id;
    private String name;
    private int age;
    private int gender;
    private float score;
    private String adress;

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

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

```



