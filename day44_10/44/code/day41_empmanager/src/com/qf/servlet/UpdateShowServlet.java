package com.qf.servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import com.qf.dao.EmployeeDao;
import com.qf.entity.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//展示一条数据 在input输入框中
@WebServlet(name = "UpdateShowServlet", value = "/UpdateShowServlet")
public class UpdateShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String id = request.getParameter("id");
        //select * from employee where id =
        EmployeeDao employeeDao = new EmployeeDao();
        Object[] objs = {id};
        List<Employee> employees = employeeDao.selectOneEmp(objs);
        Employee employee = employees.get(0);
        //employees要展示给输入框，提交给servlet让其修改
        request.setAttribute("employee", employee);
        request.getRequestDispatcher("updateEmp.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
