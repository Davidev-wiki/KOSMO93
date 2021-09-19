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

	// �������
	private JButton jbt;

	// ������
	public JframeTest_9() {

		this.setTitle("�̺�Ʈ �غ���");
		this.setLayout(new FlowLayout());

		jbt = new JButton("��ư�� ����������!!");
			
		// ���� ��ü�� �����ʷ� ���
		jbt.addActionListener(this);

		this.add(jbt);

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbt) {
			jbt.setText("��ư�� ���ȳ׿�");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_9();

	}

}