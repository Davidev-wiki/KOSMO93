package a.b.c.swing;

import javax.swing.JFrame;

public class JframeTest_2 extends JFrame {

	public JframeTest_2(String title) {
		super(title);

		display();
	}
	
	// ����ȭ���� �����ϰų� �ҽ��� ������ �Լ� �Ǵ� Ŭ������ �б��ؼ� ����Ѵ�.
	public void display () {
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_2("ù ��° JFrame");

	}

}

