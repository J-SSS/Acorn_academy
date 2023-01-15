package ch01.ex01.etc.case05;

public class C01String {
	public static void main(String[] args) {
		
		String s1 = "이";
		String s2 = "이";
		
		System.out.println(s1==s2); //true
		//String은 클래스 개념이라서 s1과s2의 주소가 같다는 의미가 됨.
		
		String s3 = new String("이");
		String s4 = new String("이");
		
		System.out.println(s3==s4); //s3과s4는 별개의 객체이기때문에 다름
		
		String s5 = "이";
		String s6 = new String("이"); //이 둘도 다름
		
		boolean b1 = s5.equals(s6);
		System.out.println(b1);
	}
}
