package ch05.ex01;

public class C02Array {
 public static void main(String[] args) {
	// 다양한 배열 선언 방법
//	 int[] a;
//	 a = new int[3];
//	 
//	 int[] b = new int[3];
//	 
//	 int[] c = {10,20,30}; //중괄호를 사용하는 경우 배열 선언과 동시에 해야함. a유형처럼 따로 정의하는것은 불가
//	 
//	 int[] d = new int[] {10,20,30};
	 
	 // 자바는 배열을 객체로 다룬다.
	 // 배열이 객체(대왕고)라는 증거
	 
	 int[] ints = new int[3];
	 System.out.println(ints); //ints라는 객체가 가진 [I@372f7a8d 라는 주소가 출력됨.
	 
	 String[] strs = new String[3];
	 System.out.println(strs); //strs라는 객체가 [Ljava.lang.String;@2f92e0f4라는 주소가 출력됨.
	 //자바 패키지 안의 스트링타입;@주소
	 
}
}
