<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/20
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>

    <form action="/login" method="post">
        <input type="text" name="username"/>
        <input type="text" name="password"/>

        <input type="submit" value="登录"/>
    </form>
</body>
</html>
