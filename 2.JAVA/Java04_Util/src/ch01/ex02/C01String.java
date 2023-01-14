package ch01.ex02;

public class C01String {
	public static void main(String[] args) {

		String s1 = new String("hello ");
		String s2 = new String("world");
		System.out.println(s1.toString());
		System.out.println(System.identityHashCode(s1));
		
		
		s1 = s1.concat(s2);
		
		
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}
	

}
// 기존의 s1객체를 변경하는 것이 아니라, 새로운 객체를 생성
// 메모리 낭비가 발생함