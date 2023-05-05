const mysql=require("mysql2");
const conInfo={
    database:"webAppBoard",
    host:"localhost",
    port:3306,
    user:"boardServerDev",
    password:"mysql123"
}
const pool=mysql.createPool(conInfo);
//console.log(pool); //접속 테스트
const poolpromise=pool.promise();
module.exports=poolpromise;