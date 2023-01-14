package ch01.ex01.case04;

public class EqualsTest {
	public static void main(String[] args) {
		
		Worker w1 = new Worker(1001,"John");
		Worker w2 = new Worker(1001,"John");
		
		
		System.out.println(w1==w2); //false
		System.out.println(w1.equals(w2)); //true
	
		System.out.println(w1.hashCode());
		System.out.println(w2.hashCode()); //workerId를 반환하도록 오버라이딩
		
		System.out.println(System.identityHashCode(w1));
		System.out.println(System.identityHashCode(w2));
		
	}
}

// 논리적으로 같으면 같은 hash값이 반환되독 오버라이딩 해줬음
// 그럼 진짜 갖고 있던 hash값은 어디로가는가?
// 없어지는게 아니라 System.identityHashCode(obj)를 통해 진짜 해당 인스턴스의 Hashcode값을 출력해주는 함수다.
// 가상메모리값 10진수
