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
