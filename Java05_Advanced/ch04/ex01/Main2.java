package ch04.ex01;

public class Main2 {
	public static void go() throws ArrayIndexOutOfBoundsException{
		
		String[] greetings = {"hello", "hola", "안녕하세요"}; // [0][1][2]
		
	
		int i = 0 ;
		
		while (i<4) {
			System.out.println(greetings[i]);
			i++;
			}
	}
	
	public static void main(String[] args) {
		
		try {
			go();
		}
		catch(ArrayIndexOutOfBoundsException e) { // 예외객체 e
			System.out.println(e); //e.tostring
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
	}
}
