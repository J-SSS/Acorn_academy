package com.acon;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class RSPGame extends JFrame{
    JFrame f=this;
    JPanel p0=new JPanel();
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JPanel p3=new JPanel();
    JPanel p4=new JPanel();

    JLabel enemyL=new JLabel("가위 바위 보");
    JLabel resultL=new JLabel("vs");
    GameButton sb=new GameButton("가위",0);
    GameButton rb=new GameButton("바위",1);
    GameButton pb=new GameButton("보",2);
    JButton startb=new JButton("시작");
    String [] enemy_arr= {"가위","바위","보"};
    int select_enemy=0;
    boolean start_game=false;
    public RSPGame() {
        this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        p1.add(enemyL);
        p2.add(resultL);
        sb.addActionListener(new GameButtonHandler());
        rb.addActionListener(new GameButtonHandler());
        pb.addActionListener(new GameButtonHandler());
        startb.addActionListener(new StartButtonHandeler());
        p3.add(sb);
        p3.add(rb);
        p3.add(pb);
        p4.add(startb);

        this.add(p0);
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.setBounds(1500, 100, 300, 300);
        this.setVisible(true);
        this.addWindowListener(new WindowHandler());
    }
    class StartButtonHandeler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(!start_game) {
                start_game=true;
                Thread t=new Thread(new EnemyRandom());
                t.start();
            }
        }
    }
    class GameButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //js 에서 e.target과 동일
            GameButton b=((GameButton)e.getSource());
            String msg= (b.num-select_enemy == 1 || b.num-select_enemy==-2 )?"승리" :
                    (b.num-select_enemy==0)?"무승부":"패배" ;
            resultL.setText(b.getText()+" vs "+enemy_arr[select_enemy]+" : "+msg);
            start_game=false;
        }
    }
    class EnemyRandom implements Runnable{
        @Override
        public void run() {
            while(start_game) {
                int random=(int)((new Random().nextDouble())*enemy_arr.length);
                enemyL.setText(enemy_arr[random]);
                select_enemy=random;
                try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            }
        }
    }
    class WindowHandler extends WindowAdapter{
        @Override
        public void windowClosing(WindowEvent e) {
            f.dispose();
            System.exit(0);
        }
    }
    class GameButton extends JButton{
        int num;
        GameButton(String txt,int num){
            super(txt);
            this.num=num;
        }
    }
}


public class T00RSPGame {
    public static void main(String[]args) {
        new RSPGame();
    }
}