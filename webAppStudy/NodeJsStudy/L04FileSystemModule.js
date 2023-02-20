/*
모듈 : 어플리케이션, 라이브러리 등을 모듈이라고 함.. (개발자에 의해 생산된 가장 작은 단위)
라이브러리 : 필요에 의해 사용하는 객체 또는 객체의 집단(패키지)
어플리케이션 : 유저에세 서비스 되는 것
패키지 : 유사한 사용을 위해 모인 객체의 집단 (컬렉션프레임워크 List,Map,Set...)
프레임워크 : 모듈을 제어하고 프로그래밍 시 프레임워크의 규칙에 따른다면? 프레임워크임.
=> 여러 라이브러리의 집단으로, 특정 서비스가 가진 한계를 벗어나기 위해 그 서비스 전체를 제어하는 단위
=> spring? : 톰캣이 가진 불안정성과 객체지향의 한계를 벗어나기 위해 관점지향을 적용하는 프레임워크
=> express.js : nodejs가 갖는 불편함(1~10까지 다 구현해야하는 점)을 해소하고 미들웨어를 적용하는 프레임워크
=> 프레임워크의 단점 : 배우기 어렵다, 작은 서비스에 적용하기 어렵다

nodejs : 서버에서 실행되는 언어(자바스크립트), nodejsPackageManager... nodejs가 npm을 제공하고있다
nodejs가 서버 그 자체는 아님..서버언어이면서 서버(서버언어 : 동적페이지에 적용되는 언어(서불릿=>자바))


 */
const http=require("http");
const url = require("url") // url에서 path와 queryString을 분리
const queryString = require("querystring") //쿼리스트링을 오브젝트로...
const server = http.createServer(); //nodejs로 구현한 서버
const fs=require("fs"); //java의 fileReader+writer와 같은 역할.. 파일을 문자열로 불러옴
const fsPromise=require("fs/promises"); //fs를 프라미스화한것
server.listen(8888); //클라이언트에서 해당 포트에 요청이 들어올 때 마다 이벤트를 실행
server.on("request", async (req, res )=>{
    res.setHeader("content-type","text/html;charset=UTF-8")

    //url : 서버주소+패스+쿼리스트링
    //서버주소 : www.naver.com(도메인) 123.3.0.13:80 : ip+port를 맵핑하는 주소
    //pathname : /book/detail.do (해당 서버에서 공개되고 있는 리소스의 주소)
    //쿼리스트링 : ?bid=12313k1 해당 동적 리소스에 제공하는 파라미터들

    const urlObj = url.parse(req.url);
    const params = queryString.parse(req.query)
    const urlSplit = urlObj.pathname.split("/");


    //url의 패스에 /public/이 포함되면 모두 정적리소스로 약속함!! (=>l04public)
    //예) /public/css/a.css
    //예2) /public/html/c.html
    if(urlSplit[1]=="public"){ //정적 리소스를 요청함
        if(urlSplit[2]=="html") {
            res.setHeader("content-type","text/html;charset=UTF-8")
        } else if(urlSplit[2]=="css") {
            res.setHeader("content-type","text/css;")
        }  else if(urlSplit[2]=="img") {
        res.setHeader("content-type","image/jpeg;")
        }  else if(urlSplit[2]=="js") {
        res.setHeader("content-type","application/javascript;")
    }

        // //서버 내부에서 슬러시로 최상위 상대주소를 쓰면 c:// 하위로 찾아간다..
        // fs.readFile("."+urlObj.pathname,(err,data)=>{
        //     if(err) {
        //         console.error(err);
        //         res.write("<h1>500 파일 요청을 실패</h1>")
        //         res.end();
        //         return;
        //     }
        //     res.write(data);
        //     res.end();
        // })

        try {
            let data = await fsPromise.readFile("."+urlObj.pathname);
            res.write(data);
            res.end();
        } catch (e){
            console.error(err);
            res.write("<h1>500 파일 요청을 실패</h1>")
            res.end();
        }




    } else {

        if(req.url=="/"){ //동적리소스 (==servlet)
            res.write("<h1>index 페이지 입니다.</h1>")
            // res.write("<h2>동적페이지 목록</h2>")
            res.write("<h2>서버의 리소스 목록 목록</h2>")
            res.write(`
            <ul>
                <li><a href="a.do">a.do 페이지</a></li>
                <li><a href="a.do?a=11.3&b=30.333">
                        a+b를 연산하는 a.do 동적페이지
                    </a></li>
                <li><a href="b.html">b.html 정적 페이지</a></li>
                <li><a href="/public/html/c.html">c.html 정적 페이지</a></li>
                <li><a href="/public/html/d.html">d.html 정적 페이지</a></li>
                <li><a href="/public/css/d.css">d.html 정적 페이지</a></li>
                <li><a href="/public/img/d.jpeg">참새 이미지</a></li>
            </ul>
        
        `)
            res.end();
        } else if(urlObj.pathname=="/a.do"){ //a.do 동적 리소스
            let a = parseFloat(params.a);
            let b = parseFloat(params.b);

            res.write(`
                <h1>a.do 페이지 입니다! </h1>
        `)
            res.write(`
                <h2>받아온 파라미터 a와 b를 더하기 연산 : ${a+b}</h2>
        `)
            res.end(); //응답을 완료함!! (클라이언트가 서버가 응답하는 것을 무한대기 할 수도 있다..

        } else if(urlObj.pathname=="/b.html"){
            fs.readFile("b.html",(err,data)=>{
                if(err) console.error(err);
                res.write(data);
                res.end();
            });
        }

        else {
            res.statusCode=404; //클라이언트가 없는 리소스를 요청한경우
            res.write(`<h1>404 존재하지 않는 페이지 입니다. </h1>`)
            res.end(); //응답을 완료함!! (클라이언트가 서버가 응답하는 것을 무한대기 할 수도 있다..

        }

    }
    });

