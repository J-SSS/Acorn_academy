package ch03.ex03.case04.web;

import java.util.Scanner;

import ch03.ex03.case04.dao.UserDao;
import ch03.ex03.case04.dao.mysql.UserDaoMySql;
import ch03.ex03.case04.dao.oracle.UserDaoOracle;
import ch03.ex03.case04.domain.User;

public class UserTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용하실 DB의 종류를 입력하세요.\n> ");
		String db = sc.nextLine();
		
		UserDao userDao = null;
		if (db.equals("oracle")) {
			userDao = new UserDaoOracle(); // 업캐스팅
		}
		else if (db.equals("mysql")) {
			userDao = new UserDaoMySql();
		}
		else {
			System.out.println("DB Support ERROR");
			return;
		}
		
		User user = new User();
		System.out.print("아이디를 입력하세요.\n> ");
		user.setUserId(sc.next());
		System.out.print("패스워드를 입력하세요.\n> ");
		user.setUserPw(sc.next());
		System.out.print("이름을 입력하세요.\n> ");
		user.setUserName(sc.next());
		
		userDao.insertUserInfo(user);
		userDao.updateUserInfo(user);
		userDao.deleteUserInfo(user);
	}
}
