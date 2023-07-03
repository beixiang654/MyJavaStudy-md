package com.qf.e_jdbc;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    @Test
    public void teestAdd () throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("insert into work(name, age, info) values('豪哥', 98, '挥洒吗')");
        System.out.println(i);
        JdbcUtil.close(statement, connection);
    }
    @Test
    public void teestDel () throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();
        int i = statement.executeUpdate("delete from work where id = 4");
        System.out.println(i);
        JdbcUtil.close(statement, connection);
    }
}
