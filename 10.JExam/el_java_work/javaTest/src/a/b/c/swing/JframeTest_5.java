package a.b.c.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JframeTest_5 extends JFrame {

	public JframeTest_5(String title) {
		super(title);

		// getLayout() - LayoutManager - Container
		// jframe의 디폴트 레이아웃 매니저는 "BorderLayout"이다.
		System.out.println("getLayout() : " + getLayout());

		JPanel jp = new JPanel();
		add(jp);
		System.out.println("jp.getLayout : " + jp.getLayout());
		jp.setLayout(null);
		System.out.println("jp.setLayout(null)이후 getLayout()의 값 : " + jp.getLayout());

		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);

		// setBounds(x좌표, y좌표, width, height);
		jb1.setBounds(20, 5, 95, 30);
		jb2.setBounds(55, 45, 105, 70);
		jb2.setBounds(180, 15, 105, 90);

		// setLocation & setSize
		//
		//

		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_5("JFrame + JPanel(Layout : null 이후 커스터마이징) ");

	}

}
