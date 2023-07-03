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
