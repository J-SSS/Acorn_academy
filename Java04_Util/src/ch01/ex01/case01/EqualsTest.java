package ch01.ex01.case01;

public class EqualsTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001,"John");
		Worker w2 = new Worker(1001,"John");
		Worker w3 = w1;
		
		System.out.println(w1==w2); //false
		System.out.println(w1.equals(w2)); //false
		System.out.println(w1==w3); //true
		System.out.println(w1.equals(w3)); //true
		
		
		String s1 = new String("John");
		String s2 = new String("John");
		
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
	}
}

//equals() 메소드의 원래 정의(Object 클래스)는
//두 객체(인스턴스)의 주소값이 같은지를 물어보는것
// String 클래스의 equals 메소드는 object 클래스의  equals메소드를 재정의했음

// 주소는 다르지만 (우리가 재정의한) 논리적으로는 같다는 걸 확인했으므로 true가 반환됨
//equals() 메소드
//두 인스턴서의 주소 값을 비교하여 true/false를 반환 (Object 클래스)
//재정의하여 두 인스턴스가 논리적으로 같은지 여부를 구현할 수 있음
//인스턴스(주소)가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의할 수 있음
