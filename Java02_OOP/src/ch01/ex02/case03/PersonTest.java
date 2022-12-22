package ch01.ex02.case03;

public class PersonTest {
	public static void main(String[] args) {
		
		Person p = new Person()	;
		
		//p.name 은 private로 막혀있기때문에 검색이 불가하다.
		//person클래스에서 생성한 getter setter를 사용
		
		p.setName("장동일");
		p.setAge(30);
		
		System.out.printf("%s, %d\n", p.getName(), p.getAge());
		
	}
}
