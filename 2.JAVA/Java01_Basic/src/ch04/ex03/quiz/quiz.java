package ch04.ex03.quiz;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	/*
//Q01//	
		for (int a = 1 ; a< 11 ; a++) {
			System.out.print(a + " ");
		}
		System.out.println();
//Q02//	
		for (int b = 5 ; b < 101 ; b+=5) {
			System.out.print(b + " ");
		}
		System.out.println();System.out.println();
	
//Q03//
		for(int select = 0 ; ;) {
		
		System.out.println( "## 메뉴를 선택하세요.## \n");
		System.out.println("1. 입력 ");
		System.out.println("2. 출력 ");
		System.out.println("3. 수정 ");
		System.out.println("4. 삭제 ");
		System.out.println("0. 프로그램 종료 ");
		System.out.print(">>");
		select = sc.nextInt();
		System.out.println("선택: " + select);
		switch (select) {
		case 1: System.out.println("입력 페이지입니다."); break;
		case 2: System.out.println("출력 페이지입니다."); break;
		case 3: System.out.println("수정 페이지입니다."); break;
		case 4: System.out.println("삭제 페이지입니다."); break;
		case 0: System.out.println("프로그램 종료!"); return;
		default: System.out.println("없는 메뉴 번호 입니다.");
		
		}
		//System.exit(0); : 프로그램 강제 종료기능
		}
		
//Q04//	
		System.out.println("\n###_Quiz04_###\n");
		
		System.out.print("단 입력>>");
		int dan = sc.nextInt();
		System.out.println();
		
		if (dan>=2 && dan<=9) {
		for (;dan==dan ;dan+=0) {
			for(int unit = 1 ; unit<=9; unit++) {
				System.out.println(dan + " x " + unit + " = " + dan*unit );
			}
			break;
		}
		
		}
		else if (dan<2 || dan>11) {
			System.out.println("출력할 수 없는 단!");
		}
		else if (dan==10) {
			System.out.println("종료!");
			return;
		}
	*/
//Q05//		
		System.out.println("\n###_Quiz05_###\n");
		System.out.print("\n정수 입력 : ");
		int num = sc.nextInt();
		int start = 1;
		int inner = 1;
		
		for (start = 1; start <=num; start++) {
			for(inner = 1 ; inner <=start ; inner++ ) {
			System.out.print(inner + " ");
		}
			System.out.println();
		}
		
//Q06//
		System.out.println("\n###_Quiz06_###\n");
		for (int gu = 1 ; gu <=9 ; gu++) {
			if (gu % 3 ==0) {
				System.out.println("_"+gu+"짝!");
			}
			else {
			System.out.print("_"+gu);}
		}
//Q07//
/*		System.out.println("\n###_Quiz07_###\n");
		for (int fir = 1 ; fir<=9 ; fir++) {
			for(int sec = 0 ; sec<=9; sec++) {
				System.out.print(fir);
				System.out.print(sec);
				System.out.println();
			}
			}
*/		
		
//Q08//
		System.out.println("\n###_Quiz08_###\n");
		for(int a = 5; a>0 ; a--) {
			for(int b = 1; b<6; b++) {
				System.out.print("["+ a +"0"+ b+"]");
			}
			System.out.println();
			
		}
//Q09//

		System.out.println("\n###_Quiz09_###\n");
		  for(int one = 0 ; one <10; one++) {
			  for(int two = 0; two <10; two++ ) {
			  
			
				  if (one == 0 && two != 0 &&  two % 3==0) {
					 
					  	 System.out.print(two +"짝!" + " ");
				  }
				  else if (one == 0 && two == 0) {}
				  
				  else if (one == 0 && two % 3!=0 && two != 0) {
						 
					  	 System.out.print(two + " ");
				  } 
				  else if ((one % 3==0) || (two % 3 ==0 && two != 0))  {
					  System.out.print(one);
					  System.out.print(two +"짝!" + " ");
				  }
				 
				  else {
					  System.out.print(one);
					  System.out.print(two + " ");
				  }
				 
				  if (two ==0) {
					  System.out.println();
				  }
			
			 
			  }
			  
		
			  }
			  }			
		

}

