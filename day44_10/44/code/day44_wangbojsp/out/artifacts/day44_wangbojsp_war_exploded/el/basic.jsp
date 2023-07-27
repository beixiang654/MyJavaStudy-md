<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--    el目的是获取四大作用域中的数据的  先有数据啊！！！--%>
<%
    request.setAttribute("req1", "士奇");
%>
<%--常规的展示一下浏览器--%>
<%=request.getAttribute("req")%><br>
<%--el表达式--%>
${requestScope.req}
<%--存的时候可以往四大作用域中取存，  键  和值  使用el表达式的 键直接取值--%>
${req1}
</body>
</html>
