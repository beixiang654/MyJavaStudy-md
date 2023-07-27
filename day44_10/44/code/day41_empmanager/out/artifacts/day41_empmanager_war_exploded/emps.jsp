<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bowang
  Date: 2023/6/22
  Time: 11:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        a {
            text-decoration: none;
        }
    </style>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div>
    <a href="addEmp.jsp">添加</a>
    <form action="SearchServlet">
        用户名:<input type="text" name="name"><input type="submit" value="查询">
    </form>
</div>
    <div align="center">
        <table class="table table-hover table-dark">
            <thead>
            <tr>

                <th scope="col">编号</th>
                <th scope="col">姓名</th>
                <th scope="col">年龄</th>
                <th scope="col">性别</th>
                <th scope="col">薪资</th>
                <th colspan="2" scope="col">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="emp" items="${employees}">
                <tr align="center">
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.age}</td>
                    <td>${emp.sex}</td>
                    <td>${emp.salary}</td>
                    <td><a onclick="return del()" href="DeleteServlet?id=${emp.id}" >删除</a></td>
                    <td><a href="UpdateShowServlet?id=${emp.id}">修改</a></td>
                </tr>
            </c:forEach>


            </tbody>
        </table>

<%--        不进行模糊查询的分页--%>
        <c:if test="${empty name}">

            <div>

                <a href="IndexServlet?pageNo=1">首页</a>
                <c:if test="${pNo > 1}">
                    <a href="IndexServlet?pageNo=${pNo - 1}">上一页</a>
                </c:if>
                <c:if test="${pNo < totalPage}">
                    <a href="IndexServlet?pageNo=${pNo + 1}">下一页</a>
                </c:if>

                <a href="IndexServlet?pageNo=${totalPage}">尾页</a>
            </div>
        </c:if>
        <c:if test="${!empty name}">

            <div>

                <a href="SearchServlet?pageNo=1&name=${name}">首页</a>
                <c:if test="${pNo > 1}">
                    <a href="SearchServlet?pageNo=${pNo - 1}&name=${name}">上一页</a>
                </c:if>
                <c:if test="${pNo < totalPage}">
                    <a href="SearchServlet?pageNo=${pNo + 1}&name=${name}">下一页</a>
                </c:if>

                <a href="SearchServlet?pageNo=${totalPage}&name=${name}">尾页</a>
            </div>
        </c:if>

    </div>

</body>
<script>
    function del() {
        var msg = "您确定要删除吗?";
        if (window.confirm(msg)) {
            return true;
        } else {
            return false;
        }

    }
</script>
</html>
