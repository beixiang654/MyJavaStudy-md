<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <form action="AddEmpServlet" method="post">
        姓名: <input type="text" name="name"><br>
        年龄: <input type="text" name="age"><br>
        性别: <input type="text" name="sex"><br>
        薪资: <input type="text" name="salary"><br>
        <input type="submit" value="添加">
    </form>
</div>
</body>
</html>
