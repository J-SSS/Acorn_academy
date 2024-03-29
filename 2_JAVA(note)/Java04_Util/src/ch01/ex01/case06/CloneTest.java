package ch01.ex01.case06;



public class CloneTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Worker w1 = new Worker(1001,"John");
		Worker w2 = new Worker(1001,"John");
		
		Worker wCopied = (Worker) w1.clone();
		System.out.println(wCopied);
		
		w1.setWorkerName("Arnie");
		Worker wCopied2 = (Worker) w1.clone();
		System.out.println(wCopied2);
	}
}

// clone메소드
// 객체의 원본을 복제하는데 사용하는 메소드
// 생성과정의 복잡한 과정을 반복하지 않고 복제가능
// 해당 클래스의 clone()메소드의 사용을 허락한다는 의미로 Clonable 인터페이스를 명시해줘야함