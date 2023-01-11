package ch01.ex03.case02;

public class Main {
	public static void main(String[] args) {
		
		PrintString str = (s) -> {System.out.println(s);}; //매개변수가 하나인경우 소괄호도 생략가능
		
		showString(str);
	}
	
	 public static void showString(PrintString p) {
		p.printString("매개변수로 람다식 전달");
	}
	
}
