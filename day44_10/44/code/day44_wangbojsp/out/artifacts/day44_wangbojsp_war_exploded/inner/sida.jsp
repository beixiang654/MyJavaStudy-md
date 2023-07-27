<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        pageContext.setAttribute("pageContext", "张山");
        request.setAttribute("request", "李四");
        session.setAttribute("session", "王五");
        application.setAttribute("app", "麻子");
    %>
    <%=pageContext.getAttribute("pageContext")%>
    <%=request.getAttribute("request")%>
    <%=session.getAttribute("session")%>
    <%=application.getAttribute("app")%>

</body>
</html>
