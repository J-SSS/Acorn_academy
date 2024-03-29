package ch02.quiz.case04;

public abstract class PlayerLevel {
	
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevelMessage();
	
	final public void go(int count) { // 템플릿 메소드 (오버라이딩 X)
		run();
		for (int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}

// 추상메소드
// interface: public abstract이 생략
// 추상클래스: abstract을 붙여줘야 함