<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%@include file="/templates/headerNav.jsp"%>
    <div class="mx-auto mt-5" style="width: 400px">
        <h1 class="py-4">로그인 폼 </h1>
        <form action="./login.do" method="post">
            <p class="form-floating">
                <input class="form-control" type="text" name="u_id" value="user05">
                <label>유저 아이디</label>
            </p>
            <p class="form-floating">
                <input class="form-control" type="password" name="pw" value="1234">
                <label>패스워드</label>
            </p>
            <p class="form-check">
                <label>
                    <input class="form-check-input" type="checkbox" name="autoLogin" value="1">
                    자동로그인
                </label>
            </p>
            <p class="text-end">
                <a class="btn btn-outline-warning" href="./signup.do">회원가입</a>
                <button class="btn btn-outline-primary">로그인</button>
            </p>
        </form>
    </div>
</body>
</html>
