<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="ua.alex.userlist.UserListServlet" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: Windows
  Date: 11.05.2019
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Checking user</title>
  </head>
    <body>
      <h3>Hello</h3>
      <br>
      <form method="GET" action="servlet">
        <table>
          <tr>
            <td>Input id of user :</td>
            <td><input type="text" name="id"></td>
            <td><input type="submit" value="find"></td>
          </tr>

          <tr>
            <td><a href="http://localhost:8087/UserListWEB/NewUser.html">I want add NewUser</a></td>
          </tr>
        </table>
      </form>
    </body>
</html>
