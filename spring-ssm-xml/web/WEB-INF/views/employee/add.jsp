<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/21
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
    <form method="post" action="/emp/list">
        姓名：<input type="text" name="username"><br/>
        工资：<input type="text" name="salary"><br/>
        日期：<input type="text" name="hiredate"><br/>
        <input type="submit" value="添加"><br/>
    </form>
</body>
</html>
