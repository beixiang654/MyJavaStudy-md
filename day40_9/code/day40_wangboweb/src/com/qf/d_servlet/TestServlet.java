package com.qf.d_servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/TestServlet")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //咋接前端的发送的数据？
        //request获取前端发送的数据 通过键获取值的
        //如果请求是乱码的时候    前端-》servlet
        request.setCharacterEncoding("utf-8");

        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");

        System.out.println(user + ":" + pwd);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
