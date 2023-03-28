<%@ page import="com.acorn.webappboard.dto.UsersDto" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <%@include file="/templates/headerNav.jsp"%>
    <h1>Web App 과 Web App Server </h1>
    <h2>동적 리소스 네비게이션</h2>
    <ul>
        <li><a href="./model1/boardList.do">model1 boards 리스트</a></li>
        <li><a href="./model1/boardInsert.do">model1 boards 등록</a></li>
        <li><a href="./users/login.do">model2 users 로그인 폼</a></li>
        <li><a href="./boards/list.do">board list</a></li>
        <li><a href=""></a></li>
    </ul>
    <a href="hello-servlet">Hello Servlet</a>

    <h2>톰캣과 Web App Server 와 Web App</h2>
    <ul>
        <li>Web App Server : 동적리소스를 반환하는 웹 서버</li>
        <li>톰캣 : 자바를 동적 리소스로 하는 웹 서버 </li>
        <li>Web App : 톰캣에서 실행하는 프로젝트, 톰캣에서 배포하는 동적리소스의 집합, 웹 앱 개발자의 산물, 동적 리소스 (네이버)</li>
    </ul>
    <h2>아파치와 Web Server</h2>
    <ul>
        <li>Web Server : http 통신을 하는 서버로 정적리소스를 반환</li>
        <li>http : HyperText Transfer Protocol html 주고받는 통신 규약(웹의 통신규약) </li>
        <li>아파치 : 가장 많이 사용하는 http 서버 중 하나</li>
    </ul>
    <h2>아파치 톰캣</h2>
    <p>정적리소스는 아파치가 동적 리소스틑 톰캣이 실행</p>

    <h2>메이븐 Maven 프로젝트</h2>
    <ul>
        <li>프로젝트를 빌드하는 도구이자 구조</li>
        <li>저장소(.m2 repository)에서 라이브러리의 종속성 관리(dependency)</li>
        <li>Junit 으로 단위 테스트를 할 수 있도록 제공 => 테스트 주도개발</li>
        <li>Gradle : 메이븐과 아주 유사한데 관리하는 파일 형식이 json 이고 성능이 더 좋다.</li>
        <li>npm : node 에서 사용되는 js 라이브러리 종속성관리 및 빌드 도구 및 단위 테스트(jest)</li>
        <li>yarn : npm 이 종속성 관리를 잘 못해서 등장한 도구 </li>
    </ul>
    <h2>Servlet 과 동적 리소스</h2>
    <ul>
        <li>동적 리소스 : 리소스를 요청할 때마다 내용이 바뀔 수 있는 것(웹앱서버가 동적리소스를 실행하고 반환하게 때문)</li>
        <li>정적 리소스 : 내용이 바뀌지 않는 리소스 (html,css,js(문서는 똑같은데 브라우저가 실행),mp3,mp4,png........)</li>
        <li>Servlet : 톰캣에서 실행되는 동적리소스로 java 로 되어있다.</li>
    </ul>
    <h2>톰캣의 웹앱에서 동적리소스와 정적리소스의 경로!</h2>
    <ul>
        <li>동적 리소스 경로 : src>main>java>* 인데 web.xml 에 동적리소스라 명시한 것들</li>
        <li>정적 리소스 경로 : src>main>webapp>* 인데 WEB-INF 와 jsp 파일은 제외 (요청하면 바로 배포됨)</li>
        <li>WEB-INF : 배포되지 않는 경로로 설정파일이 존재 </li>
        <li>web.xml : DD Development Descriptor 배포서술자로 배포할 동적리소스를 서술 및 웹앱 설정을 하는 곳</li>
        <li>jsp : 동적리소스가 정적리소스인척하는 파일로 템플릿엔진이라 부른다.
            (코드는 자바로 작성하지만 컴파일러 따로 존재해서 스크립트처럼 문자열을 그대로 실행 나중에)</li>
        <li>@WebServlet : 컴파일시 자동으로 web.xml 에 해당 서블릿을 배포하도록 설정한다.</li>
    </ul>
    <h2>디자인 패턴 model1 과 model2</h2>
    <ul>
        <li>model1 : 서비스로직(Model:dao,service),요청과 응답처리(Controller),유저인터페이스인 뷰(View)가 한페이지(동적페이지) 존재하는 로직</li>
        <li>model2 : Model 과 Controller, View 과 분리되어 관리되는 디자인패턴 </li>
        <li>model2 장점 : 모듈화로 인한 재사용성의 늘어나서 유지보수가 쉽다.</li>
        <li>model2 장점2 : 역할 분담으로 생산성을 높일 수 있다.</li>
        <li>model2 장점3 : 각 로직에서 사용되는 라이브러리(JPA,Mybatis,Sass,Less,React..)나 프레임워크(Spring,Junit) 적용이 용이하다 </li>
    </ul>
</body>
</html>
