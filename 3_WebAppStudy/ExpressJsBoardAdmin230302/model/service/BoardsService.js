const boardsDao = require("../dao/BoardsDao");
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
        return boardsDao.findById(bId);
    }
    async modify(board){
        return boardsDao.updateById(board);
    }
    async remove(bId){
        return boardsDao.deleteOne(bId);
    }

    async searchUidList(uId){
        return boardsDao.findByUid(uId);
    }

}
module.exports=new BoardsService(); // 라우터에서 최종 사용