package com.qf.c_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/java2309?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from work");
        List<Work> workList = new ArrayList<>();
        while (resultSet.next()) {
            //通过字段获取行数据
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt(3);//这个字段索引来获取
            String info = resultSet.getString("info");
            //System.out.println(id + ":" + name + ":" + age + ":" + info);
            //数据并不能打印一下啊？  可以将数据存到是对象中
            Work work = new Work(id, name, age, info);
            workList.add(work);

        }
        System.out.println(workList);
        resultSet.close();
        statement.close();
        connection.close();
    }
}
