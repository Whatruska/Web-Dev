<%--
  Created by IntelliJ IDEA.
  User: vitalij
  Date: 2019-04-21
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" href="resources/style.css">
</head>
<body>
<div class="form-style-6">
    <h1>Authorization</h1>
    <form action="login" method="post">

        <input type="text" name="login" placeholder="Login">
        <input type="password" name="password" placeholder="Password">
        <input type="submit" value="Login">

    </form>
    <form action="signUp.jsp" method="get">
        <input type="submit" value="Sign Up">
    </form>
</div>
</body>
</html>
