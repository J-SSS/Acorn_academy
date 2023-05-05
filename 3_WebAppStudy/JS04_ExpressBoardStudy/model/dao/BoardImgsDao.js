//const pool=require("../db/WebAppBoardPool");
//board detail 에서 ims 불러오기
//board update 에서 ims 삭제
//board update 에서 ims 등록
class BoardImgsDao{
    #findByBIdSql="SELECT * FROM board_imgs WHERE b_id=?";
    #deleteByIdSql="DELETE FROM board_imgs WHERE bi_id=?";
    #inserOneSql="INSERT INTO board_imgs(b_id, img_path) VALUE(?,?)";
    #pool;
    constructor(pool) {
        this.#pool=pool;
    }


    async findByBId(bId){
        const [rows,f]=await this.#pool.query(this.#findByBIdSql,[bId]);
        return rows;
    }
    async deleteById(biId){
        let del=0;
        try {
            const [result]=await this.#pool.execute(this.#deleteByIdSql,[biId]);
            del=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return del;
    }
    async insertOne(boardImg){//boardImg : {b_id:"",img_path:""}
        let insert=0;
        try {
            const [result]=await this.#pool.execute(this.#inserOneSql,[boardImg.b_id, boardImg.img_path]);
            insert=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return insert;
    }
}

module.exports=BoardImgsDao; //사용하는 쪽에서 객체를 생성해야한다.