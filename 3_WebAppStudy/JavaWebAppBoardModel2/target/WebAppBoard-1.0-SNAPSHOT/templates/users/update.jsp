<%--
  Created by IntelliJ IDEA.
  User: dongr
  Date: 2023-03-17
  Time: 오전 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원정보 수정</title>
</head>
<body>
    <%
        UsersDto user = (UsersDto) request.getAttribute("user");
    %>
    <%@include file="/templates/headerNav.jsp"%>
    <main class="container">
        <h1 class="my-4">유저 수정</h1>
        <form action="./update.do" method="post" style="width:500px; margin : 0 auto;">
            <input type = "hidden" name="u_id" value="<%=user.getUId()%>">
            <p>아이디 : <strong><%=user.getUId()%></strong></p>
            <p>가입일 : <strong><%=user.getPostTime()%></strong></p>
            <p>등급(상태) : <strong><%=user.getPermission()%></strong></p>
            <p class="form-floating">
                <input type="text" name="name" value="<%=user.getName()%>" class="form-control" placeholder="??">
                <label for="">이름</label>
            </p>
            <p class="form-floating">
                <input type="password" name="pw" value="<%=user.getPw()%>" class="form-control" placeholder="??">
                <label for="">패스워드</label>
            </p>
            <p>프로필 : <strong><%=user.getImgPath()%></strong></p>
            <p class="input-group">
                <label class="input-group-text">프로필</label>
                <input type="file" name="img_path" value="<%=user.getImgPath()%>" class="form-control" placeholder="??">
            </p>
            <p class="form-floating">
                <input type="text" name="phone" value="<%=user.getPhone()%>" class="form-control" placeholder="??">
                <label for="">핸드폰</label>
            </p>
            <p class="form-floating">
                <input type="text" name="email" value="<%=user.getEmail()%>" class="form-control" placeholder="??">
                <label for="">이메일</label>
            </p>
            <p class="form-floating">
                <input type="date" name="birth" value="<%=user.getBirth()%>" class="form-control" placeholder="??">
                <label for="">생일</label>
            </p>
            <p class="form-floating">
                <%-- readonly, selected, check, defer, aysnc... 쓰는 것 자체로 true속성을 갖고있음
                    readonly="false"는 안통함
                    false를 하고 싶으면 속성 자체를 안쓰거나, removeAttribute("readonly")로 속성을 지워야함
                    --%>
               <select name="gender">
                   <option value="MALE" <%if(user.getGender().equals("MALE")){%> selected <%}%> > 남자</option>
                   <option value="FEMALE" <%if(user.getGender().equals("FEMAIL")){%> selected <%}%> >여자</option>
                   <option value="NONE" <%if(user.getGender().equals("NONE")){%> selected <%}%> >없음</option>
               </select>
                <label for="">성별</label>
            </p>
            <p class="form-floating">
                <input type="text" name="address" value="<%=user.getAddress()%>" class="form-control" placeholder="??">
                <label for="">주소</label>
            </p>
            <p class="form-floating">
                <input type="text" name="detail_address" value="<%=user.getDetailAddress()%>" class="form-control" placeholder="??">
                <label for="">주소상세</label>
            </p>
            <p class="text-end">
                <a class="btn btn-outline-danger" href="./delete.do?u_id=<%=user.getUId()%>">탈퇴</a>
                <button class="btn btn-outline-primary">수정</button>
            </p>
       </form>


    </main>
</body>
</html>
