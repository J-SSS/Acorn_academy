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
        <li><a href="l09_document_traveling.html">09. document domtree와 node 객체</a></li>
        <li><a href="l10_event.html">10. event</a></li>
        <li><a href="l11_image_slide.html">10. 이미지 슬라이드 만들기</a></li>
        <li><a href="l12_class.html">12. 자바스크립트의 클래스 문법(static sugar)</a></li>
        <li><a href="l13_getter_setter.html">13. class의 getter setter</a></li>
        <li><a href="l14_emp_list.do">14. 자바에서 DTO 사용해보기~!(Emp.List)</a></li>
        <li><a href="l15_timing_function.html">15. 타이밍함수 setTimeout과 setInterval(자바의 new Thread)</a></li>
        <li><a href="l16_this_bind.html">16. 함수의 binding과 화살표함수</a></li>
        <li><a href="l17_promise.html">17. Promise와 Promise회로 멀티스레드 동기화</a></li>
        <li><a href="l18_promise_chainning.html">18. Promise 체이닝과 프라미스화로 비동기코드(멀티스레드)를 계속 동기화하기</a></li>
        <li><a href="l19_ajax_xmlhttprequest.html">19. Ajax와 XMLhttpRequest객체</a></li>
        <li><a href="l20_ajax_fetch.html">20. Ajax와 fetch api와 promise</a></li>
        <li><a href="l21_async_function.html">21. Ajax와 async함수</a></li>
        <li><a href="l22_node_append.html">22. node 생성과 추가</a></li>
        <li><a href="">23. </a></li>
        <li><a href="test.html">13. js를 참조하는 방법들 (태그, 파일(defer async))</a></li>
    </ul>

</nav>


<script>
    //HTML에서 js의 실행 순서는 DOMTree와 연관이 있다
    //HTML 문서가 브라우저에서 로딩되면서 스크립트 태그가 있으면 실행된다.
    //만약 스크립트 문서가 참조되고 있으면 다운받고 실행한다.

    // alert("안녕하세요? 스크립트로 경고창을 생성했습니다.")
    console.log("안녕하세요? 스크립트로 경고창을 생성했습니다.")

</script>


<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>