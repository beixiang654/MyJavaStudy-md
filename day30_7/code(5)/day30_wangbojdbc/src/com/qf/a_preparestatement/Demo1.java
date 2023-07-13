package com.qf.a_preparestatement;

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
    public static void main(String[] args) throws SQLException {
        //1.获取connection对象  只不过是封装好的而已
        Connection connection = JdbcUtil.getConnection();

        //2.之前是搬运工对象！！！ 现在换成预处理的搬运工对象
        //Statement statement = connection.createStatement();
        //2.1准备一个参数化的sql语句
        String sql = "insert into work (name, age, info) values(?, ?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        //3.sql语句不完整，只是占位符而已。对sql的?占位 填上具体的值
        //使用preparedStatement 对象的set方法进行对? 进行赋值
        //void setObject(int parameterIndex, Object x) throws SQLException;
        //第一个参数:  就是?的下标
        //parameterIndex – the first parameter is 1, the second is 2, ...
        //第二个参数:   就是对?赋的值
        preparedStatement.setObject(1, "齐齐");
        preparedStatement.setObject(2, 78);
        preparedStatement.setObject(3, "你经常上你那吗");
        //4.sql语句已经准备好了，开始去执行sql语句了
        int i = preparedStatement.executeUpdate();
        System.out.println(i);
        //5.关闭资源
       JdbcUtil.close(preparedStatement, connection);


    }
}
