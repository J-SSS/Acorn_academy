package ch05.ex01;

import java.util.Scanner;

public class C01Array {
 public static void main(String[] args) {
	 //배열
	 // 하나의 데이터 타입으로 여러 개의 값을 저장하는 변수 ()저장공간 개념
	 // 동일한 자료형의 여러 개의 값을 연이어 저장할 수 있는 공간의 집합체
	 // 인덱스: 배열에 접근하기 위한 순서(방 번호) 0 ~...
	 // 원소: 각각의 인덱스(방)에 저장된 값
	 
	 Scanner sc = new Scanner(System.in);
	 
	 int a = 10;
	 int b = 20;
	 int c = 30;
	 System.out.println(a);
	 System.out.println(b);
	 System.out.println(c);
	 
	 int[] d = new int[3]; // 방 3칸짜리 집
	 d[0] = 10; // 하나의 방
	 d[1] = 20;
	 d[2] = 30;
	 
	 System.out.println(d[0]);
	 System.out.println(d[1]);
	 System.out.println(d[2]);
	 
	 
	 
	
}
}
