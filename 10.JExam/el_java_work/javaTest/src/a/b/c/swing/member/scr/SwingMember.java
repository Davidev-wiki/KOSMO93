package a.b.c.swing.member.scr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import a.b.c.board.common.KckBoardChabun;
import a.b.c.common.KckMemberChabun;
import a.b.c.swing.member.service.SwingMemberService;
import a.b.c.swing.member.service.SwingMemberServiceImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMember extends JFrame {

	// ���
	private static final long serialVersionUID = 1223945384484229538L;

	// �������
	private JLabel la1, la2, la3, la4, la5, la6, la7;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton bt1, bt2, bt3, bt4;
	private JPanel pa1, pa2;

	// ������
	public SwingMember() {
		
		// JFrame Ÿ��Ʋ ����(Ÿ��Ʋ : â ��� �Ķ������ο� ������ �̸�)
		this.setTitle("SwingMember");
		// JFrame ���̾ƿ� �Ŵ��� "Border" �� �����ϱ�(�߾�+��������)
		this.setLayout(new BorderLayout());
		
		// ��, �ؽ�Ʈ�ʵ� ���Կ� �г� '�г�1'����
		pa1 = new JPanel();
		// '�г�1'�� ���� : cyan(�ϴû�)
		pa1.setBackground(Color.cyan);

		// ��ư ���Կ� �г� '�г�2' ����
		pa2 = new JPanel();
		// '�г�2' ���� : blue(�Ķ���) 
		pa2.setBackground(Color.blue);
		
		// '�г�1'�� ���̾ƿ� ���� 
		//  : Grid (���or���̺����� : 7��, 2��)
		pa1.setLayout(new GridLayout(7, 2));
		
		// �� 7�� ����
		la1 = new JLabel(" ����ȣ ", JLabel.CENTER);
		la2 = new JLabel(" ���� ", JLabel.CENTER);
		la3 = new JLabel(" ���̵� ", JLabel.CENTER);
		la4 = new JLabel(" �н����� ", JLabel.CENTER);
		la5 = new JLabel(" �������� ", JLabel.CENTER);
		la6 = new JLabel(" ����� ", JLabel.CENTER);
		la7 = new JLabel(" ������ ", JLabel.CENTER);
		
		// ���̰� 10�� �ؽ�Ʈ�ʵ� 7�� ����
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);

		// '�г� 1'��  '��1'�� '�ؽ�Ʈ�ʵ�1'�� �߰�
		//          '��2'�� '�ؽ�Ʈ�ʵ�2'�� �߰�
		//          '��3'�� '�ؽ�Ʈ�ʵ�3'�� �߰�
		//          '��4'�� '�ؽ�Ʈ�ʵ�4'�� �߰�
		//          '��5'�� '�ؽ�Ʈ�ʵ�5'�� �߰�
		//          '��6'�� '�ؽ�Ʈ�ʵ�6'�� �߰�
		//          '��7'�� '�ؽ�Ʈ�ʵ�7'�� �߰�
		pa1.add(la1);
		pa1.add(tf1);
		pa1.add(la2);
		pa1.add(tf2);
		pa1.add(la3);
		pa1.add(tf3);
		pa1.add(la4);
		pa1.add(tf4);
		pa1.add(la5);
		pa1.add(tf5);
		pa1.add(la6);
		pa1.add(tf6);
		pa1.add(la7);
		pa1.add(tf7);

		// '�г� 2'�� ���̾ƿ� ����
		//  : Flow(�� �ٷ� ������ ����)
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));

		// �� 4���� ��ư ���� ��ư1, ��ư2, ��ư3, ��ư4
		bt1 = new JButton("��ȸ");
		bt2 = new JButton("����");
		bt3 = new JButton("����");
		bt4 = new JButton("����");

		// '�г�2'�� ��ư 4���� �߰�
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);

		// '�ؽ�Ʈ�ʵ� 5,6,7��'�� �������ɿ��� : 'F'(�Ұ�)�� ����
		// �ؽ�Ʈ�ʵ� 5, 6, 7 : ��������, �����, ������
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);

		// '�г� 1'�� '�г� 2' �� JFrame�� �߰��ϵ�,
		//  ���� '�߾�', '�ϴ�'�� �߰��Ѵ�.
		this.add(pa1, BorderLayout.CENTER);
		this.add(pa2, BorderLayout.SOUTH);

		// '��ư 1 : ��ȸ'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		// '��ư 2 : ��ȸ'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		// '��ư 3 : ��ȸ'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		// '��ư 4 : ��ȸ'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		bt3.addActionListener(new EventHandler());
		bt4.addActionListener(new EventHandler());

		// ���� �����ϴ� JFrame�� �����  row 300, col 200 ���� ����.
		this.setSize(300, 250);
		// ���� �����ϴ� JFrame�� ��ġ�� 400, 200 ��ġ�� ����
		this.setLocation(400, 200);
		// ���� �����ϴ� JFrame�� �ð������� ���̰� ��.
		this.setVisible(true);
		
		// JFrame ���ῡ ���� ���� (������ ���� �� �� ����)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}
	
	// �̺�Ʈ�� �߻��ϴ� ���� ���Ѻ��� �ִٰ� 
	// �̺�Ʈ�� �߻��ϸ� �˸´� �۾��� �����Ű�� Ŭ���� 
	class EventHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			// e.getActionCommand? => api ��Ī
			// String.valueof => String���� �ٲ��ִ� �Լ�
			// �ǿ� : e.getActionCommand ����� �׼��̺�Ʈ�� Ŀ�ǵ�(� ������ �ԷµǾ������� ��Ÿ���� ��?)
			String btnCmd = String.valueOf(e.getActionCommand());
			
			// �Էµ� e.getActionCommand : ��ȸ ��ư�� ���� ���
			if ("��ȸ".contentEquals(btnCmd)) {
				System.out.println("[��ȸ] ������ �̺�Ʈ�� �߻���  >> " + btnCmd);
				
				// ȸ���ѹ��� ���� ���� ���� swnum�� ��� �� �ʱ�ȭ
				String swnum = "";
				// �ؽ�Ʈ�ʵ�1�� �Էµ� ���� swnum������ ���
				swnum = tf1.getText();
				System.out.println("�Էµ� ȸ���ѹ� swnum : " + swnum);

				try {
					
					// �������̽��� ���� �۾� �� �ʱ�ȭ
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					// ValueOf ��ü�� ���� ����� ȸ���ѹ��� swnum�� �����ϱ�.
					SwingMemberVO svo = null;
					svo = new SwingMemberVO();
					svo.setSwnum(swnum);

					// �ϱ⿡ ������ ����� ���� �Լ�
					// ��� TextField�� �� ��("")���� �ʱ�ȭ (��� �� �ʱ�ȭ�ΰ�?)
					jtextFileClear();
					
					// VO��ü Ÿ���� �迭�� ����, ���ο� �������̽��� ���� ��ȸ�� ����� ��´�. 
					ArrayList<SwingMemberVO> aList = sms.smSelect(svo);
					
					// �迭�� ���� null�� �ƴϸ鼭 �迭�� 1�� �̻��� �����Ͱ� �����ϴ� ���)
					if (aList != null && aList.size() > 0) {
						
						// �迭�� ���ο� �ִ� ��ü�� ������ŭ(��ü����) �ݺ��Ѵ�.
						for (int i = 0; i < aList.size(); i++) {
							
							// ���� ���� VO��ü(_svo)���ٰ�
							// aList �迭�� i��° �ִ� ��ü(���� �ʱ�ȭ�� svo)�� ���� �־��ش�.  
							SwingMemberVO _svo = aList.get(i);
							
							// �����Ͱ� ������ ���ο� ��ü '_svo'��� ���� 
							// get�Լ��� �����ͼ� �ؽ�Ʈ �ʵ忡 ���� �ùٸ� ���� �־��ش�.
							tf1.setText(_svo.getSwnum());
							tf2.setText(_svo.getSwname());
							tf3.setText(_svo.getSwid());
							tf4.setText(_svo.getSwpw());
							tf5.setText(_svo.getDeleteyn());
							tf6.setText(_svo.getInsertdate());
							tf7.setText(_svo.getUpdatedate());
						}
					} else {
						System.out.println("�迭���� �����͸� ������ �����ϴ� �� �����߻�!");
					}

				} catch (Exception e1) {
					System.out.println("��ȸ�� Error �߻�! : " + e1.getMessage());
				}

			}
			
			// �Էµ� e.getActionCommand : ���� ��ư�� ���� ���
			if ("����".equals(btnCmd)) {
				System.out.println("[����] ������ �̺�Ʈ�� �߻���  >> " + btnCmd);
				
				String swnum = "";
				String swname = "";
				String swid = "";
				String swpw = "";
				
				// ä���Լ��� �ߺ��Ǿ� ����Ұ�?
				swnum = KckMemberChabun.ymdNum();
				swname = tf2.getText();
				swid = tf3.getText();
				swpw = tf4.getText();
				
				System.out.println("swnum : " + swnum);
				System.out.println("swname : " + swname);
				System.out.println("swid : " + swid);
				System.out.println("swpw : " + swpw);
				
				
				try {
					
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					SwingMemberVO svo = new SwingMemberVO();
					
					svo.setSwnum(swnum);
					svo.setSwname(swname);
					svo.setSwid(swid);
					svo.setSwpw(swpw); 
					
					jtextFileClear();
					
					boolean bool = sms.smInsert(svo);
					
					if (bool) {
						System.out.println("ȸ������ �Է� ����! : : " + bool);
					} else {
						System.out.println("ȸ������ �Է� ����! : : " + bool);
					}
					
				} catch (Exception e1) {
					System.out.println("�����ҷ��¿� ������ �߻��߾��.. : " + e1);
				} 
				
			}

			// �Էµ� e.getActionCommand : ���� ��ư�� ���� ���
			if ("����".equals(btnCmd)) {
				System.out.println("[����] ������ �̺�Ʈ�� �߻���  >> " + btnCmd);
				
				// �̸��� �����ϴ� ������ ����.
				String swnum = "";
				String swname = "";
				swnum = tf1.getText();
				swname = tf2.getText();
				
				System.out.println("�Էµ� swnum : " + swnum);
				System.out.println("�Էµ� swname : " + swname);
				
				try {
					
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					SwingMemberVO svo = new SwingMemberVO();
					svo.setSwnum(swnum);
					svo.setSwname(swname);
					
					jtextFileClear();
					
					boolean bool = sms.smUpdate(svo);
					
					if (bool) {
						System.out.println("ȸ������ ������ �Ϸ�Ǿ����ϴ�! >> " + bool);
					} else {
						System.out.println("ȸ������ ������ �����߽��ϴ�! >> " + bool);
					}
					
				} catch(Exception e2) {
					System.out.println("�����ϴ� �������� ������ �߻��߾��! >> " + e2.getMessage() );
				}
				
			}
			
			// �Էµ� e.getActionCommand : ���� ��ư�� ���� ���
			if ("����".equals(btnCmd)) {
				System.out.println("[����] ������ �̺�Ʈ�� �߻���  >> " + btnCmd);

				String swnum = "";
				swnum = tf1.getText();
				System.out.println("������ ȸ�� ��ȣ : " + swnum);
				
				try {
					
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					SwingMemberVO svo = new SwingMemberVO();
					svo.setSwnum(swnum);
					
					jtextFileClear();
					
					boolean bool = sms.smDelete(svo);
					
					if(bool) {
						System.out.println("ȸ������ ���� �����߾�� ! : " + bool);
					}else {
						System.out.println("ȸ������ ���� �����߾�� ! : " + bool);
					}
					
				} catch(Exception e3) {
					System.out.println("���� �������� ������ �߻��߾�� : " + e3.getMessage());
				}
			}
		}
	}

	public void jtextFileClear() {

		// TextField �� ""���� (�� ��)�ʱ�ȭ
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ������ ��ȸ ���α׷��� �����մϴ�");
		new SwingMember();
	}

}


























