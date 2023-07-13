package com.qf.utils;

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
