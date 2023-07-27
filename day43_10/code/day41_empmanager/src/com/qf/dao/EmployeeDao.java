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
    public List<Employee> selectEmpAll (Object[] objs) {
        String sql = "select * from employee limit ?, ?";
        List<Employee> employees = super.query(sql,objs , Employee.class);
        return employees;
    }
    //添加方法
    public int addEmp (Object[] objs) {
        String sql = "insert into employee (name,age,sex, salary) values (?,?,?,?)";
        return super.update(sql, objs);
    }
    //删除方法
    public int delEmp (Object[] objs) {
        String sql = "delete from employee where id = ?";
        return super.update(sql, objs);
    }
    //查询一条数据的方法
    public List<Employee> selectOneEmp (Object[] objs) {
        String sql = "select * from employee where id = ?";
        return super.query(sql, objs, Employee.class);
    }
    //修改一条数据
    public int updateEmp (Object[] objs) {
        String sql = "update employee set name=?, age=?, sex=?, salary=? where id = ?";
        return super.update(sql, objs);
    }
    //查询总条数
    public int SelectAllSize() {
        String sql = "select count(*) from employee";
        int i = super.querySize(sql);
        return i;
    }

}
