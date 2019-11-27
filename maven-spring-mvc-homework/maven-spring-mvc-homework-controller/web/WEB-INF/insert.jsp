<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/19
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加页面</title>
    <style>
        .color{
            color: blue;
        }
    </style>
</head>
<body>
    <c:if test="${error==true}">
        <h1>添加失败</h1>
    </c:if>

    <form method="post" action="${pageContext.request.contextPath}/insert">
        姓名:<input type="text" name="name" value="${emp.name}"><span class="color">${nameError}</span><br/>
        电话:<input type="text" name="phone" value="${emp.phone}"><span class="color">${phoneError}</span><br/>
        邮箱:<input type="text" name="email" value="${emp.email}"><span class="color">${emailError}</span><br/>
        生日:<input type="date" name="birthday" value="${emp.birthday}" required="required"><span class="color">${birthdayError}</span><br/>
        <input type="submit">
    </form>
</body>
</html>
