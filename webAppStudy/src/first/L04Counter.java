package first;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter extends JFrame{

    private JButton uPBtn; //카운터 버튼
    private JButton downBtn; // 1씩 줄이는 버튼
    private JButton initBtn; // 초기화버튼
    private JLabel screen; // 화면

    private int count = 0;

    public Counter(String title)  {

        super(title); //생성자는 부모와 자식을 구분함
        uPBtn = new JButton("UP");
        downBtn = new JButton("DOWN");
        initBtn = new JButton("INIT");
        screen =  new JLabel(count + "명");
        screen.setHorizontalAlignment(JLabel.CENTER);

        uPBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                screen.setText(++count+"명");
            }
        });




        this.setBounds(0,0,400,400);
        this.setVisible(true);

        this.add(screen, BorderLayout.CENTER);
        this.add(uPBtn, BorderLayout.NORTH);
        this.add(downBtn, BorderLayout.SOUTH);
        this.add(initBtn, BorderLayout.EAST);



    }
}




public class L04Counter {
    public static void main(String[] args) {

        new Counter("### COUNTER ###");

    }
}
