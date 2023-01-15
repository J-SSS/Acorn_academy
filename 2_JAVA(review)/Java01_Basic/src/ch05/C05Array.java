package ch05;

import java.util.Scanner;

public class C05Array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] nums;
		
		System.out.print("배열의 크기 입력: "); // 방의 개수
		int size = sc.nextInt();
		
		nums = new int[size];
		
		System.out.println(size);		
		for (int i=0; i<size; i++) {}  // 배열의 크기를 알 때
		
		// 배열의 크기를 모를 때
		System.out.println(nums.length);
		for (int i=0; i<nums.length; i++) {}
	}
}
