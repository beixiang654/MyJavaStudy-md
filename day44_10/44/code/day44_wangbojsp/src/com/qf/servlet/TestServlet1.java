package com.qf.servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import com.qf.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TestServlet1", value = "/TestServlet1")
public class TestServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> lists = new ArrayList<>();
        lists.add(new User(1, "嘻嘻", 16));
        lists.add(new User(2, "世达", 11));
        lists.add(new User(3, "士奇", 19));
        lists.add(new User(4, "邱博", 89));
        request.setAttribute("lists", lists);//存到request域中
        request.getRequestDispatcher("el/test.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
