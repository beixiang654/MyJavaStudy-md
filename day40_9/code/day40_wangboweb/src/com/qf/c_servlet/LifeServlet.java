package com.qf.c_servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

/**
 * 专门验证生命周期的
 */
@WebServlet(name = "LifeServlet", value = "/LifeServlet")
public class LifeServlet extends HttpServlet {
   public LifeServlet() {
       System.out.println("1.被实例化了");
   }

    @Override
    public void init() throws ServletException {
        System.out.println("2.被初始化了");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print("<h2>哈哈</h2>");
        System.out.println("3.核心方法的执行");

    }

    @Override
    public void destroy() {
        System.out.println("4.servlet被销毁");
    }
}
