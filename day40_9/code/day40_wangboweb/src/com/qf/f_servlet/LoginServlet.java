package com.qf.f_servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取前端发送的数据
        request.setCharacterEncoding("utf-8");//设置请求时候中文乱码问题
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        //去连接数据库，然后 写sql语句
        //select * from t_user where name=
        //重定向主页面  index.html
        response.sendRedirect("http://www.baidu.com");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
