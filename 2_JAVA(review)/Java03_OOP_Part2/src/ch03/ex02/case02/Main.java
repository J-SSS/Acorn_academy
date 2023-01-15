package ch03.ex02.case02;

public class Main {
	public static void main(String[] args) {
		
		Worker w1 = new Worker("900000-1000000", "박남현");
		
		System.out.println(w1.COMPANY);
		System.out.println(w1.regNumber);
		System.out.println(w1.name);
		
//		w1.COMPANY = "Apple"; // 상수는 재할당할 수 없음
//		w1.regNumber = "900000-2000000";
		w1.name = "전여빈";
		
		Worker w2 = new Worker("900000-2000000", "이유리");
		
		System.out.println(w2.COMPANY);
		System.out.println(w2.regNumber);
		System.out.println(w2.name);
	}
}
