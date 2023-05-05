const pool=require("../../../model/db/WebAppBoardPool");
const BoardRepliesDao=require("../../../model/dao/BoardRepliesDao");
const boardRepliesDao=new BoardRepliesDao(pool);

describe("BoardRepliesDao test",()=>{
    let insertId=0; //삭제 수정 테스트에 사용할 등록된 번호

    beforeAll(async ()=>{
        const reply= {
            b_id: 6,
            u_id: 'user06',
            parent_br_id: null,
            status: 'REPORT',
            img_path: "img/replies/1.jpeg",
            content: '댓글 추가 테스트'
        }
        try {
            insertId=await boardRepliesDao.insertOne(reply);
        }catch (e) {
            console.error(e);
        }
    });
    test("findAll",async ()=>{
        const rows=await boardRepliesDao.findByAll(1);
        console.log(rows);
    });
    test("findByStatus",async ()=>{
        const rows=await boardRepliesDao.findByStatus("PUBLIC",1);
        console.log(rows);
    });
    test("findByBid",async ()=>{
        const rows=await boardRepliesDao.findByBid(7,1);
        console.log(rows);
    });
    test("findByParentBrId",async ()=>{
        const rows=await boardRepliesDao.findByParentBrId(46);
        console.log(rows);
    });

    test("insert",async ()=>{
        const reply= {
           b_id: 6,
           u_id: 'user06',
           parent_br_id: null,
           status: 'REPORT',
           img_path: "img/replies/1.jpeg",
           content: '댓글 추가 테스트'
        }
        let insertId=0;
        try {
            insertId=await boardRepliesDao.insertOne(reply);
        }catch (e) {
            console.error(e);
        }
        expect(insertId).toBeGreaterThan(0);
    });
    test("updateById",async ()=>{
        const reply= {
            br_id: insertId,
            status: 'REPORT',
            img_path: "img/replies/1.jpeg",
            content: '댓글 수정 테스트'
        }
        let update=0;
        try {
            update=await boardRepliesDao.updateById(reply);
        }catch (e) {
            console.error(e);
        }
        expect(update).toBeGreaterThan(0);
    });
    test("updateStatusById",async ()=>{
        const reply= {
            br_id: 16,
            status: 'BLOCK',
        }
        let update=0;
        try {
            update=await boardRepliesDao.updateStatusById(reply);
        }catch (e) {
            console.error(e);
        }
        expect(update).toBeGreaterThan(0);
    });
    test("deleteById",async ()=>{
        let del=0;
        try{
            del=await boardRepliesDao.deleteById(insertId);
        }catch (e) {
            console.error(e);
        }
        expect(del).toBeGreaterThan(0);
    })
});
// 플젝!! 팀원 내일짜서 16일 17일
// 프로젝트가 1 관리자(express+sequlize) 2 서비스(spring)
// 다음주   목16 금17
// 다다음주 월20 화21 =>2~4 (모두 나와야함)  수 목 금 4~5
// 오후 4시 30분에 병합
// 오후 5시  git push 검사
