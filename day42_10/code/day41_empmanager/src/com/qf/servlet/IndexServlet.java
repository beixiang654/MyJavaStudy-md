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
        EmployeeDao employeeDao = new EmployeeDao();
        List<Employee> employees = employeeDao.selectEmpAll();
        //将employees这个集合数据展示到html页面上面。
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<body>");



//      <a href="https://www.baidu.com/">
//      <button>点我跳转到度娘！</button>
//      </a>

        writer.print("<div style='width:200px;height:300px'>");
        writer.print("<a href='https://www.baidu.com/'>添加</a>");
        writer.print("</div>");
        writer.print("<div align='center'>");



        writer.print("<table border='2px' bordercolor='red' width='700px'>");
        writer.print("<tr>");
        writer.print("<th>编号</th>");
        writer.print("<th>姓名</th>");
        writer.print("<th>年龄</th>");
        writer.print("<th>性别</th>");
        writer.print("<th>薪资</th>");

        writer.print("</tr>");
        for (Employee employee : employees) {
            writer.print("<tr>");
            writer.print("<td>"+employee.getId()+"</td>");
            writer.print("<td>"+employee.getName()+"</td>");
            writer.print("<td>"+employee.getAge()+"</td>");
            writer.print("<td>"+employee.getSex()+"</td>");
            writer.print("<td>"+employee.getSalary()+"</td>");

            writer.print("</tr>");
        }
        writer.print("</table>");
        writer.print("</div>");


        writer.print("</body>");
        writer.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
