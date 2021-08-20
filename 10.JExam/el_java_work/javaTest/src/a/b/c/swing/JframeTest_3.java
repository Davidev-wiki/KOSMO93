package a.b.c.swing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JframeTest_3 extends JFrame {

	public JframeTest_3(String title) {
		super(title);
		
		// getLayout() - LayoutManager - Container
		// jframe�� ����Ʈ ���̾ƿ� �Ŵ����� "BorderLayout"�̴�.
		System.out.println("getLayout() : " + getLayout());
		
		// ��ư �����
		JButton jb1 = new JButton("Center");
		JButton jb2 = new JButton("Line Start");
		JButton jb3 = new JButton("Line End");
		JButton jb4 = new JButton("Page Start");
		JButton jb5 = new JButton("Page End");
		
		// jFrame�� ������Ʈ�� ���̴� ����.(jFrame�� window ������Ʈ)
		// add�� container.add()
		// Default ���� BorderLayout�� '�����¿�'�� '����'�� �����Ǵµ�
		// ��ư���� '����'�� �����ϸ� jframe ȭ�� ������ ��ư�� ��ü ũ�⸦ �����Ѵ�
		// ��ư���� '�����¿�' �� �Ѱ����� �����ϸ� ��ư�� ������ ������ �ʰ����� ���Ѵ�.
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

		new JframeTest_3("ù ��° JFrame");

	}

}
