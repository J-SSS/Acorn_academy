package ch03.ex03.case04.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import ch03.ex03.case04.dao.UserDao;
import ch03.ex03.case04.dao.mysql.UserDaoMySql;
import ch03.ex03.case04.dao.oracle.UserDaoOracle;
import ch03.ex03.case04.domain.User;

public class UserTest02 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("db.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		
		String dbType = prop.getProperty("DBTYPE");
		
		User user = new User();
		user.setUserId("12345");
		user.setUserPw("asdf!@#$");
		user.setUserName("Arnie");
		
		UserDao userDao = null;
		if (dbType.equals("ORACLE")) {
			userDao = new UserDaoOracle(); // 업캐스팅
		}
		else if (dbType.equals("MYSQL")) {
			userDao = new UserDaoMySql();
		}
		else {
			System.out.println("DB Support ERROR");
			return;
		}		
		
		userDao.insertUserInfo(user);
		userDao.updateUserInfo(user);
		userDao.deleteUserInfo(user);
	}
}