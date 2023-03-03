const express=require("express");
const bodyParser=require("body-parser");
const app=express();
app.set("views","./templates");
app.set("view engine","pug");
app.use(express.static("public"));
app.use(bodyParser.urlencoded());
//app.[get|post|put|patch|delete].("경로",(req,res)=>{}); //라우팅
//app.[get|post|put|patch|delete|use].("경로",(req,res,next)=>{}); //미들웨어 라우팅

app.get("/",(req, res)=>{
    res.render("index");
});
const empRouter=require("./L05EmpRouter");
app.use("/emp",empRouter);


//3시 5분까지 쉬었다가 오세요~
app.listen(8888,()=>{
    console.log("http://localhost:8888 라우터로 라우팅를 분리해보자~")
})