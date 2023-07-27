package com.qf.servlet; /**
 * description:
 * 公司:千锋教育
 * author:博哥
 * 公众号:Java架构栈
 */

import com.qf.dao.EmpManagerDao;
import com.qf.entity.EmpManager;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收前端发送的input输入框中的数据  post
        request.setCharacterEncoding("utf-8");//防止请求时候中文乱码
        response.setContentType("text/html;charset=utf-8");//防止响应时候中文乱码
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        //验证前端是否发送到servlet中的数据是否是对的?
        System.out.println(user + ":"  + password);
        //获取前端数据成功？链接数据库和数据库中的进行比对。用户名和密码都对上
        //那就登录成功。  不能写sql语句
        Object[] objs = {user, password};
        EmpManagerDao empManagerDao = new EmpManagerDao();
        List<EmpManager> empManagers = empManagerDao.selectOne(objs);
        System.out.println(empManagers);//null
        if (empManagers != null) {
            //就证明查到数据，就证明用户名和密码是正确，存session
            //[EmpManager{id=1, name='老邢', password='123123'}]
            EmpManager empManager = empManagers.get(0);
            //存到session中
            HttpSession session = request.getSession();
            session.setMaxInactiveInterval(60*60*24);//24小时的过期时间
            session.setAttribute("name", empManager.getName());
            //跳转到主页面  IndexServlet
            //在servlet中链接数据库查询employyee表中所有员工
            response.sendRedirect("IndexServlet");



        } else{
            //没有查到数据  继续重新登陆
            PrintWriter writer = response.getWriter();
            writer.print("<script>alert('账号或者密码错误,请重新输入');window.location.href='login.html'</script>");

        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
