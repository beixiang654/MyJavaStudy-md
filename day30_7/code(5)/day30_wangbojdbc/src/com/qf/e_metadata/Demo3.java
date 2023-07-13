package com.qf.e_metadata;

import com.qf.utils.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo3 {
    public static void main(String[] args) throws Exception{
        Connection connection = JdbcUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from dept");
        ResultSet resultSet = preparedStatement.executeQuery();
        //获取ResultMetaData  和结果集有管
        /**
         * id deptName
         * 3	教学部
         * 4	品保部
         */
        ResultSetMetaData metaData = resultSet.getMetaData();
        int columnCount = metaData.getColumnCount();//列（字段）的个数
        System.out.println(columnCount);//2
        //Params:
        //column – the first column is 1, the second is 2, ...
        //Returns:
        //column name
        String columnName = metaData.getColumnName(1);//获列（字段）的名字
        System.out.println(columnName);//id
        String columnName1 = metaData.getColumnName(2);//获列（字段）的名字
        System.out.println(columnName1);//deptName
//        String columnName2 = metaData.getColumnName(3);//获列（字段）的名字
//        System.out.println(columnName2);//deptName
        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(resultSet.getObject(metaData.getColumnName(i)));
            }

            System.out.println("=====");
        }

    }
}
