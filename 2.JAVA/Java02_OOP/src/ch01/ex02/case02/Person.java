package ch01.ex02.case02;

public class Person { //public은 접근제한자 : 정보은닉의 개념
					  //private, protected, default, public...
					  //정보를 입력하고 불러오는 과정을 분리하여 정보에 직접 접근을 막음.(보안,안정성 등)
	
	/* ## 접근제한자 정리 ## 
	 * private : 같은 클래스 안에서는 접근 가능. 그 외에는 불가
	 * public : 패키지가 달라지더라도 접근 가능
	 * 아무것도 없는경우 : 해당 패키지 내에서만 접근가능
	 */
	
	// 필드
	private String name;
	private int age;
	
	void setName(String myName) {
		name = myName;
		
	}
	void setAge(int myAge) {
		age = myAge;
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
