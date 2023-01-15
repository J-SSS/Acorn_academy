package ch01.ex02.quiz.case01;

import java.time.LocalDate;
import java.util.Scanner;

public class ManTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		LocalDate regDate = null;
		
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();
		regDate = LocalDate.now();
		
		Man man = new Man();
		man.setName(name);
		man.setAge(age);
		man.setRegDate(regDate);
		
		System.out.println("다음 사람을 입력하셨습니다.");
		System.out.printf("이름: %s\n나이: %d\n등록일: %s",
				man.getName(), man.getAge(), man.getRegDate());
	}
}
