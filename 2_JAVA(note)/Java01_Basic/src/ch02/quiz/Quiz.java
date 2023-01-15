package ch02.quiz;

public class Quiz {
	public static void main(String[] args) {
		//Q.01/////////////
		int year = 2022;
		int month = 12;
		int day = 13;
		
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", year, month, day);
		
		//Q.02/////////////
		
		int a = 1;
		int b = 3;
		
		
		
		
		//Q.03/////////////
		
		
		int kor = 90;
		int eng = 85;
		int math = 70;
		
		double avg3 = (kor + eng + math) / 3;
		
		System.out.println("총점은 " + (kor + eng + math) + "점 입니다.");
		System.out.printf("평균은 %f점 입니다.\n", avg3);
		
		//Q.04/////////////
		
		int fir = 10;
		int mid = 5130;
		int lst = 5102;
		
		System.out.printf("휴대폰 번호는 %03d - %d - %d\n", fir, mid, lst);
		
		//Q.05/////////////
		
		
		
		
		System.out.println("2022" + '년' + "12월" + "13" + '일');
		
		
		
		//Q.05/////////////
		System.out.println("\t\t회비 정보");
		System.out.println("==================================");
		System.out.println("이름\t나이\t\t회비");
		System.out.println("==================================");
		System.out.println("배수지\t27\t\t￦20,000");
		System.out.println("정국\t30\t\t￦30,000");
		System.out.println("아이린\t29\t\t￦50,000");
		System.out.println("==================================");
		System.out.println("합\t계\t\t100,000");
	}
}
