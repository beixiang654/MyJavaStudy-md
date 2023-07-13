package com.qf.b_preparestatement;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from work");
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Work> list = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            String info = resultSet.getString("info");
            Work work = new Work(id, name, age, info);
            list.add(work);
        }
        System.out.println(list);
        JdbcUtil.close(resultSet, preparedStatement, connection);
    }
}
