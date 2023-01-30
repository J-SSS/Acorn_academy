package web01_javaReview;

import java.util.Scanner;

class ConsolTimer implements Runnable{
    int index =10 ;
    boolean start = true;
    @Override
    public void run() {
        while (index>0 && start){
            System.out.println(index--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("타이머 종료!");
    } //멀티 스레드로 생성되려면 Runnable을 구현해야한다.

}

public class L08MultiThread {
    public static void main(String[] args) {

        ConsolTimer consolTimer = new ConsolTimer();
        new Thread(consolTimer).start(); //구현한 run메소드를 스레드 생성후 실행..



        Scanner scanner = new Scanner(System.in);
        System.out.println("0을 입력하면 타이머가 종료");
        String num = scanner.nextLine();
        System.out.println("입력한 번호 :" + num);
        if(num.equals("0")) consolTimer.start = false;





    }
}
