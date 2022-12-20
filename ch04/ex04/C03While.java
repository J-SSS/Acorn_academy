
package ch04.ex04;

public class C03While {
public static void main(String[] args) {
	
	System.out.println();
	
	int num = 0;
	int re = 1;
	while(true) {
		num = (int)(Math.random()*100);
		
		if (num%3==0) {
			break;
		}
		else if (num%3!=0) {
			re++;
		}
		
	}
	System.out.print(re + "번만에 ");
	System.out.print(num + "을 뽑았습니다!");
	
	
	
}
}
