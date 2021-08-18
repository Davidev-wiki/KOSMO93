package a.b.c.swing.member.scr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingMember extends JFrame{
	
	// 상수
	private static final long serialVersionUID = 1223945384484229538L;
	
	// 멤버변수
	private JLabel		la1, la2, la3, la4, la5, la6, la7;
	private JTextField  tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton     bt1, bt2, bt3, bt4;
	private JPanel		pa1, pa2;
	
	
	// 생성자
	public SwingMember() {
		this.setTitle("SwingMember");
		this.setLayout(new BorderLayout());
		
		pa1 = new JPanel();
		pa1.setBackground(Color.cyan);
		
		pa2 = new JPanel();
		pa2.setBackground(Color.blue);
		
		this.add(pa1, BorderLayout.CENTER);
		this.add(pa2, BorderLayout.SOUTH);
		
		pa1.setLayout(new GridLayout(7,2));
		la1 = new JLabel(" 고객번호 ", JLabel.CENTER);
		la2 = new JLabel(" 고객명 ", JLabel.CENTER);
		la3 = new JLabel(" 아이디 ", JLabel.CENTER);
		la4 = new JLabel(" 패스워드 ", JLabel.CENTER);
		la5 = new JLabel(" 삭제여부 ", JLabel.CENTER);
		la6 = new JLabel(" 등록일 ", JLabel.CENTER);
		la7 = new JLabel(" 수정일 ", JLabel.CENTER);

		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);
		
		
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
		
		
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		bt1 = new JButton("조회");
		bt1 = new JButton("저장");
		bt1 = new JButton("수정");
		bt1 = new JButton("삭제");
		
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);
		
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);
		
		this.add(pa1, BorderLayout.CENTER);
		this.add(pa2, BorderLayout.SOUTH);
		
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		bt3.addActionListener(new EventHandler());
		bt4.addActionListener(new EventHandler());
		
		this.setSize(300, 250);
		this.setLocation(400, 200);
		this.setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
		
	}
	
	class EventHandler implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String btnCmd = String.valueOf(e.getActionCommand());
			
			if("조회".contentEquals(btnCmd)) {
				
			}
		}

	}
	
	public void jtextFileClear() {
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingMember();
	}

}
















