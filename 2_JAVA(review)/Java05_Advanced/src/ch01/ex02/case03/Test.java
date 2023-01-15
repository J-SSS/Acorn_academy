package ch01.ex02.case03;

public class Test {
	public static void main(String[] args) {
		// 람다식 방식
		String s1 = "Hello ";
		String s2 = "World";
		
		StringConcat concat = new StringConcat() {
			@Override
			public void concatString(String s1, String s2) {
				System.out.println(s1 + s2);
			}
		};
		
		concat.concatString(s1, s2);
	}
}
