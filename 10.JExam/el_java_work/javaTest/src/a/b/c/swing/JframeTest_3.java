package a.b.c.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JframeTest_3 extends JFrame {

	public JframeTest_3(String title) {
		super(title);
		
		// getLayout() - LayoutManager - Container
		// jframe의 디폴트 레이아웃 매니저는 "BorderLayout"이다.
		System.out.println("getLayout() : " + getLayout());
		
		// 버튼 만들기
		JButton jb1 = new JButton("Center");
		JButton jb2 = new JButton("Line Start");
		JButton jb3 = new JButton("Line End");
		JButton jb4 = new JButton("Page Start");
		JButton jb5 = new JButton("Page End");
		
		// jFrame에 컴포넌트를 붙이는 역할.(jFrame은 window 컴포넌트)
		// add는 container.add()
		// Default 값인 BorderLayout은 '상하좌우'와 '센터'로 구성되는데
		// 버튼에서 '센터'만 지정하면 jframe 화면 내에서 버튼이 전체 크기를 차지한다
		// 버튼에서 '상하좌우' 중 한가지만 선택하면 버튼이 지정된 범위를 초과하지 못한다.
		//add(jb1, BorderLayout.CENTER);
		//add(jb2, BorderLayout.LINE_START);
		//add(jb3, BorderLayout.LINE_END);
		add(jb4, BorderLayout.PAGE_START);
		//add(jb5, BorderLayout.PAGE_END);

		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_3("첫 번째 JFrame");

	}

}

