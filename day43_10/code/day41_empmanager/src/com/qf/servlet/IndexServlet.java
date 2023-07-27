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
        PrintWriter writer = response.getWriter();
        writer.print("<html>");
        writer.print("<body>");
        writer.print("<div>");//放的导航栏
        writer.print("<span>教学部员工管理系统</span>");
        writer.print("<span style='margin-left:450px'>管理员: "+request.getSession(false).getAttribute("name")+"</span>");
        writer.print("<span style='margin-left:450px;'><a href='LogoutServlet' style='text-decoration:none'>退出登陆</a></span>");
        writer.print("</div>");

        //添加
        writer.print("<div><a href='addEmp.html' style='text-decoration:none'>添加员工</a></div>");



        writer.print("<div align='center'>");
        writer.print("<table border='2px' bordercolor='red' width='700px'>");
        writer.print("<tr>");
        writer.print("<th>编号</th>");
        writer.print("<th>姓名</th>");
        writer.print("<th>年龄</th>");
        writer.print("<th>性别</th>");
        writer.print("<th>薪资</th>");
        writer.print("<th colspan='2'>操作</th>");

        writer.print("</tr>");
        for (Employee employee : employees) {
            writer.print("<tr>");
            writer.print("<td>"+employee.getId()+"</td>");
            writer.print("<td>"+employee.getName()+"</td>");
            writer.print("<td>"+employee.getAge()+"</td>");
            writer.print("<td>"+employee.getSex()+"</td>");
            writer.print("<td>"+employee.getSalary()+"</td>");
            writer.print("<td><a href='DeleteServlet?id="+employee.getId()+"'>删除</a></td>");
            writer.print("<td><a href='UpdateShowServlet?id="+employee.getId()+"'>修改</a></td>");

            writer.print("</tr>");
        }
        writer.print("</table>");
        writer.print("</div>");
//        在table表格中加  首页  上一页  下一页  尾页
        writer.print("<div align='center'>");
        writer.print("<span><a href='IndexServlet?pageNo=1' style='text-decoration:none'>首页</a></span>");
        if (pNo > 1) {
            writer.print("<span><a href='IndexServlet?pageNo="+(pNo - 1)+"' style='text-decoration:none'>上一页</a></span>");
        } else {
            writer.print("<span><a href='IndexServlet?pageNo="+(pNo - 1)+"' style='text-decoration:none;pointer-events:none'>上一页</a></span>");
        }
        if (pNo < totalPage) {
            writer.print("<span><a href='IndexServlet?pageNo="+(pNo + 1)+"' style='text-decoration:none'>下一页</a></span>");
        } else {
            writer.print("<span><a href='IndexServlet?pageNo="+(pNo + 1)+"' style='text-decoration:none;pointer-events:none'>下一页</a></span>");
        }
        writer.print("<span><a href='IndexServlet?pageNo="+totalPage+"' style='text-decoration:none'>尾页</a></span>");
        writer.print("</div>");


        writer.print("</body>");
        writer.print("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
