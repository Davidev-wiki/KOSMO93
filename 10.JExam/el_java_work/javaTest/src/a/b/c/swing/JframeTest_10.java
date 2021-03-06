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

public class JframeTest_10 extends JFrame {

	// 멤버변수
	private JButton jbt;
	private JLabel jlb;

	// 생성자
	public JframeTest_10() {

		this.setTitle("이벤트 해보기");

		JPanel jp = new JPanel();

		jbt = new JButton("Press this Button");
		jlb = new JLabel("<< Click");
		
		// 익명 클래스 사용 : anonymous class
		jbt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jbt) {
					jlb.setText("Done");
				}
			}
		});

		jp.add(jbt);
		jp.add(jlb);

		this.add(jp);

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_10();

	}

}
