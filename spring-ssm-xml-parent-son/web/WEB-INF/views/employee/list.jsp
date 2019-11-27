<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/21
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>信息页面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <script src="/static/js/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <link href="/static/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet"/>
</head>
<body>

<table class="table">
    <tr>
        <th>编号</th>
        <th>名字</th>
        <th>年龄</th>
        <th>工资</th>
        <th>入职日期</th>

    </tr>
    <c:forEach items="${list.list}" var="emp">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.gender}</td>
            <td>${emp.username}</td>
            <td>${emp.salary}</td>
            <td>${emp.hiredate}</td>
        </tr>
    </c:forEach>


</table>

<ul class="pagination">
    <li><a href="/emp/list?pageNum=1"> 首页</a></li>
    <li><a href="/emp/list?pageNum=${list.prePage}"> 上一页</a></li>
    <c:forEach items="${list.navigatepageNums}" var="p">
        <li><a href="/emp/list?pageNum=${p}"> ${p}</a></li>
    </c:forEach>
    <li><a href="/emp/list?pageNum=${list.nextPage}"> 下一页</a></li>
    <li><a href="/emp/list?pageNum=${list.pages}"> 尾页</a></li>

</ul>
</body>
</html>
