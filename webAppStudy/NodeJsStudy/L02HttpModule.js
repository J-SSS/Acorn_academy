//nodejs에서 라이브러리(=모듈)를 import 하는 방법
const http = require("http");

//http = http서버를 생성하고 클라이언트의 요청을 처리할 수 있다.(웹앱서버)
console.log(http);

http.createServer(function (req,res){
    let url = req.url.split("?")[0];// 요청한 리소스의 주소
    let queryString = req.url.split("?")[1]; //요청한 파라미터들
    console.log(url)
    res.setHeader("content-type","text/html;charset=UTF-8")
    if(url=="/"){ //index 동적페이지
        res.write("<h1>node js의 http 모듈 안녕...!</h1>")
        res.write("<h2>npm으로 nodemon 설치</h2>")
        res.write("<p>npm은 노드 패키지 매니저로 라이브러리 의존성 주입을 한312다</p>")
        res.write(`<p>
                    <a href='power.do?a=3&b=6'>파라미터 a,b로 거듭제곱한 결과물을 반환하는 동적페이지</a>
                    </p>`)
        res.end();

    } else if(url=="/power.do"){
        // ?    key=value & key=value & key=value
        const params = queryString.split("&"); //["key=val","key=val","key=val"]
        // 오브젝트 형태로 {key:val, key:val2...}로 만들면 편하겠지??
        const paramObj={};
        params.forEach((p)=>{
            let key = p.split("=")[0];
            let value = p.split("=")[1];
            paramObj[key]=value;
        })
        res.write("<h1>실행 결과는 !?!?</h1>")
        res.write(`<h1>${paramObj.a} 거듭제곱 ${paramObj.b}의 결과는 :
                ${Math.pow(paramObj.a, paramObj.b)}
                </h1>`);
        res.end();
    }

    else { //찾는 리소스가 없는 경우
        // req.statusCode=404
        res.write("<h1>찾는 리소스가 없습니다...</h1>")
        res.end();
    }

}).listen(7070); // 현재 아이피주소(localHost)에서 7070입력하면 => 서버에 접속

// 톰캣은 서블릿만 구현하면 서버역할을 해줌
// 노드는 둘 다 해야하는데 서버구현에서 크게 할건 없음

// 포트 정리
// 0~2000 : os가 시스템 어플을 위해 사용하는중
// 3306 : mysql이 설치된경우
// 80 : 해당 컴퓨터가 서버역할을 하게되면 서버서비스를 위한 기본포트로 설정됨

