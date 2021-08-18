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

public class JframeTest_8 extends JFrame {

	// 멤버변수
	private JButton jbt;
	private JLabel jlb;

	// 생성자
	public JframeTest_8() {
		
		this.setTitle("이벤트 해보기2");
		this.setLayout(new FlowLayout());
		
		JPanel jp = new JPanel();
		
		jbt = new JButton("버튼을 눌러볼래요?");
		jlb = new JLabel("아직 안눌렀네?");
		jbt.addActionListener(new MyListener());
		
		jp.add(jbt);
		jp.add(jlb);
		
		this.add(jp);
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jbt) {
				jlb.setText("Good~ 참 잘했어용!");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_8();

	}

}