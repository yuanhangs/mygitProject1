<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/15
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/update.js"></script>
<script>
    $(function () {
        $("tr:first").attr("bgColor", "lightgoldenrodyellow");
        //隔行变色
        $("tr:odd").attr("bgColor", "lightgoldenrodyellow");
    });
</script>
<style>
    table {
        text-align: center;
        height: 200px;
        margin: 0px auto;

    }

    /*update prompt*/
    div {
        text-align: right;
        margin: 10px 150px 8px 0px;
    }

    /*tr first*/
    tr:nth-child(1) td {
        font-size: 28px;
    }
</style>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<div><c:if test="${flag eq 1}">更新会员信息成功!</c:if></div>
<table border="1" width="80%" cellpadding="0" cellspacing="0">
    <tr>
        <td colspan="7">俱乐部的会员信息</td>
    </tr>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>性别</th>
        <th>年龄</th>
        <th>地址</th>
        <th>email</th>
        <th>操作</th>
    </tr>
    <c:forEach var="it" items="${list}">
        <tr>
            <td><a href="find?id=${it.id}">${it.id}</a></td>
            <td>${it.mname}</td>
            <td>${it.mgender}</td>
            <td>${it.mage}</td>
            <td>${it.maddress}</td>
            <td>${it.memail}</td>
            <td>
                <a id="a2" href="javascript:funDel(${it.id})">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
