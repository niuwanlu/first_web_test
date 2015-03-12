<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Users Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<%--<h1>--%>
    <%--Add a User--%>
<%--</h1>--%>


    <%--<table>--%>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--<form:label path="id">--%>
                        <%--<spring:message text="ID"/>--%>
                    <%--</form:label>--%>
                <%--</td>--%>
            <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>--%>
                <%--<label for="username">--%>
                    <%--<spring:message text="Name"/>--%>
                <%--</label>--%>
                <%--<input name="username" id="username"/>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>--%>
                <%--<label for="password">--%>
                    <%--<spring:message text="Password"/>--%>
                <%--</label>--%>
                <%--<input name="password" id="password"/>--%>
            <%--</td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>--%>
                    <%--<input type="submit"--%>
                           <%--value="<spring:message text="Add User"/>" />--%>
            <%--</td>--%>
        <%--</tr>--%>
    <%--</table>--%>

<%--<br>--%>

<%--<h3>Users List</h3>--%>
    <%--<table class="tg">--%>
        <%--<tr>--%>
            <%--<th width="80">User ID</th>--%>
            <%--<th width="120">User Name</th>--%>
            <%--<th width="120">User Password</th>--%>
        <%--</tr>--%>
        <%--<c:forEach items="${listUsers}" var="person">--%>
            <%--<tr>--%>
                <%--<td>${person.id}</td>--%>
                <%--<td>${person.name}</td>--%>
                <%--<td>${person.country}</td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
${id}
${username}
</body>
</html>