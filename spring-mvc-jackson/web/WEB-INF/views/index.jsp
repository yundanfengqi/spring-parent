<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/18
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json 页面</title>
    <script src="/static/js/jquery-3.3.1.min.js"></script>
</head>
<body>
    <h1>ajax json  jsp</h1>

    <input type="button" value="list" id="btnList"/>
    <input type="button" value="insert" id="btnInsert"/>
    <input type="button" value="insert2" id="btnInsert2"/>
    <script>
        $(function () {
            $("#btnList").click(function () {
                $.ajax({
                    url:"/list",
                    type:"GET",
                    success:function (data) {
                        console.log(data);
                        alert(data.username);
                    }
                });
            }); //btnList end 结束了
            /**
             * ajax 方法的参数含义如下：
             * 1.data：表明请求传递的数据
             * 2.type：表明请求的方法(比如 get，post)
             * 3.contentType:表明请求的内容类型
             * 4.dataType:是 “期望”服务端返回的数据类型
             */
            $("#btnInsert").click(function () {
                var data ={id:100,gender:0,username:"STUBD",hiredate:new Date()};
                $.ajax({
                    url:"/insert",
                    data:JSON.stringify(data),
                    type:"POST",
                    contentType:"application/json",
                    dataType:"json",
                    success:function (data) {
                        alert(data.username);
                    }
                });
            });
            
            $("#btnInsert2").click(function () {
                var data ={id:101,username:"client"};
                $.ajax({
                    url:"/insert2",
                    data:data,
                    type:"POST",
                    dataType:"json",
                    success:function (data) {
                        alert(data.username);
                    }
                });
            });
            
        });
    </script>

</body>
</html>
