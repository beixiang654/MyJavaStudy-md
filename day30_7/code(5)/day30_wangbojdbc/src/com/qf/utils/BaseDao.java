package com.qf.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class BaseDao {

    public int update (String sql, Object[] parametrers)  {
        //1.获取connection对象
        Connection connection = JdbcUtil.getConnection();
        //2.获取预处理的搬运工对象
        PreparedStatement preparedStatement = null;
        try {
           preparedStatement = connection.prepareStatement(sql);
            //3.获取参数元数据 对象 并获取参数？的个数
            int parameterCount = preparedStatement.getParameterMetaData().getParameterCount();
            //4.开始赋值 循环赋值。
            if (parametrers != null && parameterCount == parametrers.length) {
                for (int i = 1; i <= parameterCount; i++) {
                    preparedStatement.setObject(i, parametrers[i-1]);
                }
            }
            //5.执行sql语句
            int i = preparedStatement.executeUpdate();
            return i;

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.关闭资源
            JdbcUtil.close(preparedStatement, connection);
        }
        return 0;

    }
}
