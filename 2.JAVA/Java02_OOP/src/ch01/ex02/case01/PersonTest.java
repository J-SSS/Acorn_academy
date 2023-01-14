package ch01.ex02.case01;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.name = "김석영";
		p.age = 30;
		System.out.printf("%s, %d\n", p.name, p.age);
		
		p.setName("로제");
		p.setAge(20);
		System.out.printf("%s, %d\n", p.name, p.age);
		
		System.out.printf("%s, %d\n", p.getName(), p.getAge());
	}
}
