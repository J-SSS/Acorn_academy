package ch01.ex02.case02;

public class PersonTest {
	public static void main(String[] args) {
				
		Person p = new Person();
		
		//p.name을 private로 설정하여 직접 접근할 수 없음.
		//메소드롤 거쳐서 접근하면 가능
		
		p.setName("동수");
		p.setAge(30);
		
		System.out.printf("%s, %d\n", p.getName(), p.getAge());
		
		
	}
}
