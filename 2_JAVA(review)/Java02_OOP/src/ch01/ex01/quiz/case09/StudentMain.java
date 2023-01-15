package ch01.ex01.quiz.case09;

public class StudentMain {
	public static void main(String[] args) {
		
		StudentService ss = new StudentService();
		Student[] s = new Student[ss.size()];
		
		while (true) {
			int menu = ss.menu();
			
			switch (menu) {
			case 0:
				System.out.println("프로그램 종료");
				return;
			case 1:
				ss.input(s);
				break;
			case 2:
				ss.output(s);
				break;
			default:
				System.out.println("선택된 메뉴가 없습니다.");
			}
		}
	}
}
