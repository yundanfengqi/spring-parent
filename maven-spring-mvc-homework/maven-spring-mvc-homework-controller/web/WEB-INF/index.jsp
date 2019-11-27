<%--
  Created by IntelliJ IDEA.
  User: 廖龙
  Date: 2019/11/19
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页面</title>
    <script src="${pageContext.request.contextPath}/static/jquery-3.4.1.js"></script>
</head>
<body>

<table>
    <thead>
    <tr>
        <th>员工编号</th>
        <th>手机号</th>
        <th>员工姓名</th>
        <th>邮箱</th>
        <th>生日日期</th>
    </tr>
    </thead>
    <tbody id="tab_body"></tbody>
</table>
<div id="data"></div>

<div>
    <button class="insert">添加</button>
</div>
<script>
    //最开始的数据
    show(1)

    //加载页面的时候进行ajax请求。获取数据
    function show(pageNum) {
        $.ajax({
            url:"${pageContext.request.contextPath}/list",
            method:"post",
            data:{
                pageNum:pageNum,
                pageSize:3
            },
            dataType:"JSON"
        }).done(function (res) {
            /*把所有的数据都清空。不然会叠加数据*/
            $("#tab_body").html("")
            $("#data").html("")

            //在表格里面显示数据
            res.list.forEach(function (emp) {
                var tab ="<tr><td>"+emp.id+"</td><td>"+emp.name+"</td><td>"+
                    emp.phone+"</td><td>"+emp.email+"</td><td>"+emp.birthday+"</td></tr>";
                $("#tab_body").append(tab)
            })

            //添加分页功能的按钮
            var data = "<button class='btn' value='1'>首页</button>"+
                "<button class='btn' value='"+res.prePage+"'>上一页</button>";
            res.navigatepageNums.forEach(function (num) {
                data += "<button class='btn' value='"+num+"'>"+num+"</button>"
            })
            data += "<button class='btn' value='"+res.nextPage+"'>下一页</button>"+
                "<button class='btn' value='"+res.pages+"'>尾页</button> ";
            $("#data").append(data)

            //调用btn点击事件
            bunClick()
        })
    }

    //btn点击事件
    function bunClick() {
        $(".btn").click(function (e) {
            var pageNum = $(this).val()
            show(pageNum)
        })
    }

    //当点击insert按钮时触发的事件,交给inserIndex处理
    $(".insert").click(function (e) {
        window.location.replace("${pageContext.request.contextPath}/insertIndex");
    })

</script>

</body>
</html>
