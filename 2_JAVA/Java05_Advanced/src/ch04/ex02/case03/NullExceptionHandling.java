package ch04.ex02.case03;

public class NullExceptionHandling {
	
	static void a() {
		
	}
	
	public static void main(String[] args) {
		

		try {
//			String s = null;
//			System.out.println("문자열의 길이 =>" + s);
		
			throw new NullPointerException("NullPointer 에러 연습"); // 가상의 예외 발생
			
			
		} catch (Exception e) {
			System.out.println("객체 생성 없이는 메소드 호출이 불가능합니다");
		}
		System.out.println("끝");
	}
	
}
