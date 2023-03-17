<%@ page import="com.acorn.webappboard.dto.UsersDto" %><%--
  Created by IntelliJ IDEA.
  User: dongr
  Date: 2023-03-17
  Time: 오전 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java"  pageEncoding="UTF-8" %>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>
<%
    String contextPath = request.getContextPath();
%>
<link rel="stylesheet" href="<%=contextPath%>/public/bootstrap/css/bootstrap.css">
<script src="<%=contextPath%>/public/bootstrap/js/bootstrap.bundle.js"></script>

<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="<%=contextPath%>">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="#">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Dropdown
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="<%=contextPath%>/model1/boardList.do">리스트</a></li>
                        <li><a class="dropdown-item" href="<%=contextPath%>/model1/boardInsert.do">등록폼</a></li>

                    </ul>
                </li>
            </ul>
<%
    Object loginUser_obj = session.getAttribute("loginUser");
%>
            <ul class="d-flex breadcrumb mb-0" role="search">
            <%
                if(loginUser_obj ==null){
            %>
                <li class="breadcrumb-item">
                   <a class="nav-link" href="<%=contextPath%>/users/login.do">로그인</a>
                </li>
                <li class="breadcrumb-item">
                   <a class="nav-link" href="<%=contextPath%>/users/signup.do">회원가입</a>
                </li>
            <%
                } else {
                    UsersDto loginUser = (UsersDto) loginUser_obj;
                    //타입의 다형성 : 매개변수나 변수가 여러 타입의 객체를 참조할 수 있다 => 제네릭
            %>
                <li class="breadcrumb-item">
                    <a href="<%=contextPath%>/users/detail.do?u_id=<%=loginUser.getUId()%>">
                        (<%=loginUser.getUId()%>)<%=loginUser.getName()%>
                    </a>
                </li>
                <li class="breadcrumb-item">
                    <a href="<%=contextPath%>/users/logout.do">로그아웃</a>
                </li>
            <%}%>
            </ul>
        </div>
    </div>
</nav>
