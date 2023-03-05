const express=require("express");
const app=express();
app.use(express.static("public"));
//app.use : 미들웨어로 요청을 처리하기 전에(중간에) 가로채서 무언가를 하는 것
//확장자가 정적리소스 이면(html,js,css,jpeg,png...) 무조건 public 폴더에서 리소스를 찾아서 반환한다.
//"/"index 동적페이지
//if(req.url=="/"&&req.method=="GET")
app.get("/",(req, res)=>{
    //res.setHeader("content-type","text/html;charset=UTF-8");
    //res.send() : content-type 을 자동으로 맵핑하고 res.end() 자동으로 한다.
    const o={checkId:true};
    //res.send(o); //JSON.stringify(o)   content-type application/json
    let html=("<h1>안녕 Express.js</h1>");
    html+=("<h2>Express.js 는 node.js 의 웹앱 프레임워크(다수의 라이브러의 의해서 웹앱이 지배당하고 있을 때)입니다.</h2>");
    html+=`<ul>
                <li>nodejs 동적페이지 구분이 안되는 것을 express 가 요청 메소드와 동일이름의 함수(라우팅)를 제공해서 해결 </li>
                <li>한 페이지에 너무 많은 동적 리소스를 작성하는 것을 router 라는 것으로 해결</li>
                <li>미들웨어를 이용해서 특정 요청의 중간처리를 할 수 있다.</li>
                <li>미들웨어를 이용해서 편리하게 라이브러리 적용을 할 수 있따. </li>
                <li>node.js 의 모든 기능 사용할 수 있다.</li>
           </ul>
           <h2>라이팅과 res.send()</h2>
           <ul>
               <li><a href="/checkIdJson.do">JSON 페이지 요청</a></li>
               <li><a href="/sum.do?a=10&b=20&c=30">파라미터 처리로 더하기 구현</a></li>
               <li><a href="/img/참새.jpeg">정적 페이지 요청(참새이미지)</a></li>
           </ul>
            `;
    res.send(html);
});
app.get("/sum.do",(req, res)=>{
    //const urlObj=url.parse(req.url);
    //const params=querystring.parse(urlObj.query);
    console.log(req.query)//==params
    let a=Number(req.query.a);
    let b=Number(req.query.b);
    let c=Number(req.query.c);
    res.send(`<h1>a+b+c=${a+b+c} 파라미터는 req.query에 처리되어 있다.</h1>`);
})

app.get("/checkIdJson.do",(req, res)=>{
    const o={checkId:true,emp:{empno:7777,ename:"이현주"}};
    //res.setHeader("content-type","application/json;charset=UTF-8;");
    //res.write(JSON.stringify(o));
    //res.end();
    res.send(o);
});
//3시 10분까지 쉬었다가 오세요~


//404 에러 처리가 되어있음!!
app.listen(7777,()=>{
    console.log("http://localhost:7777 에 express web app 생성!")
});