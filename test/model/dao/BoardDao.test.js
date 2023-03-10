const pool=require("../../../model/db/WebAppBoardPool");
const BoardsDao=require("../../../model/dao/BoardsDao");
const boardsDao=new BoardsDao(pool);
const PageVo=require("../../../model/vo/PageVo");
describe("model.dao.BoardDao test",()=>{
    test("findById",async ()=>{
       const board=await boardsDao.findById(6);
        console.log(board);
    });
    test("",async ()=>{
        const pageVo=new PageVo(1,10,{field:"title", value:"열"});
        const boards=await boardsDao.findBySearch(pageVo);
        console.log(boards)

    })
    test("countAll",async ()=>{
        let cnt = await boardsDao.countAll();
        console.log(cnt)
    })
    test("countStatus",async ()=>{
        let cnt = await boardsDao.countByStatus("PUBLIC")
        console.log(cnt)
    })
})
