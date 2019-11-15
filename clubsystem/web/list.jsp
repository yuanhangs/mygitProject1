<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/15
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script >
  $(function(){
        $("a").click(function(){
            alert("who are you?");
        });
  });
</script>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<table border="1" width="80%" cellspacing="0" cellpadding="0">
    <tr><td colspan="7">俱乐部的会员信息</td></tr>
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
        <td><a href="">${it.id}</a></td>
        <td>${it.mname}</td>
        <td>${it.mgender}</td>
        <td>${it.mage}</td>
        <td>${it.maddress}</td>
        <td>${it.memail}</td>
        <td><a href="">删除</a></td>
    </tr>
    </c:forEach>
</table>
  </body>
</html>
