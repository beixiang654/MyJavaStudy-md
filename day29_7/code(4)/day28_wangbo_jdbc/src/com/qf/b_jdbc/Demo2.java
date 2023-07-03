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
