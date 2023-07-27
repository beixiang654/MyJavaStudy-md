package com.qf.dao;

import com.qf.entity.EmpManager;
import com.qf.utils.BaseDao;

import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//专门处理emp_manager  这张表
public class EmpManagerDao extends BaseDao {

    public List<EmpManager> selectOne (Object[] objs) {
        String sql = "select * from emp_manager where name=? and password=?";
        List<EmpManager> empManagers = super.query(sql, objs, EmpManager.class);
        return empManagers;
    }
}
