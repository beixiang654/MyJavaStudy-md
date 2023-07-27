<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%=pageContext.getAttribute("pageContext")%>
    <%=request.getAttribute("request")%>
    <%=session.getAttribute("session")%>
    <%=application.getAttribute("app")%>
</body>
</html>
