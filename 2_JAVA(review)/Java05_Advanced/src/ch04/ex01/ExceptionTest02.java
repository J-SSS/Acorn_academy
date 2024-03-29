package ch04.ex01;

public class ExceptionTest02 {
	
	public static void go() throws ArrayIndexOutOfBoundsException {
		String[] greetings = {"Hello", "Hola", "안녕하세요"}; // [0][1][2]
		
		int i=0;
		while (i<4) {
			System.out.println(greetings[i]);
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		try {
			go();
		} catch (ArrayIndexOutOfBoundsException e) { // 예외객체 e
			System.out.println(e); // e.toString
			System.out.println(e.getMessage());
			e.printStackTrace(); // 기록
			System.out.println("배열첨자계산이 잘못됐습니다.");
		}
		
		System.out.println("End");
	}
}
