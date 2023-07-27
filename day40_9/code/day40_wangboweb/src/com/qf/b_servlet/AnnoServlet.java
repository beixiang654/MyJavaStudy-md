package com.qf.b_servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/AnnoServlet")
//@WebServlet(name = "AnnoServlet", urlPatterns = {"/AnnoServlet", "/anno.do", "/anno.action"}, loadOnStartup = 1)
public class AnnoServlet extends HttpServlet {
    public AnnoServlet () {
        System.out.println("AnnoServlet被实例化");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("<h2>嘻嘻</h2>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
