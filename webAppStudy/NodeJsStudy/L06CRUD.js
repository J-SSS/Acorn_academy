/*
Create,Reade,Update,Delete
=> 유저에게 db를 제어할 수 있는 인터페이스를 제공한다(모델, 서비스)
=> 그러나 유저가 직접 db에 접속해서 데이터를 조작하게하면 안됨


Create,Alter,Drop
=> table을 생성하거나 구조를 바꾸거나 삭제하는 명령어(DDL)
Update,Delete,Insert(DML),Select(DQL) :
=> table에 데이터를 추가하거나 삭제 또는 수정 조회 명령어
 */

const http = require("http");
const url = require("url");
const querystring = require("querystring");
const fs = require("fs/promises");
const mysql = require("mysql2")
const pug = require("pug");
//java는 java.lang 패키지가 가지고 있는 라이브러리가 많은편...

const server = http.createServer();
server.listen(8888,()=>{
    console.log("http://localhost:8888 SCOTT CRUD 서버")
})
const mysqlConInfo={
    host:"localhost",
    port : 3306,
    user : "root",
    password : "mysql123",
    database : "scott"
}
const  createPool = mysql.createPool(mysqlConInfo);
const  poolPromise = createPool.promise();

server.on("request", async (req,res)=>{
    const urlObj=url.parse(req.url);
    const postPs=querystring.parse(urlObj.query);
    const params=querystring.parse(urlObj.query);
    const urlSplits=urlObj.pathname.split("/");
    if (urlSplits[1]==="public"){ //정적리소스
        if(urlSplits[2]==="js"){
            res.setHeader("content-style","application/javascript");
        } else if(urlSplits[2]==="css"){
            res.setHeader("content-style","text/css");
        } else if(urlSplits[2]==="img"){
            res.setHeader("content-style","image/jpeg");
        }
        try {
            //fs : 서버가 실행되고 있는 컴퓨터를 기준으로 파일을 검색하기때문에
            //"/ + 상대경로 " : 컴퓨터의 root(c,d) 경로를 기준으로 파일을 검색
            //" . or ./ + 상대경로" : 서버가 실행되고 있는 위치를 기준
            let data = await fs.readFile("."+urlObj.pathname);
            res.write(data);
            res.end();
        } catch (e) {
            res.statusCode=404;
            res.end();

        }

    } else { //동적리소스
        if(urlObj.pathname==="/"){
            let html = pug.renderFile("./templates/index.pug");
            res.write(html);
            res.end();
        } else if(urlObj.pathname==="/empList.do"){
            try {
                const [rows,f] = await poolPromise.query("SELECT * FROM EMP")
                let html = pug.renderFile("./templates/empList.pug",{empList:rows});
                res.write(html);
                res.end();
            } catch (e) {
                console.log(e)
                console.log("!2!")
            }

        } else if(urlObj.pathname==="/empDetail.do"){
            let empno=Number(postPs.empno); //undefined??
            // 만약 empno가 없다?? 페이지 동작불가
            // 400에러 : 요청할 때 꼭 필요한 파라미터를 보내지 않았다
            if(Number.isNaN(empno)){
                res.statusCode=400;
                res.write("<h1>해당 페이지에 꼭 필요한 파라미터를 보내지 않음</h1>")
                res.end();
                return; //응답이 완료되어도 밑에 코드가 실행될 수 있어서 콜백종료
            }
            let sql= "SELECT * FROM EMP WHERE EMPNO=?"; // ? : preparedStatement;
            const [rows,f] = await poolPromise.query(sql,[empno]); //SELECT의 결과는 항상 배열이다
            let html = pug.renderFile("./templates/empDetail.pug",{emp:rows[0]});
            res.write(html);
            res.end();
        } else if(urlObj.pathname==="/empUpdate.do"&&req.method==="GET"){
            let empno=Number(postPs.empno);

            if(Number.isNaN(empno)){
                res.statusCode=400;
                res.write("<h1>해당 페이지에 꼭 필요한 파라미터를 보내지 않음</h1>")
                res.end();
                return;
            }
            let sql= "SELECT * FROM EMP WHERE EMPNO=?"; //
            const [rows,f] = await poolPromise.query(sql,[empno]); //SELECT의 결과는 항상 배열이다1
            let html = pug.renderFile("./templates/empUpdate.pug", {emp:rows[0]});
            res.write(html);
            res.end();
        } else if(urlObj.pathname==="/empUpdate.do"&&req.method==="POST"){
            //data 를 수정한는 동적리소스 (액션페이지)
            //dml을 실행할때는 오류가 종종 발생하기 때문에 꼭 예외처리를 하세요!
            //querystring 은 url 에 오는 파라미터만 객체로 파싱중
            //post 로 오는 파라미터는 요청해더의 본문을 해석해서 받아와야한다.
            let postquery="";
            let update=0; //0이면 실패 1이면 성공
            req.on("data",(param)=>{
                postquery+=param;
            });//요청해더의 문서을 읽는 이벤트 (post 로 넘긴 querystring 불러오기)
            req.on("end",async ()=>{
                console.log(postquery);
                const postPs=querystring.parse(postquery);
                try {
                    let sql=`UPDATE EMP SET ENAME=?,SAL=?,COMM=?,JOB=?,MGR=?,DEPTNO=?,HIREDATE=? WHERE EMPNO=?`
                    const [result]=await poolPromise.execute(sql,[
                        postPs.ename,
                        (!postPs.sal.trim())?null:Number(postPs.sal),
                        (!postPs.comm.trim())?null:Number(postPs.comm),
                        postPs.job,
                        (!postPs.mgr.trim())? null : Number(postPs.mgr),
                        (!postPs.deptno.trim())? null : Number(postPs.deptno),
                        postPs.hiredate,
                        Number(postPs.empno)
                    ])//11시까지 쉬었따~ 유효성검사~
                    console.log(result);
                    update=result.affectedRows;
                }catch (e) {
                    console.error(e);
                }
                //오류없이 잘실행되고 update 도 잘되면 update=1
                if(update>0){
                    //302 : redirect 이페이지가 응답하지 않고 다른 페이지가 응답하도록 서버 내부에서 요청
                    res.writeHead(302,{location:"/empDetail.do?empno="+postPs.empno});
                    res.end();
                }else{
                    res.writeHead(302,{location:"/empUpdate.do?empno="+postPs.empno});
                    res.end();
                }//20분까지 쉬었다가 와서 삭제하고 등록해보겠습니다.
            });//요청해더의 문서을 모두 다 읽으면 발생하는 이벤트
        }else if(urlObj.pathname==="/empInsert.do"&&req.method==="GET"){//등록 form
            let html=pug.renderFile("./templates/empInsert.pug");
            res.write(html);
            res.end();
        }else if(urlObj.pathname==="/empInsert.do"&&req.method==="POST"){//등록 action
            let postQuery=""
            req.on("data",(p)=>{postQuery+=p;});
            req.on("end",async ()=>{
                const postPs=querystring.parse(postQuery);
                for(let key in postPs){ //input value="" => null 값을 기대하지만 문자열 공백이 온다.(mgr,deptno,comm=>null)
                    if(postPs[key].trim()==="")postPs[key]=null;
                }
                let sql=`INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) 
                                    VALUE (?,?,?,?,?,?,?,?)`;
                let insert=0;

                try {
                    const [result]=await poolPromise.execute(sql,
                        [
                            postPs.empno,
                            postPs.ename,
                            postPs.job,
                            postPs.mgr,
                            postPs.hiredate,
                            postPs.sal,
                            postPs.comm,
                            postPs.deptno
                        ]);
                    insert=result.affectedRows;
                }catch (e) {
                    console.error(e)
                }
                if(insert>0){
                    res.writeHead(302,{location:"/empList.do"});
                    res.end();
                }else{
                    res.writeHead(302,{location:"/empInsert.do"});
                    res.end();
                }
            });//4시 15분까지 쉬었다 삭제하고 나머지 자습~ dept crud
        }else if(urlObj.pathname==="/empDelete.do") { //삭제 액션 페이지
            let empno = Number(params.empno);
            console.log(empno);
            //400처리 해보세요~
            let sql = "DELETE FROM EMP WHERE EMPNO=?";
            let del = 0;  //delete 필드를 삭제하는 연산자 예약어
            try {
                const [result] = await poolPromise.execute(sql, [empno]);
                del = result.affectedRows;
            } catch (e) {
                console.error(e)
            }
            if (del > 0) {
                res.writeHead(302, {location: "/empList.do"});
                res.end();
            } else {
                res.writeHead(302, {location: "/empUpdate.do?empno=" + params.empno});
                res.end();
            }

        } else if(urlObj.pathname==="/empnoCheck.do"){
        //empno가 동일한 사원이 있으면 true 없으면 false
        if(!params.empno || isNaN(params.empno)){ //(null,undefined,"",0(x))=>false
            res.statusCode=400; //이 동적페이지에 요청을 잘못했다.(꼭 필요한 파라미터가 없다.)
            res.end();return;
        }
        let empno=parseInt(params.empno);
        const resObj={checkId:false,emp:null}; //Object 문자열로 응답하는 JSON 이라 부른다.
        let sql="SELECT * FROM EMP WHERE EMPNO=?";
        try {
            const [rows,f]=await poolPromise.query(sql,[empno]);
            if(rows.length>0){
                resObj.checkId=true;
                resObj.emp=rows[0]
            }
        }catch (e) {
            console.error(e); //오류가 발생하면 500 (서버에서 발생하는 오류)
            res.statusCode=500;
            res.end();return;
        }
        res.setHeader("content-type","application/json;charset=UTF-8;"); //응답하는 문서형식
        res.write(JSON.stringify(resObj));
        res.end();
    }else if(urlObj.pathname==="/deptnoCheck.do"){
        //deptno 동일한 부서가 있으면 true 없으면 false
        if(!params.deptno || isNaN(params.deptno)){
            res.statusCode=400;
            res.end();return;
        }
        let deptno=parseInt(params.deptno);
        const resObj={checkId:false,dept:null};
        let sql="SELECT * FROM DEPT WHERE DEPTNO=?";
        try {
            const [rows,f]=await poolPromise.query(sql,[deptno]);
            if(rows.length>0){
                resObj.checkId=true;
                resObj.dept=rows[0]
            }
        }catch (e) {
            console.error(e);
            res.statusCode=500;
            res.end();return;
        }
        res.setHeader("content-type","application/json;charset=UTF-8;");
        res.write(JSON.stringify(resObj));
        res.end();
    }else { // 다른 웹앱서버는 사용법만 익히면 바로 사용가능.. 당장 쓰기는 쉽지만 고급으로 나아가기 어렵다
            // 노드js는 원시웹앱형태라 하나하나원리를 이해할 수 있음
            res.statusCode=404;
            res.setHeader("content-type","text/html;charset=UTF-8")
            res.write("<h1>존재하지 않는 페이지 입니다. 404</h1>");
            res.end();

        }

    }

})
