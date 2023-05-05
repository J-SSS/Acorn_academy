const express=require("express");
const fs=require("fs/promises")
const router=express.Router();
const BoardRepliesService=require("../model/service/BoardRepliesService");
const boardRepliesService=new BoardRepliesService();
const path=require("path");
const multer=require("multer");
const storage=multer.diskStorage(
    {
        destination:(req,file,cb)=>{ //cb : destination의 값을 지정
            cb(null,"./public/img/reply");
        },
        filename:(req,file,cb)=>{
            /*
            * {
                  fieldname: 'img_path',
                  originalname: 'F7FA780C-A596-4C46-B485-F1144A252018.test.23.02.31.jpg',
                  encoding: '7bit',
                  mimetype: 'image/jpeg',
                  destination: 'upload/',
                  filename: 'ed91bb11dc25a42bd1498329e0b5398d',
                  path: 'upload/ed91bb11dc25a42bd1498329e0b5398d',
                  size: 5598899
                }
                */
            let ext=path.extname(file.originalname);
            let name="reply_"+Date.now()+"_"+(Math.trunc(Math.random()*1000))+ext; //.jpeg
            //0.123012937901273809*1E9 => 12301293.7901273809 => 12301294
            req.body.img_path="/img/reply/"+name;
            cb(null,name);
        },
        limits: {
            fileSize: 1024 * 1024 * 10, // 10MB
        }
    }
);
function fileFilter (req, file, cb)  {
    let mimetype=file.mimetype.split("/");
    if (mimetype[0]!=="image"){
        return cb(new Error("이미지만 업로드 가능합니다."), false);
    }
    cb(null, true);
};
const upload=multer({storage:storage,fileFilter:fileFilter});
//const upload=multer({dest:"upload/"});//파일 이름을 임의로 생성
//multer : 요청이 올때 파라미터가 blob 으로 오면 이때 file 로 된 blob 은 바로 저장, 쿼리스트링으로 추정되는 blob 은 req.body 에 추가
router.post("/insert.do",upload.single("img_path"),async (req, res)=>{
    const reply=req.body;//post 방식으로 보내는 파라미터
    if(!req.body.parent_br_id)req.body.parent_br_id=null; //참조할 부모 댓글이 없을 때
    if(!req.body.img_path)req.body.img_path=null; //이미지 없을 때
    req.body.b_id=Number(req.body.b_id);
    let insertId=0;
    try {
        insertId=await boardRepliesService.register(reply)
    }catch (e) {
        console.error(e);
    }
    if(!insertId){
        await fs.unlink("./public"+req.body.img_path);//등록 실패시 방금 등록한 이미지 삭제
    }
    console.log("등록된 댓글 번호 :"+insertId)
    res.redirect(`/boards/${reply.b_id}/detail.do`);

});

router.post("/update.do",upload.single("new_img"),async (req, res)=>{
    const newImg=req.file;
    const reply=req.body;
    if(!req.body.img_path)req.body.img_path=null; //새 이미지 없을 때
    //새이미지가 없고 기존이미지를 삭제하지 않으면 기존이미지를 다시 저장
    if(!newImg && !req.body.del_img && req.body.origin_img_path){
        req.body.img_path=req.body.origin_img_path;
    }
    req.body.b_id=Number(req.body.b_id);

    let update=0;
    try {
        update=await boardRepliesService.modify(reply)
    }catch (e) {
        console.error(e);
    }
    console.log("수정 성공 :"+update);
    if(update>0 ){
    //수정 성공하고 새이미지 등록되었을 때 기존 이미지 삭제
        if( (newImg && req.body.origin_img_path)||req.del_img ){
            try {
                await fs.unlink("./public"+req.body.origin_img_path);
                console.log("기존 이미지 삭제")
            }catch (e) {
                console.error("기존 이미지 삭제 실패 :"+e);
            }
        }
    }else{
    //수정 실패시 방금 등록한 이미지 삭제
        try {
            await fs.unlink("./public"+req.body.img_path);
        }catch (e) {
            console.error(e)
        }
    }
    res.redirect(`/boards/${reply.b_id}/detail.do`);

});
router.get("/:brId/:bId/delete.do",async (req,res)=>{
    let brId=req.params.brId;
    let bId=req.params.bId;

    let del=0;
    try {
        del=await boardRepliesService.remove(brId);
    }catch (e) {
        console.error(e);
    }
    res.redirect(`/boards/${bId}/detail.do`);

});


module.exports=router;