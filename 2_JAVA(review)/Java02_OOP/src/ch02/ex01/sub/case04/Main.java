package ch02.ex01.sub.case04;

public class Main {
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s);
		
		System.out.println(s.stuId); // 0
		System.out.println(s.name);  // null (참조타입의 값이 할당이 안 되어 있을 시)
		System.out.println(s.kor);   // null (객체 생성 값/주소가 없다.)
	}
}
