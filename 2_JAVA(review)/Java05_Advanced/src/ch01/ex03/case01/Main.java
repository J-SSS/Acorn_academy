package ch01.ex03.case01;

public class Main {
	public static void main(String[] args) {
		
		PrintString str = s -> System.out.println(s); // 매개변수가 하나일 경우 소괄호 생략 가능
		
		str.printString("Lamda식 구현");
	}
}
