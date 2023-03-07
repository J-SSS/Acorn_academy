//Test Driven Development : 테스트 주도 개발에 꼭 단위 테스트를 사용한다.

//jest 설치 및 설정
//페이스북에서 개발한 단위 테스트를 위한 테스트 프레임워크(test 실행 및 검증[expect])
//단위 테스트 라이브러리는 커버리지 보고서(성능 or 기능)를 작성해서 코드품질 개선에 사용될 수 있다.
//JUnit5 자바의 단위 테스트 라이브러리와 거의 동일하다.(maven 프로젝트에서 기본 제공하고 있음.)

//프로젝트를 배포하기전 npm test 를 진행하고 문제가 없으면 배포할 수 있다.
//or 개발(유지보수)도중 특정 test 문서만 테스트를 진행할 수 있다.
//or 개발(유집보수)도중 특정 test 문서의 특정 test 만 진행하면서 개발 가능
//=> 단위 테스트

//npm i --save-dev jest
//-dev : 개발환경으로 지정 (jest 모듈을 import 할 필요 x)
//npm i --save-dev @types/jest (jest typescript 로 자동완성 제공)
//프로젝트 root jest.config.js 추가해서 npm test 를 했을 때 어떤 파일을 할 것인지 명시
//package.json(npm 의 프로젝트 빌드와 라이브러 디펜던시 추가) 에서 npm test 명령어 추가
//npm test 라 하면 *.test.js 파일 모두를 테스트 실행한다.

//describe 내에서 작성할 수 있는 test 함수
//test() : 모든 test 는 멀티스레드로 실행 (비동기)
//beforeAll,afterAll,beforeEach,afterEach : test 전처리 (test 로 취급하지 않음)
//beforeAll() : 제일 처음 실행
//afterAll() : 제일 마지막 실행

//beforeEach() : 모든 test() 실행 전에
//afterEach() : 모든 test() 실행 후에
/* jest.test() 에서 사용할 수 있는 검사식
expect(data)==비교연산: (.not.) 기대하는 값과 실제 값이 일치하는지 검사합니다. 주로 toBe(기본형), toEqual(자료형), toBeNull(), toBeTruthy(), toBeFalsy() 등의 메서드를 사용합니다.
toThrow(함수이름): 함수 호출 시 예외가 발생하는지 검사합니다.
toMatch(정규식): 정규식과 일치하는지 검사합니다.
toContain(문자열 or 배열): 배열이나 문자열에 특정 값이 포함되어 있는지 검사합니다.
toHaveLength(길이): 배열이나 문자열의 길이가 일치하는지 검사합니다.
toBeGreaterThan(>), toBeLessThan(<): 숫자가 특정 값보다 크거나 작은지 검사합니다.
toHaveProperty(in): 객체가 특정 프로퍼티를 가지고 있는지 검사합니다.
toHaveBeenCalled(), toHaveBeenCalledWith(): 함수가 호출되었는지, 특정 인수와 함께 호출되었는지 검사합니다.
*
*/
const userDao=require("../../../model/dao/UsersDao");
describe("model.dao.UserDao Test 진행",()=>{
    //test() 함수는 비동기코드로 순서없이 실행된다.
    let i=0;
    beforeAll(async ()=>{
        console.log("insertOne test01 등록");
        const user={
            u_id:"test01",
            pw:"1234",
            name:"test",
            phone: "99999998888",
            email: "test@test.com",
            birth: "1900-02-02",
            gender: "FEMALE",
            img_path:null,
            address:null,
            detail_address:null,
            permission:"ADMIN"
        };
        try{
            let insert=await userDao.insertOne(user);
            console.log("등록 : "+insert)
        }catch (e) {
            console.error(e);
        }
    });
    afterAll(async ()=>{
        console.log("deleteOne test01 삭제");
        let del=await userDao.deleteOne("test01");
        console.log("삭제:"+del);
    })
    test("insertOne test02 등록 및 삭제",async ()=>{
        const user={
            u_id:"test02",
            pw:"1234",
            name:"test",
            phone: "88888888888",
            email: "test02@test.com",
            birth: "1900-02-02",
            gender: "FEMALE",
            img_path:null,
            address:null,
            detail_address:null,
            permission:"PRIVATE"
        };
        let insert=0;
        try {
            insert=await userDao.insertOne(user);
            console.log("등록 : "+insert);
        }catch (e) {
            console.error(e)
            //throw Error(e);
            //test: 오류가 뜨지 않으면 성공 toThrow (default)
        }
        let del=0;
        try {
            del=await userDao.deleteOne(user.u_id);
        }catch (e) {
            console.error(e);
        }
        expect(insert).toBe(1) && expect(del).toBe(1);
        //insert 가 1이 아니면 test 실패가 발생
    });

    test("findById",async ()=>{
        let user=await userDao.findById("test01");
        console.log("user :"+JSON.stringify(user));
        expect(user).not.toBeNull(); //null이 아닌지 검사
    });
    test("findByUidAndPw",async ()=>{
        let user=await userDao.findByUidAndPw("test01","1234");
        console.log("user :"+JSON.stringify(user));
        expect(user).not.toBeNull(); //null이 아닌지 검사
    });
    test("findAll",async ()=>{
        let users=await userDao.fildAll();
        //console.log(JSON.stringify(users)); //???
        //Array.isArray(users); //js Array 가 배열 타입인지 검사 (x jest)
        expect(Array.isArray(users)).toBeTruthy();
        //expect(Array.isArray(users)).toBe(true);
    });
    test("updateById",async ()=>{
        const user={
            u_id:"test01",
            pw:"test1234",
            name:"testUpdate",
            phone: "1199999998888",
            email: "test11@test.com",
            birth: "1900-12-29",
            gender: "MALE",
            img_path:"/img/users/test01.jpeg",
            address:"경기도",
            detail_address:"하남시",
            permission:"ADMIN"
        };
        let update=await userDao.updateById(user);
        let resultUser=await userDao.findById("test01");
        console.log(JSON.stringify(resultUser));
        delete user.birth;
        delete resultUser.birth;
        delete resultUser.post_time;
        //수정한 내역과 조회한 내역이 같은지?
        expect(update).toBe(1) && expect(user).toEqual(resultUser);
    });

});
