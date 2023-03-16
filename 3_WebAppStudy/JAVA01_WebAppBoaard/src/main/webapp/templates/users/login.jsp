<%--
  Created by IntelliJ IDEA.
  User: dongr
  Date: 2023-03-16
  Time: 오전 11:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% //java문법 블록
      int i = 0;
    %>
    <h1>로그인 폼 <%=i++%></h1>
    <form action="./login.do" method="post">
        <p>
            <label>
                u_id :
                <input type="text" name="u_id" value="user05">
            </label>
        </p>
        <p>
            <label>
                password :
                <input type="password" name="pw" value="1234">
            </label>
        </p>
        <p>
            <button>로그인</button>
            <a href="./signup.do">회원가입</a>
        </p>
</body>
</html>
