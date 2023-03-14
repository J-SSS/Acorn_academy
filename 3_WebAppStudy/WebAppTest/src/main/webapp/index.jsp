<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1><%= "Hello World!" %></h1>
    <h1>Web App과 Web App Server </h1>
    <h2>동적 리소스 네비게이션</h2>
    <ul>
        <li><a href="sum.do?a=10&b=33">sum(a+b) 동적리소스</a></li>
        <li><a href="./model1/boardList.do">model1 boards 리스트</a></li>
        <li><a href=""></a></li>
        <li><a href=""></a></li>
        <li><a href=""></a></li>
    </ul>
    <a href="hello-servlet">Hello Servlet</a>
    <br/>
    <h2>톰캣과 Web App Server와 Web App</h2>
    <ul>
        <li>Web App Server : 동적리소스를 반환하는 웹 서버 </li>
        <li>톰캣 : 자바를 동적 리소스로 하는 웹 서버 </li>
        <li>Web App : 톰캣에서 실행하는 프로젝트, 톰캣에서 배포하는 동적리소스의 집합, 웹 앱 개발자의 산물 </li>
    </ul>
    <h2>아파치와 Web Server</h2>
    <ul>
        <li>Web Server : http 통신을 하는 서버로 정적 리소스를 반환함</li>
        <li>http : HyperTextTransferProtocol : html을 주고받는 통신 규약(웹의 통신규약)</li>
        <li>아파치 : 가장 많이 사용하는 http 서버 중 하나다. </li>
    </ul>
    <h2>아파치 톰캣</h2>
    <p>정적리소스는 아파치가, 동적리소스는 톰캣이 실행</p>

    <h2>메이븐 Maven 프로젝트</h2>
    <ul>
        <li>프로젝트를 빌드하는 도구이자, 구조</li>
        <li>저장소(.m2 repository)라이브러리의 종속성 관리(dependency) </li>
        <li>Junit으로 단위 테스트를 할 수 있도록 제공 => 테스트 주도 개발</li>
        <li>Gradle : 메이븐과 아주 유사한데, 관리하는 파일 형식이 json이며 성능이 더 좋다.</li>
    </ul>

    <h2>Servlet과 동적 리소스</h2>
    <ul>
        <li>동적 리소스 : 리소스를 요청 할 때 마다 내용이 바뀔 수 있는 것(웹 앱 서버가 동적리소스를 실행하고 반환하기때문...)</li>
        <li>정적 리소스 : 내용이 바뀌지 않는 리소스(html,css,js(문서는 같은데 브라우저가 실행),음원,이미지 등)</li>
        <li>Servlet : 톰캣에서 실행되는 동적리소스로 java로 되어있다.</li>
    </ul>

    <h2>톰캣의 웹앱에서 동적리소스와 정적리소스의 경로</h2>
    <ul>
        <li>동 : src > main > java > * 중에서 web.xml에 동적리소스라 명시한 것들</li>
        <li>정 : src > main > webapp > * 중에서 Web-INF와 jsp파일을 제외한것(요청하면 바로 배포됨) :</li>
        <li>Web-Inf : 배포되지 않는 경로로서 설정파일을 담아둠</li>
        <li>web.xml : DD :development Descriptor : 배포 서술자 (배포할 동적 리소스를 서술 및 웹앱을 설정하는 곳) = 총괄지휘</li>
        <li>jsp : 동적리소스인데 정적리소스인척 하는 파일로, 템플릿엔진이라고 부름(코드는 자바인데 컴파일러 따로 존재해서 스크립트처럼 문자열을 그대로 실행</li>
    </ul>
</body>
</html>
