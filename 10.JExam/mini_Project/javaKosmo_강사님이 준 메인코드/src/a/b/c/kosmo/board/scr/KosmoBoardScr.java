package a.b.c.kosmo.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.kosmo.board.service.KosmoBoardService;
import a.b.c.kosmo.board.service.KosmoBoardServiceImpl;
import a.b.c.kosmo.board.vo.KosmoBoardVO;
import a.b.c.common.KosmoBoardChabun;


public class KosmoBoardScr {
	
	// �Խ������� ��
	public static final String[] insert_label = {"������", "�ۼ���", "�۳���", "��й�ȣ"};
	public static final String[] update_label = {"�۹�ȣ", "������", "�۳���"};	

	// ��ü ��ȸ
	public static void hboardSelectAll(){
		
		try {
			// ���� ȣ�� 
			KosmoBoardService hs = new KosmoBoardServiceImpl();	

			ArrayList<KosmoBoardVO> aList = hs.hboardSelectAll();

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					KosmoBoardVO hvo = aList.get(i);	
					KosmoBoardVO.printHbeBoardVO(hvo);
				}		
			}else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// ���� ��ȸ
	public static void hboardSelect(String sVal[]){
		System.out.println("HbeBoardScr.hboardSelect() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ��ȸ >>> : " + sVal[0]);
				
		try {
			// ���� ȣ�� 
			KosmoBoardService hs = new KosmoBoardServiceImpl();	
			KosmoBoardVO hvo = null;
			hvo = new KosmoBoardVO();
			hvo.setBnum(sVal[0]);

			ArrayList<KosmoBoardVO> aList = hs.hboardSelect(hvo);

			if (aList !=null && aList.size() > 0) {
				for (int i=0; i < aList.size(); i++) {				
					KosmoBoardVO _hvo = aList.get(i);	
					KosmoBoardVO.printHbeBoardVO(_hvo);
				}		
			}else {
				System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
			}
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
		
	}
	
	// �� �Է�
	public static void hboardInsert(String sVal[]){
		System.out.println("HbeBoardScr.hboardInsert() �Լ� ���� >>> : ");
		System.out.println("ȸ������ �Է� >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(insert_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = KosmoBoardChabun.gubunNum();
		String bsubject = sVal[0];
		String bwriter = sVal[1];
		String bpw = sVal[2];
		String bcontents = sVal[3];
		
		try {
			// ���� ȣ�� 
			KosmoBoardService hs = new KosmoBoardServiceImpl();	
			KosmoBoardVO hvo = null;
			hvo = new KosmoBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBwriter(bwriter);			
			hvo.setBcontents(bcontents);
			hvo.setBpw(bpw);
			
			int nCnt = hs.hboardInsert(hvo);					
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ��� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ��� ����.");
			}			
		}catch(Exception e) {
			System.out.println("��� �� ������ >>> : " + e.getMessage());
		}
	}
	
	// �� ���� 
	public static void hboardUpdate(String sVal[]){
		System.out.println("HbeBoardScr.hboardUpdate() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ���� >>> : " + sVal.length);
		
		for (int i=0; i < sVal.length; i++){
			System.out.println(update_label[i] + " >>> : " + sVal[i]);
		}
		
		String bnum = sVal[0];		
		String bsubject = sVal[1];
		String bcontents = sVal[2];
		
		try {
			// ���� ȣ�� 
			KosmoBoardService hs = new KosmoBoardServiceImpl();	
			KosmoBoardVO hvo = null;
			hvo = new KosmoBoardVO();
			
			hvo.setBnum(bnum);
			hvo.setBsubject(bsubject);
			hvo.setBcontents(bcontents);
						
			int nCnt = hs.hboardUpdate(hvo);	
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ���� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ���� ����.");
			}			
		}catch(Exception e) {
			System.out.println("���� �� ������ >>> : " + e.getMessage());
		}				 
	}
	
	// �� ����
	public static void hboardDelete(String sVal[]){
		System.out.println("HbeBoardScr.hboardDelete() �Լ� ���� >>> : ");
		System.out.println("ȸ������ ���� >>> : " + sVal[0]);

		try {
			// ���� ȣ�� 
			KosmoBoardService hs = new KosmoBoardServiceImpl();	
			KosmoBoardVO hvo = null;
			hvo = new KosmoBoardVO();
			
			hvo.setBnum(sVal[0]);
						
			int nCnt = hs.hboardDelete(hvo);	
			
			if (nCnt > 0) {				
				System.out.println("�Խñ� " + nCnt + " �� ���� �Ǿ����ϴ�.");				
			}else {
				System.out.println("�Խñ� ���� ����.");
			}			
		}catch(Exception e) {
			System.out.println("���� �� ������ >>> : " + e.getMessage());
		}				 
	}
	
	
	// �Խ��� INSERT, UPDATE ���� �Է��ϱ� 
	public static String[] getParameter(int iVal) {
	
		String sVal[] = null;
		
		if (2 == iVal || 5 == iVal) {
			sVal = new String[1];
			
			System.out.println("��ȸ �Ǵ� ������ �Խ��� �۹�ȣ �Է��Ͻÿ� >>> : ");
			
			Scanner sc25 = new Scanner(System.in);
			
			sVal[0] = sc25.next();
			
			System.out.println("��ȸ �Ǵ� ������ �Խ��� ������ >>> : " + sVal[0]);
		}
		
		// �Խ��� ��� �Ķ���� 
		if (3 == iVal) { 			
			
			sVal = new String[insert_label.length];	
			
			Scanner sc3 = new Scanner(System.in);
			
			System.out.println("����� �Խ��������� �Է��Ͻÿ� >>> : " + insert_label.length);
			System.out.println("����� �Խ��� �迭�� ���� >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				System.out.println(insert_label[i] + "��(��) �Է��Ͻÿ� :: " );
				sVal[i] = sc3.next();
				System.out.println(insert_label[i] + " ������ >>> : " + sVal[i]);
			}
		}			
		
		// �Խ��� ���� �Ķ���� 
		if (4 == iVal) { 
		
			sVal = new String[update_label.length];				
			
			Scanner sc4 = new Scanner(System.in);
			
			System.out.println("������ �Խ��������� �Է��Ͻÿ� >>> : " + update_label.length);
			System.out.println("������ �Խ������� �迭�� ���� >>> : " + sVal.length);
			
			for (int i=0; i < sVal.length; i++) {
				
				System.out.println(update_label[i] + "��(��) �Է��Ͻÿ� :: " );
				
				sVal[i] = sc4.next();
				
				System.out.println(update_label[i] + " ������ >>> : " + sVal[i]);
			}
		}
		
		return sVal;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Խ��� CRUD::ISUD �׽�Ʈ >>> : ");		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n�Խ������� ��ü��ȸ:1, ������ȸ:2, ���:3, ����:4, ����:5, ����:0");
			
			int isud = sc.nextInt();	
			if (0 == isud) {
				System.out.println("���α׷� ���� !!"); 
				break;	
			}
			 
			
			switch(isud) {
				case 1:		
					try {
						KosmoBoardScr.hboardSelectAll();
					}catch(Exception e) {						
					}
					break;
					
				case 2:				
					try {
						String sVal2[] = KosmoBoardScr.getParameter(2);
						KosmoBoardScr.hboardSelect(sVal2);
					}catch(Exception e) {						
					}								
					break;
					
				case 3:
					try {
						String sVal3[] = KosmoBoardScr.getParameter(3);
						KosmoBoardScr.hboardInsert(sVal3);
					}catch(Exception e) {						
					}
					break;
					
				case 4:
					try {
						String sVal4[] = KosmoBoardScr.getParameter(4);
						KosmoBoardScr.hboardUpdate(sVal4);
					}catch(Exception e) {						
					}				
					break;
					
				case 5:				
					try {
						String sVal5[] = KosmoBoardScr.getParameter(5);
						KosmoBoardScr.hboardDelete(sVal5);							
					}catch(Exception e) {						
					}								
					break;					
			}
		}
	}
}
