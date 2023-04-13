const pool=require("../db/WebAppBoardPool");
class BoardLikesDao{
    //BoardService 호출해서 detail 구현하세요

    #groupByStatusFindByBidSql="SELECT status, count(*) cnt FROM board_likes WHERE b_id=? GROUP BY status";
    async groupByStatusFindByBidSql(bId){
        const [rows,f]=await pool.query(this.#groupByStatusFindByBidSql,[bId]);
        return rows;
    }
}

module.exports=new BoardLikesDao();