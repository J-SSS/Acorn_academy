const pool=require("../db/WebAppBoardPool");
const BoardsDao = require("../dao/BoardsDao");
const BoardImsDao = require("../dao/BoardImgsDao");
const BoardLikesDao=require("../dao/BoardLikesDao");
const BoardRepliesDao=require("../dao/BoardRepliesDao")
const boardImsDao = new BoardImsDao(pool);
const boardLikesDao=new BoardLikesDao(pool);
const boardsDao=new BoardsDao(pool);
const boardRepliesDao=new BoardRepliesDao(pool);
//서버튜닝 : 기능개선없이 성능을 올리는 것
const PageVo=require("../vo/PageVo");
class BoardsService{
    async list(status,page,reqQuery){
        let boards;
            let cnt = await boardsDao.countBySearch(reqQuery.field, reqQuery.value);
            const pageVo = new PageVo(page,cnt,reqQuery);
            boards = await boardsDao.findBySearch(pageVo);
            boards.pageVo=pageVo;
        // // if(status) {
        // //     // let cnt = await boardsDao.countByStatus(status);
        // //     // const pageVo = new PageVo(page,cnt,reqQuery);
        // //     // boards = await boardsDao.findByStatus(status,pageVo);
        // //     // boards.pageVo=pageVo;
        // // }else {
        //     let cnt = await boardsDao.countBySearch(reqQuery.field, reqQuery.value);
        //     const pageVo = new PageVo(page,cnt,reqQuery);
        //     boards = await boardsDao.findBySearch(pageVo);
        //     boards.pageVo=pageVo;
        // }
        return boards;
    }
    async register(board) {
        return boardsDao.insertOne(board);
    }
    async detail(bId){
        const board=await boardsDao.findById(bId);
        const bls=await boardLikesDao.groupByStatusFindByBid(bId);
        const imgs=await boardImsDao.findByBId(bId);
        const replies=await boardRepliesDao.findByBid(bId);
        board.imgs=imgs;
        board.bls=bls;
        board.replies=replies;
        //대댓글 !!
        if(board.replies && Array.isArray(board.replies)){
            for(let i=0; i<board.replies.length; i++){
                let br_id=board.replies[i].br_id;
                const replies=await boardRepliesDao.findByParentBrId(br_id);
                board.replies[i].replies=replies;
            }
        }

        //boards : board_imgs = 1 : N
        //boards : board_likes = 1 : N
        //boards : board_replies = 1 :N
        //board_replies (댓글): board_replies (대댓글) = 1: N (Self join)
        return board;
    }
    async modify(board){
        let del=await boardsDao.updateById(board);
        //board.bi_id=>[] or ["12", "15", "16"]
        //board.bi_id=>undefined, "122"  , ["12", "315"]
        if(board.bi_id && Array.isArray(board.bi_id)){
            for (let biId of board.bi_id){
                del+=await boardImsDao.deleteById(biId);
            }
        }else if(board.bi_id){
            del+=await boardImsDao.deleteById(board.bi_id);
        }
        return del;
    }
    async remove(bId){
        let del=await boardsDao.deleteOne(bId);
        return del;
    }
    async searchUidList(uId){
        return boardsDao.findByUid(uId);
    }

}
module.exports=new BoardsService(); // 라우터에서 최종 사용
