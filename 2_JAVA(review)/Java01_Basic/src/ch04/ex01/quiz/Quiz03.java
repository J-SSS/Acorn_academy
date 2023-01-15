package ch04.ex01.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력: ");
		String name = sc.next();
		
		System.out.println("\n### 출생 지역 선택 ###");
		System.out.println("1. 서울");
		System.out.println("2. 경기도권");
		System.out.println("3. 강원도권");
		System.out.println("4. 충청도권");
		System.out.println("5. 경상도권");
		System.out.println("6. 전라도권");
		System.out.println("7. 제주도권");
		
		System.out.print("출생 지역 선택: ");
		int birth = sc.nextInt();
		
		String local = "";
		if (birth == 1) local = "서울";		
		else if (birth == 2) local = "경기도권";
		else if (birth == 3) local = "강원도권";
		else if (birth == 4) local = "충청도권";
		else if (birth == 5) local = "경상도권";
		else if (birth == 6) local = "전라도권";		
		else if (birth == 7) local = " 제주도권";
		else local = "그 외 지역";
		
		System.out.printf("%s님의 출생지는 %s입니다.", name, local);
	}
}
