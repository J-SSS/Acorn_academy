package ch04.ex03.case03;

public class Main {
	public static void main(String[] args) {
		
		AutoCloseableImpl obj = new AutoCloseableImpl();
		
		try (obj) {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외처리 부분입니다.");
		}
		
		System.out.println("end");
	}
}
