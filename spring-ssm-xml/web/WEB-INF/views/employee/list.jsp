<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/21
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee list</title>
    <meta name="viewport" content="width=device-width,initial-scale=1.0">
    <script src="/static/js/jquery-3.3.1.min.js"></script>
    <script src="/static/bootstrap/js/bootstrap.js"></script>
    <link href="/static/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet"/>
</head>
<body>

    <table>
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>工资</td>
            <td>日期</td>
        </tr>

        <tr>
            <c:forEach items="${list.list}" var="emp">
                 <tr>
                     <td>${emp.id}</td>
                     <td>${emp.username}</td>
                     <td>${emp.salary}</td>
                     <td>${emp.hiredate}</td>
                 </tr>
            </c:forEach>
        </tr>
    </table>
    <%--<h1>${list.navigatepageNums}</h1>--%>
<ul>
    <li><a href="/emp/list?pageNum=1">首页</a></li><br/>
    <li><a href="/emp/list?pageNum=${list.prePage}">上一页</a></li><br/>
    <li><a href="/emp/list?pageNum=${list.nextPage}">下一页</a></li><br/>
    <li><a href="/emp/list?pageNum=${list.pages}">尾页</a></li>

    <c:forEach begin="1" end="${list.navigatePages}" var="ln">
       <li> <a href="/emp/list?pageNum=${ln}">${ln}</a></li>
    </c:forEach>
</ul>
</body>
</html>
