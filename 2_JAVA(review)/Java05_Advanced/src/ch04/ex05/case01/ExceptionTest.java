package ch04.ex05.case01;

public class ExceptionTest {
	public static void main(String[] args) {
		
		ExceptionMaker maker = new ExceptionMaker();
		
		String password = null;		
		try {
			maker.setPassword(password); 
			System.out.println("오류 없음1");
		} catch (PasswordException e) {
			System.out.println(e.getMessage()); // 비밀번호는 null일 수 없습니다.
		}
		
		password = "asdf";
		try {
			maker.setPassword(password);
			System.out.println("오류 없음2");
		} catch (PasswordException e) {
			System.out.println(e.getMessage()); // 비밀번호는 7글자 이상이어야 합니다.
		}
		
		password = "asdfzxcvasdf";
		try {
			maker.setPassword(password);
			System.out.println("오류 없음3");
		} catch (PasswordException e) {
			System.out.println(e.getMessage()); // 비밀번호는 숫자나 특수문자를 반드시 포함해야 합니다.
		}
		
		password = "asdf1234!@#$";
		try {
			maker.setPassword(password);
			System.out.println("오류 없음4");
		} catch (PasswordException e) {
			System.out.println(e.getMessage());
		}
	}
}
