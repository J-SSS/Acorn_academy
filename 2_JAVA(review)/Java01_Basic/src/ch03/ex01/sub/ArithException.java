package ch03.ex01.sub;

public class ArithException {
	public static void main(String[] args) {
		
		try {
			System.out.println(5 / 0); // ERROR
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("End");
	}
}
