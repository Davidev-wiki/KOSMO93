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

/*
�̺�Ʈ-���� ���α׷���(event-driven programming)
event, event source, event listener

�̺�Ʈ ó�� ����
1. �̺�Ʈ�� �߻��ϴ� ������Ʈ �����Ѵ�.
2. �̺�Ʈ ������ Ŭ������ ����Ѵ�.
	�ܺ� Ŭ����
	���� Ŭ����
	���� ��ü : ����ϴ� ���
	���� Ŭ���� : �͸� Ŭ���� : Anonymous class
3. �̺�Ʈ �����ʸ� �̺�Ʈ �ҽ�(�̺�Ʈ�� �߻��ϴ� ������Ʈ)�� ����Ѵ�.
	�ܺ� Ŭ���� : addXxxListener(new �ܺ�Ŭ����())
	���� Ŭ���� : addXxxListener(new ����Ŭ����())
	���� ��ü : ����ϴ� ��� : addXxxListener(this)
	���� Ŭ���� : �͸� Ŭ���� : Anonymous class :  : addXxxListener(new �̺�Ʈ������Ŭ����(){
												............
											})
	
*/

public class JframeTest_7 extends JFrame {

	// �������
	private JButton jbt;

	// ������
	public JframeTest_7() {

		this.setTitle("�̺�Ʈ �غ���");
		this.setLayout(new FlowLayout());

		jbt = new JButton("��ư�� ���������?");

		jbt.addActionListener(new MyListener());

		this.add(jbt);

		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new JframeTest_7();

	}

}

//2. �̺�Ʈ ������ Ŭ������ ����Ѵ�.
//�ܺ� Ŭ���� ����ϱ� 
class MyListener implements ActionListener {

//	�׼� �̺�Ʈ
//	����ڰ� ��ư�� Ŭ���� ��
//	����ڰ� �޴� �׸��� ������ ��
//	����ڰ� �ؽ�Ʈ �ʵ忡�� ����Ű�� ���� ��

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("e >>> : " + e);
		// TODO Auto-generated method stub
		JButton jbt = (JButton) e.getSource();
		jbt.setText("��ư�� ���Ƚ��ϴ�, �� ���߾��! ");
	}

}