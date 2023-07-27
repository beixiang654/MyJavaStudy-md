package com.qf.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

//拦截的资源路径是谁？TestServlet
//@WebFilter("/el/*")
@WebFilter("*.do")
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        System.out.println("嘻嘻哒");
        //放行的事情。不写这行代码  拦截住。不放行的情况！！！
        //filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("呵呵哒");
    }
}
