package a.b.c.swing;

import javax.swing.JFrame;

public class JframeTest_2 extends JFrame {

	public JframeTest_2(String title) {
		super(title);

		display();
	}
	
	// 구현화면이 복잡하거나 소스가 많으면 함수 또는 클래스로 분기해서 사용한다.
	public void display () {
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_2("첫 번째 JFrame");

	}

}

