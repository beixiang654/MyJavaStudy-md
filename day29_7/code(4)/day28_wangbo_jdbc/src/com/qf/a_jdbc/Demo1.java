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
