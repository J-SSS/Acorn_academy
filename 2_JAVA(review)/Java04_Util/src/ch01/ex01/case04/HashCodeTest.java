package ch01.ex01.case04;

public class HashCodeTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001, "John");
		Worker w2 = new Worker(1001, "John");
		
		System.out.println(w1 == w2); 		// false
		System.out.println(w1.equals(w2));  // true
		
		System.out.println(w1.hashCode());	// 1001
		System.out.println(w2.hashCode());	// 1001
		
		System.out.println(System.identityHashCode(w1));
		System.out.println(System.identityHashCode(w2));
	}
}

// 우리는 지금 논리적으로 같으면 같은 hash값이 반환되도록 해줬다.
// 그럼 진짜 갖고 있는 hash값은 어떻게 알 수 있나요?
// 없어진 게 아니고 System.identityHashCode(obj)
// 진짜 해당 인스턴스의 hashCode값을 출력해주는 함수다. (가상메모리값_10진수)