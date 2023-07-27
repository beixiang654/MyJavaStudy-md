package com.qf.c_servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
@WebServlet("/Test1Servlet")
public class Test1Servlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        //验证一下 init、方法是否执行！！！
        System.out.println("初始化的方法");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("获得Servlet配置对象的方法");
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //核心方法  最重要的
        //响应乱码   如果下面的字符串写错了以后，请求这个资源的时候在下载这个页面
        servletResponse.setContentType("text/html;charset=utf-8");
        System.out.println("service方法  服务方法  核心方法！！！");
        PrintWriter writer = servletResponse.getWriter();


        writer.print("<marquee>欢迎来到红浪漫！！！</marquee>");


    }

    @Override
    public String getServletInfo() {
        System.out.println("获取servlet信息的一个方法");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet的销毁");
    }
}
