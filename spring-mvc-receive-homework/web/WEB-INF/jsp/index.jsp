<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/12
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World Spring MVC</title>
</head>
<body>
    <form method="post" action="/add">
        <input type="text" name="salary" value="11111"/>
        <input type="text" name="gender" value="0">
        <input type="text" name="username" value="双十一剁手节">
        <input type="text" name="deptid" value="5">
        <input type="submit" value="添加">
    </form>

    <form method="post" action="/tx">
        <input type="text" name="salary" value="121212"/>
        <input type="text" name="gender" value="0">
        <input type="text" name="username" value="双十二剁手节">
        <input type="text" name="deptid" value="5">
        <input type="submit" value="添加">
    </form>

    <a href="/pv/12345">点击我-------pv</a>
</body>
</html>
