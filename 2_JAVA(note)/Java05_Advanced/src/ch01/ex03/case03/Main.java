package ch01.ex03.case03;

public class Main {
	public static void main(String[] args) {
		
		PrintString str = returnString();
		
		str.printString("lamda");
	}
	
	 public static PrintString returnString() {
		 return s -> System.out.println(s);  //반환 값으로 쓰이는 람다식
	}
	
}
