package a.b.c.swing;

import javax.swing.JFrame;

public class JframeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HTML�� ����ϴ�.
		JFrame jf = new JFrame("ù ��° JFrame");
		
		// JFrame�� ũ��
			// jf.setSize(��, ����)
			// jf.setSize(width, height); void - Window
		jf.setSize(600, 500);
		
		// JFrame ���� : â���� x��ư ������ �����Ű�� ��
			// jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); void - Window
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// JFrame ������ ȭ�鿡 ������ : true : �۾������ڿ� ������ ������ �����.
		// JFrame ������ ȭ�鿡 �������� ���� : false : �۾������ڿ� ���Դٰ� �����.
		// �޸𸮿��� �ö� �ִ� ���·�.
			// jf.setVisible(true); void - window
		jf.setVisible(true);
	}

}