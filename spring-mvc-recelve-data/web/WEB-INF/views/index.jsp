<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/12
  Time: 14:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>index page</h1>
    <hr/><hr/>
    <h1>传递list数据给控制器</h1>

    <form method="get" action="/list">
        <input type="text" name="employees[0].id"/>
        <input type="text" name="employees[0].salary"/>
        <input type="text" name="employees[0].gender"/>
        <input type="text" name="employees[0].username"/>
        <input type="text" name="employees[0].deptid"/>

        <input type="text" name="employees[0].id"/>
        <input type="text" name="employees[0].salary"/>
        <input type="text" name="employees[0].gender"/>
        <input type="text" name="employees[0].username"/>
        <input type="text" name="employees[0].deptid"/>

        <input type="submit" value="提交"/>
    </form>

    <h1>绑定到数组</h1>
    <form method="get" action="/array">
        <input type="text" name="name"/>
        <input type="text" name="NameOne"/>
        <input type="text" name="NameTwo"/>

        <input type="submit" value="提交">
    </form>
</body>
</html>
