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
		// jframe�� ����Ʈ ���̾ƿ� �Ŵ����� "BorderLayout"�̴�.
		System.out.println("getLayout() : " + getLayout());

		JPanel jp = new JPanel();
		System.out.println("getLayout() : " + jp.getLayout());
		jp.setBackground(Color.green);

		// ��ư �����
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");
		JButton jb5 = new JButton("Button5");

		// jPanel�� ������Ʈ�� ���̴� ����.(JPanel�� Java ������Ʈ)
		// add�� container.add()
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);

		// jFrame�� jPanel�� ���̴� ��.
		// �⺻ ���̽��� jFrame�� jPanel�� ���̴� �����ΰ�����.
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