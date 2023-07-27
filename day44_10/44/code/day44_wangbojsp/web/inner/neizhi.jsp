<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("name", "狗蛋");
//        想一个问题，就是拿对象调用方法而已
        session.setMaxInactiveInterval(60);
        session.setAttribute("sess", "xixi");
        application.setAttribute("goudan", "狗蛋");

    %>
    <%=request.getAttribute("name")%>
</body>
</html>
