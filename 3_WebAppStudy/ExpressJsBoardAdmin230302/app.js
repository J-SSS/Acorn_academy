const createError = require('http-errors'); //미들웨어로 http 에러 상태(status) 메세지 통합 작성 가능
const express = require('express');
const path = require('path'); //파일의 절대경로 검색시 사용됨 __dirname 프로젝트 폴더
const cookieParser = require('cookie-parser');//서버가 브라우저에게 남기는 데이터 cookie 를 사용하는 모듈
const logger = require('morgan'); //서비스(웹앱)를 배포하면 유지보수시 로그검색을 해야하는데 로그를 파일로 저장해주는 모듈(==log4j)
const session = require("express-session");

//express-session v1.5 이상부터 cookie-parser 가 필요 없다.
const indexRouter = require('./routes/index');
const usersRouter = require('./routes/users');
const boardsRouter = require('./routes/boards');
const app = express();
//17분까지 쉬었다가 오세요~~
// view engine setup
app.set('views', path.join(__dirname, 'views')); //절대경로로 pug 위치 등록 (배포과정에서 상대 경로를 찾지 못할 수도 있기 때문)
//app.set('views', './views'); //상대경로로 pug 위치 등록
app.set('view engine', 'pug');


app.use(logger('dev')); //morgan 설정
app.use(express.json()); //queryString 이 json 일때 처리   name=val&name=val2 => {name:val,name:val}
app.use(express.urlencoded({ extended: false })); //body-parser
app.use(cookieParser()); //쿠키 처리
app.use(express.static(path.join(__dirname, 'public'))); //정적리소스 위치!
app.use(session({
  secret: 'my-secret-key',
  saveUninitialized: true
}));

//미들웨어는 순서대로 동작합니다. router 가 미들웨어로 되어 있기 때문에 라우터 위에서 session 미들웨어를 등록해야한다.
//모든 요청에서 퍼그 렌더시 변수로 loginUser 를 제공
app.use(function (req, res, next){
  res.locals.loginUser=req.session.loginUser;
  next();
});
// 미들웨어를 이용해서 로그인 인증 구현 !
app.use( function (req, res, next ){
  if(req.path==="/" || req.path==="/users/login.do" ){
    next();
  }else{
    if(req.session.loginUser){
      next();
    }else{
      res.redirect("/users/login.do");
    }
  }
});

app.use('/', indexRouter);
app.use('/users', usersRouter);
app.use('/boards',boardsRouter);

// catch 404
// and forward to error handler
app.use(function(req, res, next) {
  next(createError(404));
});
// error handler
app.use(function(err, req, res, next) {
  // set locals, only providing error in development
  //res.locals :퍼그의 번수 등록!
  res.locals.message = err.message;
  res.locals.error = (req.app.get('env') === 'development') ? err : {};
  // render the error page
  res.status(err.status || 500);
  res.render('error'); // views/error.pug
});

app.listen(8888,()=>{
  console.log("http://localhost:8888 expressjs 로 게시판 만들기")
});
module.exports = app;
