package ch02.ex02.case04;

public class Main {
	public static void main(String[] args) {
		// 소품_인물 생성 (객체 생성)
		Ball ball = new Ball();
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		// 장면(행위): 메소드 호출
		p3.kick(p2.pass(p1.pass(ball))).fly();
	}
}

// 축구선수 3명이 볼을 차는데
// p1이 p2에게 볼을 패스하고,
// p2가 p3에게 볼을 패스하고,
// p3이 볼을 차서, 그 볼이 날라간다.

// 객체를 하나의 데이터(공)로 볼 수 있어야 한다.