package ch01.ex02.sub;

public class Editor {
	// 필드
	private String title = "이름\t주소\t\t전화번호\n";
	private String line = "===================================\n";
	
	StringBuffer buffer = new StringBuffer();
	
	// 메소드
	private void makeHeader() {
		buffer.append(title);
		buffer.append(line);
	}
	
	private void makeBody() {
		buffer.append(" So-en\t");
		buffer.append(" Busan Korea\t");
		buffer.append(" 010-2222-3333\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
		buffer.append("\t\t\t 작성일: 1.5(목)");
	}
	
	public String getReport() {
		makeHeader();
		makeBody();
		makeFooter();
		
		return buffer.toString();
	}
}

// 캡슐화(Encapsultation)
// 꼭 필요한 정보와 기능만 외부에 공개함
// 대부분의 멤버변수와 메소드를 감추고 외부에 통합된 인터페이스만을 제공하여 일관된 기능을 구현하게 함
// public으로 된 각각의 필드나 메소드에 접근함으로써 발생하는 오류를 줄임
