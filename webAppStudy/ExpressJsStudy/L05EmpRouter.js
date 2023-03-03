const express=require("express");
const scott=require("./mysqlScottPool");
const router=express.Router();
router.get("/list.do",async (req, res)=>{
    const [rows,f]=await scott.query("SELECT * FROM EMP");
    res.render("empList",{empList:rows});
});
router.get("/detail.do",async (req,res)=>{
    if(!req.query.empno) res.sendStatus(400);//Bad Request
    const [rows,f]=await scott.query("SELECT * FROM EMP WHERE empno=?",[req.query.empno]);
    if(rows.length>0) {
        res.render("empDetail", {emp: rows[0]});
    }else {
        //해당 사원(레코드)가 존재하지 않습니다.(이미 삭제된 레코드 입니다.) 페이지를 반환! or 사원 리스트로 이동
        res.redirect("./list.do");
    }
});
//REST Api : 웹 서비스 요청을 구체화시키기 위한 노력의 일부 (url,메소드)
//pathVariable : 쿼리스트링이 파라미터를 파악하기 어렵고 해당 파라미터가 리소스의 꼭 필요한 것을 명시하기 위해 등장
//method 분할 : (get, post) , put, delete, patch
//express가 파라미터를 패스에서 받을 수 있도록 지워!
router.get("/:empno/update.do",async (req,res)=>{
    //empno 가 존재하지 않는 페이지는 없는 페이지기 때문에 400에러 설정은 필요없다.
    const [rows,f]=await scott.query("SELECT * FROM EMP WHERE EMPNO=?",[req.params.empno]);
    if(rows.length>0){
        res.render("empUpdate",{emp:rows[0]});
    }else{
        res.redirect("./list.do");
    }
});
router.post("/update.do",async (req,res)=>{
    let sql="UPDATE EMP SET ENAME=?,JOB=?,HIREDATE=?,SAL=?,COMM=?,DEPTNO=?,MGR=? WHERE EMPNO=?";
    for(let key in req.body){ //"" 을 null 처리
        if(!req.body[key]){ req.body[key]=null;}
    }
    //parseFloat NaN 가 아닌 null 을 반환!!!
    const values=
        [   req.body.ename,
            req.body.job,
            req.body.hiredate,
            (req.body.sal) && parseFloat(req.body.sal),
            (req.body.comm) && parseFloat(req.body.comm),
            (req.body.deptno) && parseInt(req.body.deptno),
            (req.body.mgr) && parseInt(req.body.mgr),
            parseInt(req.body.empno)
        ];
    //() && () && .. :모두가 true 가 될때까지 실행 만약 false 멈추고 반환
    console.log(values)
    let update=0;
    try {
        const [result]=await scott.execute(sql,values);
        update=result.affectedRows; //dml 실행시 성공한 row 수
    }catch (e) {
        console.error(e)
    }
    if(update>0){
        res.redirect("/emp/detail.do?empno="+req.body.empno);
    }else{
        res.redirect(`./${req.body.empno}/update.do`);
    }
});//부서 라우터를 만들어보세요~
router.get("/insert.do",(req, res)=>{
    res.render("empInsert");
});
router.post("/insert.do",async (req,res)=>{
    for (let key in req.body){
        if(!req.body[key]){
            req.body[key]=null;
        }else{
            if(key==="comm" || key==="sal"){
                req.body[key]=parseFloat(req.body[key]);
            }else if(key==="empno" || key==="deptno" || key==="mgr"){
                req.body[key]=parseInt(req.body[key]);
            }
            if(Number.isNaN(req.body[key])){
                res.status(500).send(`<h1>${key}이(가) 수가 아닌 값을 입력하셨습니다.</h1>`);
                return;
            }
        }
    }
    let insert=0; //등록 성공 여부
    try { //모델
        let sql="INSERT INTO EMP (EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) VALUE (?,?,?,?,?,?,?,?)";
        const [result]=await scott.execute(sql,[req.body.empno, req.body.ename, req.body.job, req.body.mgr, req.body.hiredate, req.body.sal, req.body.comm, req.body.deptno]);
        insert=result.affectedRows;
    }catch (e) {
        console.error(e);
        res.status(500).send(`<h1>DB 등록을 실패했습니다. 다시 시도하세요!</h1>`);
        return;
    }
    //응답 처리
    if(insert>0){
        res.redirect("/emp/list.do");
    }else{
        res.redirect("/emp/insert.do");
    }

});
//이번주 express 다음주부터 톰캣! model1 => model2 => spring
router.get("/delete.do",async(req, res)=>{
    if(!req.query.empno || isNaN(req.query.empno)){
        res.status(400).send("400 잘못된 요청입니다.");
        return;
    }
    let empno=parseInt(req.query.empno);
    //요청처리
    let del=0;
    try {//모델
        let sql="DELETE FROM EMP WHERE EMPNO=?";
        const [result]=await scott.execute(sql,[empno]);
        del=result.affectedRows;
    }catch (e) {
        console.error(e);
    }
    if(del>0){
        res.redirect("/emp/list.do");
    }else{
        res.redirect(`/emp/${empno}/update.do`);
    }
});
router.get("/empnoCheck.do",async(req,res)=>{
   if(!req.query.empno || isNaN(req.query.empno)){
       res.sendStatus(400);
       return;
   }
   let empno=parseInt(req.query.empno);
   const resObj={check:false,emp:null};
   try {
        let sql="SELECT * FROM EMP WHERE EMPNO=?";
        const[rows,f]=await scott.query(sql,[empno]);
        if(rows.length>0){
            resObj.check=true;
            resObj.emp=rows[0];
        }
   }catch (e) {
       console.error(e);
       res.sendStatus(500);
       return;
   }
   res.send(resObj);
});


module.exports=router;