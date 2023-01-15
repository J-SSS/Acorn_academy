package ch03.quiz;

public class Customer {
	
	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("이름: %s 나이: %d 가격: %d", 
				name, age, price);
	}
}
