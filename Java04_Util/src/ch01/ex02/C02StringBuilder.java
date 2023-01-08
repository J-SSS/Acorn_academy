package ch01.ex02;

public class C02StringBuilder {
	public static void main(String[] args) {
		
		String s1 = new String("hello ");
		String s2 = new String("world");
		
		System.out.println(System.identityHashCode(s1));
		
		StringBuilder builder = new StringBuilder(s1);
		System.out.println(System.identityHashCode(builder));
		
		builder.append("world");
		
		s1 = builder.toString();
		
		System.out.println(System.identityHashCode(builder));
	}
	
	
}

// StringBuffer, StringBuffer
// 내부으로 가변적인 char[]을 멤버 변수로 가짐
// 문자열을 여러번 연걸하거나 변경할 때 사용하면 용이
// 새로운 인스턴스를 생성하지 않고 Char[]를 변경함