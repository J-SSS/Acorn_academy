const pool=require("../db/WebAppBoardPool");
const boardDao={

    findAllSql: "SELECT * FROM boards LIMIT ?,?",
    findByIdSql: "SELECT * FROM boards WHERE b_id=?",
    findByUidSql: "SELECT * FROM boards WHERE u_id=?",
    findByStatusSql: "SELECT * FROM boards WHERE status=? LIMIT ?,?",
    updateSql: "UPDATE boards SET title=?, content=?, status=? WHERE b_id=?",
    insertSql: "INSERT INTO boards (u_id,title,content ,status) value (?,?,?,?)",
    deleteSql: "DELETE FROM boards WHERE b_id=?",

    findAll : async function(page=1){
        let length=5;
        const[rows,f]=await pool.query(this.findAllSql,[(page-1)*length, length]);
        return rows;
    },
    findById : async function(bId){
       const [rows,f]=await pool.query(this.findByIdSql,[bId]);
        return rows[0] || null;
    },

    findByUid : async function(uId){
        const [rows,f]=await pool.query(this.findByUidSql,[uId]);
        return rows[0] || null;
    },

    findByStatus : async function(status,page=1) {
      let length=5;
      const values=[status, (page-1)*length,length]
      const [rows,f]= await pool.query(this.findByStatusSql,values);
      return rows;
    },

    updateById : async function(board) {
        let update=0;
        const values=[
            board.title,
            board.content,
            board.status,
            board.b_id

        ];
        try{
            const [result]=await pool.execute(this.updateSql, values);
            update=result.affectedRows;
        }catch (e) {
            throw new Error(e); // ???? 🧨예외위임?
        }
        return update;
    },

    insertOne : async function(board) {
        let insert=0;
        const values=[
            board.u_id,
            board.title,
            board.content,
            board.status
        ];
        try{
            const [result]=await pool.execute(this.insertSql,values);
            insert=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return insert;
    },
    deleteOne : async function(bId){
        let del=0;
        try{
            const [result, f]=await pool.execute(this.deleteSql,[bId]);
            del=result.affectedRows;
        }catch(e){
            throw new Error(e);
        }
        return del;
    }

}
module.exports=boardDao;