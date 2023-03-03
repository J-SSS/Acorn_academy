/////////////모듈 import//////////
const http = require("http");
const url = require("url");
const querystring = require("querystring");
const pug = require("pug");

const mysql = require("mysql2")
const mysqlConInfo={
    host:"localhost",
    port : 3306,
    user : "root",
    password : "mysql123",
    database : "scott"
}
const  createPool = mysql.createPool(mysqlConInfo);
const  pool = createPool.promise();

///////////////////////////////

const server = http.createServer(); //서버 생성

server.listen(8888,()=>{ //8888포트 할당(?)
    console.log("http://localhost:8888 DeptList 만들기 과제~!~!")
})

//  요청이 발생 할 때 수행 할 내용들...
server.on("request", async (req,res)=>{
    const urlObj=url.parse(req.url); //요청이 들어온 url을 node.js에서 사용하기 위한 변수
    const params=querystring.parse(urlObj.query); // urlObj의 쿼리 부분만 따와서 사용하는 변수


    if(urlObj.pathname==="/"){ // 인덱스

        let html = pug.renderFile("./ex01/templates/index.pug");
        res.write(html);
        res.end();

    } else if(urlObj.pathname==="/deptList.do"){ // 전체 리스트

        try {
            const [rows,f] = await pool.query("SELECT * FROM DEPT")
            let html = pug.renderFile("./ex01/templates/deptList.pug",{deptList:rows});
            res.write(html);
            res.end();
        } catch (e) {
            console.log(e)
        }

    } else if(urlObj.pathname==="/deptDetail.do"){ // 상세리스트

        let deptno=Number(params.deptno);
        if(Number.isNaN(deptno)){
            res.statusCode=400;
            res.write("<h1>해당 페이지에 꼭 필요한 파라미터를 보내지 않음</h1>")
            res.end();
            return;
        }
        let sql= "SELECT * FROM DEPT WHERE DEPTNO=?";
        const [rows,f] = await pool.query(sql,[deptno]);
        let html = pug.renderFile("./ex01/templates/deptDetail.pug",{dept:rows[0]});
        res.write(html);
        res.end();

    } else if(urlObj.pathname==="/deptUpdate.do"&&req.method==="GET"){ //업데이트 페이지

        let deptno=Number(params.deptno);
        if(Number.isNaN(deptno)){
            res.statusCode=400;
            res.write("<h1>해당 페이지에 꼭 필요한 파라미터를 보내지 않음</h1>")
            res.end();
            return;
        }
        let sql= "SELECT * FROM DEPT WHERE DEPTNO=?";
        const [rows,f] = await pool.query(sql,[deptno]);
        let html = pug.renderFile("./ex01/templates/deptUpdate.pug",{dept:rows[0]});
        // console.log("왜안됨?")
        res.write(html);
        res.end();

    } else if(urlObj.pathname==="/deptUpdate.do" && req.method==="POST"){ //업데이트 폼 제출시 실행되는 부분

        let postQuery="";
        req.on("data",(p)=>{postQuery+=p; // 제출버튼 클릭시 받아온 value값들을 postquery에 담음

            // console.log(p) //<Buffer 64 65 70 ..... 3d 44 41 4c 4c 41 53>
            // 버퍼...?
            // console.log(postQuery) //deptno=20&dname=RESEARCH&loc=DALLAS
        });
        req.on("end", async ()=>{ // 제출버튼클릭 이벤트가 끝나면 응답 실행

            const postPs=querystring.parse(postQuery); //받아온 value에서 쿼리스트링 추출

            for(let key in postPs){ // 빈칸이 제출된경우 null로 변환
                if(postPs[key].trim()==="") postPs[key]=null;
            }

            let sql = "UPDATE DEPT SET DNAME=?, LOC=? WHERE DEPTNO=?";
            let insert=0;

            try {
                const [result] = await pool.execute(sql,[postPs.dname, postPs.loc, postPs.deptno])
                insert=result.affectedRows
            } catch (e) {
                console.error(e)
            }
            if(insert>0){ //리다이렉트?? 다른페이지로 보내주는 기능
                res.writeHead(302,{location:"/deptDetail.do?deptno="+postPs.deptno});
                res.end();
            } else {
                res.writeHead(302,{location:"/deptUpdate.do?deptno="+postPs.deptno})
                res.end();
            }
        });
    } else if(urlObj.pathname==="/deptInsert.do" && req.method==="GET"){ //등록용 페이지
        let html=pug.renderFile("./ex01/templates/deptInsert.pug");
        res.write(html);
        res.end();
    }
    else if(urlObj.pathname==="/deptInsert.do" && req.method==="POST"){ //등록폼 제출시 실행되는 부분

        let postQuery="";
        req.on("data",(p)=>{postQuery+=p;});
        req.on("end", async ()=>{
            const postPs=querystring.parse(postQuery);
            for(let key in postPs){
                if(postPs[key].trim()==="") postPs[key]=null;
            }

            let sql = `INSERT INTO DEPT (deptno, dname, loc)
                        VALUE (?, ?, ?)`;
            let insert=0;
            try {
                const [result] = await pool.execute(sql,[postPs.deptno, postPs.dname, postPs.loc])
                insert=result.affectedRows
            } catch (e) {
                console.error(e)
            }
            if(insert>0){
                res.writeHead(302,{location:"/deptList.do"});
                res.end();
            } else {
                res.writeHead(302,{location:"/deptInsert.do?"})
                // console.log("null이거나 숫자가 아닌경우 여기 걸림")
                res.end();
            }


        });

    } else if(urlObj.pathname==="/deptDelete.do"){ // 삭제링크 클릭시 실행

        let deptno=Number(params.deptno);
        if(Number.isNaN(deptno)){
            res.statusCode=400;
            res.write("<h1>해당 페이지에 꼭 필요한 파라미터를 보내지 않음</h1>")
            res.end();
            return;
        }

        let sql = "DELETE FROM DEPT WHERE DEPTNO=?";
        let del = 0;

        try {
            const [result] =  await pool.execute(sql, [deptno]);
            del = result.affectedRows;
        } catch (e) {
            console.error(e)
        }
        if(del>0){
            res.writeHead(302,{location:"/deptList.do"});
            res.end();
        } else {
            res.writeHead(302,{location:"/deptUpdate.do?deptno="+postPs.deptno})
            res.end();
        }
    } else {
        res.statusCode=404;
        res.setHeader("content-type","text/html;charset=UTF-8")
        res.write("<h1>## 404 ## 존재하지 않는 페이지 입니다. </h1>");
        res.end();
    }





    }
)