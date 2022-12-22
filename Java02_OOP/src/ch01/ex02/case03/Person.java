package ch01.ex02.case03;

public class Person {
		// 필드
		private String name;
		private int age;
		
		// getter,setters
		public String getName() {//public이 붙으면 패키지가 달라져도 엑세스가능
			return name;
		}//this는 현재 클라스인 person자체를 의미하며, 결과적으로 person.name을 의미.
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
