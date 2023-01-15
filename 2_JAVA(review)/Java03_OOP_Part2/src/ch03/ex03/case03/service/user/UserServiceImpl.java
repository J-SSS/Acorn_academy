package ch03.ex03.case03.service.user;

import ch03.ex03.case03.dao.user.UserDao;
import ch03.ex03.case03.domain.User;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) { // DI
		this.userDao = userDao;
	}

	@Override
	public User searchUser() {
		return userDao.getUser();
	}
}
