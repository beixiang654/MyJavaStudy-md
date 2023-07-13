package com.qf.e_metadata;

import com.qf.utils.JdbcUtil;

import java.sql.*;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo2 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from work");
        ResultSet resultSet = preparedStatement.executeQuery();
        //获取ResultMetaData
        ResultSetMetaData metaData = resultSet.getMetaData();
        //ResultSetMetaData 这个对象包含了字段的各种信息
        //getColumnCount  从结果集中获取列的个数
        int columnCount = metaData.getColumnCount();
        System.out.println(columnCount);//4个字段
        while (resultSet.next()) {
            //System.out.println(metaData.getColumnName(1));id//获取第一个字段
//            System.out.println(resultSet.getObject(metaData.getColumnName(1)));
//            //System.out.println(metaData.getColumnName(2));//name
//            System.out.println(resultSet.getObject(metaData.getColumnName(2)));
//            //System.out.println(metaData.getColumnName(3));//age
//            System.out.println(resultSet.getObject(metaData.getColumnName(3)));
//            //System.out.println(metaData.getColumnName(4));//info
//            System.out.println(resultSet.getObject(metaData.getColumnName(4)));
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(resultSet.getObject(metaData.getColumnName(i)));
            }
            System.out.println("=======");
        }
    }
}
