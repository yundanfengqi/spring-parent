<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/13
  Time: 15:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>主页面</title>
</head>
<body>
    <div>
        <c:forEach items="${errors}" var="err">
            <li>${err.field} === ${err.defaultMessage}</li>
        </c:forEach>
    </div>

    <form method="post" action="/insertCheck">
        工资: <input type="text" name="salary"/><br>
        性别: <input type="text" name="gender"/><br>
        入职日期:<input type="date" name="hiredate"><br>
        姓名: <input type="text" name="username"/><br>
        部门编号:<input type="text" name="deptid"><br>
        <input type="submit" value="添加">
    </form>


</body>
</html>
