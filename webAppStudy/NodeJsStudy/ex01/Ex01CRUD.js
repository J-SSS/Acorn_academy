const http = require("http");
const url = require("url");
const querystring = require("querystring");
const fs = require("fs/promises");
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
    const params=querystring.parse(urlObj.query); //urlObj의 쿼리 부분만 따와서 사용하는 변수
    const postPs=querystring.parse(urlObj.query); // + POST방식에서 사용하기위해 하나 더 만듦
    // const urlSplits=urlObj.pathname.split("/");

    if(urlObj.pathname==="/"){
        let html = pug.renderFile("./ex01/templates/index.pug");
        res.write(html);
        res.end();
    } else if(urlObj.pathname==="/deptList.do"){
        try {
            const [rows,f] = await pool.query("SELECT * FROM DEPT")
            let html = pug.renderFile("./ex01/templates/deptList.pug",{deptList:rows});
            res.write(html);
            res.end();
        } catch (e) {
            console.log(e)
            console.log("!!")
        }
    } else if(urlObj.pathname==="/deptDetail.do"){
        let sql= "SELECT * FROM DEPT WHERE DEPTNO=?"; // ? : preparedStatement;
        const [rows,f] = await pool.query(sql,[params.deptno]); //SELECT의 결과는 항상 배열이다
        let html = pug.renderFile("./ex01/templates/deptDetail.pug",{dept:rows[0]});
        res.write(html);
        res.end();
    } else if(urlObj.pathname==="deptUpdate.do"&&req.method==="GET"){
        let sql= "SELECT * FROM DEPT WHERE DEPTNO=?"; // ? : preparedStatement;
        const [rows,f] = await pool.query(sql,[params.deptno]); //SELECT의 결과는 항상 배열이다
        let html = pug.renderFile("./ex01/templates/deptUpdate.pug",{dept:rows[0]});
        res.write(html);
        res.end();
    }





    }
)