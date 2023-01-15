package ch05.quiz;

import java.util.Scanner;

public class Quiz08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("방 개수 입력: ");
		int roomSize = sc.nextInt();
		System.out.print("객실 시작번호 입력: ");
		int startRoomNum =  sc.nextInt();
		System.out.println();
		
		boolean[] room = new boolean[roomSize]; 
		boolean running = true;
		
		while (running) {
			System.out.println("#### 선택 메뉴 ####");
			System.out.println("1. 입실\n2. 퇴실\n3. 방정보\n0. 프로그램 종료");
			System.out.print("> ");
			int menu = sc.nextInt();
			System.out.println();
			
			int roomNum;    // 3
			switch (menu) { // 1001 1002 1003
			case 0:
				running = false;
				break;
			case 1:
				System.out.print("입실할 방 번호 입력: ");  
				roomNum = sc.nextInt() - startRoomNum; 
				if (roomNum<0 || roomNum>=room.length) {
					System.out.println("존재하지 않는 방 번호입니다.");
					System.out.println();
					continue;
				}
				if (room[roomNum]) { // room[0] = true
					System.out.println("이미 배정된 방입니다.");
				} else { // room[0] = false
					room[roomNum] = true;
					System.out.println("입실 처리되었습니다.");
				}
				System.out.println();
				break;
			case 2:
				System.out.println("퇴실할 방 번호 입력: ");
				roomNum = sc.nextInt() - startRoomNum; 
				if (roomNum<0 || roomNum>=room.length) {
					System.out.println("존재하지 않는 방 번호입니다.");
					System.out.println();
					continue;
				}
				if (room[roomNum]) { // room[roomNum]=true
					room[roomNum] = false;
					System.out.println("퇴실 처리되었습니다.");
				} else { // room[roomNum]=false
					System.out.println("이미 비어있는 방입니다.");
				}
				System.out.println();
				break;
			case 3:
				System.out.println("----- 방 정보 -----");
				for (int i=0; i<room.length; i++) {
					if (room[i]) // room[i]=true
						System.out.printf("%d번방: %s\n", startRoomNum+i, "입실중");
					else // room[i]=false
						System.out.printf("%d번방: %s\n", startRoomNum+i, "비어있음");
				}
				System.out.println();
				break;
			default:
				System.out.println("잘못된 메뉴 선택입니다.");
				System.out.println();
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
