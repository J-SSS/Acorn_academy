package ch01.ex02.case03;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person();
		p.setAge(30);
		
		System.out.printf("%s, %d\n", p.getName(), p.getAge());
	}
}
