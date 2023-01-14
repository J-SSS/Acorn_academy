package ch01.ex01.quiz.Quiz09;

public class StudentMain {
	public static void main(String[] args) {
		StudentService ss = new StudentService();
		
		
		Student[] s = new Student[ss.num()];
		
		
		while(true) {
			int select = ss.menu();
			switch (select) {
			case 0 :
			System.err.println("프로그램 종료"); return;
			case 1:
			ss.input(s); break;
			case 2:
			ss.output(s); break;
		
			default :
				System.out.println("잘못된 입력 입니다.");break;
					
			}
		}	
	}
}
