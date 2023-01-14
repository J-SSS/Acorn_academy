package ch01.ex01.quiz.Quiz08;

import java.util.Scanner;

public class GroupMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GroupService gs = new GroupService();

		int cnt =0;
		gs.size();
		
		Group[]	g = new Group[gs.size];	
		for(int i=0;i<gs.size;i++) {
			g[i] = new Group();
		}
		while(true) {
		gs.select();	
		
		switch (gs.select) {
		case 1:
			g[cnt].input();
			cnt++;
			break;
		case 2:
			for(int i =0 ; i<gs.size; i++) {
				g[i].output();
			}break;
		case 0:
			System.err.println("프로그램 종료");
			return;
		default:
			System.err.println("잘못된 메뉴 선택입니다!");
		}
		
		}
	}
}
