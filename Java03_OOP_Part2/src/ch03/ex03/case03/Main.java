package ch03.ex03.case03;


import ch03.ex03.case03.dao.user.UserDao;
import ch03.ex03.case03.dao.user.UserDaoImpl;
import ch03.ex03.case03.presentation.Console;
import ch03.ex03.case03.presentation.user.UserIo;
import ch03.ex03.case03.service.user.UserService;
import ch03.ex03.case03.service.user.UserServiceImpl;

public class Main {
	public static void main(String[] args) {
		
		UserDao userDao = new UserDaoImpl();
		UserService userservice = new UserServiceImpl(userDao);
		UserIo userIo = new UserIo(userservice);
		
		Console.showInfo("앱을 시작합니다.");
		userIo.run();
		Console.showInfo("앱을 종료합니다.");
	}
}
