package ch03.ex01.quiz.Quiz01;

import java.util.Scanner;

public class BankService {
	Scanner sc = new Scanner(System.in);
	int cnt = 0;
	public int menu() {
		System.out.println("1. 계좌등록");
		System.out.println("2. 계좌출력");
		System.out.println("0. 종료");
		
		return sc.nextInt();
	}
	
	public void input(Bank[] b) {
		if (cnt== b.length) {
			System.out.println("더 이상 등록할 수 없습니다.");
		} else {
			b[cnt] = new Bank();
			System.out.println("계좌번호 입력 : ");
			b[cnt].setNum(sc.next());
			System.out.println("잔액 입력: ");
			b[cnt].setBalance(sc.nextInt());
			System.out.println("이자율 입력: ");
			b[cnt].perSet(sc.nextDouble());
			cnt++;
			
		}
	}
	
	public void output(Bank[] b) {
		if (cnt ==0) {
			System.out.println("출력할 정보가 없습니다.");
		} else {
			for (int i = 0; i<3;i++) {
				b.toString();			}
		}
	}

}
