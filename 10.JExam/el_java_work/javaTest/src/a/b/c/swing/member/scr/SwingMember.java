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
import a.b.c.swing.member.vo.SwingMemberVO;

// class evnetHandler 삭제
// [전체조회] [초기화] [종료] 기능 3개 버튼 추가 
public class SwingMember extends JFrame implements ActionListener {

	// 상수
	private static final long serialVersionUID = 1223945384484229538L;

	// 멤버변수
	private JLabel la1, la2, la3, la4, la5, la6, la7;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton bt1, bt2, bt3, bt4, bt5, bt6;
	private JPanel pa1, pa2;
	private JButton btClose;

	// 생성자
	public SwingMember() {

		System.out.println("생성자가 호출되었습니다. 프로그램이 초기화됩니다.");
		// JFrame 타이틀 세팅(타이틀 : 창 상단 파란색라인에 나오는 이름)
		System.out.println("JFrame 타이틀을 세팅합니다.");
		this.setTitle("SwingMember");
		// JFrame 레이아웃 매니저 "Border" 로 설정하기(중앙+동서남북)
		System.out.println("JFrame 레이아웃을 세팅합니다.");
		this.setLayout(new BorderLayout());

		// 라벨, 텍스트필드 삽입용 패널 '패널1'생성
		System.out.println("JFrame 패널을 세팅합니다.");
		pa1 = new JPanel();
		// '패널1'의 색상 : cyan(하늘색)
		pa1.setBackground(Color.cyan);

		// 버튼 삽입용 패널 '패널2' 생성
		pa2 = new JPanel();
		// '패널2' 색상 : blue(파란색)
		pa2.setBackground(Color.blue);

		// '패널1'의 레이아웃 세팅
		// : Grid (행렬or테이블형태 : 7행, 2열)
		System.out.println("패널1 레이아웃을 세팅합니다.");
		pa1.setLayout(new GridLayout(7, 2));

		// 라벨 7개 생성
		System.out.println("라벨을 생성합니다.");
		la1 = new JLabel(" 고객번호 ", JLabel.CENTER);
		la2 = new JLabel(" 고객명 ", JLabel.CENTER);
		la3 = new JLabel(" 아이디 ", JLabel.CENTER);
		la4 = new JLabel(" 패스워드 ", JLabel.CENTER);
		la5 = new JLabel(" 삭제여부 ", JLabel.CENTER);
		la6 = new JLabel(" 등록일 ", JLabel.CENTER);
		la7 = new JLabel(" 수정일 ", JLabel.CENTER);

		// 길이가 10인 텍스트필드 7개 생성
		System.out.println("텍스트필드를 생성합니다.");
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);

		// '패널 1'에 '라벨1'과 '텍스트필드1'을 추가
		// '라벨2'와 '텍스트필드2'을 추가
		// '라벨3'와 '텍스트필드3'을 추가
		// '라벨4'와 '텍스트필드4'을 추가
		// '라벨5'와 '텍스트필드5'을 추가
		// '라벨6'와 '텍스트필드6'을 추가
		// '라벨7'와 '텍스트필드7'을 추가
		System.out.println("라벨과 텍스트필드를 패널에 추가합니다.");
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

		// '패널 2'의 레이아웃 세팅
		// : Flow(한 줄로 나열된 형태)
		System.out.println("패널2 레이아웃을 세팅합니다.");
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));

		// 총 4개의 버튼 생성 버튼1, 버튼2, 버튼3, 버튼4
		System.out.println("버튼을 생성합니다.");
		bt1 = new JButton("조회");
		bt2 = new JButton("저장");
		bt3 = new JButton("수정");
		bt4 = new JButton("삭제");
		bt5 = new JButton("전체조회");
		bt6 = new JButton("초기화");
		btClose = new JButton("프로그램종료");

		// '패널2'에 버튼 4개를 추가
		System.out.println("버튼을 세팅합니다.");
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);
		pa2.add(bt5);
		pa2.add(bt6);
		pa2.add(btClose);

		// '텍스트필드 5,6,7번'은 수정가능여부 : 'F'(불가)로 설정
		// 텍스트필드 5, 6, 7 : 삭제여부, 등록일, 수정일
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);

		// '버튼 1 : 조회'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		// '버튼 2 : 저장'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		// '버튼 3 : 수정'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		// '버튼 4 : 삭제'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		System.out.println("버튼에 이벤트를 추가합니다.");
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		btClose.addActionListener(this);

		// '패널 1'과 '패널 2' 를 JFrame에 추가하되,
		// 각각 '중앙', '하단'에 추가한다.
		System.out.println("JFrame에 패널을 붙입니다..");
		this.getContentPane().add(pa1, BorderLayout.CENTER);
		this.getContentPane().add(pa2, BorderLayout.SOUTH);

		System.out.println("JFrame의 사이즈를 세팅합니다.");
		// 새로 생성하는 JFrame의 사이즈를 row 580, col 250 으로 설정.
		this.setSize(580, 250);
		// 새로 생성하는 JFrame의 위치를 400, 200 위치로 설정
		this.setLocation(400, 200);
		// 새로 생성하는 JFrame을 시각적으로 보이게 함.
		this.setVisible(true);
		// 사용자가 사이즈를 변경할 수 있게 하는 옵션
		this.setResizable(false);

		// JFrame 종료에 관한 설정 (원리는 아직 알 수 없음)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
				System.out.println("프로그램을 종료합니다.");
			}
		});
		System.out.println("생성자가 종료됩니다.");
	}

	// 전체 조회 - 전체 조회를 위한 클래스, SwingMemberAll() 함수로 보내기
	public void smSelectAll() {
		System.out.println("SwingMember :: smSelectAll() 시작함");

		try {
			// 클래스 생성해야 함
			new SwingMemberAll();
		} catch (Exception ex) {
			System.out.println("조건 중 에러가 >>> : " + ex.getMessage());
		}
	}

	// 조건 조회 - 회원 번호 입력시 데이터에서 값을 가지고 와서 보여주는 기능의 함수.
	public void smSelect(String swnum) {
		System.out.println("SwingMember.smSelect()진입함");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);

			// 화면 텍스트필드 클리어
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
			System.out.println("조건 중 에러가 >>> : " + ex.getMessage());
		}
	}

	// 등록 - 회원 번호, 회원 이름, 회원 아이디, 회원 패스워드 입력시 데이터베이스에 저장하는 기능의 함수.
	public void smInsert(String swnum, String swname, String swid, String swpw) {
		System.out.println("SwingMember.smInsert()진입함");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			svo.setSwname(swname);
			svo.setSwid(swid);
			svo.setSwpw(swpw);

			// 화면 텍스트필드 클리어
			jtextFileClear();

			boolean bool = sms.smInsert(svo);

			if (bool) {
				System.out.println("회원 정보 입력 성공 >>> : " + bool);

				JOptionPane.showMessageDialog(this, "회원정보 입력 성공 >>> :  ");

				this.smSelect(swnum);
			} else {
				System.out.println("회원 정보 입력 실패 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 입력 실패 >>> :  ");
			}
		} catch (Exception ex) {
			System.out.println("등록 중 에러가 >>> : " + ex.getMessage());
		}
	}

	// 수정 - 회원 번호, 회원 이름 입력시 데이터베이스에 데이터가 수정되는 기능의 함수.
	public void smUpdate(String swnum, String swname) {
		System.out.println("SwingMember.smUpdate()진입함");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			svo.setSwname(swname);

			// 화면 텍스트필드 클리어
			jtextFileClear();

			boolean bool = sms.smUpdate(svo);

			if (bool) {
				System.out.println("회원 정보 수정 성공 >>> : " + bool);

				JOptionPane.showMessageDialog(this, "회원정보 수정 성공!");

				this.smSelect(swnum);
			} else {
				System.out.println("회원 정보 수정 실패 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 수정 실패!");
			}
		} catch (Exception ex) {
			System.out.println("수정 중 에러가 발생했어요 : " + ex.getMessage());
		}
	}

	// 삭제 - 회원 번호 입력시 데이터베이스에서 조회할 수 없도록 DELETEYN : 'N'으로 변경하는 기능의 함수.
	public void smDelete(String swnum) {
		System.out.println("SwingMember.smDelete()진입함");

		try {

			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);

			// 화면 텍스트필드 클리어
			jtextFileClear();

			boolean bool = sms.smDelete(svo);

			if (bool) {
				System.out.println("회원 정보 삭제 성공 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 삭제 성공 >>> :  ");
			} else {
				System.out.println("회원 정보 삭제 실패 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 실패 성공 >>> :  ");
			}

		} catch (Exception ex) {
			System.out.println("삭제 중 에러가 >>> : " + ex.getMessage());
		}
	}

	// 이벤트 발생시 수행 로직
	// ActionListener를 구현하는 별도의 클래스 eventHandler 대신
	// ActionListener의 함수를 직접 구현함.
	@Override
	public void actionPerformed(ActionEvent e) {
		String btnCmd = String.valueOf(e.getActionCommand());

		if ("조회".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			String swnum = "";

			try {

				swnum = tf1.getText();
				System.out.println("swnum >>> : " + swnum);

				// 조건 조회 함수 호출
				this.smSelect(swnum);

			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("저장".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			String swnum = "";
			String swname = "";
			String swid = "";
			String swpw = "";

			try {
					//강사님 코드 :  SwingMemberChabun.ymdNum();
				//a.b.c.board.common.KckBoardChabun.gubunNum()
				swnum = SwingMemberChabun.ymdNum();
				swname = tf2.getText();
				swid = tf3.getText();
				swpw = tf4.getText();
				System.out.println("swnum >>> : " + swnum);
				System.out.println("swname >>> : " + swname);
				System.out.println("swid >>> : " + swid);
				System.out.println("swpw >>> : " + swpw);

				// 등록 함수 호출
				this.smInsert(swnum, swname, swid, swpw);

			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("수정".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			// 이름만 수정하기
			String swnum = "";
			String swname = "";

			try {

				swnum = tf1.getText();
				swname = tf2.getText();

				System.out.println("swnum >>> : " + swnum);
				System.out.println("swname >>> : " + swname);

				// 수정 함수 호출
				this.smUpdate(swnum, swname);

			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}

		}
		if ("삭제".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			String swnum = "";

			try {

				swnum = tf1.getText();
				System.out.println("swnum >>> : " + swnum);

				// 삭제 함수 호출
				this.smDelete(swnum);

			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("전체조회".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			try {
				// 전체조회 함수 호출
				this.smSelectAll();

			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("초기화".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			try {
				// 초기화 함수 호출
				this.jtextFileClear();

			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("프로그램종료".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");

			try {
				System.exit(0);
			} catch (Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}

	}

	public void jtextFileClear() {

		// TextField 를 ""으로 (빈 값)초기화
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
		System.out.println("Swing Member 프로그램이 시작됩니다.");
		System.out.println("회원정보 조회 프로그램을 실행합니다");

		// 생성자 호출
		new SwingMember();
	}
}
