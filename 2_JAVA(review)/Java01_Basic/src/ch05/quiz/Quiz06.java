package ch05.quiz;

import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 입력: ");
		int num = sc.nextInt();
		
		String[] name = new String[num];
		int[] score = new int[num];
		int[] rank = new int[num];
		
		for (int i=0; i<num; i++) {
			System.out.print("이름 입력: ");
			name[i] = sc.next(); // name[0] name[1] name[2]
			System.out.print("성적 입력: ");
			score[i] = sc.nextInt();
			
			rank[i] = 1;
			for (int j=0; j<i; j++) {
				if (score[j] > score[i]) rank[i]++;
				if (score[j] < score[i]) rank[j]++;
			}
		}
		
		System.out.println("이름\t성적\t순위");
		for (int i=0; i<num; i++)
			System.out.println(name[i]+"\t"+score[i]+"\t"+rank[i]);
	}
}

/*
 * i=0
 * name[0]=김석영
 * score[0]=100
 * rank[0]=1
 * 
 * i=1
 * name[1]=로제
 * score[1]=90
 * rank[1]=1
 * score[0] > score[1]  rank[1]=2  ->  rank[0]=1, rank[1]=2
 * 
 * i=2
 * name[2]=리사
 * score[2]=95
 * rank[2]=1
 * score[0] > score[2]  rank[2]=2
 * score[1] < score[2]  rank[1]=3  ->  rank[0]=1, rank[1]=3, rank[2]=2
 */




