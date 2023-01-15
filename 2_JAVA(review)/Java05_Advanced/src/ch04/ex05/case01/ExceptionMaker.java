package ch04.ex05.case01;

public class ExceptionMaker {
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) throws PasswordException {
		if (password == null) {
			throw new PasswordException("비밀번호는 null일 수 없습니다.");
		} else if (password.length() < 7) {
			throw new PasswordException("비밀번호는 7글자 이상이어야 합니다.");
		} else if (password.matches("[a-zA-Z]+")) {
			throw new PasswordException("비밀번호는 숫자나 특수문자를 반드시 포함해야 합니다.");
		}
		this.password = password;
	}
}
