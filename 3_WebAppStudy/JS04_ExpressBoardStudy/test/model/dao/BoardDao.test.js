const boardDao=require("../../../model/dao/BoardsDao");
describe("model.dao.BoardDao test",()=>{
    test("findById",async ()=>{
       const board=await boardDao.findById(6);
        console.log(board);
    });
})