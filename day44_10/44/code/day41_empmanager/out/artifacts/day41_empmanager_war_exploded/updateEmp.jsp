<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center">
        <form action="UpdateServlet?id=${employee.id}" method="post">
            姓名:<input type="text" name="name" value="${employee.name}"><br>
            年龄:<input type="text" name="age" value="${employee.age}"><br>
            性别:<input type="text" name="sex" value="${employee.sex}"><br>
            薪资:<input type="text" name="salary" value="${employee.salary}"><br>
            <input type="submit" value="提交">
        </form>
    </div>
</body>
</html>
