package ch01.ex02.case01;

public class Test {
	public static void main(String[] args) {
		// OOP 방식
		String s1 = "Hello ";
		String s2 = "World";
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.concatString(s1, s2);
	}
}
