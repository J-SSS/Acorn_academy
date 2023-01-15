// 정보 은닉(Information Hiding)
package ch01.ex02.case03;

public class Person {
	// 필드_멤버변수
	private String name;
	private int age;
	
	// getters, setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
