package ch04.ex03.case03;

public class Main {
	public static void main(String[] args) {
		
		AutoCloseableImpl obj = new AutoCloseableImpl();
		
		try(obj){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
		} finally {
			System.out.println("finally블록은 항상 실행됩니다");
		}
		
	}
}
