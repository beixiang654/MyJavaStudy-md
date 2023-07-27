package com.qf.g_servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletTest8", value = "/ServletTest8")
public class ServletTest8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取当前上下文对象
        ServletContext servletContext = request.getServletContext();
        System.out.println("ServletTest8的内存地址:"+servletContext);//内存地址
        //2.取servletContext  通过键取值
        Object name = servletContext.getAttribute("name");
        System.out.println("ServletTest8中的name： " + name);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
