package ch02.ex01.case02;

	public class Student {
		// 필드_멤버 변수(속성)
		
		int studentId; //0(기본값)
		String studentName; //null(기본값)
		int grade;
		
		// 생성자(Constructor)
		//매개변수가 있는경우
		public Student(int id, String name) {
			studentId = id;
			studentName = name;
		}
		//매개변수가 없는기본생성자는 생성자를 만들면 사라짐. 필요한경우 다시 만들어줘야함
		public Student() {
		}
		
		public Student(int studentId, String studentName, int grade) {
			this.studentId = studentId;
			this.studentName = studentName;
			this.grade = grade;
		}
		
		// 메소드_멤버 함수(기능)
		void showStudentInfo() {
			System.out.printf("학번: %d\n이름: %s",studentId, studentName);
		}
		
	}

