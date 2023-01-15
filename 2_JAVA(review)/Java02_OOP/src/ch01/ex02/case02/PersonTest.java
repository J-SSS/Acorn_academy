package ch01.ex02.case02;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		
//		p.name = "준석";
//		p.age = 20;
		
		p.setName("동수");
		p.setAge(20);
		
		System.out.printf("%s, %d\n", p.getName(), p.getAge());
	}
}
