const boardLikesDao = require("../../../model/dao/BoardLikesDao");
const boardDao = require("../../../model/dao/BoardsDao");

describe("test", ()=>{
    test("test", async ()=>{
        const board=await boardLikesDao.groupByStatusFindByBidSql(1)

        console.log(board);
    })
})


