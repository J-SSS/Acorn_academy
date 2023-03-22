<%@ page import="java.util.List" %>
<%@ page import="com.acorn.webappboard.dto.BoardsDto" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="/templates/headerNav.jsp"%>
<%
    Object obj = request.getAttribute("boardsDtoList");
    List<BoardsDto> list = (List<BoardsDto>) obj;

    /*
    [
    BoardsDto(bId=3, uId=user03, postTime=2023-03-08 14:40:25.0, updateTime=2023-03-14 17:12:28.0, status=PUBLIC, title=게시글입니다, content=게시글입니다, viewCount=0),
    BoardsDto(bId=4, uId=user04, postTime=2023-03-08 14:40:25.0, updateTime=2023-03-08 14:40:25.0, status=PUBLIC, title=네 번째 글입니다.
    ]
     */
%>
<h2>게시글 리스트</h2>

<table>
    <thead>
        <tr>
            <th>글번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성시간</th>
            <th>상태</th>
            <th>조회수</th>
            <th>상세보기링크</th>
        </tr>
    </thead>
    <tbody>
        <% for(BoardsDto board : list) { %>
            <tr>
                <td><%=board.getBId()%></td>
                <td><%=board.getTitle()%></td>
                <td><%=board.getUId()%></td>
                <td><%=board.getPostTime()%></td>
                <td><%=board.getStatus()%></td>
                <td><%=board.getViewCount()%></td>
                <td>상세보기링크</td>
            </tr>
        <%}%>
    </tbody>
</table>

<ul>
    <li>First</li>
    <li>Prev</li>
    <% for(BoardsDto board : list) { %>
    <%}%>
    <li>Next</li>
    <li>Last</li>
</ul>
<%--<p><%=list%></p>--%>
<%--<%%>--%>
</body>
</html>
