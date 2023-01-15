package ch03.ex01;

public class C05Random {
	public static void main(String[] args) {
		// Math.random(): 0.0 이상 1.0 미만
		System.out.println(Math.PI);
		System.out.println(Math.random());
		
		// 1이상 10이하의 정수값 출력
		int result = (int)(Math.random() * 10) + 1;
		System.out.println(result);
	}
}
