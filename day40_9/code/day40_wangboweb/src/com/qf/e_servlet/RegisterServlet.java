package com.qf.e_servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import com.qf.dao.UserDao;
import com.qf.utils.BaseDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String user = request.getParameter("user");
        String pwd = request.getParameter("pwd");
        //已经接到前端发送的数据 ，只需要存到数据即可
        //如果按照分层的来写，servlte里面不允许出现sql语句
        UserDao userDao = new UserDao();
        Object[] objs = {user, pwd};
        userDao.addUser(objs);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
