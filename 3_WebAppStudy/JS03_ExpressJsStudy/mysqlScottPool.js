const mysql=require("mysql2");
const scottConnInfo={
    user:"root",
    password:"mysql123",
    host:"localhost",
    port:3306,
    database:"scott"
}
const pool=mysql.createPool(scottConnInfo);
const poolPromise=pool.promise();

//console.log(pool);
module.exports = poolPromise;

