package com.qf.c_sqlinject;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        preparedstatementTest();
    }
    public static void statementTest() throws SQLException {
        //写搬运工对象
        Connection connection = JdbcUtil.getConnection();
        Statement statement = connection.createStatement();
        String id = "1 or 1=1";//假设前端给我传过来一个id字符串
        String sql = "delete from t_teacher where t_id = " + id ;
        int i = statement.executeUpdate(sql);
        System.out.println(i);
        JdbcUtil.close(statement, connection);
    }
    public static void preparedstatementTest() throws Exception{
        //写搬运工对象
        Connection connection = JdbcUtil.getConnection();
        String sql  = "delete from work where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //一个?只能是一个占位   现在4 or  1=1
        preparedStatement.setObject(1, "4 or 1=1");
        preparedStatement.executeUpdate();

    }

}
