<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/21
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
</head>
<body>
    <form method="post" action="/emp/insert">
              <input type="text" name="username"/>
              <input type="text" name="gender"/>
              <input type="text" name="salary"/>
              <input type="text" name="hiredate"/>
              <input type="submit" value="insert"/>
    </form>
</body>
</html>
