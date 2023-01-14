package ch03.ex03.case03.dao.user;

import ch03.ex03.case03.domain.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return new User("김석영");
	}

}
