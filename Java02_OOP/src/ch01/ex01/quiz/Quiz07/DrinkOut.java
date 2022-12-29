package ch01.ex01.quiz.Quiz07;

import java.util.Scanner;

public class DrinkOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------------");
		System.out.print("음료 메뉴 수량 : ");
		int num = sc.nextInt();
		
		Drink[] d1 = new Drink[num];
		Drink[] d2 = new Drink[num];
		
		for(int i = 0; i<num ; i++) {
			d1[i] = new Drink();
			d2[i] = new Drink();
		}
		for(int i=0; i<num; i++) {
			System.out.print("음료 이름 입력 : ");
			d1[i].name = sc.next();
		}
		for(int i=0; i<num; i++) {
			System.out.printf("%s의 가격 입력 : ",d1[i].name);
			d1[i].price = sc.nextInt();
			d1[i].ea = 0;
		}

		System.out.println("-------------------------------");
		while(true) {
		System.out.println();
		System.out.println("#### 선택 ####");
		System.out.println("1.주        문");
		System.out.println("2.결        제");
		System.out.println("3.총 매 출 현 황");
		System.out.println("4.폐        업");
		int select = sc.nextInt();
		int s_m =0;
		int s_e =0;
		switch(select) {
	
		case 1:
			System.out.println();
		System.out.println("#### 메뉴 ####");
		for(int i = 0; i<num; i++) {
			System.out.printf("%d. %s : %d원",(i+1),d1[i].name,d1[i].price);
			System.out.println();
		}
		System.out.print("메뉴 선택 :");
		s_m = sc.nextInt();
		s_e= s_m-1;
		System.out.print("수량 입력 :");
		d1[s_e].ea = sc.nextInt();
		d2[s_e].ea+=d1[s_e].ea;
		break;
		
		case 2:
			System.out.println();
		System.out.println("#### 결제 ####");
		for(int i = 0; i<num; i++) {
			System.out.printf("%d. %s : %d원",(i+1),d1[i].name,d1[i].price*d1[i].ea);
			System.out.println();
			d1[i].ea=0;
		}
		break;
			

		case 3:
			System.out.println();
		System.out.println("#### 매출현황 ####");
		for(int i = 0; i<num; i++) {
			System.out.println("----" + d1[i].name +"----");
			System.out.printf("총 판매 금액 %d원",d1[i].price*d2[i].ea);
			System.out.println();
			System.out.printf("총 판매 수량 %d개",d2[i].ea);
			System.out.println();
		}
		
		}//스위치
		}//while	
}
	
}
