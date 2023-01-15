package ch01.ex01.quiz.case07;

import java.util.Scanner;

public class DrinkDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열의 개수를 저장
		System.out.print("음료 메뉴 수량: ");
		int drinkCnt = sc.nextInt();
		
		// Drink 객체 배열 					// [0]  [1]  [2]
		Drink[] d = new Drink[drinkCnt];	// 아메	라떼	 주스
		// 주문 시 사용할 요금 저장 배열
		int[] pay = new int[drinkCnt];		// 100	200	 300
		// 주문 시 사용할 수량 저장 배열
		int[] cnt = new int[drinkCnt];		// 5	5	 10
		
		// 음료 이름 등록
		for (int i=0; i<drinkCnt; i++) {
			d[i] = new Drink();
			System.out.print("음료 이름 입력: ");
			d[i].name = sc.next();
		}
		
		// 음료별 이름 등록
		for (int i=0; i<drinkCnt; i++) {
			System.out.print(d[i].name + "의 요금 입력: ");
			pay[i] = sc.nextInt();
		}
		
		while (true) {
			System.out.println("#### 선택 ####");
			System.out.println("1. 주문");
			System.out.println("2. 결제");
			System.out.println("3. 총 매출 현황");
			System.out.print("선택: ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				System.out.println("#### 메뉴 ####");
				for (int i=0; i<drinkCnt; i++) {
					System.out.println((i+1) + ". " + d[i].name
							+ ": " + pay[i] + "원");
				}
				System.out.print("메뉴 선택: ");
				int s = sc.nextInt();
				System.out.print("수량 입력: ");
				cnt[s-1] = sc.nextInt();
				break;
			case 2:
				System.out.println("#### 결제 ####");
				for (int i=0; i<drinkCnt; i++) {
					System.out.println((i+1) + ". " + d[i].name
							+ ": " + cnt[i]);
				}				
				int sum=0;
				for (int i=0; i<drinkCnt; i++) {
					d[i].sumCnt += cnt[i];
					d[i].sumPay += cnt[i] * pay[i];
					sum += cnt[i] * pay[i];
				}
				System.out.print("총 금액: " + sum);
				System.out.println("결제 완료되었습니다.");
				cnt = new int[drinkCnt]; // 0 0
				break;
			case 3:
				System.out.println("#### 매출 현황 ####");
				for (Drink dd : d) {
					System.out.println("--- " + dd.name + " ---");
					System.out.println("총 판매 금액: " + dd.sumPay);
					System.out.println("총 판매 수량: " + dd.sumCnt);
				}
				break;
			default:
				System.out.println("잘못된 선택입니다.");
			}
			
		}		
	}
}
