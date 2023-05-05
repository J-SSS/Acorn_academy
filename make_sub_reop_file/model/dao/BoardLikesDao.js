class BoardLikesDao{
    //BoardService 호출해서 detail 구현하세요!
    #groupByStatusFindByBidSql="SELECT COUNT(status) cnt, status FROM board_likes WHERE b_id=? GROUP BY status";
    #pool;
    constructor(pool) {
        this.#pool=pool;
    }
    async groupByStatusFindByBid(bId){
        const [rows,f]=await this.#pool.query(this.#groupByStatusFindByBidSql,[bId]);
        return rows;
    }
}
module.exports=BoardLikesDao;