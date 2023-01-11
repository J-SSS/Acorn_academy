package ch04.ex02.case03;

public class NullException {
	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = null;
		
		System.out.println("문자열의 길이 =>" + s1.length());
		System.out.println("문자열의 길이 =>" + s2.length());
	}
}
