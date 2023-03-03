console.log("안녕하세요!?!?");
//java class파일명 : jvm class 파일의 main 메소드 실행
// !=
//node js 파일명 : v8엔진 js파일 실행한다.
//브라우저의 js 실행 : html문서에 js script태그가 있으면 v8엔진이 실행됨
//console.log(window); // 브라우저에서 js가 실행되면 제공되는 전역필드
//console.log(document); //html문서를 받는 필드

console.log(this); //node js에서 정의한 전역필드
//문법은 바닐라 js를 그대로 따라간다
//window.setInterval(), window.setTimeout() : 윈도우 필드 말고 전역에서 존재함

setInterval(()=>{
    console.log(new Date());
},1000)

// node js는 자바스크립트를 서버단에서 사용하기 위한 언어다.
// node js에서 제공하는 필드 중에서 서버 모듈(http)이 존재한다.(서버다..!!)
// nodejs는 maven처럼 프로젝트 빌드와 라이브러리 의존성 주입을 할 수 있다(npm)
