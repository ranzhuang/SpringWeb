<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: ran
  Date: 2018/10/11
  Time: 上午10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SpringWeb</title>
    <link rel="stylesheet"
          typ="text/css"
          href="<c:url value="/resources/style.css"/>">
</head>
<body>
    <h1>welcome to SpringWeb</h1>
    <a href="<c:url value="/baseInfo"/>">springWebInf</a> |
    <a href="<c:url value="/springWeb/register"/> ">Register</a>
</body>
</html>
