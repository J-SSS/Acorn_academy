package com.acorn.javascriptstudy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class L18MultiThread {
   static boolean isClock = true;
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));

        JFrame f = new JFrame("시계");
        JLabel l = new JLabel();
        JButton stopBtn = new JButton("멈춰!");
        f.add(l, BorderLayout.CENTER);
        f.add(stopBtn, BorderLayout.SOUTH);
        f.setBounds(0,0,200,200);
        f.setVisible(true);

        new Thread(()->{
            while (isClock) {
                Date now = new Date();
                SimpleDateFormat nowSdf = new SimpleDateFormat("hh:mm:ss.SS");
                l.setText(nowSdf.format(now));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();


        stopBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isClock = false;
            }
        });
//        System.out.println("다른일을 하고싶어요~~ ");
    }
}
