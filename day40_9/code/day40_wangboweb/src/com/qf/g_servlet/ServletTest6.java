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

@WebServlet(name = "ServletTest6", value = "/ServletTest6")
public class ServletTest6 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取当前上下文对象
        ServletContext servletContext = request.getServletContext();
        System.out.println("ServletTest6的内存地址:"+servletContext);//内存地址
        //2.将值存到servletContext对象
        servletContext.setAttribute("name", "goudan");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
