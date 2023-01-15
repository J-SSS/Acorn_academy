package ch03.ex03.case04.dao.oracle;

import ch03.ex03.case04.dao.UserDao;
import ch03.ex03.case04.domain.User;

public class UserDaoOracle implements UserDao {

	@Override
	public void insertUserInfo(User user) {
		System.out.println("INSERT INTO ORACLE DB userId = " + user.getUserId());
	}

	@Override
	public void updateUserInfo(User user) {
		System.out.println("UPDATE SET ORACLE DB userPw = " + user.getUserPw());
	}

	@Override
	public void deleteUserInfo(User user) {
		System.out.println("DELETE FROM ORACLE DB userName = " + user.getUserName());
	}
}
