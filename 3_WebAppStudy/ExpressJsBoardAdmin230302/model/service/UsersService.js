const usersDao=require("../dao/UsersDao");
class UsersService{
    async list(permission,page=1){
        if(permission){
            return usersDao.findByPermission(permission,page);
        }else{
            return usersDao.fildAll(page);
        }
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