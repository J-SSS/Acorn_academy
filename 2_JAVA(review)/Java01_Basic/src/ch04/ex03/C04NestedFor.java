package ch04.ex03;

public class C04NestedFor {
	public static void main(String[] args) {
		
		for (int i=1; i<=3; i++) {
			System.out.println(" #### 외부 for문 실행 #### ");	
			
			for (int j=1; j<=3; j++) {
				System.out.println(" ---- 내부 for문 실행 ---- ");
				System.out.println(" 외부: " + i + ", 내부: " + j);
			}
			System.out.println();
		}
	}
}
