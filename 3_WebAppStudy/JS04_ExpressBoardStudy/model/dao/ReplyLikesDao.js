class BoardLikesDao{
    //BoardService 호출해서 detail 구현하세요!
    #countStatusByBrIdSql=`
        SELECT COUNT(CASE WHEN status = 'LIKE' THEN 1 END) AS 'LIKE',
               COUNT(CASE WHEN status = 'SAD' THEN 1 END)  AS 'SAD',
               COUNT(CASE WHEN status = 'BEST' THEN 1 END) AS 'BEST',
               COUNT(CASE WHEN status = 'BAD' THEN 1 END)  AS 'BAD'
        FROM reply_likes
        WHERE br_id =?`;
    #pool;
    constructor(pool) {
        this.#pool=pool;
    }
    async countStatusByBrId(bId){
        const [rows,f]=await this.#pool.query(this.#countStatusByBrIdSql,[bId]);
        return rows[0];
    }
}
module.exports=BoardLikesDao;