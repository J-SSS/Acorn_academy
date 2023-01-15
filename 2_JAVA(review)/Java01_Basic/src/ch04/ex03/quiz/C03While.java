package ch04.ex03.quiz;

public class C03While {
	public static void main(String[] args) {
		int i = (int) (Math.random()*100);
		
		while(!(i%3==0)) {
			i++;
			System.out.println(i);
		}
		System.out.printf(" %d번만에 %d을 뽑았습니다.",i,i);
	}
	
}
