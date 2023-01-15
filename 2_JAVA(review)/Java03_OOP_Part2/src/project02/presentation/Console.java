package project02.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public interface Console {

	Scanner sc = new Scanner(System.in); // Scanner의 sc는 final 상수이기에 바로 초기화
	
	static void in(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
	
	static void info(String msg) {
		System.out.println(msg);
	}
	
	static void info(Object obj) { // 이와 관련 domain에 toString() 메소드 준비
		System.out.println(obj);
	}
	
	static void success(String msg) {
		System.out.print("SUCCESS] " + msg + " 성공했습니다.");
	}
	
	static void fail(String msg) {
		System.out.print("FAIL] " + msg + " 실패했습니다.");
	}
	
	static String inStr(String msg) {
		boolean isVal = false;
		String line = "";
		
		do {
			in(msg);
			line = sc.nextLine();
			
			isVal = line.length() > 0;
			if(!isVal) err("문자열을 입력하세요.");
		} while(!isVal);
		
		return line;
	}
	
	static int inNum(String msg) {
		int num = 0;
		String line = "";
		boolean isVal = false;
		
		do {
			in(msg);
			line = sc.nextLine();
			
			if (line.length()>0 && line.matches("[0-9]*")) {
				num = Integer.parseInt(line);
				isVal = true;
			}
			
			if(!isVal) err("0 이상의 정수를 입력하세요.");
		} while(!isVal);		
		
		return num;
	}
	
	static LocalDate inDate(String msg) { // 날짜 입력 받는 메서드
		String line = "";
		LocalDate date = null;
		
		do {
			in(msg); // 입력 안내 메시지 보여줌.
			line = sc.nextLine();
			
			if(line.length() > 0) { // 한 글자 이상 입력했는지 먼저 확인해 볼 것
				try {               										  // 상수 ISO_DATE가 갖고 있는 값: yyyy-MM-dd
					date = LocalDate.parse(line, DateTimeFormatter.ISO_DATE); // line의 값과 일치하지 않으면 exception발생시킬 것
				} catch(DateTimeParseException e) {} 						  // exception이 발생하면 date값 할당 X. date=null될 것
			}
			
			if(date == null) err("실제 날짜를 yyyy-MM-dd 형식으로 입력하세요."); 
		} while(date == null);
		
		return date;
	}
	
	static int choose(String menu, int length) {
		int choice = 0;
		boolean isVal = false;
		
		do {
			System.out.println();
			choice = inNum(menu);
			if (choice<0 || choice>length)
				err("존재하는 메뉴 번호를 입력하세요.");
			else isVal = true;
		} while(!isVal);
		
		return choice;
	}
	
	static String menu(String[] menuItem) {
		String menu = "";
		
		for (int i=0; i<menuItem.length; i++) {
			menu += (i+1) + "." + menuItem[i] + ", ";
		}
		menu += "0.종료";
		return menu;
	}
}