const pool=require("../db/WebAppBoardPool");
const BoardRepliesDao=require("../dao/BoardRepliesDao");
const boardRepliesDao=new BoardRepliesDao(pool);

class BoardRepliesService{
    async register(reply){
        let insertId=await boardRepliesDao.insertOne(reply);
        return insertId;
    }
    async modify(reply){
        let modify=await boardRepliesDao.updateById(reply);
        return modify;
    }
    async remove(brId){
        let del=await boardRepliesDao.deleteById(brId);
        return del;
    }
}
module.exports=BoardRepliesService;