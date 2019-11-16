<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/16
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

    <style>
        table {
            height: 280px;
            margin: 0px auto;
            background: blanchedalmond;
        }

        /*tr first*/
        tr:nth-child(1) td {
            font-size: 28px;
        }

        .right{
            text-align: center;
        }
    </style>
</head>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/update.js"></script>
<body>
<form method="post" action="all">
    <table border="1" cellspacing="0" cellpadding="0" width="28%">
        <tr>
            <td colspan="2" class="right">会员信息</td>
        </tr>
        <tr>
            <td class="right">姓名</td>
            <td><input type="text" name="name" id="name" value="${info.mname}">
                <input type="hidden" name="id" id="" value="${info.id}">
            </td>
        </tr>
        <tr>
            <td class="right">性别</td>
            <td>
                <input type="radio" name="gender" id="" value="男" <c:if test="${info.mgender=='男'}">checked </c:if>>男
                <input type="radio" name="gender" id="" value="女"
                       <c:if test="${info.mgender=='女'}">checked </c:if> >女
            </td>
        </tr>
        <tr>
            <td class="right">年龄</td>
            <td><input type="text" name="age" id="age" value="${info.mage}"></td>
        </tr>
        <tr>
            <td class="right">家庭地址</td>
            <td><input type="text" name="address" id="" value="${info.maddress}"></td>
        </tr>
        <tr>
            <td class="right">Email</td>
            <td><input type="email" name="email" id="" value="${info.memail}"></td>
        </tr>
        <tr>
            <td colspan="2"  class="right"><input type="submit" value="修改">
               &nbsp;&nbsp; <input type="reset" value="重置">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
