package first;
// 작명규칙 (숫자로 시작하면 안되고, 연산을 사용하지 않는다(-+=/%), $ _ # 은 사용하는데 사용하는 경우가 제한적임 )
// #: 프라이빗한 이름, $필드이름에, 주로 사용...

// 대명사를 작성하는 규칙
// 파스칼 : 대명사, class, 프로젝트명
// 카멜케이스 : 변수 (자바)
// 스네이크(대문자) : 상수 (모든 프로그래밍 언어)
// 스네이크(소문자) : 폴더(대소문자 구분을 못하는 운영체제 때문), 패키지명(클래스이름과 구분하기위해)


// 인터페이스 : 모든 메서드가 추상이어야 한다.
// 클래스 : 모든 메서드가  추상일 수 없다.(인터페이스를 implementes 하면 모든 추상메서드를 구현해야한다.) == 바디작성

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BtnActionHandler implements ActionListener {

    int index;

    @Override
    public void actionPerformed(ActionEvent e) { //버튼을 누를때마다 이벤트 발생

        //ACtionEvent e : 이벤트와 관련된 정보가 포함되어있다.
        Object btnObj = e.getSource(); //이벤트가 발생한 대상을 반환
        JButton btn = (JButton) btnObj;
        btn.setText(++index + "명");
        System.out.println("버튼이 눌렸습니다!");
    }
}

public class L02InnerClass {


    static int index = 0;

    /*
      class 1 implements ActionListener
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setText(1+"");
            }
        });


     */


    public static void main(String[] args) {
        JFrame f = new JFrame("awt window 안녕!");
        JButton btn = new JButton("안뇽1");
        BtnActionHandler btnActionHandler = new BtnActionHandler();
        btn.addActionListener(btnActionHandler);


        int index = 0;
        JButton btn2 = new JButton("안뇽2");
        btn2.addActionListener(new ActionListener() { //L02InnerClass$1 생성
            int n =0;
            @Override
            public void actionPerformed(ActionEvent e) {
                btn2.setText(/*index*/++n+"");
            }
        });
        // 익명함수를 통해 내부클래스로 만들어졌기 때문에,
        // main함수의 지역변수 btn2에 접근할 수 없는것이 정상이나,
        // 컴파일러가 마치 부모 클래스의 필드처럼 접근 할 수 있도록 구현해놓는다. 하지만 상수로 정의되어야한다.
        // index도 main함수에 존재하나, 상수가 아니라서 내부클래스에서는 접근할 수 없음
        // btn2는 자료형으로서 내부의 필드가 바뀐다고 해도 btn2자체가 바뀌는것이 아니기때문에 여전히 상수다.
        // 그러나 index는 기본형이기에 값이 바뀌면 다른 데이터가 되기 때문에 상수가 아님.



        f.setBounds(0, 0, 400, 400);
        f.setVisible(true);
//        f.add(btn);
        f.add(btn2);




        //하이레벨(인간과 가까운) VS 로우레벨(컴퓨터에 가까운) 언어
        //플랫폼(os)가 하는 일 : 컴퓨터의 재원을 관리 및 동작



        //GUI (MAC에서 마우스를 최초로 이용. -> MS가 애플의 Mac을 따라서 만들기 시작함...


        //플랫폼에 독립적이다!
        //windwos나 mac에서 자바를 실행 시켜서 동작한다(x)
        //자바가(jvm)이 .class를 각 플랫폼의 언어로 변환하여 실행하면서 플랫폼의 자원을 동작(o)
        //자바가 유명하게 된 이유와 frame
        //window에서 GUI 앱을 개발하는 패키지를 제공했는데, 어렵고 복잡해서 개발 난이도가 높았다.
        //window용 앱을 만들고 다시 mac이나 리눅스용 앱을 만드려면 각 플랫폼에서 제공하는 GUI 패키지를 공부해야했다..ㅠㅠ
        //이러한 상황에서 JAVA가 통합 GUI 패키지를 제공(java.awt.*)하면서 자바가 유명해지게되었다.
        // ==> 시간이 지날수록 java.awt에서 제공하는 컴포넌트가 플랫폼마다 다르게 동작하기 시작했다...
        // ==> java.swing 패캐지로 업데이트하게됨(그러나 컴포넌트의 레이아웃이 제한적인 문제. 나온지도 오래됨.)
        // ==> javaFX : swing의 문제점을 극복하기위해 새롭게 등장한 GUI패키지(html와 비슷한 문법으로 컴포넌트를 배치가능)

    }
}
