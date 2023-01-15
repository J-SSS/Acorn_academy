package ch03.ex03.case04.dao;

import ch03.ex03.case04.domain.User;

public interface UserDao {
	
	void insertUserInfo(User user);
	void updateUserInfo(User user);
	void deleteUserInfo(User user);
}
