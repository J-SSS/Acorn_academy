package web01_javaReview;

import java.util.Scanner;

public class L07Thread {
    public static void main(String[] args) {

        int index = 10; //0까지 1씩 줄이면서 콘솔에 출력하는 어플
        boolean start = true;

        //스레드 : 일의 단위
        //java.lang.Thread : 스레드를 생성할 수 있는 객체
        //main() : 실행하는 일의 집합으로 기본 한개의 스레드를 갖는다.
        //순차적 언어 : main에 작성한 코드가 한개의 스레드에 의해서 순서대로 실행된다.


        System.out.println("0 을 누르면 카운터가 종료됩니다.");
        Scanner scanner = new Scanner(System.in);
        String num=scanner.nextLine();//콘솔창에서 입력하는 내용과, JVM이 통신해서 받아오는 결과는 무조건 문자열이다.
        //스캐너가 스레드를 독점하며 입력을 기다리고 있기때문에 while이 실행이안됨

        if(num.equals("0")) start=false;


        while (index>0 && start){
            System.out.println(index--);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("타이머 종료");

    }
}
