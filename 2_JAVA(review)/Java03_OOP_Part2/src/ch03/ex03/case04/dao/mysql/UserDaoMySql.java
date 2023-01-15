package ch03.ex03.case04.dao.mysql;

import ch03.ex03.case04.dao.UserDao;
import ch03.ex03.case04.domain.User;

public class UserDaoMySql implements UserDao {

	@Override
	public void insertUserInfo(User user) {
		System.out.println("INSERT INTO MySql DB userId = " + user.getUserId());
	}

	@Override
	public void updateUserInfo(User user) {
		System.out.println("UPDATE SET MySql DB userPw = " + user.getUserPw());
	}

	@Override
	public void deleteUserInfo(User user) {
		System.out.println("DELETE FROM MySql DB userName = " + user.getUserName());
	}

}
