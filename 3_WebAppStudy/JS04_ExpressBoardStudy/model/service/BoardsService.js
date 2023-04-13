const boardsDao = require("../dao/BoardsDao");
const boardImsDao = require("../dao/BoardImgsDao");
const boardLikesDao = require("../dao/BoardLikesDao");

class BoardsService{
    async list(status,page=1){
        if(status) {
            return boardsDao.findByStatus(status,page);
        }else {
            return boardsDao.findAll(page);
        }
    }
    async register(board) {
        return boardsDao.insertOne(board);
    }
    async detail(bId){
        //boards : board_imgs = 1 : N
        const board=await boardsDao.findById(bId);
        const imgs=await boardImsDao.findByBId(bId);
        board.imgs=imgs;

        //boards : board_likes = 1:N
        //board_likes의 그룹핑된 수

        const likes = await boardLikesDao.groupByStatusFindByBidSql(bId);
        for(const like of likes){
            if(like.status=='LIKE') board.likes = like.cnt;
            else if(like.status=='SAD') board.sads = like.cnt;
            else if(like.status=='BAD') board.bads = like.cnt;
            else if(like.status=='BEST') board.bests = like.cnt;
        }
        console.log("??????????")
        return board;
    }
    async modify(board){ //[], [12, 15, 16...]
        let del = await  boardsDao.updateById(board);

        // board.bi_id => [] or [12,15,16...]
        // board.bi_id => undefined, 12 , [12,15]
        if(board.bi_id && Array.isArray(board.bi_id)){
            for(let biId of board.bi_id){
                del+=await boardImsDao.deleteById(biId);
            }
        } else if(board.bi_id){
            del+=await boardImsDao.deleteById(board.bi_id);
        }
        return del;
    }
    async remove(bId){
        let del = await boardsDao.deleteOne(bid);

        return del;
    }

    async searchUidList(uId){
        return boardsDao.findByUid(uId);
    }

}
module.exports=new BoardsService(); // 라우터에서 최종 사용