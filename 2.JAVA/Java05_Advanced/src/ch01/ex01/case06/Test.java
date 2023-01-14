package ch01.ex01.case06;

public class Test {
	public static void main(String[] args) {
		// 람다식 방식
		String s1 = "hello ";
		String s2 = "world"	;
		
		StringConcat concat = (x , y) -> System.out.println(x + y);
		concat.concatString(s1, s2);
	}
}
