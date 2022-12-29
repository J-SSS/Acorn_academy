package project;

public class MemberDemo {
	public static void main(String[] args) {
		
		MemberManager m = new MemberManager();
		m.print();
		String inputData = m.input("번호를 선택하세요>");
		m.run(inputData);
	}
}

