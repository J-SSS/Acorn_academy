package ch04.ex01;

public class ExceptionTest01 {
	public static void main(String[] args) {
		
		String[] greetings = {"Hello", "Hola", "안녕하세요"}; // [0][1][2]
		
		int i=0;
		while (i<4) {
			System.out.println(greetings[i]);
			i++;
		}
	}
}
