const pool=require("../../../model/db/WebAppBoardPool");
const BoardLikesDao=require("../../../model/dao/BoardLikesDao");
const boardLikesDao=new BoardLikesDao(pool);

describe("BoardLikesDao test",()=>{
   test("",async ()=>{
      const bls=await boardLikesDao.groupByStatusFindByBid(6);
      console.log(bls);
      expect(Array.isArray(bls)).toBeTruthy();
   });
});