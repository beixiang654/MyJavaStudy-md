<%@ page import="com.qf.entity.User" %><%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        User user = new User(1, "狗蛋", 12);

        request.setAttribute("user", user);

    %>
${user}<br>
${user.id}<br>
${user.name}<br>
${user.age}<br>
</body>
</html>
