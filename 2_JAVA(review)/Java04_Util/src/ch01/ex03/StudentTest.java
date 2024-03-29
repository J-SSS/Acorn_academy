package ch01.ex03;

// Class 클래스의 newInstance() 메소드로 객체(인스턴스) 생성
public class StudentTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Class c1 = Class.forName("ch01.ex03.Student");
		
		Student s1 = (Student) c1.newInstance(); // 객체 생성 (new를 사용하지 않고도)
		
		s1.setStuId(1001);
		s1.setStuName("Arnie");
		System.out.println(s1.toString()); 
		
		Class c2 = s1.getClass(); // Object 클래스의 메소드. 기존에 만들어진 인스턴스가 있어야 사용 가능
		Student s2 = (Student) c2.newInstance();
		
		s2.setStuId(1002);
		s2.setStuName("Gatsby");
		System.out.println(s2);
	}
}
