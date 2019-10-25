<%--
  Created by IntelliJ IDEA.
  User: 85305
  Date: 2019/10/22
  Time: 19:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--请求参数绑定--%>
<%--<a href="param/testParam?username=hehe&password=123">请求参数绑定</a>--%>
<%--post请求中文乱码--%>
<%--把数据封装到Account中--%>
<%--    <form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"></br>
        密码：<input type="text" name="password"></br>
        金额：<input type="text" name="money"></br>
    &lt;%&ndash;    提交到Account类中的user对象的uname和age中&ndash;%&gt;
    &lt;%&ndash;    封装后结果：Account{username='zhangsan', password='uc76', money=222.0, user=User{uname='ss', age=33}}&ndash;%&gt;
        用户姓名：<input type="text" name="user.uname"></br>
        用户年龄：<input type="text" name="user.age"></br>
        提交：<input type="submit" value="提交"></br>
    </form>--%>
<%--把数据封装到Account中，类中存在list和map集合--%>
    <%--<form action="param/saveAccount" method="post">
        姓名：<input type="text" name="username"></br>
        密码：<input type="text" name="password"></br>
        金额：<input type="text" name="money"></br>
        &lt;%&ndash;    提交到Account类中的user对象的uname和age中&ndash;%&gt;
        &lt;%&ndash;    封装后结果：Account{username='zhangsan', password='uc76', money=222.0, user=User{uname='ss', age=33}}&ndash;%&gt;
        用户姓名：<input type="text" name="list[0].uname"></br>
        用户年龄：<input type="text" name="list[0].age"></br>
        用户姓名：<input type="text" name="map['one'].uname"></br>
        用户年龄：<input type="text" name="map['one'].age"></br>
        提交：<input type="submit" value="提交"></br>
    </form>--%>

<%--自定义类型转换器--%>
<form action="param/saveUser" method="post">

    用户姓名：<input type="text" name="uname"></br>
    用户年龄：<input type="text" name="age"></br>
    用户生日：<input type="text" name="date"></br>

    提交：<input type="submit" value="提交"></br>
</form>
<%--<a href="param/testServlet">测试servlet原生api</a>--%>
</body>
</html>
