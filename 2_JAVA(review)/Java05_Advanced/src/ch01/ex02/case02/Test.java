package ch01.ex02.case02;

public class Test {
	public static void main(String[] args) {
		// 람다식 방식
		String s1 = "Hello ";
		String s2 = "World";
		
		StringConcat concat = (x, y) -> System.out.println(x + y);
		concat.concatString(s1, s2);
	}
}