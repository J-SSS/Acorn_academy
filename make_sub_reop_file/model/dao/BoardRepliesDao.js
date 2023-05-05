//BoardRepliesService
//1.댓글 관리 리스트 [status 로 소메뉴, 페이징, 검색] //==board.findAll,findByStatus
//2.댓글 관리 상태 업데이트
//BoardService
//3.게시글의 댓글 리스트를 출력 (게시글 상세)
//4.게시글에서 댓글 작성(대댓글 작성)
//5.게시글에서 댓글 삭제
//6.게시글에서 댓글 수정
class BoardRepliesDao{
    #findAllSql="SELECT * FROM board_replies ORDER BY post_time DESC LIMIT ?,?";
    #findByStatusSql="SELECT * FROM board_replies WHERE status=? ORDER BY post_time DESC LIMIT ?,?"; //PRIVATE(y),PUBLIC,REPORT(r),BLOCK(b)
    #findByBidSql="SELECT * FROM board_replies WHERE b_id=? AND parent_br_id IS NULL ORDER BY post_time DESC LIMIT ?,?"; //보드에 작성된 댓글(유저에게는 status="PUBLIC",로그인한 유저는 PRIVATE 까지 보여야함)

    #findByParentBrIdSql="SELECT * FROM board_replies WHERE parent_br_id=? ORDER BY post_time";
    //댓글 달린 댓글 리스트 조회!
    #insertOneSql="INSERT INTO board_replies (b_id, u_id, parent_br_id, img_path, content, status) VALUE (?,?,?,?,?,?)";
    #updateByIdSql="UPDATE board_replies SET img_path=?,content=?,status=? WHERE br_id=?";
    #updateStatusByIdSql="UPDATE board_replies SET status=? WHERE br_id=?";
    #deleteByIdSql="DELETE FROM board_replies WHERE br_id=?";
    #pageLength=10;
    #pool;
    constructor(pool) {
        this.#pool=pool;
    }
    async findByAll(page=1){
        const [rows,f]=await this.#pool.query(this.#findAllSql,[(page-1)*this.#pageLength,this.#pageLength]);
        return rows;
    }
    async findByStatus(status,page=1){
        const [rows,f]=await this.#pool.query(this.#findByStatusSql,[status,(page-1)*this.#pageLength,this.#pageLength]);
        return rows;
    }
    async findByBid(bId,page=1){
        const [rows,f]=await this.#pool.query(this.#findByBidSql,[bId,(page-1)*this.#pageLength,this.#pageLength]);
        return rows;
    }
    async findByParentBrId(brId,page=1){
        //댓글(br_id)을 참조하는 댓글(대댓글) 리스트 조회
        const [rows,f]=await this.#pool.query(this.#findByParentBrIdSql,[brId]);
        return rows;
    }

    async insertOne(reply){
    /*reply= {
            b_id: 7,
            u_id: 'user06',
            parent_br_id: null || br_id,
            status: 'REPORT',
            img_path: null,
            content: '댓글입니다10'
    }*/
        //(b_id, u_id, parent_br_id, img_path, content, status);
        const values=[reply.b_id,reply.u_id,reply.parent_br_id,reply.img_path,reply.content,reply.status];
        let insertId=0;
        try {
            const [result]=await this.#pool.execute(this.#insertOneSql,values);
            insertId=result.insertId;
        /*
        *   ResultSetHeader {
              affectedRows: 1, //실행된 로우
              insertId: 44,  //등록할 때 auto increment 로 생성된 pk
            }
        * */
        }catch (e) {
            throw new Error(e);
        }
        return insertId;
    }
    async updateById(reply){
        let update=0;
        /*reply= {
            br_id: 7,
            status: 'REPORT',
            img_path: null,
            content: '댓글입니다10'
        }*/
        //img_path=?,content=?,status=? WHERE br_id=?
        try {
            const values=[reply.img_path,reply.content,reply.status,reply.br_id];
            const [result]=await this.#pool.execute(this.#updateByIdSql,values);
            update=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return update;
    }
    async updateStatusById(reply){
        let update=0;
        /*reply= {
            br_id: 7,
            status: 'REPORT',
        }*/
        //img_path=?,content=?,status=? WHERE br_id=?
        try {
            const values=[reply.status,reply.br_id];
            const [result]=await this.#pool.execute(this.#updateStatusByIdSql,values);
            update=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return update;
    }
    async deleteById(br_id){
        let del=0;
        try {
            const [result]=await this.#pool.execute(this.#deleteByIdSql,[br_id]);
            del=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return del;
    }
}

module.exports=BoardRepliesDao;


