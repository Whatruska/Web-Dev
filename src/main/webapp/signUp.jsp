<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vitalij
  Date: 2019-04-21
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sign Up Page</title>
    <link rel="stylesheet" href="resources/style.css">
</head>
<body>
    <div class="form-style-6">
        <h1>Registration</h1>
        <form action="sign_up" method="post">

            <input type="text" name="username" placeholder="Username">
            <input type="password" name="password" placeholder="Password">
            <input type="date" name="birthday" placeholder="Birthday">
            <input type="submit" value="Sign up">

        </form>
    </div>
    <div class="form-style-6">
        <h1>Already Registered</h1>
    <table>
        <tr>
            <th>Username</th>
            <th>Birthday</th>
        </tr>
        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.username}</td>
                <td>${user.birthday}</td>
            </tr>
        </c:forEach>
    </table>
    </div>
</body>
</html>
