package ch01.ex01.case01;

public class EqualsTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001, "John");
		Worker w2 = new Worker(1001, "John");
		Worker w3 = w1;
		
		System.out.println(w1 == w2); 		// false
		System.out.println(w1.equals(w2));  // false
		System.out.println(w1 == w3); 		// true
		System.out.println(w1.equals(w3));  // true
		
		
		String s1 = new String("John");
		String s2 = new String("John");
		
		System.out.println(s1 == s2); 		// false
		System.out.println(s1.equals(s2));  // true  (입력한 문자열이 같으면 true가 나오도록 String 클래스에서 오버라이딩됐으므로)
	}
}

// equals() 메소드의 원래 정의(Object 클래스)는
// 두 객체(인스턴스)의 주소값이 같은지를 물어보는 것
// String 클래스의 equals() 메소드는 Object 클래스의 equals() 메소드를 재정의(override)했음