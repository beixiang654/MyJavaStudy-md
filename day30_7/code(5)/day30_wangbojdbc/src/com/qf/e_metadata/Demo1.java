package com.qf.e_metadata;

import com.qf.utils.JdbcUtil;
import jdk.nashorn.internal.ir.SplitReturn;

import java.sql.Connection;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtil.getConnection();
        String sql = "insert into work(name, age, info) values(?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        //ParameterMetaData getParameterMetaData()  得到参数元数据
        // preparedStatement
        //                                throws SQLException
        //检索的数量，这 PreparedStatement对象参数的类型和性质。
        //结果
        //一个 ParameterMetaData对象所包含的信息的数量，因为这 PreparedStatement对象的每个参数标记的类型和性质
        //异常
        //SQLException -如果一个数据库访问错误发生或调用此方法在一个封闭的 PreparedStatement
        ParameterMetaData pm = ps.getParameterMetaData();
        //ParameterMetaData  表示 sql的参数的所有的信息
        int parameterCount = pm.getParameterCount();
        System.out.println(parameterCount);
        //声明了一个数组
        Object[] objs = {"二狗", 23, "想念家乡"};

        for (int i = 1; i <= parameterCount; i++) {
            //对sql 的? 进行赋值的
            ps.setObject(i , objs[i - 1]);
        }
        int i = ps.executeUpdate();
        System.out.println(i);
        JdbcUtil.close(ps, connection);

    }
}
