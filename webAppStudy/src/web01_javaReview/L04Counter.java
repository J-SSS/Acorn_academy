package web01_javaReview;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//Swing gui Component
//Component > Container(레이아웃 메니저:다른 컴포넌트 배치) > Window(Frame : 종료버튼 메뉴가 있는 창), Panel (Frame 에 포함되어야만 함)
//Component > JComponent > JList, JButton, JLabel, JTable ..... (컨테이너에 포함될 수 있는 컴포넌트)
//GUI 를 구성하는 컴포넌트는 상시 이벤트 발생을 대기한다.
class Counter extends JFrame{ //Window 필드인 JFrame 이 모든 컴포넌트를 포함할 수 있는 창이기 때문에 상속받고 구현한다.
    private JButton upBtn; //1늘리는 버튼
    private JButton downBtn; //1줄이는 버튼
    private JButton initBtn; //초기화
    private JLabel screen; //카운터 화면
    private int count=0;
    public Counter(String title) {
        super(title); //생성자는 부모의 자식을 구분한다.
        upBtn=new JButton("Up");
        downBtn=new JButton("Down");
        initBtn=new JButton("Init");
        screen=new JLabel(count+" 명");
        screen.setHorizontalAlignment(JLabel.CENTER);
        //this.setLayout(new BorderLayout());
        this.add(screen);
        this.add(upBtn, BorderLayout.NORTH);
        this.add(downBtn,BorderLayout.SOUTH);
        this.add(initBtn, BorderLayout.EAST);
        //addWindowListener : window 의 테두리의 버튼을 누르것을(이벤트) 재정의
        this.addWindowListener(new WindowHandler());
        upBtn.addActionListener(new UpBtnHandler());
        downBtn.addActionListener(new DownBtnHandler());
        initBtn.addActionListener(new InitBtnHandler());
        this.setBounds(0,0,200,200);
        this.setVisible(true);
    }
    class UpBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            screen.setText(++count+" 명");
        }
    }
    class DownBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(count>0)screen.setText(--count+" 명");
        }
    }
    class InitBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            screen.setText((count=0)+" 명");
        }
    }
    //class Counter{
    class WindowHandler implements WindowListener{
        @Override
        public void windowOpened(WindowEvent e) {} //열릴때
        @Override
        public void windowClosing(WindowEvent e) {
            // this.dispose(); //WindowHandler 의 필드 접근자 this
            Counter.this.dispose();
        } //닫힘버튼을 누를 때
        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("윈도우가 종료됩니다.");
            System.exit(0);
        } //윈도우가 종료될 때
        @Override
        public void windowIconified(WindowEvent e) {}//윈도우가 아이콘으로 바뀔때
        @Override
        public void windowDeiconified(WindowEvent e) {} //아이콘에서 창으로 바뀔때
        @Override
        public void windowActivated(WindowEvent e) {} //창을 마우스로 누르고 있을 때
        @Override
        public void windowDeactivated(WindowEvent e) {}//누르고 있던 마우스를 놓을 때
    }

    //this : 인스턴스객체의 필드 접근자 (부모필드를 상속 받았기 때문에 부모 필드도 접근 가능)
    //super : 객체의 부모 필드 접근자
    //this() : 해당 객체의 생성자 호출
    //super() : 해당 객체의 부모 생성자 호출
    //부모클래스이름.this : 중첩클래스에서 부모클래스의 필드 접근자 (자식과 부모가 같은 이름의 필드가 존재하지 않으면 굳이 사용하지 않아도 된다.)
}


public class L04Counter {
    public static void main(String[] args) {
        new Counter("카운터"); //
    }
}
