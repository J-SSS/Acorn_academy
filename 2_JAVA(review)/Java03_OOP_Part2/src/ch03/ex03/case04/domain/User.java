package ch03.ex03.case04.domain;

public class User {
	// 필드
	private String userId;
	private String userPw;
	private String userName;
	
	// 생성자
	public User() {}
	
	// 메소드 - getters, setters
	public String getUserId() {
		return userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
