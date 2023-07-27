<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.qf.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${user1.id}
${user1.name}
${user1.age}
<br>

<%
    List<User> list = (List)request.getAttribute("lists");

%>
<%--分清  Java代码是写在  el不能下在--%>
<%for (int i = 0; i < list.size(); i++) {%>
    <tr>

    <td>${lists[i].id}</td>
    <td>${lists[i].name}</td>
    <td>${lists[i].age}</td>

    </tr>
   <% }%>

${lists[0].id}
${lists[0].name}
${lists[0].age}

${1 + 1}
${3 > 4}
${empty lists}

================
<!-- var :遍历出的每一项使用变量先存储
           items：集合(使用El表达式)
           -->
<c:forEach var="user" items="${lists}">
    ${user.id}
    ${user.name}
    ${user.age}
</c:forEach>
</body>
</html>
