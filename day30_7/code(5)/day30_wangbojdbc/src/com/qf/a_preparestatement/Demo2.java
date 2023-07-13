package com.qf.a_preparestatement;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws Exception{
        Connection connection = JdbcUtil.getConnection();
        String sql = "update work set name=?, age=?, info=? where id=?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setObject(1, "小骚");
        preparedStatement.setObject(2, 78);
        preparedStatement.setObject(3, "好像俺们是农民");
        preparedStatement.setObject(4, 5);
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        JdbcUtil.close(preparedStatement, connection);
    }
}
