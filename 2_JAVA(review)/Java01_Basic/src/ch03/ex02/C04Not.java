package ch03.ex02;

public class C04Not {
	public static void main(String[] args) {
		// 논리 부정 연산자 !
		// boolean 타입 데이터만 다룸
		// toggle 알고리즘(스위치 온/오프)
		
		boolean power = false;
		
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
