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
