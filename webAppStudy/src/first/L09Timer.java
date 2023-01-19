package first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingTimer extends JFrame{
    int min = 1;
    int sec = 0;
    int mSec = 0;
    boolean stop = false;
    boolean start = false;


    JButton startBtn = new JButton("시 작");
    JButton stopBtn = new JButton("일시정지");
    JButton initBtn = new JButton("초기화");
    Panel btnP = new Panel();

    JLabel screen = new JLabel(String.format("%02d:%02d:%03d",min,sec,mSec));


    class StartBtnHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


                new Thread(() -> {
                    stop = false;
                    while (min >= 0 && !start) {


                        // [n분 00초 000]시점에서 min을 감소시키고 sec와 mSec을 재설정 == [n-1분 59초 1000] 상태가 됨
                        if (sec == 0 && mSec == 0 && min != 0) {
                            min--;
                            sec = 59;
                            mSec = 1000;
                        }

                        // 밀리초가 0이면서 sec는 0이 아닐때 sec감소
                        if (mSec == 0 && sec != 0) {
                            sec--;
                            mSec = 1000;

                        }

                        //0.001초 기다리고
                        try {
                            Thread.sleep(1);
                        } catch (InterruptedException ex) {
                            throw new RuntimeException(ex);
                        }

                        //0.001초 감소시켜주며 스크린표시
                        //30초 아래면 글자가 빨간색으로 바뀜
                        mSec--;
                        if (sec <= 30) screen.setForeground(Color.RED);
                        screen.setText(String.format("%02d:%02d:%03d", min, sec, mSec));


                        // 일시정지 버튼을 누르면 stop이 true가 되면서 wait상태가 되는데.. 일단 작동은 되는데 에러메시지뜸
                        // IllegalMonitorStateException (???)
                        if (stop) {
                            try {
                                this.wait();
                            } catch (InterruptedException ex) {
                                throw new RuntimeException(ex);
                            }
                        }

                        if (min == 0 && sec == 0 && mSec == 0) {
                            start = true;
                        }

                    }
                }).start();

        }
    }



    class StopBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            stop=true;
        }
    }

    class InitBtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //[1분 00초 000]로 초기화
           min=1;
           sec=0;
           mSec=0;
           
           screen.setText(String.format("%02d:%02d:%03d",min,sec,mSec));
        }
    }
    public SwingTimer() {
        super("### TIMER ###");


        this.add(screen);
        screen.setHorizontalAlignment(JLabel.CENTER);
        screen.setFont(new Font( "", Font.BOLD,70));


        StartBtnHandler startBtnHandler = new StartBtnHandler();
        StopBtnHandler stopBtnHandler = new StopBtnHandler();
        InitBtnHandler initBtnHandler = new InitBtnHandler();


        startBtn.addActionListener(startBtnHandler);
        stopBtn.addActionListener(stopBtnHandler);
        initBtn.addActionListener(initBtnHandler);


        btnP.setLayout(new GridLayout());
        btnP.add(startBtn);
        btnP.add(stopBtn);
        btnP.add(initBtn);

        this.add(btnP,BorderLayout.SOUTH);
        this.setBounds(0,0,400,200);
        this.setVisible(true);


    }
}






public class L09Timer {
    public static void main(String[] args) {

       new SwingTimer();

    }
}

