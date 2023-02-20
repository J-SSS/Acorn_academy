const http = require("http2");
const url = require("url");
const mysql=require("mysql");
const querStr=require("querystring");
const mysqlConnInfo={
    host: "localhost",
    port:3306,
    database:"SCOTT",
    user: "root",
    password:"mysql123",
}
// 1.http - > http2로 하다가 실행할 때 바꿔서 실행
// expressjs : nodejs 프레임워크를 실무에서 사용함..!!
http.createServer((req,resp)=>{
    console.log(req.url);
    const urlObj=url.parse(req.url);
    console.log(urlObj)


    resp.setHeader("content-type","text/html;charset=UTF-8")
    if(urlObj.pathname=="/"){
        resp.write("<h1>url 모듈과 mysql 사용해보기</h1>")
        resp.write(`<p>
                      <a href="power.do?a=3&b=6">
                        파라미터 a,b 로 거듭제곱한 결과물을 반환하는 동적페이지
                      </a>
                   </p>`);
        resp.write(`<p>
                      <a href="deptList.do?">
                        파라미터 a,b 로 거듭제곱한 결과물을 반환하는 동적페이지
                      </a>
                   </p>`);
        resp.end();
    } else if(urlObj.pathname=="/power.do"){
        const params=querStr.parse(urlObj.query);
        resp.write("<h1>a b 파라미터를 거듭제곱 하는 동적 페이지</h1>")
        resp.write(`<h2>${params.a} 거듭제곱 ${params.b} = ${Math.pow(params.a, params.b)}</h2>`);
        resp.end();
    } else if(urlObj.pathname=="/deptList.do"){
        resp.write("<h1>부서 리스트 동적 페이지(mysql)</h1>")
        console.log("??")
        try {
            console.log("??")
            const conn=mysql.createConnection(mysqlConnInfo);
            //console.log(conn)
            conn.query("SELECT * FROM DEPT",(err, rows, fields)=>{
                if(err) console.error(err);
                let html = `<table><tr><th>번호</th><th>이름</th><th>위치</th></tr>`;
                rows.forEach((row)=>{
                    html+=`<tr>
                                <td>${row.DEPTNO}</td>
                                <td>${row["DNAME"]}</td>
                                <td>${row["LOC"]}</td>
                            </tr>`
                })
                html+=`</table>`;
                resp.write(html);
                resp.end();

                console.log(rows);
            }); //("실행할질의",()=>{쿼리가 실행되고 값이 반환되면 실행되는 콜백함수})
        }
        catch (e){
            console.error(e)
        }
    }
    else {
        resp.write("<h1>404 없는 주소입니다~</h1>")
        resp.end();
    }
}).listen(7070);