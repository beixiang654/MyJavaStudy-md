package com.qf.dao;

import com.qf.entity.Employee;
import com.qf.utils.BaseDao;

import java.util.List;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
public class EmployeeDao extends BaseDao {

    //查询所有employee表中的所有数据的一个方法
    public List<Employee> selectEmpAll () {
        String sql = "select * from employee";
        List<Employee> employees = super.query(sql, null, Employee.class);
        return employees;
    }
}
