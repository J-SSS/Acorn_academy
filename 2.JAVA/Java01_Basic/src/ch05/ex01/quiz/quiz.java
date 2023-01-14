package ch05.ex01.quiz;

import java.util.Scanner;

public class quiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int[] b = new int[5];
//		System.out.print("방 번호: ");
//		int c = sc.nextInt();
//		System.out.print("입력: ");
//		b[c] = sc.nextInt();
//		System.out.print("찾을 방: ");
//		int d = sc.nextInt();
//		System.out.println("=> " + b[d]);
//		
//		
//		
//		char[] a = new char[26];
//		
//		
//		
//		//System.out.println((int)a);
//		
//	
//		
//		for(int i = 0 ; i<a.length ; i++) {
//			a[i] = (char)(i+65);
//		}
//		
//
//		for (int num : a) {
//			System.out.println((char)num + "," + num);
//		}
		
		
		
		/////////////
//		int count = 1;
//		int i = 1;
//		
//		System.out.print("인원 수 입력: ");
//		count = sc.nextInt();
//		
//		String[] name = new String[count];
//		String[] phone = new String[count];
//		int[] men = new int[count];
//		
//		for(i = 0 ; i<men.length; i++) {
//		System.out.println("###" + (i+1) +"###");
//		System.out.print("이름 : ");
//		name[i] = sc.next();
//		System.out.print("전화번호 : ");
//		phone[i] = sc.next();
//		System.out.println();
//		
//		}
//		
//		for(i = 0 ; i<men.length; i++) {
//			System.out.println("###" + (i+1) +"###");
//			System.out.println("이름 : " + name[i]);
//			System.out.println("전화번호 : " + phone[i]);
//			
//		}
//		
//		int[] score = {100, 50, 100, 50};
//		int sum = 0;
//		double avg = 0.0;
//		for(int num : score) {
//			sum +=num;
//			avg = sum/score.length;
//		}
//		System.out.println(sum);
//		System.out.println(avg);
		
		int[] num = {79, 88, 91, 33, 100, 55, 95};
		int count = 0;
		int max = 0;
		int min = 79;
		for(count = 0; count<num.length; count++) {
			for(int h : num) {
				if (h > max) {
					max=num[count];
				}
			}}
		System.out.println("최대값 : " + max);
		for(count = 0; count<num.length; count++) {
			for(int m : num) {
				if (m < min) {
							min=num[count];}
			}
		}
		System.out.println("최소값 : " + min);

		
		
		
		
		System.out.print("인원 수 입력 : ");
		int a = sc.nextInt();
		int rank = 1;
		int[] men = new int[a];
		String[] name = new String[a];
		int[] score = new int[a];
				
		for(int i=0; i<men.length; i++) {
		System.out.print("이름 입력 : ");
		name[i] = sc.next();
		System.out.print("성적 입력 : ");
		score[i] = sc.nextInt();}
		
		System.out.println();
		System.out.println();
		
		System.out.println("이름   성적   순위");
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score.length; j++) {
				if(score[i] < score[j]) {
					rank++;
				}
	
			}
			System.out.printf("%s %s %d\n",name[i],score[i],rank);
			rank=1;
		}
		
		
		int[] arr = {10,55,23,2,79,101,16,82,30,45};
		
		
	}
}
