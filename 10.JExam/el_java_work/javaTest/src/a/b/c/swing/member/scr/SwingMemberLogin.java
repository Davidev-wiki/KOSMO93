package a.b.c.swing.member.scr;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import a.b.c.swing.member.service.SwingMemberService;
import a.b.c.swing.member.service.SwingMemberServiceImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberLogin extends JFrame implements ActionListener {

	
	// 상수아닌가봄
	private static final long serialVersionUID = -152326483017758029L;
	
	// 멤버변수
	JPanel 			jp;
	JLabel[] 		jlM;
	JTextField		jtM;
	JPasswordField  jpfM;
	JButton[]		jbM;
	JButton			jbMem;
	
	// 생성자
	public SwingMemberLogin() {
		this.setTitle("회원 로그인");
		
		this.getContentPane().setLayout(null);
		jp = new JPanel();
		jp.setBackground(Color.CYAN);
		jp.setBorder(new EtchedBorder());
		jp.setBounds(0, 0, 310, 280);
		
		jp.setLayout(null);
		
		JPanel jpM = new JPanel();
		jpM.setLayout(null);
		jpM.setBounds(10, 30, 275, 180);
		jpM.setBackground(Color.YELLOW);
		jpM.setBorder(new TitledBorder("로그인"));
		jp.add(jpM);
	
		jlM  = new JLabel[2];
		jtM  = new JTextField();
		jpfM = new JPasswordField();
		jbM  = new JButton[2];

		for (int j=0; j < jlM.length; j++ ){
			jlM[j] = new JLabel();
			jlM[j].setHorizontalAlignment(SwingConstants.CENTER);
			jbM[j] = new JButton();
			jbM[j].addActionListener(this);
			jpM.add(jlM[j]);
			jpM.add(jbM[j]);
		}
		jlM[0].setText("아이디");
		jlM[1].setText("패스워드");
		
		jtM  = new JTextField(10);			
		jpfM = new JPasswordField(10);
		jpM.add(jtM);
		jpM.add(jpfM);

		jbM[0].setText("로그인");
		jbM[1].setText("로그아웃");
		
		jbMem = new JButton();
		jbMem.addActionListener(this);
		jbMem.setText("회원가입");
		jpM.add(jbMem);

		jlM[0].setBounds(10, 20, 100, 30);
		jtM.setBounds(110, 20, 150, 30);
		
		jlM[1].setBounds(10, 55, 100, 30);
		jpfM.setBounds(110, 55, 150, 30);
		
		jbM[0].setBounds(40, 92, 100, 30);
		jbM[1].setBounds(150, 92, 100, 30);
		jbMem.setBounds(40, 130, 210, 30);
						
		this.getContentPane().add(jp);

		// 화면 중앙에 배치하기 
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		this.setLocation(screenSize.width/2 - 150, screenSize.height/2 - 100);
		
		//this.setLocation(100, 100);
		this.setSize(310, 280);
		this.setResizable(false);
		this.setVisible(true);
		
		// JFrame 닫기
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
//				System.exit(0);
			}
		});	
	}
	
	// 함수
	// 로그인 체크
	public void smLoginCheck(String swid, String swpw) {
		System.out.println("SwingMemberLogin :: smLoginCheck() 시작 >>> : ");
		
		try {
			
			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwid(swid);
			svo.setSwpw(swpw);
			
			int nCnt = sms.smLoginCheck(svo);
			
			if (nCnt == 1) {
				System.out.println("아이디 :: " + svo.getSwid() + " 님 로그인 성공 !! ");
				
				JOptionPane.showMessageDialog(this, svo.getSwid() + " 님 로그인 성공  !! ");
				
				this.jtMSetText();
			}else {
				System.out.println("아이디 :: " + svo.getSwid() + " 님 로그인 실패 !! ");
				JOptionPane.showMessageDialog(this, svo.getSwid() + " 님 로그인 실패  !! ");
				this.jtMSetText();
			}
		}catch(Exception ex) {
			System.out.println("로그인처리 중 에러가 >>> : " + ex.getMessage());
		}
	}
	
	// 로그인시 JTextField, JPasswordField 초기화 
	public void jtMSetText(){
		jtM.setText("");
		jpfM.setText("");
	}
	
	// 로그아웃 체크
	public void smLogoutCheck() {
		System.out.println("SwingMemberLogin :: smLoginCheck() 시작 >>> : ");
		
		String message = "로그아웃 하시겠습니까 ? ";
		int conFirm = 0;
		try {
			
			conFirm = JOptionPane.showConfirmDialog(this, message);
			
			if (conFirm == JOptionPane.YES_OPTION) {
				this.setVisible(false);
				this.dispose();
//				System.exit(0);
			} else if (conFirm == JOptionPane.NO_OPTION) {			
			}			
		}catch(Exception ex) {
			System.out.println("로그아웃 처리 중 에러가 >>> : " + ex.getMessage());
		}
	}
	
	// 회원가입 호출
	public void smMember() {

		System.out.println("SwingMemberLogin :: smMember() 시작 >>> : ");
		
		try {			
			new SwingMember();
		}catch(Exception ex) {
			System.out.println("로그아웃 처리 중 에러가 >>> : " + ex.getMessage());
		}	
	}
	
	// 이벤트 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jbnt = (JButton)e.getSource();
		String loginCmd = jbnt.getText();

		if ("로그인".equals(loginCmd)){
			System.out.println("loginCmd >>> : " + loginCmd + " 시작 >>> : ");
			
			String swid = "";
			String swpw = "";
			
			swid = jtM.getText();
			swpw = jtM.getText();
			System.out.println("swid >>> : " + swid);
			System.out.println("swpw >>> : " + swpw);
			
			this.smLoginCheck(swid, swpw);
		}
		if ("로그아웃".equals(loginCmd)){
			System.out.println("loginCmd >>> : " + loginCmd + " 시작 >>> : ");	
			this.smLogoutCheck();
		}
		if ("회원가입".equals(loginCmd)){
			System.out.println("loginCmd >>> : " + loginCmd + " 시작 >>> : ");	
			this.smMember();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new SwingMemberLogin();
		
	}

}
