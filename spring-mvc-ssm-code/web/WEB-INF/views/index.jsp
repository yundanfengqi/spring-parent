<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/25
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询员工数据</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
<input type="button" value="list" id="btnList"/>
    <script>
        $(function () {
            $.ajax({
                url:"/list",
                type:"GET",
                success:function (result) {
                    alert(result[0].id);
                    alert(result[1].username);
                    alert(result[2].gender);
                }
            });
        });
    </script>
</body>
</html>
