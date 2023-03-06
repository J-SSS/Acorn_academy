const express = require('express');
const router = express.Router();
const boardService=require("../model/service/BoardsService");

router.get('/list.do', async (req,res)=>{
    let status=req.query.status;
    let page = parseInt(req.query.page) || 1; // 페이지 있으면 페이지, 없으면 1

    // 쿼리에 페이지 파라미터 처리(페이지 파라미터 제외)
    let query='';
    for(let key in req.query){
        if(key!=='page') {
            query+=`${key}=${req.query[key]}&`; // 파라미터 {key=value&key=value...}
        }
    }
    const boards=await boardService.list(status,page);
    res.render("boards/list",{boards:boards,params:req.query,query:query,page:page}); // list.pug 페이지에 객체 보내기
});

router.get("/insert.do", (req,res)=>{
    res.render("boards/insert");
});
router.post("/insert.do",async (req,res)=>{
    let insert=0;
    try{
        insert=await boardService.register(req.body);
    }catch(e){
        console.error(e);
    }
    if(insert>0) {
        res.redirect("/boards/list.do");
    }else {
        res.redirect("/boards/insert.do");
    }
});

router.get("/:bId/detail.do", async (req,res)=>{
    console.log(req.params.bId);
    const board=await boardService.detail(req.params.bId);
    if(board) {
        res.render("boards/update", {board:board});
    }else {
        res.redirect("/boards/list.do");
    }
})

router.post("/update.do",async (req,res)=>{
   for(let key in req.body){
       if(!req.body[key].trim()) {
           req.body[key]=null;
       }
   }
    console.log("req.body",req.body);
   let update=0;
   update=await boardService.modify(req.body);
   if(update>0){
       res.redirect("/boards/list.do");
   }else {
       res.redirect(`/boards/${req.body.b_id}/detail.do`);
   }
});

router.get("/:bId/delete.do", async (req,res)=>{
   let del=0;
   try{
       del=await boardService.remove(req.params.bId);
   }catch(e){
       console.error(e);
   }
    if(del>0){
        res.redirect("/boards/list.do");
    }else{
        res.redirect(`/boards/${req.params.bId}/detail.do`);
    }
});


module.exports=router;