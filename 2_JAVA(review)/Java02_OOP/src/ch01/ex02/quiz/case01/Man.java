package ch01.ex02.quiz.case01;

import java.time.LocalDate;

public class Man {
	// 필드
	private String name;
	private int age;
	private LocalDate regDate;
	
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
	public LocalDate getRegDate() {
		return regDate;
	}
	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}
