package ch04.ex04.quiz;

import java.util.Scanner;

public class Quiz {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
//	 int a = 0;
//	 int b = 0;
//	 int c = 0;
//	 while(!(a==100)) {
//		a++;
//		b = b+a;
//		
//	 }
//	 System.out.println("While문 이용: "+b);
//	 System.out.println();
//	 
//	 for(a = 0; a<=100; a++) {
//		 c +=a;
//	 }
//	 System.out.println("for문 이용: "+c);
//	 
//	 //////////////////////////////
//	 
//	 int out = 2;
//	 int in = 0;
//	 while(!(out==10)) {
//		 in=0;
//		 while(!(in==9)) {
//			 
//			 in++;
//			 
//			 System.out.print(out + " * ");
//			 System.out.print(in + " = ");
//			 System.out.println(out*in);
//			 
//		 }
//		 out++;
//		 System.out.println();
//		
//		 
//	 }
	 
//	int num = 0;
//	System.out.print("정수 입력 : ");
//	num = sc.nextInt();
//
//	int len = 0;
//	
//	int sum = 0;
//
//	while(num != 0) {
//		sum += num % 10;
//		num = num / 10;
//		len ++;
//		
//		
//	}
//
//
//	System.out.println("자릿수: " + len);
//	System.out.println("총 합: " + sum);
//	
	
	//////////////////////////
	
	int mon = 0;
	int cnt = 0;
	int sum = 0;
	while (sum<30000) {
		cnt ++;
		mon = ((int)(Math.random()*10)+1)*1000;
		System.out.printf("[%d]번째 %d원",cnt , mon );
		sum = sum + mon;
	
		
		System.out.println();
	}
	
	
	 System.out.println("지갑에서 " + cnt + "번에 걸쳐 총 " + sum + "원을 꺼냈습니다.");
}
}
