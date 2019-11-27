<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/7
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c"uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Hello World Spring MVC !!!!!!!</h1>

    <h2>${msg}</h2>

    <ul>
        <c:forEach items="${requestScope}" var="req">
        <li>${req.key} = ${req.value}<>
            </c:forEach>
    </ul>
</body>
</html>
