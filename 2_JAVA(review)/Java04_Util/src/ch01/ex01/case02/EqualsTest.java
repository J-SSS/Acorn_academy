package ch01.ex01.case02;

public class EqualsTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001, "John");
		Worker w2 = new Worker(1001, "John");
		
		System.out.println(w1 == w2); 		// false;
		System.out.println(w1.equals(w2));  // true
	}
}

// 주소는 다르지만 (우리가 재정의한) 논리적으로는 같다는 걸 확인했으므로 true가 반환됨
// equals() 메소드
// 두 인스턴서의 주소 값을 비교하여 true/false를 반환 (Object 클래스)
// 재정의하여 두 인스턴스가 논리적으로 같은지 여부를 구현할 수 있음
// 인스턴스(주소)가 다르더라도 논리적으로 동일한 경우 true를 반환하도록 재정의할 수 있음