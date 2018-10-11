<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ran
  Date: 2018/10/11
  Time: 下午3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>--%>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>baseInfo</title>
</head>
<body>

    <c:forEach items="${infoList}" var="info">
        <li id="info_<c:out value="info.id"/>">
            <div class="infoMessage">
                <c:out value="${info.message}"></c:out>
            </div>
            <div>
                <span class="infoTime"><c:out value="${info.time}"/></span>
                <span class="infoLocation">
                    (<c:out value="${info.latitude}"/>,
                    <c:out value="${info.longitude}"/>)
                </span>
            </div>
        </li>

    </c:forEach>
</body>
</html>
