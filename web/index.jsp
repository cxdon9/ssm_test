<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/8
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table>
    <tr>
        <td>id</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
    </tr>
    <c:forEach var="list" items="${requestScope.list}">
        <tr>
            <td>${list.sid}</td>
            <td>${list.sname}</td>
            <td>${list.sex}</td>
            <td>${list.sage}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
