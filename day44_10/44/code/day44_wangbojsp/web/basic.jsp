<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--浏览器的页面展示出来   3--%>
    <%=10/3%>
<%--在控制台打印的--%>
    <%System.out.println("嘻嘻");%>
<%--区别:  带=号的  在浏览器上面展示--%>
<%--在浏览器上面展示--%>
<%out.println("哈哈");%>
<%--可以写Java代码的--%>
    <%
        for (int i = 0; i < 10; i++) {
            out.println("吃饭" + "<br>");
        }

        List<String> list = new ArrayList<>();
        list.add("休息");
        int a = 12;
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("嘻嘻");
            }
        }).start();


    %>
<%--定义变量和方法--%>
<%!
    int a =  30;
   public void test () {
    System.out.println("hehe");
    }
%>
<%test();
a=40;
%>
<%--注释--%>
</body>
</html>
