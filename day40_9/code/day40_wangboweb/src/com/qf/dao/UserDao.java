package com.qf.dao;

import com.qf.utils.BaseDao;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class UserDao extends BaseDao {
    public void addUser (Object[] objs) {
        String sql = "insert into t_user(user, password) values(?, ?)";
        super.update(sql, objs);

    }
}
