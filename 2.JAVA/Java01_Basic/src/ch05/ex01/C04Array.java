package ch05.ex01;

import java.util.Scanner;

public class C04Array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] nums;
		
		System.out.println("배열의 크기 입력 : "); // 방의 개수
		int size = sc.nextInt();
		
		nums = new int[size];
		
		//배열의 크기를 아는 경우
		for (int i =0; i<size; i++) {}
		System.out.println(size);
		
		
		//배열의 크기를 모르는 경우
		System.out.println(nums.length); //length를 입력하면 자바머신 자체에서 배열의 크기라는 변수를 만들어줌
		
	}
}
