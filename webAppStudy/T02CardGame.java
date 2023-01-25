


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
interface CardColor{
    Color FRONT=new Color(240, 245, 255);
    Color FRONT_TEXT=new Color(15, 15, 25);
    Color BACK=new Color(200, 205, 215);
    //Color BACK_TEXT=new Color(200, 205, 215); //배경과 글자색을 똑같이 해서 보이지 않게 하기

    Color BACK_TEXT=new Color(185, 185, 185);
    Color FAILED=new Color(240, 100, 100);
    Color FAILED_TEXT=new Color(105, 15, 25);
    Color SUCCESS=new Color(200, 240, 200);
    Color SUCCESS_TEXT=new Color(15, 115, 25);
}
class CardGameFrame extends JFrame{
    int time=30;
    int score=0;
    JPanel resultP=new JPanel();
    JPanel buttonP=new JPanel();

    JLabel timeL=new JLabel(time+"초");
    JLabel scoreL=new JLabel(score+"점");
    Card[] cards=new Card[12];
    Integer [] cards_nums= {1,1,2,2,3,3,4,4,5,5,6,6};
    LinkedList<Card> click_cards=new LinkedList<Card>();
    JFrame f=this;
    public CardGameFrame(String title) throws InterruptedException {
        super(title);
        randomCards(); //카드 섞고 버튼객체 만들기
        //Card 버튼 12개를 버튼 패널에 붙이기
        for(Card c :cards) {
            buttonP.add(c);
        }
        this.setLayout(new BorderLayout());//y축으로 1칸씩 정렬되는 레이아웃
        buttonP.setLayout(new GridLayout(3,4,20,10));//그리드로 정렬되는 레이아웃
        resultP.add(timeL);
        resultP.add(scoreL);
        this.add(resultP,BorderLayout.NORTH);
        this.add(buttonP,BorderLayout.CENTER);
        this.setBounds(600,100,600,800);
        this.setVisible(true);
        this.validate();//새로고침
        this.addWindowListener(new WindowHandler());


        Thread t1=new ShowCard();
        Thread t2=new HideCard();
        Thread t3=new CheckSucces();
        t1.start(); //화면에 카드 출력
        t1.join();
        t2.start(); //화면에 출력된 카드 뒤집기
        t2.join();
        setCardAction(); //카드를 누를 수 있도록 액션 등록하기
        t3.start(); //0.5초동안 무한히 뒤집어진 2개의 카드가 옳바른지 검사하기
    }
    class WindowHandler extends WindowAdapter{
        public void windowClosing(WindowEvent e) {f.dispose();}
        public void windowClosed(WindowEvent e) {System.exit(0);}
    }
    //처음 시작하면 화면에 카드 보이게 하는 스레드
    class ShowCard extends Thread{
        @Override
        public void run() {
            for(Card c :cards) {
                try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
                c.setOpaque(true);
                c.setBorderPainted(false);
                c.setBackground(CardColor.FRONT);
                c.setText(c.card_num+"");
                c.setForeground(CardColor.FRONT_TEXT);

                f.validate();
            }
        }
    }
    //처음 시작하면 화면에 카드 보이는 것을 감추는 스레드
    class HideCard extends Thread{
        @Override
        public void run() {
            try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
            for(Card c :cards) {
                try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
                c.setBackground(CardColor.BACK);
                c.setForeground(CardColor.BACK_TEXT);
            }
        }
    }
    //카드가 2개 선택되었을 때 짝이 맞는지 검사하는 스레드
    class CheckSucces extends Thread{
        @Override
        public void run() {
            //선택한 두개의 카드가 같은지 .5초마다 무한히 검사하는 코드
            while(true) {
                try {Thread.sleep(500);} catch (InterruptedException e1) {	e1.printStackTrace();}
                if(click_cards.size()==2) {
                    //실패했을 때 다시 뒤집기
                    if(click_cards.get(0).card_num!=click_cards.get(1).card_num) {
                        try {Thread.sleep(500);} catch (InterruptedException e1) {e1.printStackTrace();}
                        for(Card c: click_cards) {
                            c.setBackground(CardColor.FAILED);
                            c.setForeground(CardColor.FAILED_TEXT);
                        }
                        try {Thread.sleep(200);} catch (InterruptedException e1) {	e1.printStackTrace();}
                        for(Card c: click_cards) {
                            c.setBackground(CardColor.BACK);
                            c.setForeground(CardColor.BACK_TEXT);
                        }
                    }else{
                        //성공했을 때 다시 뒤집어지지 않도록 true로 바꾸기
                        for(Card c: click_cards) {
                            c.success=true;
                            c.setBackground(CardColor.SUCCESS);
                            c.setForeground(CardColor.SUCCESS_TEXT);

                        }
                    }
                    click_cards.clear();
                    //성공하든 실패하든 2번 클릭하고 나면 클릭 초기화
                }
            }
        }
    }
    public void randomCards() { //번호를 랜덤으로 섞으면서 카드 생성하기
        LinkedList<Integer> card_list=new LinkedList<Integer>(Arrays.asList(cards_nums));
        for(int i=0; i< cards.length; i++){
            int random=(int)(new Random().nextDouble()*card_list.size());
            Card c=new Card(card_list.remove(random));
            c.setBackground(CardColor.FRONT);
            c.setOpaque(true);
            c.setBorderPainted(false);

            cards[i]=c;

        }
    }
    public void setCardAction() {//카드에 누르면 이벤트 발생시기도록 액션 정의하기
        for(Card c: cards) {
            c.addActionListener(new CardActionHander(c));
        }
    }
    class CardActionHander implements ActionListener{
        Card c;
        CardActionHander(Card c){
            this.c=c;
        }
        @Override
        public void actionPerformed(ActionEvent e) {

            if(c.success) return;//이미 성공한 카드는 누를 수 없다.
            if(click_cards.size()<2) {//카드는 2번 누를 수 있다.
                //카드를 눌렀을 때 click_cards 배열에 넣는데 click_cards이 2보다 작으면 뒤집어 진 것처럼 넘버 표시하고 색 바꾸기
                if(click_cards.size()==1 && c==click_cards.get(0) ) return;
                click_cards.add(c);
                c.setBackground(CardColor.FRONT);
                c.setForeground(CardColor.FRONT_TEXT);
            }
        }
    }
}
class Card extends JButton{
    public int card_num; //선택한 2개의 카드가 같은지 비교할 때 사용
    public boolean success=false; //카드 찾기 성공하면 TRUE가 된다.
    public Card(int card_num) {
        this.card_num=card_num;
    }
}
public class T02CardGame{
    public static void main(String[]args) {
        try {
            new CardGameFrame("카드게임");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
