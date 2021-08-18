package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
이벤트-구동 프로그래밍(event-driven programming)
event, event source, event listener

이벤트 처리 과정
1. 이벤트를 발생하는 컴포넌트 생성한다.
2. 이벤트 리스너 클래스를 등록한다.
	외부 클래스
	내부 클래스
	현재 객체 : 상속하는 경우
	무명 클래스 : 익명 클래스 : Anonymous class
3. 이벤트 리스너를 이벤트 소스(이벤트를 발생하는 컴포넌트)에 등록한다.
	외부 클래스 : addXxxListener(new 외부클래스())
	내부 클래스 : addXxxListener(new 내부클래스())
	현재 객체 : 상속하는 경우 : addXxxListener(this)
	무명 클래스 : 익명 클래스 : Anonymous class :  : addXxxListener(new 이벤트리스너클래스(){
												............
											})
	
*/

public class JframeTest_7 extends JFrame {

	// 멤버변수
	private JButton jbt;

	// 생성자
	public JframeTest_7() {

		this.setTitle("이벤트 해보기");
		this.setLayout(new FlowLayout());

		jbt = new JButton("버튼을 눌러볼까요?");

		jbt.addActionListener(new MyListener());

		this.add(jbt);

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_7();

	}

}

//2. 이벤트 리스너 클래스를 등록한다.
//외부 클래스 사용하기 
class MyListener implements ActionListener {

//	액션 이벤트
//	사용자가 버튼을 클릭할 때
//	사용자가 메뉴 항목을 선택할 때
//	사용자가 텍스트 필드에서 엔터키를 누를 때

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("e >>> : " + e);
		// TODO Auto-generated method stub
		JButton jbt = (JButton) e.getSource();
		jbt.setText("버튼이 눌렸습니다, 참 잘했어요! ");
	}

}