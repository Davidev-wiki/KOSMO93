package a.b.c.kosmo.mem.scr;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import a.b.c.common.CodeUtil;
import a.b.c.kosmo.board.scr.HbeBoardrAll;
import a.b.c.kosmo.mem.service.HbeMemberService;
import a.b.c.kosmo.mem.service.HbeMemberServiceImpl;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeMemberUpdate extends JFrame implements ActionListener {

	private static final long serialVersionUID = 9072198881429763467L;
	
	// 멤버변수
	private JLabel      jl[];
	private JTextField  jt[];
	private JTextField  jtFiled[];
	private JButton     jb[];
	private JPanel      jp[];
	private JComboBox<String> jc[];
	private JComboBox<String> jcBirth[];
	private JRadioButton        jr[];
	
	// 생성자 
	@SuppressWarnings("unchecked")
	public HbeMemberUpdate() {
		// JFrame 타이틀 세팅하기
		this.setTitle(":::수정/삭제:::");
		
		// JFrame 레이아웃 매니저 보더 레이아웃으로 설정하기 
		this.getContentPane().setLayout(null);				
		jp = new JPanel[2];		
		jp[0] = new JPanel();
		jp[0].setBorder(new EtchedBorder());
		jp[0].setBounds(0, 0, 420, 880);
		jp[0].setBackground(Color.cyan);
		jp[0].setLayout(null);
		
		// 콤보박스, 라이오버튼, 텍스트필드, 라벨 초기화 
		// 콤보박스 
		jc = new JComboBox[5];
		// 콤보박스 : 생년월일에서 월, 일 
		jcBirth = new JComboBox[5];
		// 라이오버튼 : 여자, 남자
		jr = new JRadioButton[2];
				
		// 텍스트필드
		jtFiled = new JTextField[6];
		jt = new JTextField[17];
		int ty = 80;
		for (int i=0; i < jt.length; i++) {
							
			if (8 == i || 10 == i || 13 == i) {
				System.out.println(">>>>>>>> " + i);				
				// 이메일
				if (8 == i) {					

					jtFiled[4] = new JTextField(20);
					jtFiled[4].setBackground(Color.white);
					jtFiled[4].setBounds(130, 400, 100, 30);
					
					JLabel jla = new JLabel("@");
					jla.setOpaque(true);
					jla.setBackground(Color.cyan);
					jla.setBounds(235, 400, 20, 30);
					
					jtFiled[5] = new JTextField(6);
					jtFiled[5].setBackground(Color.white);
					jtFiled[5].setBounds(260, 400, 100, 30);
					
					jp[0].add(jtFiled[4]);
					jp[0].add(jla);
					jp[0].add(jtFiled[5]);
				}
				// 취미
				if (10 == i) {
					jc[3] = new JComboBox<String>(CodeUtil.hobby_lavel);
					jp[0].add(jc[3]);
					jc[3].setBackground(Color.white);
					jc[3].setSelectedIndex(0);
					jc[3].setBounds(130,480,80,30);
				}
				// 직업
				if (13 == i) {
					jc[4] = new JComboBox<String>(CodeUtil.job_lavel);
					jp[0].add(jc[4]);
					jc[4].setBackground(Color.white);
					jc[4].setSelectedIndex(0);
					jc[4].setBounds(130,600,80,30);
				}
			}else {
				jt[i] = new JTextField(20);	
				jt[i].setBounds(130, ty, 140, 30);
				jp[0].add(jt[i]);
			}
			ty += 40;
		}
				
		// 라벨
		jl = new JLabel[17];		
		int ly = 80;		
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel();
			jl[i].setOpaque(true);
			jl[i].setText(CodeUtil.member_value[i]);
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("맑은고딕", Font.BOLD, 15));			
			jl[i].setBounds(20, ly, 100, 30);
			ly += 40;
			jp[0].add(jl[i]);
		}

		// 회원가입 라벨 
		JLabel jlM = new JLabel(); 
		jlM.setText("수정/삭제");		
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
		
		jb[0].setText("수정");
		jb[0].setBounds(100, 780, 100, 30);		
		jb[0].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		jb[1].setText("삭제");
		jb[1].setBounds(220, 780, 100, 30);		
		jb[1].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		
		// JTextFiled disable : 삭제여부, 등록일, 수정일
		jt[0].setEditable(false);
		jt[1].setEditable(false);
		jt[2].setEditable(false);
		jt[3].setEditable(false);
		jt[4].setEditable(false);
		jt[5].setEditable(false);
		jt[6].setEditable(false);
		jt[7].setEditable(false);		
		jt[11].setEditable(false);
		jt[12].setEditable(false);		
		jt[14].setEditable(false);
		jt[15].setEditable(false);
		jt[16].setEditable(false);		
		
		// JPanel JFrame 붙이기 
		this.getContentPane().add(jp[0]);
		
		this.setSize(420, 880);
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

	
	// 회원정보 조회하기 
	public void hmemSelect(String hnum) {
		System.out.println("HbeMemberUpdate hmemSelect() 함수 진입 >>> : " + hnum);
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);
		
		ArrayList<HbeMemberVO> aList = hs.hmemSelect(hvo);
		System.out.println("" + aList);
		if (aList !=null && aList.size() > 0) {			
	
			HbeMemberVO _hvo = aList.get(0);			
			
			// 회원번호
			jt[0].setText(_hvo.getHnum());
			// 회원이름 		
			jt[1].setText(_hvo.getHname());						
			// 회원 아이디
			jt[2].setText(_hvo.getHid());			
			// 회원 비밀번호
			jt[3].setText(_hvo.getHpw());			
			// 생년월일		
			jt[4].setText(_hvo.getHbirth());			
			// 성별
			String hgender = _hvo.getHgender();
			if ("01".equals(hgender)) {
				hgender = "여자";
			}else {
				hgender = "남자";
			}
			jt[5].setText(hgender);								
			// 전화번호
			jt[6].setText(_hvo.getHtel());
			// 핸드폰 번호
			jt[7].setText(_hvo.getHhp());

			// 이메일 
			String hemail = _hvo.getHemail();
			String email[] = hemail.split("@");					
			jtFiled[4].setText(email[0]);		
			jtFiled[5].setText(email[1]);			
			// 주소
			jt[9].setText(_hvo.getHaddr());			
			// 취미 		
			jc[3].setSelectedIndex(CodeUtil.getComboIndex(_hvo.getHhobby()));		
			// 사진						
			jt[11].setText(_hvo.getHphoto());			
			// 특기			
			jt[12].setText(_hvo.getHskill());			
			// 직업			getComboIndex
			jc[4].setSelectedIndex(CodeUtil.getComboIndex(_hvo.getHjob()));
			
			jt[14].setText(_hvo.getDeleteyn());
			jt[15].setText(_hvo.getInsertdate());
			jt[16].setText(_hvo.getUpdatedate());		
		}
	}
	
	// 회원정보 수정하기 
	public void hmemUpdate(String hnum, String hemail, String haddr, String hhobby, String hjob) {
		System.out.println("HbeMemberUpdate hmemUpdate() 함수 진입 >>> : " + hnum);
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);
		hvo.setHemail(hemail);
		hvo.setHaddr(haddr);
		hvo.setHhobby(hhobby);
		hvo.setHjob(hjob);			
		
		boolean bool = hs.hmemUpdate(hvo);
		
		if (bool) {
			System.out.println("회원정보 수정 성공  >>> : " + bool);
			JOptionPane.showMessageDialog(this, "회원정보 수정 성공 >>> :  ");
			
			this.setVisible(false);
			this.dispose();
			
			HbeMemberAll hmemAll = HbeMemberAll.getInstance();
			hmemAll.hmemSelectAll();
		}else {
			System.out.println("회원정보  수정 실패  >>> : " + bool);
		}
	}

	// 회원정보 삭제하기 
	public void hmemDelete(String hnum) {
		System.out.println("HbeMemberUpdate hmemDelete() 함수 진입 >>> : " + hnum);
		
		HbeMemberService hs = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHnum(hnum);	
		
		boolean bool = hs.hmemDelete(hvo);
		
		if (bool) {
			System.out.println("회원정보 삭제 성공  >>> : " + bool);
			JOptionPane.showMessageDialog(this, "회원정보 삭제 성공 >>> :  ");	
			
			this.setVisible(false);
			this.dispose();
			
			HbeMemberAll hmemAll = HbeMemberAll.getInstance();
			hmemAll.hmemSelectAll();
		}else {
			System.out.println("회원정보 삭제 실패  >>> : " + bool);
		}
	}
	
	public void valueClear() {
		System.out.println("HbeMember.valueClear() 함수 시작  >>> : ");
		for (int i=0; i < jt.length; i++) {			
			if ( 4 == i || 5 == i || 6 == i || 7 == i || 8 == i || 10 == i || 13 == i) {				
				jc[0].setSelectedIndex(0);
				jcBirth[0].setSelectedIndex(0);
				jcBirth[1].setSelectedIndex(0);
				jr[0].setSelected(true);
				jr[1].setSelected(false);
				jc[1].setSelectedIndex(0);
				jtFiled[0].setText("");
				jtFiled[1].setText("");
				jc[2].setSelectedIndex(0);				
				jtFiled[2].setText("");
				jtFiled[3].setText("");
				jtFiled[4].setText("");
				jtFiled[5].setText("");
				jc[3].setSelectedIndex(0);
				jc[4].setSelectedIndex(0);				
			}else {
				jt[i].setText("");	
			}
		}
	}
	
	// 액션 이벤트 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberUpdate.actionPerformed() 함수 시작  >>> : ");
		String jbCaption = e.getActionCommand();
		
		if (jb[0] == e.getSource()) {
			System.out.println("수정 버튼 클릭 >>> : " + jbCaption);
			// 회원번호
			String hnum = jt[0].getText();			
			// 이메일 
			String hemail = "";
			hemail = jtFiled[4].getText();
			hemail = hemail.concat("@");
			hemail = hemail.concat(jtFiled[5].getText());
			// 주소
			String haddr = jt[9].getText();
			// 취미 
			String hhobby = "";
			hhobby = CodeUtil.setHobby(String.valueOf(jc[3].getSelectedItem()));
			// 직업
			String hjob = "";			
			hjob = CodeUtil.setJob(String.valueOf(jc[4].getSelectedItem()));
			
			System.out.println("hnum >>> : " + hnum);		
			System.out.println("hemail >>> : " + hemail);
			System.out.println("haddr >>> : " + haddr);			
			System.out.println("hhobby >>> : " + hhobby);
			System.out.println("hjob >>> : " + hjob);
			
			this.hmemUpdate(hnum, hemail, haddr, hhobby, hjob);
		}
		if (jb[1] == e.getSource()) {	
			System.out.println("삭제 버튼 클릭 >>> : " + jbCaption);	
			
			// 회원번호
			String hnum = jt[0].getText();				
			System.out.println("hnum >>> : " + hnum);		
			
			this.hmemDelete(hnum);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberUpdate.main() 함수 시작  >>> : ");
		new HbeMemberUpdate();
	}
}
