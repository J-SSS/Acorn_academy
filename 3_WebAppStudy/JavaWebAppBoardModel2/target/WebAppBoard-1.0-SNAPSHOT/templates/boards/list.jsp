<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="/templates/headerNav.jsp"%>
<%
    Object obj = request.getAttribute("boardsDtoList");
%>
<p><%=obj%></p>
</body>
</html>
