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

	// 상수
	private static final long serialVersionUID = 1223945384484229538L;

	// 멤버변수
	private JLabel la1, la2, la3, la4, la5, la6, la7;
	private JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton bt1, bt2, bt3, bt4;
	private JPanel pa1, pa2;

	// 생성자
	public SwingMember() {
		
		// JFrame 타이틀 세팅(타이틀 : 창 상단 파란색라인에 나오는 이름)
		this.setTitle("SwingMember");
		// JFrame 레이아웃 매니저 "Border" 로 설정하기(중앙+동서남북)
		this.setLayout(new BorderLayout());
		
		// 라벨, 텍스트필드 삽입용 패널 '패널1'생성
		pa1 = new JPanel();
		// '패널1'의 색상 : cyan(하늘색)
		pa1.setBackground(Color.cyan);

		// 버튼 삽입용 패널 '패널2' 생성
		pa2 = new JPanel();
		// '패널2' 색상 : blue(파란색) 
		pa2.setBackground(Color.blue);
		
		// '패널1'의 레이아웃 세팅 
		//  : Grid (행렬or테이블형태 : 7행, 2열)
		pa1.setLayout(new GridLayout(7, 2));
		
		// 라벨 7개 생성
		la1 = new JLabel(" 고객번호 ", JLabel.CENTER);
		la2 = new JLabel(" 고객명 ", JLabel.CENTER);
		la3 = new JLabel(" 아이디 ", JLabel.CENTER);
		la4 = new JLabel(" 패스워드 ", JLabel.CENTER);
		la5 = new JLabel(" 삭제여부 ", JLabel.CENTER);
		la6 = new JLabel(" 등록일 ", JLabel.CENTER);
		la7 = new JLabel(" 수정일 ", JLabel.CENTER);
		
		// 길이가 10인 텍스트필드 7개 생성
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);

		// '패널 1'에  '라벨1'과 '텍스트필드1'을 추가
		//          '라벨2'와 '텍스트필드2'을 추가
		//          '라벨3'와 '텍스트필드3'을 추가
		//          '라벨4'와 '텍스트필드4'을 추가
		//          '라벨5'와 '텍스트필드5'을 추가
		//          '라벨6'와 '텍스트필드6'을 추가
		//          '라벨7'와 '텍스트필드7'을 추가
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
		//  : Flow(한 줄로 나열된 형태)
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));

		// 총 4개의 버튼 생성 버튼1, 버튼2, 버튼3, 버튼4
		bt1 = new JButton("조회");
		bt2 = new JButton("저장");
		bt3 = new JButton("수정");
		bt4 = new JButton("삭제");

		// '패널2'에 버튼 4개를 추가
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);

		// '텍스트필드 5,6,7번'은 수정가능여부 : 'F'(불가)로 설정
		// 텍스트필드 5, 6, 7 : 삭제여부, 등록일, 수정일
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);

		// '패널 1'과 '패널 2' 를 JFrame에 추가하되,
		//  각각 '중앙', '하단'에 추가한다.
		this.add(pa1, BorderLayout.CENTER);
		this.add(pa2, BorderLayout.SOUTH);

		// '버튼 1 : 조회'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		// '버튼 2 : 조회'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		// '버튼 3 : 조회'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		// '버튼 4 : 조회'에 이벤트리스너를 추가한다. (이벤트핸들러를 이용하는)
		bt1.addActionListener(new EventHandler());
		bt2.addActionListener(new EventHandler());
		bt3.addActionListener(new EventHandler());
		bt4.addActionListener(new EventHandler());

		// 새로 생성하는 JFrame의 사이즈를  row 300, col 200 으로 설정.
		this.setSize(300, 250);
		// 새로 생성하는 JFrame의 위치를 400, 200 위치로 설정
		this.setLocation(400, 200);
		// 새로 생성하는 JFrame을 시각적으로 보이게 함.
		this.setVisible(true);
		
		// JFrame 종료에 관한 설정 (원리는 아직 알 수 없음)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});

	}
	
	// 이벤트가 발생하는 것을 지켜보고 있다가 
	// 이벤트가 발생하면 알맞는 작업을 실행시키는 클래스 
	class EventHandler implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {

			// e.getActionCommand? => api 서칭
			// String.valueof => String으로 바꿔주는 함수
			// 의역 : e.getActionCommand 실행된 액션이벤트의 커맨드(어떤 종류가 입력되었는지를 나타내는 것?)
			String btnCmd = String.valueOf(e.getActionCommand());
			
			// 입력된 e.getActionCommand : 조회 버튼이 눌린 경우
			if ("조회".contentEquals(btnCmd)) {
				System.out.println("[조회] 다음의 이벤트가 발생됨  >> " + btnCmd);
				
				// 회원넘버의 값을 담을 변수 swnum을 사용 전 초기화
				String swnum = "";
				// 텍스트필드1에 입력된 값을 swnum변수에 담기
				swnum = tf1.getText();
				System.out.println("입력된 회원넘버 swnum : " + swnum);

				try {
					
					// 인터페이스를 통한 작업 전 초기화
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					// ValueOf 객체를 새로 만들어 회원넘버인 swnum을 세팅하기.
					SwingMemberVO svo = null;
					svo = new SwingMemberVO();
					svo.setSwnum(swnum);

					// 하기에 생성한 사용자 정의 함수
					// 모든 TextField를 빈 값("")으로 초기화 (사용 전 초기화인가?)
					jtextFileClear();
					
					// VO객체 타입의 배열을 생성, 내부에 인터페이스를 통해 조회한 결과를 담는다. 
					ArrayList<SwingMemberVO> aList = sms.smSelect(svo);
					
					// 배열의 값이 null이 아니면서 배열에 1개 이상의 데이터가 존재하는 경우)
					if (aList != null && aList.size() > 0) {
						
						// 배열의 내부에 있는 객체의 개수만큼(객체마다) 반복한다.
						for (int i = 0; i < aList.size(); i++) {
							
							// 새로 만든 VO객체(_svo)에다가
							// aList 배열의 i번째 있는 객체(위에 초기화한 svo)의 값을 넣어준다.  
							SwingMemberVO _svo = aList.get(i);
							
							// 데이터가 이전된 새로운 객체 '_svo'담긴 값을 
							// get함수로 가져와서 텍스트 필드에 각각 올바른 값을 넣어준다.
							tf1.setText(_svo.getSwnum());
							tf2.setText(_svo.getSwname());
							tf3.setText(_svo.getSwid());
							tf4.setText(_svo.getSwpw());
							tf5.setText(_svo.getDeleteyn());
							tf6.setText(_svo.getInsertdate());
							tf7.setText(_svo.getUpdatedate());
						}
					} else {
						System.out.println("배열에서 데이터를 가져와 세팅하는 중 에러발생!");
					}

				} catch (Exception e1) {
					System.out.println("조회중 Error 발생! : " + e1.getMessage());
				}

			}
			
			// 입력된 e.getActionCommand : 저장 버튼이 눌린 경우
			if ("저장".equals(btnCmd)) {
				System.out.println("[저장] 다음의 이벤트가 발생됨  >> " + btnCmd);
				
				String swnum = "";
				String swname = "";
				String swid = "";
				String swpw = "";
				
				// 채번함수가 중복되어 진행불가?
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
						System.out.println("회원정보 입력 성공! : : " + bool);
					} else {
						System.out.println("회원정보 입력 실패! : : " + bool);
					}
					
				} catch (Exception e1) {
					System.out.println("저장할려는에 에러가 발생했어요.. : " + e1);
				} 
				
			}

			// 입력된 e.getActionCommand : 수정 버튼이 눌린 경우
			if ("수정".equals(btnCmd)) {
				System.out.println("[수정] 다음의 이벤트가 발생됨  >> " + btnCmd);
				
				// 이름만 수정하는 것으로 가정.
				String swnum = "";
				String swname = "";
				swnum = tf1.getText();
				swname = tf2.getText();
				
				System.out.println("입력된 swnum : " + swnum);
				System.out.println("입력된 swname : " + swname);
				
				try {
					
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					SwingMemberVO svo = new SwingMemberVO();
					svo.setSwnum(swnum);
					svo.setSwname(swname);
					
					jtextFileClear();
					
					boolean bool = sms.smUpdate(svo);
					
					if (bool) {
						System.out.println("회원정보 수정이 완료되었습니다! >> " + bool);
					} else {
						System.out.println("회원정보 수정에 실패했습니다! >> " + bool);
					}
					
				} catch(Exception e2) {
					System.out.println("수정하는 과정에서 에러가 발생했어요! >> " + e2.getMessage() );
				}
				
			}
			
			// 입력된 e.getActionCommand : 삭제 버튼이 눌린 경우
			if ("삭제".equals(btnCmd)) {
				System.out.println("[삭제] 다음의 이벤트가 발생됨  >> " + btnCmd);

				String swnum = "";
				swnum = tf1.getText();
				System.out.println("삭제할 회원 번호 : " + swnum);
				
				try {
					
					SwingMemberService sms = new SwingMemberServiceImpl();
					
					SwingMemberVO svo = new SwingMemberVO();
					svo.setSwnum(swnum);
					
					jtextFileClear();
					
					boolean bool = sms.smDelete(svo);
					
					if(bool) {
						System.out.println("회원정보 삭제 성공했어요 ! : " + bool);
					}else {
						System.out.println("회원정보 삭제 실패했어요 ! : " + bool);
					}
					
				} catch(Exception e3) {
					System.out.println("삭제 과정에서 에러가 발생했어요 : " + e3.getMessage());
				}
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
		
		System.out.println("회원정보 조회 프로그램을 실행합니다");
		new SwingMember();
	}

}


























