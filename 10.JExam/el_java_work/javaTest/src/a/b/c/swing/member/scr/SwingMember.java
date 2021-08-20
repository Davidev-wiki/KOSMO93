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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import a.b.c.swing.member.service.SwingMemberService;
import a.b.c.swing.member.service.SwingMemberServiceImpl;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

// class evnetHandler ����
// [��ü��ȸ] [�ʱ�ȭ] [����] ��� 3�� ��ư �߰� 
public class SwingMember extends JFrame implements ActionListener {

	// ���
	private static final long serialVersionUID = 1223945384484229538L;

	// �������
	private JLabel la1, la2, la3, la4, la5, la6, la7;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6;
	private JPanel pa1, pa2;
	private JButton btClose;

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
		// : Grid (���or���̺����� : 7��, 2��)
		pa1.setLayout(new GridLayout(7, 2));

		// �� 7�� ����
		la1 = new JLabel(" ������ȣ ", JLabel.CENTER);
		la2 = new JLabel(" ������ ", JLabel.CENTER);
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

		// '�г� 1'�� '��1'�� '�ؽ�Ʈ�ʵ�1'�� �߰�
		// '��2'�� '�ؽ�Ʈ�ʵ�2'�� �߰�
		// '��3'�� '�ؽ�Ʈ�ʵ�3'�� �߰�
		// '��4'�� '�ؽ�Ʈ�ʵ�4'�� �߰�
		// '��5'�� '�ؽ�Ʈ�ʵ�5'�� �߰�
		// '��6'�� '�ؽ�Ʈ�ʵ�6'�� �߰�
		// '��7'�� '�ؽ�Ʈ�ʵ�7'�� �߰�
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
		// : Flow(�� �ٷ� ������ ����)
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));

		// �� 4���� ��ư ���� ��ư1, ��ư2, ��ư3, ��ư4
		bt1 = new JButton("��ȸ");
		bt2 = new JButton("����");
		bt3 = new JButton("����");
		bt4 = new JButton("����");
		bt5 = new JButton("��ü��ȸ");
		bt6 = new JButton("�ʱ�ȭ");
		btClose = new JButton("���α׷�����");

		// '�г�2'�� ��ư 4���� �߰�
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);
		pa2.add(bt5);
		pa2.add(bt6);
		pa2.add(btClose);

		// '�ؽ�Ʈ�ʵ� 5,6,7��'�� �������ɿ��� : 'F'(�Ұ�)�� ����
		// �ؽ�Ʈ�ʵ� 5, 6, 7 : ��������, �����, ������
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);

		// '��ư 1 : ��ȸ'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		// '��ư 2 : ����'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		// '��ư 3 : ����'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		// '��ư 4 : ����'�� �̺�Ʈ�����ʸ� �߰��Ѵ�. (�̺�Ʈ�ڵ鷯�� �̿��ϴ�)
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		btClose.addActionListener(this);

		// '�г� 1'�� '�г� 2' �� JFrame�� �߰��ϵ�,
		// ���� '�߾�', '�ϴ�'�� �߰��Ѵ�.
		this.getContentPane().add(pa1, BorderLayout.CENTER);
		this.getContentPane().add(pa2, BorderLayout.SOUTH);

		// ���� �����ϴ� JFrame�� ����� row 580, col 250 ���� ����.
		this.setSize(580, 250);
		// ���� �����ϴ� JFrame�� ��ġ�� 400, 200 ��ġ�� ����
		this.setLocation(400, 200);
		// ���� �����ϴ� JFrame�� �ð������� ���̰� ��.
		this.setVisible(true);
		// ����ڰ� ����� ������ �� �ְ� �ϴ� �ɼ�
		this.setResizable(false);

		// JFrame ���ῡ ���� ���� (������ ���� �� �� ����)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}

	// ��ü ��ȸ - ��ü ��ȸ�� ���� Ŭ����, SwingMemberAll() �Լ��� ������
	public void smSelectAll() {
		System.out.println("SwingMember :: smSelectAll() ������");

		try {
			// Ŭ���� �����ؾ� ��
			new SwingMemberAll();
		} catch (Exception ex) {
			System.out.println("���� �� ������ >>> : " + ex.getMessage());
		}
	}

	// ���� ��ȸ - ȸ�� ��ȣ �Է½� �����Ϳ��� ���� ������ �ͼ� �����ִ� ����� �Լ�.
	public void smSelect(String swnum) {
		System.out.println("SwingMember.smSelect()������");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);

			// ȭ�� �ؽ�Ʈ�ʵ� Ŭ����
			jtextFileClear();

			ArrayList<SwingMemberVO> aList = sms.smSelect(svo);

			if (aList != null && aList.size() > 0) {

				for (int i = 0; i < aList.size(); i++) {

					SwingMemberVO _svo = aList.get(i);

					tf1.setText(_svo.getSwnum());
					tf2.setText(_svo.getSwname());
					tf3.setText(_svo.getSwid());
					tf4.setText(_svo.getSwpw());
					tf5.setText(_svo.getDeleteyn());
					tf6.setText(_svo.getInsertdate());
					tf7.setText(_svo.getUpdatedate());
				}
			} else {

			}
		} catch (Exception ex) {
			System.out.println("���� �� ������ >>> : " + ex.getMessage());
		}
	}

	// ��� - ȸ�� ��ȣ, ȸ�� �̸�, ȸ�� ���̵�, ȸ�� �н����� �Է½� �����ͺ��̽��� �����ϴ� ����� �Լ�.
	public void smInsert(String swnum, String swname, String swid, String swpw) {
		System.out.println("SwingMember.smInsert()������");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			svo.setSwname(swname);
			svo.setSwid(swid);
			svo.setSwpw(swpw);

			// ȭ�� �ؽ�Ʈ�ʵ� Ŭ����
			jtextFileClear();

			boolean bool = sms.smInsert(svo);

			if (bool) {
				System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);

				JOptionPane.showMessageDialog(this, "ȸ������ �Է� ���� >>> :  ");

				this.smSelect(swnum);
			} else {
				System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
				JOptionPane.showMessageDialog(this, "ȸ������ �Է� ���� >>> :  ");
			}
		} catch (Exception ex) {
			System.out.println("��� �� ������ >>> : " + ex.getMessage());
		}
	}

	// ���� - ȸ�� ��ȣ, ȸ�� �̸� �Է½� �����ͺ��̽��� �����Ͱ� �����Ǵ� ����� �Լ�.
	public void smUpdate(String swnum, String swname) {
		System.out.println("SwingMember.smUpdate()������");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			svo.setSwname(swname);

			// ȭ�� �ؽ�Ʈ�ʵ� Ŭ����
			jtextFileClear();

			boolean bool = sms.smUpdate(svo);

			if (bool) {
				System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);

				JOptionPane.showMessageDialog(this, "ȸ������ ���� ���� >>> :  ");

				this.smSelect(swnum);
			} else {
				System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
				JOptionPane.showMessageDialog(this, "ȸ������ ���� ���� >>> :  ");
			}
		} catch (Exception ex) {
			System.out.println("���� �� ������ >>> : " + ex.getMessage());
		}
	}

	// ���� - ȸ�� ��ȣ �Է½� �����ͺ��̽����� ��ȸ�� �� ������ DELETEYN : 'N'���� �����ϴ� ����� �Լ�.
	public void smDelete(String swnum) {
		System.out.println("SwingMember.smDelete()������");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);

			// ȭ�� �ؽ�Ʈ�ʵ� Ŭ����
			jtextFileClear();

			boolean bool = sms.smDelete(svo);

			if (bool) {
				System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
				JOptionPane.showMessageDialog(this, "ȸ������ ���� ���� >>> :  ");
			} else {
				System.out.println("ȸ�� ���� ���� ���� >>> : " + bool);
				JOptionPane.showMessageDialog(this, "ȸ������ ���� ���� >>> :  ");
			}

		} catch (Exception ex) {
			System.out.println("���� �� ������ >>> : " + ex.getMessage());
		}
	}

	// �̺�Ʈ �߻��� ���� ����
	// ActionListener�� �����ϴ� ������ Ŭ���� eventHandler ���
	// ActionListener�� �Լ��� ���� ������.
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnCmd = String.valueOf(e.getActionCommand());

		if ("��ȸ".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			String swnum = "";

			try {

				swnum = tf1.getText();
				System.out.println("swnum >>> : " + swnum);

				// ���� ��ȸ �Լ� ȣ��
				this.smSelect(swnum);

			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
			}
		}
		if ("����".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			String swnum = "";
			String swname = "";
			String swid = "";
			String swpw = "";

			try {
					//����� �ڵ� :  SwingMemberChabun.ymdNum();
				//a.b.c.board.common.KckBoardChabun.gubunNum()
				swnum = SwingMemberChabun.ymdNum();
				swname = tf2.getText();
				swid = tf3.getText();
				swpw = tf4.getText();
				System.out.println("swnum >>> : " + swnum);
				System.out.println("swname >>> : " + swname);
				System.out.println("swid >>> : " + swid);
				System.out.println("swpw >>> : " + swpw);

				// ��� �Լ� ȣ��
				this.smInsert(swnum, swname, swid, swpw);

			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
			}
		}
		if ("����".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			// �̸��� �����ϱ�
			String swnum = "";
			String swname = "";

			try {

				swnum = tf1.getText();
				swname = tf2.getText();

				System.out.println("swnum >>> : " + swnum);
				System.out.println("swname >>> : " + swname);

				// ���� �Լ� ȣ��
				this.smUpdate(swnum, swname);

			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
			}

		}
		if ("����".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			String swnum = "";

			try {

				swnum = tf1.getText();
				System.out.println("swnum >>> : " + swnum);

				// ���� �Լ� ȣ��
				this.smDelete(swnum);

			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
			}
		}
		if ("��ü��ȸ".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			try {
				// ��ü��ȸ �Լ� ȣ��
				this.smSelectAll();

			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
			}
		}
		if ("�ʱ�ȭ".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			try {
				// �ʱ�ȭ �Լ� ȣ��
				this.jtextFileClear();

			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
			}
		}
		if ("���α׷�����".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " ���� >>> : ");

			try {
				System.exit(0);
			} catch (Exception ex) {
				System.out.println("������ >>> : " + ex.getMessage());
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
		System.out.println("Swing Member ���α׷��� ���۵˴ϴ�.");
		System.out.println("ȸ������ ��ȸ ���α׷��� �����մϴ�");

		// ������ ȣ��
		new SwingMember();
	}
}