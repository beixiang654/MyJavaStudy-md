package com.qf.f_jdbc;

import java.sql.Connection;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        Connection connection = JdbcUtil.getConnection();
        System.out.println(connection);
    }
}
