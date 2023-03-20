<%@ page import="com.acorn.webappboard.dto.UsersDto" %>
<%@ page language="java" pageEncoding="UTF-8" %>
<%
String contextPath=request.getContextPath();
%>
<link rel="stylesheet" href="<%=contextPath%>/public/bootstrap/css/bootstrap.css">
<script src="<%=contextPath%>/public/bootstrap/js/bootstrap.bundle.js"></script>

<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="<%=contextPath%>/">HOME</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Model1Board
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="<%=contextPath%>/model1/boardList.do">리스트</a></li>
                        <li><a class="dropdown-item" href="<%=contextPath%>/model1/boardInsert.do">등록폼</a></li>
                    </ul>
                </li>
            </ul>
            <% Object loginUser_obj=session.getAttribute("loginUser"); %>
            <ul class="d-flex breadcrumb mb-0">
                <% if(loginUser_obj==null){ %>
                    <li class="breadcrumb-item">
                        <a class="" href="<%=contextPath%>/users/login.do">로그인</a>
                    </li>
                    <li class="breadcrumb-item">
                        <a class="" href="<%=contextPath%>/users/signup.do">회원가입</a>
                    </li>
                <%
                    }else{
                    UsersDto loginUser=(UsersDto) loginUser_obj;
                    //타입의 다형성 : 매개변수나 변수가 여러 타입의 객체를 참조할 수 있다.=> 제네릭!
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
<!-- 액션페이지(등록, 수정, 삭제) 메시지 모달 -->
<!-- html+java 주석
     redirect 되는 페이지에 파라미터 전달하기
    1.쿼리스트링으로 전달 ?actionMsg=등록성공 : 권장하지 않는다..!!
    2.세션객체로 전달하고 바로 삭제 : 권장
    3. 세션객체로 전달하고 바로 삭제하는 라이브러리... 사용권장!!
    but, 톰켓에선 사용불가. express : connect-flash, spring : redirectAttribute

-->
<%
    //1
//    String actionMsg = request.getParameter("actionMsg");
    Object actionMsg= session.getAttribute("actionMsg");
    session.removeAttribute("actionMsg");
%>
<% if(actionMsg!=null){ %>

<%--<%--%>
<%--    Object actionMsg= session.getAttribute("actionMsg");--%>
<%--    session.removeAttribute("actionMsg");//리다이렉트 페이지하는 곳에서 한번만 메세지 출력하기 위해 바로 삭제--%>
<%--    if(actionMsg!=null){--%>

<%--%>--%>
<div class="modal fade" id="actionMsgModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h1 class="modal-title fs-5">Modal title</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <%=actionMsg%>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<script>
    //모달 띄우기
    const actionModal = new bootstrap.Modal(document.getElementById("actionMsgModal"), {});
    actionModal.show()
</script>
<%
    }
%>
