package web01_javaReview;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingTimer22 extends JFrame {
    int count=100;
    boolean start=false;
    JButton startBtn=new JButton("시작");
    JButton stopBtn=new JButton("멈춤");
    JButton initBtn=new JButton("초기화");
    Panel btnP=new Panel();
    JLabel screen=new JLabel((this.count/10.0)+"");
    public SwingTimer22(){
        screen.setHorizontalAlignment(JLabel.CENTER);
        this.add(screen);
        btnP.setLayout(new GridLayout());
        btnP.add(startBtn);
        btnP.add(stopBtn);
        btnP.add(initBtn);
        this.add(btnP,BorderLayout.SOUTH);
        this.setBounds(0,0,300,300);
        this.setVisible(true);

        //객체지향 문법은 매개변수의 타입을 지정해야한다.(class 가 타입)
        //함수형 언어는 함수가 타입이라 함수를 매개변수로 작성가능 (함수가 타입)
        //(e)->{} : 람다식은 타입 생성을 컴파일러가 자동으로 하는 static sugar (함수형 언어인 척 하는 문법)
        //startBtn.addActionListener((e)->{}); //버튼을 누를때 행동을 재정의
        startBtn.addActionListener(new StartBtnHandler());
        stopBtn.addActionListener((e)->{
            start=false;
        });
        initBtn.addActionListener((e)->{
            start=false;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
            screen.setText(((count=100)/10.0)+"");
        });
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    class StartBtnHandler implements ActionListener {
        //StartBtnHandler가 ActionListener 타입이 될 수 있는 것은 객체지형의 어떤 특징 때문인가요? 상속받은 부모의 타입이 될 수 있는 타입의 다형성
        //addEventListener(ActionListener al) : ActionListener 를 구현하도록 강제해서 타입을 명확하게 한다. (오류를 줄인다.)
        //해당 버튼이 종료될 때까지 컴포넌트의 스레드를 독점하고 있어서 GUI 가 바뀌지 않는다.
        //swing 의 이벤트 리스너는 1개의 스레드가 모든 컴포넌트의 이벤트를 감시합니다.(js 처럼 멀티스레드가 아니다.)

        @Override
        public void actionPerformed(ActionEvent e) {
            if(!start){
                start=true;
            }else{  //start 가 true 이면 카운트를 하는 중
                return;
            }
            Runnable anonymousClassRunnable=new Runnable() {public void run() {}};
            //람다식은 익명클래스를 만들지 않는다.
            Runnable runnable=()->{
                //버튼을 여러번 누르면 스레드가 여러개 생겨서 카운트를 여러번 증감시킨다.
                while (count>0 && start){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    count--;
                    screen.setText((count/10.0)+"");
                }
            };
            new Thread(runnable).start();
        }
    } //카우터를 구현
    //new Thread(()->{}); //Runnable 을 재정의 없이 람다식을 바로 사용가능
}
public class L09_2Timer {
    public static void main(String[] args) {
        //JVM 과 클래스 로더 와 메소드 영역
        //main 이 실행되면 main 을 포함하는 패키지 내부의 모든 클래스를 로드해서 메소드 영역에 저장함!
        //import 하고 있는 클래스를 로드해서 메소드 영역에 저장!
        new SwingTimer22();
    }
}

