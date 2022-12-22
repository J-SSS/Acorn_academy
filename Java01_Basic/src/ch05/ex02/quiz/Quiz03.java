package ch05.ex01.quiz;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		

		System.out.print("방 개수 입력 : ");
		int t = sc.nextInt();
		int[] room_t = new int[t]; //방 배열
		boolean[] in = new boolean[t];//각 방에 대응되는 boolean값
		System.out.print("객실 시작번호 입력 : ");
		int s = sc.nextInt();
			for (int i = 0 ; i<t ; i++) {  //방번호를 증가시키며 방배열에 입력
			room_t[i] = s;
			s++;	
		}
			
		System.out.println();
		
		
		boolean end = true; // 플래그변수
		do {
		
		System.out.println();
		System.out.println("#### 선택 메뉴 ####");
		System.out.println("1. 입 실");
		System.out.println("2. 퇴 실");
		System.out.println("3. 방 정 보");
		System.out.println("0. 프로그램종료");
		System.out.print(">> ");
		int select = sc.nextInt();
		
		switch (select) {
		case 1 : 
			System.out.println();
			System.out.print("입실할 방 번호 입력 :");
			int room_in = sc.nextInt();
			
			//입력한 방 번호의 적절성 검사
			int in_check = 0;
			for(int i = 0; i<room_t.length; i++) {
				if(room_in==room_t[i]) {
					in_check++;
				}
			}
			
			//입력한 방 번호의 배열 내 순서 추출
					int room_arr = 0;
					for(int i =0 ; i<room_t.length ; i++) {
						if(room_t[i]<room_in) {room_arr++;}
					}
			
			//입실여부 토글
			if (in_check==0) {
				System.out.println("존재하지 않는 방 번호입니다!");
			}
			else {
				if(in[room_arr]==true) {
					System.out.println("비어있지 않은 방 입니다!");
				}
				else {
					in[room_arr] = true;
					System.out.println("입실 처리 되었습니다!");
				}
			} break;

		case 2 :
			
			System.out.println();
			System.out.print("퇴실할 방 번호 입력 :");
			int room_out = sc.nextInt();
			
			//입력한 방 번호의 적절성 검사
			int out_check = 0;
			for(int i = 0; i<room_t.length; i++) {
				if(room_out==room_t[i]) {
					out_check++;
				}
			}
			
			//입력한 방 번호의 배열 내 순서 추출
					room_arr = 0;
					for(int i =0 ; i<room_t.length ; i++) {
						if(room_t[i]<room_out) {room_arr++;}
					}
			
			//입실여부 토글
			if (out_check==0) {
				System.out.println("존재하지 않는 방 번호입니다!");
			}
			else {
				if(in[room_arr]==false) {
					System.out.println("이미 비어있는 방 입니다!");
				}
				else {
					in[room_arr] = false;
					System.out.println("퇴실 처리 되었습니다!");
				}
			} break;

		
		case 3 :
		String[] in_kor = new String[t]; //방의 boolan값을 문자열로 치환
		
		System.out.println();
		System.out.println("--- 방 정보 ---");
		for (int i = 0 ; i < room_t.length; i++) {
			if (in[i]==true) {
				in_kor[i] = "입실중"; 
			}else if(in[i]==false) {
				in_kor[i] = "비어있음"; 
			}
			System.out.printf("%d번방 : %s",room_t[i], in_kor[i]);
			System.out.println();
		}
		break;
		
		case 0 :
			System.out.println();
			System.out.println("프로그램 종료!");
			return;
			
			
		default :
			
			System.out.println("잘못된 메뉴 선택입니다!");
		}
		
		}
		while(end);
		
	
		
	}
}
