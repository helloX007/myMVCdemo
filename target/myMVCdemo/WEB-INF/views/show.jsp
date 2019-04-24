<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/24 0024
  Time: 下午 1:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UserList</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>ID</td>
            <td>姓名</td>
            <td>密码</td>
            <td>年龄</td>
        </tr>
        <c:choose>
            <c:when test="${not empty userList}" >
                <c:forEach items="${userList}" var="user" varStatus="vs">
                    <tr>
                        <td>${user.id}</td>
                        <td>${user.user_name}</td>
                        <td>${user.password}</td>
                        <td>${user.age}</td>
                    </tr>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <tr>
                    <td colspan="2">无数据!</td>
                </tr>
            </c:otherwise>
        </c:choose>
    </table>
</body>
</html>
