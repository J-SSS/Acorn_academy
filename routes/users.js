const express = require('express');
const router = express.Router();
const userService=require("../model/service/UsersService");

router.get("/login.do",(req, res)=>{
  res.render("users/login");

});
router.get("/logout.do",async (req,res)=>{
  //세션을 만료하거나 삭제하는 방법
  //1. 최초 세션을 만들고 30분 뒤 쿠키가 삭제되고 다시 서버에 요청하면 자동으로 서버의 session 도 삭제
  //2. req.session.destroy((err)=>{}) : 세션을 파기 삭제
  //3. req.session.key=null; : 세션의 특정객체를 null 로 만들면 해당 필드만 삭제됨
  //4. delete req.session.key (권장 하지 않음!)
  req.session.destroy((err)=>{
    if(err) console.error(err); //거의 발생하지 않는다.
    res.cookie("autoLoginPw","",{maxAge:0,signed:false})
    res.cookie("autoLoginId","",{maxAge:0,signed:false})
    res.redirect("/");
  })
});
router.post("/login.do",async (req, res) => {
  // let u_id = req.body.u_id;
  // let pw = req.body.pw;
  // let autoLogin=req.body.autoLogin;
  let { u_id, pw, autoLogin }=req.body; //11분까지 쉬었다가 오세요
  //autoLogin 이 있으면 id와 pw cookie 로 만들어서 저장한후 자동로그인 사용!
  let user = null;
  if (u_id && pw) {
    user = await userService.login(u_id, pw);
  }
  if(user){
    req.session.loginUser=user; //session : 서버에 유지되는 정보
    const cookieOpt={
      httpOnly: true, //http 통신에서만 쿠카를 사용(쿠키 탈취 해킹 방지)
      signed: true, //암호화하겠다.
      maxAge: 7*24*60*60*1000 //현재를 기준으로 만료시간
    }
    if(autoLogin && autoLogin==="1"){
      //오늘날짜 1970.01.01 부터 작성된 밀리세컨즈로 받을 수 있다  Date.now();
      //Date.now()+7*24*60*60*1000
      //res.cookie("autoLoginId",user.u_id,{expires:new Date(Date.now()+7*24*60*60*1000)});
      //res.cookie("autoLoginPw",user.pw,{expires:new Date(Date.now()+7*24*60*60*1000)});
      res.cookie("autoLoginId",user.u_id,cookieOpt);
      res.cookie("autoLoginPw",user.pw,cookieOpt);

    }
    res.redirect("/");
  }else{
    res.redirect("/users/login.do");
  }
  res.end();
});


router.get('/list.do', async function(req, res) {
  let permission=req.query.permission;
  let reqQuery = req.query;
  let page = parseInt(req.query.page) || 1;

  let query = '';
  for (let key in req.query) {
    if (key !== 'page') {
      query += `${key}=${req.query[key]}&`;
    }
  }
  const users=await userService.list(permission,page,reqQuery);
  res.render("users/list",{users:users,params:req.query,query:query,page:page});
});

router.get("/insert.do",(req,res)=>{
  res.render("users/insert");
});
router.post("/insert.do",async (req,res)=>{
  let insert=0;
  try {
    insert=await userService.register(req.body);
  }catch (e) {
    console.error(e);
  }
  if(insert>0){
    res.redirect("/users/list.do");
  }else{
    res.redirect("/users/insert.do");
  }
});
router.get("/:uId/detail.do",async (req, res)=>{
  console.log(req.params.uId);
  const user=await userService.detail(req.params.uId);
  if(user){
    res.render("users/update",{user:user});
  }else{
    res.redirect("/users/list.do");
  }
});
router.get("/:uId/delete.do", async (req, res)=>{
  let del=0;
  try {
    del=userService.remove(req.params.uId);
  }catch (e) {
    console.error(e);
  }
  if(del>0){
    res.redirect("/users/list.do");
  }else{
    res.redirect(`/users/${req.params.uId}/detail.do`);
  }
});
router.post("/update.do",async (req, res)=>{
  for(let key in req.body){
    if(!req.body[key].trim()){//""," "
      req.body[key]=null;
    }
  }
  //console.log(req.body);//==users
  let update=0;
  update=await userService.modify(req.body);
  if(update>0){
    res.redirect("/users/list.do");
  }else{
    res.redirect(`/users/${req.body.u_id}/detail.do`);
  }
});
module.exports = router;
