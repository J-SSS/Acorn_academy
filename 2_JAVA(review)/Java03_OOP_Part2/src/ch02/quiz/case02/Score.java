package ch02.quiz.case02;

public class Score {
	
	private String name;
	private String major;
	private int score;
	
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public int getScore() {
		return score;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setScore(int score) {
		this.score = score;
	}
}

// 정보은닉(Information Hiding)
// POJO