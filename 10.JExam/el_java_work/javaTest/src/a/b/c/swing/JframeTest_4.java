package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JframeTest_4 extends JFrame {

	public JframeTest_4(String title) {
		super(title);

		// getLayout() - LayoutManager - Container
		// jframe의 디폴트 레이아웃 매니저는 "BorderLayout"이다.
		System.out.println("getLayout() : " + getLayout());

		JPanel jp = new JPanel();
		System.out.println("getLayout() : " + jp.getLayout());
		jp.setBackground(Color.green);

		// 버튼 만들기
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");
		JButton jb5 = new JButton("Button5");

		// jPanel에 컴포넌트를 붙이는 역할.(JPanel은 Java 컴포넌트)
		// add는 container.add()
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);

		// jFrame에 jPanel을 붙이는 것.
		// 기본 베이스는 jFrame에 jPanel을 붙이는 구조인가보다.
		add(jp);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_4("JFrame + JPanel");

	}

}