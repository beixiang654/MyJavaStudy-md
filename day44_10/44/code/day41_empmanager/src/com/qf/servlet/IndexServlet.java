package com.qf.servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import com.qf.dao.EmpManagerDao;
import com.qf.dao.EmployeeDao;
import com.qf.entity.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "IndexServlet", value = "/IndexServlet")
public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //要在这个地方获取emoloyee表中的所有的数据，并展示到table中
        //查询！！！
        response.setContentType("text/html;charset=utf-8");
        String pageNo = request.getParameter("pageNo");
        if (pageNo == null) {
            pageNo = "1";
        }
        Integer pNo = Integer.valueOf(pageNo);//第几页

        EmployeeDao employeeDao = new EmployeeDao();
        //每页显示的数据
        int pageSize = 6;
        //计算总页数
        int totalCount = employeeDao.SelectAllSize();//总条数
        //声明一个总页数变量
        int totalPage = 0;
        if (totalCount % pageSize == 0) {
            totalPage = totalCount/ pageSize;
        } else {
            totalPage = totalCount/ pageSize + 1;
        }
        Object[] objs = {(pNo - 1) * pageSize, pageSize};
        List<Employee> employees = employeeDao.selectEmpAll(objs);

        //将employees这个集合数据展示到html页面上面。
        request.setAttribute("employees", employees);
        request.setAttribute("pNo", pNo);
        request.setAttribute("totalPage", totalPage);
        request.getRequestDispatcher("emps.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
