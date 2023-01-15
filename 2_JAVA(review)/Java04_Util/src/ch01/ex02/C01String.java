package ch01.ex02;

public class C01String {
	public static void main(String[] args) {
		
		String s1 = new String("hello ");
		String s2 = new String("world");
		System.out.println(System.identityHashCode(s1));
		
		s1 = s1.concat(s2);
		
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
	}
}
