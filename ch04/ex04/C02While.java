package ch04.ex04;

import java.util.Scanner;

public class C02While {
 public static void main(String[] args) {
	
	 //1. 조건에 true 값 넣기
	 while (true) {
		 System.out.println("a");
		 break;
	 }
	 
	 //2. boolean 타입
	 
	 boolean b =true; //flag변수
	 int i= 0;
	  while (b) {
		  System.out.println("b");
		  i++;
		  if (i==5) b=false;
	  }
	 System.out.println();
	  //3. 특정 조건을 종료조건으로
	 
	  i=0;
	  while(!(i==10)) {
		  i++;
		 

	  }
	  System.out.println();
	  
	  i=0;
	  
	  Scanner sc = new Scanner(System.in);
	  while(!(i==10)) {
		  System.out.print("입력: ");
		  i = sc.nextInt()	;
		  
		  
		  
	  }
	
	 
	 
	 
	 
}
}
