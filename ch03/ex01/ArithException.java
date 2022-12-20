package ch03.ex01;

public class ArithException {
	public static void main(String[] args) {
		
		try {
			System.out.println(5/1);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
	}
}
