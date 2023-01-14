package ch03.ex03.case03.presentation.user;

import ch03.ex03.case03.presentation.Console;
import ch03.ex03.case03.service.user.UserService;

public class UserIo {
	private UserService userService;
	
	public UserIo(UserService userService) {
		this.userService = userService;
	}
	
	public void run() {
		Console.showInfo(userService.searchUser()); //김석영
	}
}
