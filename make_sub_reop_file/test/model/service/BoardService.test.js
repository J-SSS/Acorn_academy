const boardService=require("../../../model/service/BoardsService");
describe("boardService test",()=>{
   test("detail",async ()=>{
       const board=await boardService.detail(6);
       console.log(board);
   });
   test("modify",async ()=>{
        const board={
            b_id: '6',
            u_id: 'user06',
            title: '여섯 번째 글입니다.',
            content: '안녕하세요. 여섯 번째 글입니다.',
            status: 'BLOCK',
            bi_id: [ '34', '36' ]
        }
        let del=await boardService.modify(board);
       console.log(del);
   })
});