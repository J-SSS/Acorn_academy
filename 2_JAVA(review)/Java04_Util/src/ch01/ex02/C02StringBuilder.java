package ch01.ex02;

public class C02StringBuilder {
	public static void main(String[] args) {
		
		String s1 = new String("hello ");
		String s2 = new String("world");
		
		StringBuilder builder = new StringBuilder(s1);
		System.out.println(System.identityHashCode(builder));		
		
		builder.append("world");
		System.out.println(System.identityHashCode(builder));	
		
		s1 = builder.toString();
		System.out.println(s1);
	}
}

// StringBuilder, StringBuffer
// 내부적으로 가변적인 char[]을 멤버 변수로 가짐
// 문자열을 여러번 연결하거나 변경할 때 사용하면 용이
// 새로운 인스턴스를 생성하지 않고 char[]를 변경함