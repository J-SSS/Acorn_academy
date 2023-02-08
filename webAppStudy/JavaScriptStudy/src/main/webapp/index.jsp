<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1>JavaScript에 대해 배워보자</h1>
    <p>js의 역사 : 브라우저를 동적(브라우저가 이벤트에 반응)으로 만들기 위해 개발된 언어로서 <br>
    JAVA가 인기있는 언어라서 그냥 JAVA라는 이름을 따온거임 JAVA에서 이름 사용을 못하게 해서 ECMAScript, es로 불린다 es6는 표준화된 버전을 의미한다.
    </p>
    <p>바닐라 js : js로 된 라이브러리나 프레임워크(jquery, react, view등등...)을 사용하지 않고 순수한 js문법만 사용</p>
    <p>예전에는 바닐라js로 개발이 불가능했다. es6로 표준화되면서 가능해졌다... (크로스브라우징)</p>
<nav>
    <ul>
        <li><a href="l00_variable_const.html">00. 변수와 상수(var, let, const)</a></li>
        <li><a href="l01_var_hoisting.html">01. window 필드 var 변수의 hoisting 현상(*)</a></li>
        <li><a href="l02_primaritve_type.html">02. 기본데이터타입(number,bigint,string,boolean,symbol,null,undefined)</a></li>
        <li><a href="l03_object_type.html">03. 자료형(Object {}, prototype)</a></li>
        <li><a href="l04_array_list.html">04. 배열(ArrayList [] (Array와 List를 구분하지않음)</a></li>
        <li><a href="l05_function.html">05. 함수</a></li>
        <li><a href="l06_for.html">06. 반복문 (for, 내부반복문, iterator 반복문)</a></li>
        <li><a href="l07_if.html">07. If,Switch</a></li>
        <li><a href="l08_array_Iteration.html">08. 배열의 내부 반복문(Iteration)과 정렬</a></li>
        <li><a href="l09_document_traveling.html">12. document domtree와 node 객체</a></li>
        <li><a href="">09. 함수와 타입</a></li>
        <li><a href="">10. JSON과 object</a></li>
        <li><a href="">11. 브라우저 객체 window와 document</a></li>
        <li><a href="">13. js를 참조하는 방법들 (태그, 파일(defer async))</a></li>
    </ul>

</nav>


<script>
    //HTML에서 js의 실행 순서는 DOMTree와 연관이 있다
    //HTML 문서가 브라우저에서 로딩되면서 스크립트 태그가 있으면 실행된다.
    //만약 스크립트 문서가 참조되고 있으면 다운받고 실행한다.

    alert("안녕하세요? 스크립트로 경고창을 생성했습니다.")
    console.log("안녕하세요? 스크립트로 경고창을 생성했습니다.")

</script>


<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>