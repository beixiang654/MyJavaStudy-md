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

@WebServlet(name = "ServletTest1", value = "/ServletTest1")
public class ServletTest1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //现在   请求ServletTest1这个资源 但是展示是ServletTest2这个资源页
        request.setAttribute("name", "laoxing");//设置属性和值给request对象
        request.getRequestDispatcher("ServletTest2").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
