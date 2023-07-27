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
import java.util.List;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获模糊查询的input输入框中的 输入用户名
        String name = request.getParameter("name");
        String pageNo = request.getParameter("pageNo");
        if(pageNo == null) {
            pageNo = "1";
        }
        Integer pNo = Integer.valueOf(pageNo);
        //select * from employee where name like "%狗%"
        EmployeeDao employeeDao = new EmployeeDao();
        //每页显示的条数
        int pageSize = 3;
        Object[] objs = {(pNo - 1) * pageSize, pageSize};
        List<Employee> employees = employeeDao.selectConditionEmp(objs, name);
        //模糊查询到额总条数
        int totalConditionCount = employeeDao.selectAllConditionSize(name);
        //算总页数
        int totalPage = 0;
        if (totalConditionCount % pageSize == 0) {
            totalPage = totalConditionCount / pageSize;
        } else {
            totalPage = totalConditionCount / pageSize + 1;
        }
        request.setAttribute("employees", employees);
        request.setAttribute("name", name);
        request.setAttribute("pNo", pNo);
        request.setAttribute("totalPage", totalPage);

        request.getRequestDispatcher("emps.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
