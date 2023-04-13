<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    UsersDto user=(UsersDto) request.getAttribute("user");
%>
<%@include file="/templates/headerNav.jsp"%>
<main class="container">
    <h1 class="my-4">유저 상세</h1>
    <p>아이디 : <strong><%=user.getUId()%></strong></p>
    <p>이름 : <strong><%=user.getName()%></strong></p>
    <p>가입일 : <strong><%=user.getPostTime()%></strong></p>
    <p>프로필 : <img class="img-thumbnail" style="width: 100px" src="<%=request.getContextPath()+"/"+user.getImgPath()%>"></p>
    <p>핸드폰: <strong><%=user.getPhone()%></strong></p>
    <p>이메일 : <strong><%=user.getEmail()%></strong></p>
    <p>생일 : <strong><%=user.getBirth()%></strong></p>
    <p>성별 : <strong><%=user.getGender()%></strong></p>
    <p>주소 : <strong><%=user.getAddress()%></strong></p>
    <p>주소상세 : <strong><%=user.getDetailAddress()%></strong></p>
    <p>등급(상태) : <strong><%=user.getPermission()%></strong></p>
    <p><a href="./update.do?u_id=<%=user.getUId()%>">수정폼</a></p>
    <%--   시멘틱요소 :
            검색엔진 로봇이 해당 웹앱을 분석할 때 구조 및 정보를 파악하기 위해 태그를 사용하는 것,
            프로그래머가 해당 태그의 이름으로 어떤 목적인지 파악할 때 사용,
            시각장애인이 해당 웹앱을 이용할때 말로 설명하는 것을 시멘틱요소를 이용한다.
            b : 두껍게
            strong : 두껍게 + 강조
            div : 블럭
            nav : 블럭+네비게이션
            header : 블럭+해더정보
            footer : 블럭+회사정보
            main : 블럭+내용
            .......
    --%>
</main>
</body>
</html>
