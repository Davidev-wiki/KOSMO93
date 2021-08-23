package a.b.c.kosmo.mem.scr;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import a.b.c.common.CodeUtil;
import a.b.c.kosmo.mem.service.KosmoMemberService;
import a.b.c.kosmo.mem.service.KosmoMemberServiceImpl;
import a.b.c.kosmo.mem.vo.KosmoMemberVO;

public class KosmoMemberAll extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -7773980409866362226L;
	
	DefaultTableModel dtm;
	JTable             jt;
	Object[][] fieldValue;
	String[]   columnName;
	
	JPanel[]    jpR;
	JLabel      jlR;
	JComboBox<String>  jcR;
	JTextField  jtR;
	JButton     jbR;
	JScrollPane jsPain;
	JButton     jtBtn[];
	JCheckBox   jcb[];
	
	String comboStr;
	
	// 생성자 
	@SuppressWarnings("unchecked")
	public KosmoMemberAll() {
		this.setTitle("회원검색하기");
		this.getContentPane().setLayout(new BorderLayout(10, 10));

		jpR = new JPanel[3];
		jlR = new JLabel("조회조건");
		jlR.setHorizontalAlignment(SwingConstants.CENTER);

		jcR = new JComboBox<String>(CodeUtil.combo_cpation);
		jcR.setSelectedIndex(0);
		jcR.addActionListener(this);

		jtR = new JTextField();
		jtR.setVisible(false);
		jbR = new JButton("조회");
		jbR.addActionListener(this);

		for (int i=0; i < jpR.length; i++ ){
			jpR[i] = new JPanel();
			jpR[i].setLayout(new BorderLayout());
		}

		// JTable 붙이는 규칙 
		columnName = CodeUtil.member_value;
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt = new JTable(dtm);
		jt.setEnabled(true);
		jsPain = new JScrollPane(jt);

		jpR[0].add(jlR);
		jpR[0].add(jcR);		
		jpR[0].add(jtR);
		jpR[0].add(jbR);
		jpR[0].setLayout(new GridLayout(1, 4, 5, 5));
		jpR[1].add(jsPain);
		
		jpR[2] = new JPanel();
		jpR[2].setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		jtBtn = new JButton[4];		
		for (int i=0; i < jtBtn.length; i++) {
			jtBtn[i] = new JButton(CodeUtil.jbtn_cpation[i]);
			jtBtn[i].addActionListener(this);
			jpR[2].add(jtBtn[i]);
		}

		this.getContentPane().add(jpR[0], BorderLayout.NORTH);
		this.getContentPane().add(jpR[1], BorderLayout.CENTER);
		this.getContentPane().add(jpR[2], BorderLayout.SOUTH);

		this.setLocation(100, 100);
		this.setSize(1300,540);
		this.setResizable(false);
		this.setVisible(true);
		
		// JFrame 클로우즈 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
		});
	}
	
	// JTable 프린트 
	public void jtablePrint(ArrayList<KosmoMemberVO> aList, int rowCnt, int columnCnt) {
		
		fieldValue = new Object[rowCnt][columnCnt];

		for (int i=0; i < rowCnt; i++ ){
			
			KosmoMemberVO _hvo = aList.get(i);
			fieldValue[i][0] = _hvo.getHnum();
			fieldValue[i][1] = _hvo.getHname();
			fieldValue[i][2] = _hvo.getHid();
			fieldValue[i][3] = _hvo.getHpw();
			fieldValue[i][4] = _hvo.getHbirth();
			fieldValue[i][5] = _hvo.getHgender();
			fieldValue[i][6] = _hvo.getHtel();
			fieldValue[i][7] = _hvo.getHhp();								
			fieldValue[i][8] = _hvo.getHemail();
			fieldValue[i][9] = _hvo.getHaddr();
			fieldValue[i][10] = CodeUtil.hobby(_hvo.getHhobby());
			fieldValue[i][11] = _hvo.getHphoto();
			fieldValue[i][12] = _hvo.getHskill();
			fieldValue[i][13] = CodeUtil.hobby(_hvo.getHjob());
			fieldValue[i][14] = _hvo.getDeleteyn();
			fieldValue[i][15] = _hvo.getInsertdate();
			fieldValue[i][16] = _hvo.getUpdatedate();	
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// ComboBox 이벤트 처리
		if (jcR == e.getSource()) {
			comboStr = (String)jcR.getSelectedItem();
			if ("전체".equals(comboStr)){
				jtR.setVisible(false);				
			}
			if ("아이디".equals(comboStr)){
				jtR.setVisible(true);
			}
			if ("이름".equals(comboStr)){
				jtR.setVisible(true);
			}
		}
		
		// 조회 버튼 이벤트 
		if (jbR == e.getSource()) {
			String searchStr = "";

			if ("전체".equals(comboStr)){
				searchStr = jtR.getText();
				System.out.println("searchStr >>> : " + searchStr);

				int columnCnt = columnName.length;
		
				try{
					KosmoMemberService hms = new KosmoMemberServiceImpl();
					ArrayList<KosmoMemberVO> aList =  hms.hmemSelectAll();
				
					int rowCnt = aList.size();
					System.out.println("rowCnt >>> : " + rowCnt);
			
					this.jtablePrint(aList, rowCnt, columnCnt);
					
				}
				catch (Exception ex){
					System.out.println("에러가 >>> : " + ex.getMessage());
				}		

				dtm = new DefaultTableModel(fieldValue, columnName);
				jt.setModel(dtm);
				
				return;
			}
			if ("이름".equals(comboStr)){
				searchStr = jtR.getText();
				System.out.println("searchStr >>> : " + searchStr);

				int columnCnt = columnName.length;
		
				try{
					KosmoMemberService hms = new KosmoMemberServiceImpl();
					KosmoMemberVO hvo = null;
					hvo = new KosmoMemberVO();
					hvo.setHname(searchStr);
					
					ArrayList<KosmoMemberVO> aList =  hms.hmemSelectName(hvo);
				
					int rowCnt = aList.size();
					System.out.println("rowCnt >>> : " + rowCnt);

					this.jtablePrint(aList, rowCnt, columnCnt);
				}
				catch (Exception ex){
					System.out.println("에러가 >>> : " + ex.getMessage());
				}		

				dtm = new DefaultTableModel(fieldValue, columnName);
				jt.setModel(dtm);
				
				return;
			}
			if ("아이디".equals(comboStr)){
				searchStr = jtR.getText();
				System.out.println(" searchStr >>> : " + searchStr);

				int columnCnt = columnName.length;
		
				try{
					KosmoMemberService hms = new KosmoMemberServiceImpl();
					KosmoMemberVO hvo = null;
					hvo = new KosmoMemberVO();
					hvo.setHid(searchStr);
					
					ArrayList<KosmoMemberVO> aList =  hms.hmemSelectId(hvo);
				
					int rowCnt = aList.size();
					System.out.println("rowCnt >>> : " + rowCnt);

					this.jtablePrint(aList, rowCnt, columnCnt);
				}
				catch (Exception ex){
					System.out.println("에러가 >>> : " + ex.getMessage());
				}		

				dtm = new DefaultTableModel(fieldValue, columnName);
				jt.setModel(dtm);
				
				return;
			}
		}
		
		// 버튼 
		if (jtBtn[0] == e.getSource()) {
			System.out.println("회원 가입하기 >>> : ");
		}
		if (jtBtn[1] == e.getSource()) {
			System.out.println("회원 수정하기 >>> : ");
		}
		if (jtBtn[2] == e.getSource()) {
			System.out.println("회원 삭제하기 >>> : ");
		}
		if (jtBtn[3] == e.getSource()) {
			System.out.println("회원 목록보기 >>> : ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KosmoMemberAll();
	}
}
