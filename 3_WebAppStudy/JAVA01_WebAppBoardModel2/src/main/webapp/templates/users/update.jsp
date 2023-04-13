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
        <form action="./update.do" method="post" style="width: 500px;margin: 0 auto;">
            <h1 class="my-4">유저 수정폼</h1>
            <input type="hidden" name="u_id" value="<%=user.getUId()%>">
            <p>아이디 : <strong><%=user.getUId()%></strong></p>
            <p>가입일 : <strong><%=user.getPostTime()%></strong></p>
            <p>등급(상태) : <strong><%=user.getPermission()%></strong></p>
            <p class="form-floating">
                <input type="text" name="name" value="<%=user.getName()%>" class="form-control" placeholder="??">
                <label>이름</label>
            </p>
            <p class="form-floating">
                <input type="password" name="pw" value="<%=user.getPw()%>" class="form-control" placeholder="??">
                <label>패스워드</label>
            </p>
            <p>프로필 : <strong><%=user.getImgPath()%></strong></p>
            <p class="input-group">
                <label class="input-group-text">새 프로필</label>
                <input type="file" name="img_path" value="<%=user.getImgPath()%>" class="form-control" placeholder="??">
            </p>
            <p class="form-floating">
                <input type="text" name="phone" value="<%=user.getPhone()%>" class="form-control" placeholder="??">
                <label>핸드폰</label>
            </p>
            <p class="form-floating">
                <input type="text" name="email" value="<%=user.getEmail()%>" class="form-control" placeholder="??">
                <label>이메일</label>
            </p>
            <p class="form-floating">
                <input type="date" name="birth" value="<%=user.getBirth()%>" class="form-control" placeholder="??">
                <label>생일</label>
            </p>
            <p class="form-floating">
                <%--   readonly,selected,checked,defer,async,....  속성자체가 있는 것이 true
                       readonly="false"(X) 존재하기 때문에 true
                       false 를 하고 싶으면 안쓰거나 removeAttribute("readonly")로 속성을 지워야한다.
                --%>
                <select name="gender" class="form-control">
                    <option value="MALE" <%if(user.getGender().equals("MALE")){%> selected <%}%> >남자</option>
                    <option value="FEMALE" <%if(user.getGender().equals("FEMALE")){%> selected <%}%> >여자</option>
                    <option value="NONE" <%if(user.getGender().equals("NONE")){%> selected <%}%>>없음</option>
                </select>
                <label>성별</label>
            </p>
            <p class="form-floating">
                <input type="text" name="address" value="<%=user.getAddress()%>" class="form-control" placeholder="??">
                <label>주소</label>
            </p>
            <p class="form-floating">
                <input type="text" name="detail_address" value="<%=user.getDetailAddress()%>" class="form-control" placeholder="??">
                <label>주소상세</label>
            </p>
            <p class="text-end">
                <a class="btn btn-outline-danger" href="./delete.do?u_id=<%=user.getUId()%>">탈퇴</a>
                <button class="btn btn-outline-primary">수정</button>
            </p>
        </form>
    </main>

</body>
</html>
