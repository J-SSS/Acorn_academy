package project;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	// member variable
	private ArrayList<Member> list = new ArrayList<Member>();
	
	// member method
	public void print() {
		System.out.println("**********************************************");
		System.out.println("* 1.insert 2.update 3.delete 4.search 5.exit *");
		System.out.println("**********************************************");

	}

	public String input(String msg) {
		System.out.print(msg);
		Scanner sc = new Scanner(System.in);
		return sc.next();  // 키보드에서 입력한 데이터를 반환해준다.
	}
	
	public void output() {
		for(int i =0; i<list.size();i++) {
			System.out.println("아이디 : " + list.get(i).getId() + ", 이름 :" + list.get(i).getName());
			
		}
	}

	public void run(String inputData) {
		if (inputData.equals("1")) {
			insert();
		} else if (inputData.equals("2")) {
			update();
		} else if (inputData.equals("3")) {
			delete();
		} else if (inputData.equals("4")) {
			search();
		} else if (inputData.equals("5")) {
			System.out.println("프로그램이 종료되었습니다.");
		} else {
			System.out.println("똑바로해!");
			print();
			String inputD = input("번호를 선택하세요>");
			run(inputD);
		}
	}

	// 1. 아이디, 이름을 입력받는다.
	// 2. 아이디가 존재하면  "이디가 존재하여 회원을 추가할 수 없습니다." 메세지를 출력한다.
	// 3. 아이디가 존재하지 않으면 ArrayList에 회원을 추가하고 "회원을 추가했습니다." 메세지를 출력한다.
	// 4. print() 메서드를 호출하여 번호를 선택할 수 있게 한다.
	// 5. ArrayList에 있는 모든 회원을 출력한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드로 입력을 받게 한다.
	
	public void insert() {
		
		//입력값을 일단 변수로 저장
		String inputI = input("아이디 : ");
		String inputN = input("이름 : ");
		
		// 첫 입력시에는 입력값을 배열에 바로 넣음
		if(list.size()==0) {
			list.add(new Member(inputI, inputN));
			System.out.println("회원을 추가했습니다.");
			}
		//그 다음부터는 검사 후 배열에 넣을지 결정
		else {
		for(int i = 0; i<list.size();i++) {
			//입력값의 배열 내 존재 여부 검사 true => 퇴짜
			if(inputI.equals(list.get(i).getId())) {
				System.out.println("아이디가 존재하여 회원을 추가할 수 없습니다!");
				System.out.println();
				break;
						}
			// 그저께 밤에 잘자라고 보낸 인사에다가 퉤. 하나 답장했잖아
			// 난 그 카톡 보고 솔직히 기분 상했고, 그 날 잠들때부터 다음날 아침까지 내내 찝찝했어
			// 그리고 왜 퉤라는 카톡을 보냈는지 캐물어서 이유를 듣고나서도 솔직히 잘 납득은 안됐어
			
			// 근데 정작 어제 썸원에서는 나한테 장단 맞추라는 식으로 말 했지??
			// 그럼 내 입장에서는 이렇게 생각을 하게 되는거야
			// 내가 장난삼아 하는 말에는 조금만 삐끗해도 서운하다고 티 내면서, 자기 장난에는 알아서 장단을 맞춰라???
			
			// 처음에 말한 것 같은 상황이 몇번 반복되니까
			// 내 입장에서는 내 말, 행동 하나하나 자꾸 검열하게 되고 조심스러워지는데
			// 
			
			
			//무사히 검사 끝나면? => 새로운 배열에 추가
			if(i==list.size()-1) {
				list.add(new Member(inputI, inputN));
				System.out.println("회원을 추가했습니다.");
				System.out.println();break;
			}
		}
	
		
		}//반복되는 메뉴 & 아웃풋 부분
		System.out.println();
		print();
		System.out.println("------");
		output();
		System.out.println("------");
		String inputD = input("번호를 선택하세요>");
		run(inputD);;

	}

	// 1. 수정할 아이디를 입력받는다.
	// 2. 수정할 아이디가 없으면 "수정할 아이디가 없습니다." 메세지를 출력한다.
	// 3. 수정할 아이디가 있으면 수정할 이름을 입력받고, ArrayList에 회원 정보를 수정하고 "회원을 수정했습니다."라는 메세지를 출력한다.
	// 4. print() 메서드 호출
	// 5. ArrayList에 있는 모든 회원을 출력한다.
	// 6. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	
	public void update() {
		// 입력값을 일단 변수에 저장
		String inputI = input("아이디 : ");
		
		// 리스트가 아직 생성되지 않은 경우
		if(list.size()==0) {
			System.out.println("수정할 아이디가 없습니다!");
			}
		
		// 리스트가 있는경우, 아이디 존재 여부 검사 후 업데이트
		else {
		for(int i = 0; i<list.size();i++) {

			if(inputI.equals(list.get(i).getId())) {
				list.get(i).setId(inputI); //아이디는 위에서 받은거 쓰고
				list.get(i).setName(input("이름 : ")); //이름은 새로 입력 받아서 업데이트
				System.out.println("회원 정보를 수정했습니다!");
			
				break;
			}
			if(i==list.size()-1) {
				System.out.println("수정할 아이디가 없습니다!");
				System.out.println();break;
			}
		}
		System.out.println();
		print();
		System.out.println("------");
		output();
		System.out.println("------");
		String inputD = input("번호를 선택하세요>");
		run(inputD);}
	}
		
		

	

	// 1. 삭제할 아이디를 입력받는다.
	// 2. ArrayList에서 아이디를 찾아 있으면 삭제하고 "성공적으로 삭제하였습니다" 메세지 출력하고
	//    없으면 "삭제할 아이디가 없습니다." 메세지를 출력한다.
	// 3. print() 메서드 호출
	// 4. ArrayList에 있는 모든 회원을 출력한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void delete() {
		
		String inputI = input("아이디 : ");
		if(list.size()==0) {
			
			System.out.println("삭제할 아이디가 없습니다!");
			}
		else {
		for(int i = 0; i<list.size();i++) {

			if(inputI.equals(list.get(i).getId())) {
				list.remove(i);
				System.out.println("성공적으로 삭제하였습니다!");
			
				break;
			}
			if(i==list.size()-1) {
				System.out.println("삭제할 아이디가 없습니다!");
				System.out.println();break;
			}
		}
		System.out.println();
		print();
		System.out.println("------");
		output();
		System.out.println("------");
		String inputD = input("번호를 선택하세요>");
		run(inputD);}
	}

	// 1. 검색할 아이디를 입력 받는다.
	// 2. ArrayList에서 아이디를 찾아서 있으면 검색된 회원을 출력하고 없으면 "검색된 결과가 없습니다." 메세지 출력
	// 3. print() 메서드 호출
	// 4. ArrayList에 있는 모든 회원을 출력한다.
	// 5. 번호를 선택하세요> 메세지를 출력한 후 키보드 입력을 받게 한다.
	public void search() {
		
		String inputI = input("아이디 : ");
		if(list.size()==0) {
			
			System.out.println("검색된 결과가 없습니다!");
			}
		else {
		for(int i = 0; i<list.size();i++) {

			if(inputI.equals(list.get(i).getId())) {
				System.out.println("아이디 : " + list.get(i).getId() + ", 이름 :" + list.get(i).getName());
				break;
			}
			if(i==list.size()-1) {
				System.out.println("검색된 결과가 없습니다!");
				System.out.println();break;
			}
		}
		System.out.println();
		print();
		System.out.println("------");
		output();
		System.out.println("------");
		String inputD = input("번호를 선택하세요>");
		run(inputD);}
	}
}
