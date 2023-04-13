<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body class="bg-danger bg-opacity-10">
<%@include file="/templates/headerNav.jsp"%>
<%UsersDto user=(UsersDto) request.getAttribute("user");%>
<div class="mx-auto mt-5" style="width: 400px">
    <h1 class="py-4">회원 탈퇴 폼</h1>
    <form  action="./delete.do" method="post">
        <p class="form-floating">
            <input class="form-control" type="text" name="u_id" value="<%=user.getUId()%>"readonly>
            <label>유저 아이디</label>
        </p>
        <p class="form-floating">
            <input class="form-control" type="password" name="pw" value="">
            <label>패스워드</label>
        </p>
        <p class="text-end">
            <button class="btn btn-outline-danger">탈퇴</button>
        </p>
    </form>
</div>
</body>
</html>
