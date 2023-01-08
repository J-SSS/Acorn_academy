package ch01.ex01.case03;

public class EqualsTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001,"John");
		Worker w2 = new Worker(1001,"John");
		
		
		System.out.println(w1==w2); //false
		System.out.println(w1.equals(w2)); //true
	
		System.out.println(w1.hashCode());
		System.out.println(w1.hashCode()); //서로다름
		
		String s1 = new String("123");
		String s2 = new String("123");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
	
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode()); //서로같음(String 클래스에서 오버라이딩 돼있음)
		
		Integer i = -100; // Integer의 경우 hash값을 찍어보면, 할당한 정수값이 출력됨(오버라이딩)
		System.out.println(i.hashCode()); // -100 (Integer 클래스에서 오버라이딩됨)
	}
}

