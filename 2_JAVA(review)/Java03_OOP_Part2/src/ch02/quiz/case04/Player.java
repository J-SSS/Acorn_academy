package ch02.quiz.case04;

public class Player {
	// 필드_멤버변수
	private PlayerLevel level; // Player has a PlayerLevel
	
	// 생성자
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	// 메소드
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
}
