const pool=require("../db/WebAppBoardPool");
const UsersDao=require("../dao/UsersDao");
const usersDao=new UsersDao(pool);
const PageVo = require("../vo/PageVoTest");
class UsersService{
    async list(reqQuery){

            let users;
            let cnt = await usersDao.countBySearch(reqQuery.field, reqQuery.value);
            const pageVo  = new PageVo(cnt,reqQuery);
            users = await usersDao.findPage(pageVo);
            users.pageVo = pageVo;

        return users
    }
    async detail(uId){
        return usersDao.findById(uId);
    }

    async login(uId,pw){
        //로그인한 기록을 추가, pw 수정일을 확인
        return usersDao.findByUidAndPw(uId,pw);
    }


    async permissionModify(uId,permission){
        return usersDao.updatePermissionById(uId,permission)
    }
    async modify(user){
        return usersDao.updateById(user);
    }
    async register(user){
        return usersDao.insertOne(user);
    }
    async remove(uId){
        return usersDao.deleteOne(uId);
    }
}


module.exports=new UsersService(); //라우터에서 최종 사용!
