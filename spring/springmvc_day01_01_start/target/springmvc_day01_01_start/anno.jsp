<%--
  Created by IntelliJ IDEA.
  User: 85305
  Date: 2019/10/23
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--常用的 注解--%>
<a href="anno/RequestParam?username=haha">RequestParam</a>
<%--get请求没有请求体--%>
<br>
<form action="anno/testRequestBody" method="post">

    用户姓名：<input type="text" name="username"></br>
    用户年龄：<input type="text" name="age"></br>

    提交：<input type="submit" value="提交"></br>
</form>
<a href="anno/testPathVariable/10">PathVariable</a>


<a href="anno/testRequestHeader">RequestHeader</a><br>

<a href="anno/testCookieValue">CookieValue</a>

<br>
<form action="anno/testModelAttribute" method="post">

    用户姓名：<input type="text" name="uname"></br>
    用户年龄：<input type="text" name="age"></br>

    提交：<input type="submit" value="提交"></br>
</form>
<br>
<a href="anno/testSessionAttribute">SessionAttribute</a><br>
<a href="anno/getSessionAttribute">getSessionAttribute</a>
<a href="anno/delSessionAttribute">删除</a>


</body>
</html>
