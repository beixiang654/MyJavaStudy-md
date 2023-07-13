package com.qf.f_basedao;

import com.qf.utils.BaseDao;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class Demo1 {
    public static void main(String[] args) {
        BaseDao baseDao = new BaseDao();
//        Object[] objs = {3};
//        String sql = "delete from work where id = ?";
//        baseDao.update(sql, objs);

        String sql1 = "update work set name=?, age=?,info=? where id = ? ";
        Object[] objs1 = {"嘻嘻", 89, "nssj", 8};
        baseDao.update(sql1, objs1);
    }
}
