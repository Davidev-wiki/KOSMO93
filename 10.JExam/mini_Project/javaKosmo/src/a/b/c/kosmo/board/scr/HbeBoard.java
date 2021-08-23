package a.b.c.kosmo.board.scr;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import a.b.c.common.CodeUtil;


public class HbeBoard  extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	// 멤버변수
	private JLabel      jl[];
	private JTextField  jt[];
	private JTextArea   jta;
	private JScrollPane jsPane;
	private JButton     jb[];	
	private JPanel      jp[];
	
	public HbeBoard() {
		// JFrame 타이틀 세팅하기
		this.setTitle(":::게시판:::");
		
		// JFrame 레이아웃 매니저 보더 레이아웃으로 설정하기 
		this.getContentPane().setLayout(null);				
		jp = new JPanel[2];		
		jp[0] = new JPanel();
		jp[0].setBorder(new EtchedBorder());
		jp[0].setBounds(0, 0, 420, 420);
		jp[0].setBackground(Color.cyan);
		jp[0].setLayout(null);
		
		// 텍스트필드	
		jt = new JTextField[4];
		int ty = 80;
		for (int i=0; i < jt.length; i++) {
			
			if (2 == i || 3 == i) {
				
				if (2 == i) {
					jt[i] = new JTextField(80);	
					jt[i].setBounds(130, ty, 100, 30);
					jp[0].add(jt[i]);	
				}
				if (3 == i) {
					jta = new JTextArea();
					jta.setBounds(130, ty, 100, 30);
					jp[0].add(new JScrollPane(jta));
				}
											
			}else {
				jt[i] = new JTextField(200);	
				jt[i].setBounds(130, ty, 200, 30);
				jp[0].add(jt[i]);								
			}
			ty += 40;
		}		
		
		// 라벨
		jl = new JLabel[4];		
		int ly = 80;		
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel();
			jl[i].setOpaque(true);
			jl[i].setText(CodeUtil.board_label[i]);
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("맑은고딕", Font.BOLD, 15));			
			jl[i].setBounds(20, ly, 100, 30);
			ly += 40;
			jp[0].add(jl[i]);
		}
		
		// 게시판 라벨 
		JLabel jlM = new JLabel(); 
		jlM.setText("게시판");		
		jlM.setHorizontalAlignment(SwingConstants.CENTER);
		jlM.setFont(new Font("맑은고딕", Font.BOLD, 20));
		jlM.setBounds(20,20,362,40);
		jp[0].add(jlM);		
		
		
		// 버튼
		jb = new JButton[3];
		for (int i=0; i < jb.length ; i++ ){
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			jp[0].add(jb[i]);
		}
		
		jb[0].setText("비밀번호확인");
		jb[0].setBounds(240, 160, 110, 30);		
		jb[0].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		jb[1].setText("작성하기");
		jb[1].setBounds(20, 300, 250, 30);		
		jb[1].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		jb[2].setText("다시");
		jb[2].setBounds(280, 300, 100, 30);		
		jb[2].setFont(new Font("맑은고딕", Font.BOLD, 15));
				
		// JPanel JFrame 붙이기 
		this.getContentPane().add(jp[0]);		
		
		this.setSize(420, 420);
		this.setLocation(200, 100);
		this.setResizable(false);
		this.setVisible(true);

		// JFrame 닫기 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();						
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HbeBoard();
	}
}
