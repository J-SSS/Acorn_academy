const pool=require("../../../model/db/WebAppBoardPool");
const BoardImsDao=require("../../../model/dao/BoardImgsDao");
const boardImsDao=new BoardImsDao(pool);

describe("boardImsDao test",()=>{
   test("findByBId 로 게시글의 이미지 리스트 불러오기",async ()=>{
        const imgs=await  boardImsDao.findByBId(6);
        //expect(imgs.length>0).toBe(true);
        //expect(imgs.length).toBeGreaterThan(0);
       console.log(imgs);
        expect(Array.isArray(imgs)).toBeTruthy();
   });
   test("insertOne 로 게시글에 이미지 등록",async ()=>{
       const img={b_id:6,img_path:"/img/board/99.jpg"}
       const insert=await  boardImsDao.insertOne(img);
       console.log(insert);
       expect(insert).toBeGreaterThan(0);
       //16분까지 쉬었다가 오세요~
   });
   test("deleteById 로 이미지1개 삭제",async ()=>{
        const del=await boardImsDao.deleteById(35);
       console.log(del)
   });
});
