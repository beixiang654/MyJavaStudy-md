package com.qf.servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import com.qf.dao.EmployeeDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AddEmpServlet", value = "/AddEmpServlet")
public class AddEmpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //防止请求时候的乱码
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String sex = request.getParameter("sex");
        String salary = request.getParameter("salary");
        //要将以上的数据 存数据中
        EmployeeDao employeeDao = new EmployeeDao();
        Object[] objs = {name, age, sex, salary};
        int i = employeeDao.addEmp(objs);
        if (i== 1) {
            response.sendRedirect("IndexServlet");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
