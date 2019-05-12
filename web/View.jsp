<%@ page import="java.util.Map" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Windows
  Date: 12.05.2019
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
</head>
<body>
    <%
        Map<Integer, String> users =(Map<Integer, String>) pageContext.getAttribute("users");
    %>
    <table border="1px">
        <tr>
            <td>id</td>
            <td>name</td>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr>
                <td><c:out value="${user.key}"/></td>
                <td><c:out value="${user.value}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
