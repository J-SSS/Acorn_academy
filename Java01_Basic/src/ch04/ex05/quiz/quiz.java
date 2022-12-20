package ch04.ex05.quiz;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
//		
//		int num1 = 0;
//		int num2 = 0;
//		int sum = 0;
//	
//		do {
//			System.out.print("-숫자 1: ");
//			num1 = sc.nextInt();
//			System.out.print("-숫자 2: ");
//			num2 = sc.nextInt();
//			sum = num1 + num2;
//			System.out.println(num1 +  " + " + num2 + " = " + sum);
//		}
//		while(sum!=0);
//		
//		System.out.println("합계가 0이므로 프로그램을 종료합니다");
//		return;
		
		///////////////////
//		int num = 1;
//		
//		for(num =1 ; num<=1000; num++) {
//			if (num%5!=0) continue;
//			System.out.println(num);
//		}
//		
		///////////////
		
//		int my = 0;
//		int ran = (int)(Math.random()*100+1);
//		int count = 0;
//		
//		do {
//		System.out.print("입력 : ");
//		my = sc.nextInt();
//		if(my<ran) {
//			System.out.println("더 작은 수를 말했군요?");
//		}
//		else if(my>ran) {
//			System.out.println("더 큰 수를 말했군요?");
//		}
//		
//		count ++;
//	
//		}
//		
//		while(my!=ran);
//		
//		System.out.printf("%d번만에 %d를 맞혔습니다!", count, ran);	
//		
		///////////////////////
//		
//		int kor = 0;
//		int eng = 0;
//		int math = 0;
//		String name = "";
//		int menu = 3;
//		
//		
//		while(menu !=0) {
//			int sum = kor + eng + math;
//			double avg = (double)(kor + eng + math)/3;
//		
//		System.out.println("1. 성적입력");
//		System.out.println("2. 성적출력");
//		System.out.println("0. 프로그램 종료");
//		System.out.print("선택 : ");
//		menu = sc.nextInt();
//		System.out.println();
//		
//		switch(menu) {
//		case 1 : System.out.println("## 성적 입력 ##");
//		System.out.print("이름 입력 : ");
//		name = sc.next();
//		do {
//		System.out.print("국어 점수 입력 : ");
//		kor = sc.nextInt();
//		}
//		while(!(kor>=0 && kor<=100));
//		do {
//		System.out.print("영어 점수 입력 : ");
//		eng = sc.nextInt();}
//		while(!(eng>=0 && eng<=100));
//		do {
//		System.out.print("수학 점수 입력 : ");
//		math = sc.nextInt();}
//		while(!(math>=0 && math<=100));
//		System.out.println();
//		break;
//		
//			
//		case 2 :
//			System.out.println("## 성적 출력 ##");
//			System.out.println("이름 : " + name);
//			System.out.println("총점 : " + sum);
//			System.out.printf("평균 : %.1f ", avg); 
//			System.out.println();
//			System.out.println();
//			break;
//		
//		} 
//		
//		}
//		
//		
//		System.out.println("## 프로그램 종료! ##");
//		
		/////////////////////////////////////////////
		
		
		String num11 = "0";
		String num22 = "0";
		int num1 = 0;
		int num2 = 0;
		
		int result = 0;
		char cal = ' ';
		char select = ' ';
		
		do {
		
			
			
			System.out.print("숫자 : ");
			num11 = sc.nextLine();
			
			
			do {
				
				System.out.print("연산자 : ");
				cal = sc.next().charAt(0);
				
				if (cal !='+' && cal !='-' && cal !='*' && cal !='/') {
					System.out.println("ERROR] +,-,*,/ 중에 입력하세요!");
					
				}
				}while(cal !='+' && cal !='-' && cal !='*' && cal !='/');
			System.out.print("숫자 : ");
			num22 = sc2.nextLine();
			
			
		
		
		
			num1 = Integer.parseInt(num11);
			num2 = Integer.parseInt(num22);
		
		
	
		switch(cal) {
		case '+' :
			result = num1 + num2;break;
		case '-' :
			result = num1 - num2;break;
		case '*' :
			result = num1 * num2;break;
		case '/' :
			result = num1 / num2;
		}
		System.out.printf("%d %c %d = %d",num1,cal,num2,result);
		
		do {
		System.out.println();
		System.out.print("계속 할까요(y/n)?? ");
		select = sc.next().charAt(0);
		
		if (select !='y' && select !='Y' && select !='n' && select !='N') {
			System.out.println("ERROR] y혹은 n을 입력하세요!"); 
		}
		}while(select !='y' && select !='Y' && select !='n' && select !='N');
		}while(select =='y' || select =='Y' );
		
		System.out.println();
		System.out.println("...끝. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
