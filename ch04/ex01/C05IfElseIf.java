package ch04.ex01;

public class C05IfElseIf {
	public static void main(String[] args) {
		
		int age = 0;
		int charge = 0;
		
		if (age < 8) {
			charge = 1000;
			System.out.println("미취학 아동입니다!");
		}
		else if (age <14){ // age < 8 && age < 14의 의미를 가짐. 배타적인 특징을 가짐!
			charge = 2000;
			System.out.println("초등학생입니다!");	
		}
		else if (age <20){ 
			charge = 2500;
			System.out.println("청소년입니다!");			
		}
		else {
			charge = 3000;
			System.out.println("성인입니다!");
		}
		
		System.out.println("입장료는 " + charge + "입니다!!");
	}
}
