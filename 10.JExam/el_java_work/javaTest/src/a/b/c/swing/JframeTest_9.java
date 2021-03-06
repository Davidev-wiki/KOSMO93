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

public class JframeTest_9 extends JFrame implements ActionListener {

	// 멤버변수
	private JButton jbt;

	// 생성자
	public JframeTest_9() {

		this.setTitle("이벤트 해보기");
		this.setLayout(new FlowLayout());

		jbt = new JButton("버튼을 눌러보세요!!");
			
		// 현재 객체를 리스너로 등록
		jbt.addActionListener(this);

		this.add(jbt);

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			jbt.setText("버튼이 눌렸네용");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_9();

	}

}