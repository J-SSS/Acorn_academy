package ch02.ex01.case04;

public class ManTest {
	public static void main(String[] args) {
		
		Man m = new Man();
		m.showManInfo();
		System.out.println(m);
		
		Man m2 = m.getMan(); //m의 주소를 호출하는 메소드라서 m과 주소가 같음
		System.out.println(m2);
		
		Man m3 = new Man(); //새로운 매소드를 생성했기때문에 m및 m2와는 다름
		System.out.println(m3);
	}
}
