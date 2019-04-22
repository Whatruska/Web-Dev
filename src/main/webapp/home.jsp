<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Homepage</title>
    <link rel="stylesheet" href="resources/style.css">
</head>
<body>
    <div class="form-style-6">
    <h1 style="color: ${cookie.color.value}">Hello</h1>
        <form action="home" method="post">
    <select name="color" id="select">
        <option value="red">Red</option>
        <option value="blue">Blue</option>
        <option value="green">Green</option>
        <option value="yellow">Yellow</option>
        <option value="gray">Gray</option>
        <option value="black">Black</option>
    </select>
            <input type="submit" value="Change color">
        </form>
    </div>
</body>
</html>
