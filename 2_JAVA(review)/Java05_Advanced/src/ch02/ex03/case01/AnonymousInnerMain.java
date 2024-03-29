package ch02.ex03.case01;

class OuterClass {
	
	// 메소드
	Runnable getRunnable() {				
		return new Runnable() { // 익명내부클래스(anonymous inner class)
			@Override
			public void run() {
				System.out.println("익명 내부 클래스");
			}
		};
	}
}

public class AnonymousInnerMain {
	public static void main(String[] args) {
		
		OuterClass out = new OuterClass();
		
		Runnable runner = out.getRunnable();
		runner.run();
	}
}

// ch02.ex02.case02에서 보면
// class LocalInner의 이름은 실제로 호출되는 경우가 없음
// 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
// 1) 메소드 내부에서 생성하여 반환하는 경우
// 2) 인터페이스나 추상 클래스 데이터타입의 변수에 직접 대입하여 생성