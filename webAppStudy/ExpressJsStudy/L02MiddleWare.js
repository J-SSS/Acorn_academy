const express=require("express");
const fs=require("fs/promises");
const app=express();
//app.use : 미들에어
//"*" : 가로챌 요청의 패턴 (* 모든 와일드카드)
//next : /a.do 요청을 미들웨어가 중간에 가로챘는데 /a.do로 계속 가려면 next()를 호출하면 된다.
app.use("*",(req, res, next)=>{
    console.log("* 미들웨어가 가로챔!",req.originalUrl);
    next();
});
app.use("/user/*",(req, res, next)=>{
    console.log("/user/* 미들웨어가 가로챔!",req.originalUrl);
    if(req.query.id){
        next(); //원래 요청하던 url 이동
    }else{
        res.redirect("/");
        //res.writeHead(302,{location:"/"});
        //res.end()
    }
});

app.get("/a.do",(req, res)=>{
    res.send("<h1>* 미들웨어가 모든 페이지를 감시합니다.</h1>");
});

app.get("/user/b.do",(req, res)=>{
    res.send("<h1>/user/b.do 페이지 (/user/* 모든 리소스는 파라미터 id 꼭 필요합니다.)</h1>")
});
app.get("/user/c.do",(req, res)=>{
    res.send("<h1>/user/c.do 페이지 (/user/* 모든 리소스는 파라미터 id 꼭 필요합니다.)</h1>")
});


//"/" index 페이지를 요청하면 L02Index.html 파일을 불러와서 응답하세요!
app.get("/",async (req, res)=>{
    let data=await fs.readFile("L02Index.html");
    res.write(data);
    res.end();
});




app.listen(7777,()=>{
    console.log("http://localhost:7777 에 미들웨어 수업")
})
//["","",""].length == 3
//"abcd".length == 4