package com.qf.a_servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */
//3.写一个注解，修饰一个类，是一个路径问题，就是为了找到当前的TestServlet资源
//这个路径一定要带斜线   /  不带这个斜线就会404
@WebServlet("/TestServlet")
//1.继承了HttpServlet
public class TestServlet extends HttpServlet {
    //2.重写doGet方法和doPost方法
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("哈哈 这个是TestServet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
