//const pool=require("../db/WebAppBoardPool");
class UsersDao{
    findByUidAndPwSql = "SELECT * FROM users WHERE u_id=? AND pw=? AND permission='ADMIN'";
    findAllSql="SELECT * FROM users LIMIT ?,?";
    findByPermissionSql="SELECT * FROM users WHERE permission=? LIMIT ?,?";
    findByIdSql="SELECT * FROM users WHERE u_id=?";
    updateSql="UPDATE users SET permission=?,email=?,name=?,phone=?,pw=?,gender=?,birth=?,img_path=?,address=?,detail_address=? WHERE u_id=?";
    updatePermissionSql="UPDATE users SET permission=? WHERE u_id=?";
    insertSql="INSERT INTO users (u_id, pw, name, phone, img_path, email, birth, gender, address, detail_address, permission) value (?,?,?,?,?,?,?,?,?,?,?)";
    deleteSql="DELETE FROM users WHERE u_id=?";
    #pool;
    #findBySearchSql="SELECT * FROM users";
    #countBySearchSql="SELECT COUNT(*) FROM users";
    constructor(pool) {
        this.#pool=pool;
    }
    async findPage(pageVo){
        let searchQuery = this.#findBySearchSql;

        if(pageVo.searchField && pageVo.searchValue){
            searchQuery+=` WHERE ${pageVo.searchField} LIKE '%${pageVo.searchValue}%'`;
        }
        searchQuery+=" ORDER BY "+((pageVo.orderField) || "post_time");
        searchQuery+=" "+(pageVo.orderDirect || "DESC");
        searchQuery+=" LIMIT ?,?";

        const [rows,f] = await this.#pool.query(searchQuery,[pageVo.offset, pageVo.rowLength])
        return rows;
    }
    async countBySearch(searchField, searchValue){
        let sql=this.#countBySearchSql;
        if(searchField && searchValue){
            sql+=` WHERE ${searchField} LIKE '%${searchValue}%'`;
        }
        const [rows,f]=await this.#pool.query(sql);

        return rows[0]["COUNT(*)"];
    }
    async findByUidAndPw(uId,pw){
        const [rows,f]=await this.#pool.query(this.findByUidAndPwSql,[uId,pw]);
        return rows[0] || null;
    }
    // async fildAll(page=1){
    //     let length=5;
    //     const [rows,f]=await this.#pool.query(this.findAllSql,[(page-1)*length,length]);
    //     return rows;
    // }
    //  async findByPermission(permission,page=1){
    //     //화살표 함수를 사용하면 this 가 userDao 를 포함하는 Object 를 바인드함
    //     let length=5;
    //     const values=[permission,(page-1)*length,length];
    //     const [rows,f]=await this.#pool.query(this.findByPermissionSql,values);
    //     return rows;
    // }
     async findById(uId){
        const [rows,f]=await this.#pool.query(this.findByIdSql,[uId]);
        return  rows[0] || null;
    }
     async updatePermissionById (uId,permission){
        let update=0;
        const [result]=await this.#pool.execute(this.updatePermissionSql,[permission,uId]);
        update=result.affectedRows;
        return update;
    }
     async deleteOne(uId){
        let del=0;
        try {
            const [result,f]=await this.#pool.execute(this.deleteSql,[uId]);
            del=result.affectedRows;
        }catch (e) {
            throw new Error(e); //예외 위임
        }
        return del;
    }
     async updateById(user){
        let update=0;
        const values=[
            user.permission,
            user.email,
            user.name,
            user.phone,
            user.pw,
            user.gender,
            user.birth,
            user.img_path,
            user.address,
            user.detail_address,
            user.u_id
        ];
        try {
            const [result]=await this.#pool.execute(this.updateSql,values);
            update=result.affectedRows;
        }catch (e) {
            throw new Error(e); //예외 위임
        }
        return update;
    }
     async insertOne(user){
        let insert=0;
        const values=[
            user.u_id,
            user.pw,
            user.name,
            user.phone,
            user.img_path,
            user.email,
            user.birth,
            user.gender,
            user.address,
            user.detail_address,
            user.permission
        ];
        try {
            const [result]=await this.#pool.execute(this.insertSql,values);
            insert=result.affectedRows;
        }catch (e) {
            throw new Error(e);
        }
        return insert;
    }
}
module.exports=UsersDao;
