package a.b.c.ch4.mem;
import java.util.Scanner;
import a.b.c.ch4.mem.vo.Ex_MemberVO;

public class Ex_Member_1 {
	/*
		�ܼ� ���ø����̼����� ȸ�������� �ϴ� ���α׷� �����.
		ȸ�������� ����� �μ��� �޴´�. 
		ȸ������ �����ʹ� VO�� �־ ����Ѵ�.
		ȸ�������� 
		ȸ����ȣ : mnum
		ȸ���̸� : mname
		ȸ�����̵� : mid
		ȸ����й�ȣ : mpw
		ȸ���޴�����ȣ : mhp
		ȸ���̸����ּ� : memail
		ȸ���ּ� : maddr

		��Ű�� : a.b.c.ch4.mem
		����Ŭ������ : a.b.c.ch4.mem.Ex_Member
		Ĳ��Ŭ���� : a.b.c.ch4.mem.vo.Ex_MemberVO
		//���߿� ��* �ٿ��������̽� : a.b.c.ch4.mem.dao.Ex_MemberDAO
		//���߿� ��* �ٿ�Ŭ���� : a.b.c.ch4.mem.dao.Ex_MemberDAOImpl

		����� ����
		1. VO ����� 
		2. DAO
		3. main �����
	*/

	//�������

	//������
	public Ex_Member(){
		System.out.println("Ex_Member() ������");
	}

	//�Լ�	
	//ȸ�� �Է� (EX_MemberVOŬ�������� getter�Լ��� �̿��� ������ �� ���)
	public int memInsert(Ex_MemberVO exvo){
		System.out.println("\nmemInsert() �Լ��� ���۵˴ϴ�!-\n");
		System.out.println("JVM�� ��Ÿ�� exvo�� �ּҰ� : " + exvo);
		System.out.println("exvo�� Mnum : " + exvo.getMnum());
		System.out.println("exvo�� Mname : " + exvo.getMname());
		System.out.println("exvo�� Mid : " + exvo.getMid());
		System.out.println("exvo�� Mpw : " + exvo.getMpw());
		System.out.println("exvo�� Mhp : " + exvo.getMhp());
		System.out.println("exvo�� Memail : " + exvo.getMemail());
		System.out.println("exvo�� Maddr : " + exvo.getMaddr());

		int nCnt = 0;
		
		if (true){
			nCnt = 1;
		}
		
		return nCnt;
	}

	// ȸ������ ��ȸ
	public Ex_MemberVO memSelect(Ex_MemberVO exvo){
		System.out.println("\nEx_Member.memSelect() �Լ��� ���۵˴ϴ�!-\n ");
		
		return null;
	}
	
	// ȸ������ ����
	public int memUpdate(Ex_MemberVO exvo){
		System.out.println("\nEx_Member.memUpdate() �Լ��� ���۵˴ϴ�!-\n");
		
		return 0;
	}

	// ȸ������ ���� 
	public int memDelete(Ex_MemberVO exvo){
		System.out.println("\nEx_Member.memDelete() �Լ��� ���۵˴ϴ�!-\n");
		
		return 0;
	}


	public static void main(String args[]){
		
	//��������
	String mnum = "";
	String mname = "";
	String mid	= "";
	String mpw = "";
	String mhp = ""; 
	String memail = ""; 
	String maddr = "";

	//���� : �Է� ������ �°� ��Ȯ�� �ԷµǸ� ���α׷� �۵�
	if (1 == args.length)
		{
			String isud = args[0];

			// ȸ������
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println("ȸ������ ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);
				
				System.out.println("ȸ���̸��� key-in �Ͻÿ� >>> : ");
				mname = sc.next();
				System.out.println("�Է��� ȸ���̸� >>> : " + mname);
				
				System.out.println("���̵� key-in �Ͻÿ� >>> : ");
				mid = sc.next();
				System.out.println("�Է��� ���̵� >>> : " + mid);
				
				System.out.println("��й�ȣ�� key-in �Ͻÿ� >>> : ");
				mpw = sc.next();
				System.out.println("�Է��� ��й�ȣ >>> : " + mpw);

				System.out.println("�ڵ�����ȣ�� key-in �Ͻÿ� >>> : ");
				mhp = sc.next();
				System.out.println("�Է��� �ڵ�����ȣ >>> : " + mhp);

				System.out.println("�̸��ϸ� key-in �Ͻÿ� >>> : ");
				memail = sc.next();
				System.out.println("�Է��� �̸��� >>> : " + memail);
				
				System.out.println("ȸ���ּҸ� key-in �Ͻÿ� >>> : ");
				maddr = sc.next();
				System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);
				sc.nextLine();

				// ȸ������
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
							
				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				exvo.setMname(mname);
				exvo.setMid(mid);
				exvo.setMpw(mpw);
				exvo.setMhp(mhp);
				exvo.setMemail(memail);
				exvo.setMaddr(maddr);

				// Value Objec exvo ���������� memInsert �ƱԸ�Ʈ�� �ѱ��
				int nCntInsert = exm_1.memInsert(exvo);

				System.out.println("nCntInsert >>> : " + nCntInsert);
				if (nCntInsert == 1)
				{
					System.out.println("ȸ������ ���� !!!");
				}else{
					System.out.println("ȸ������ ���� !!!");
				}
			}

			// ȸ�� ��ȸ
			if ("S".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ����ȸ ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

				// ȸ�� ��ȸ
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);

				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				
				// Value Objec exvo ���������� memSelect �ƱԸ�Ʈ�� �ѱ��
				exm_1.memSelect(exvo);
			}

			// ȸ������ ���� 
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ������ �ּ� ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);
				
				System.out.println("ȸ���ּҸ� key-in �Ͻÿ� >>> : ");
				maddr = sc.next();
				System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);
				
				// ȸ������ ���� 
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);				
				exvo.setMaddr(maddr);

				// Value Objec exvo ���������� memUpdate �ƱԸ�Ʈ�� �ѱ��
				int nCntUpdate = exm_1.memUpdate(exvo);

				System.out.println("nCntUpdate >>> : " + nCntUpdate);
				if (nCntUpdate == 1)
				{
					System.out.println("ȸ������ ���� ���� !!!");
				}else{
					System.out.println("ȸ������ ���� ���� !!!");			
				}
			}

			// ȸ������ ����
			if ("D".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ�������� ȸ����Ȧ�� �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

				// ȸ������ ����
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);

				// Value Objec exvo ���������� memDelete �ƱԸ�Ʈ�� �ѱ��
				int nCntDelete = exm_1.memDelete(exvo);

				System.out.println("nCntDelete >>> : " + nCntDelete);
				if (nCntDelete == 1)
				{
					System.out.println("ȸ������ ���� ���� !!!");
				}else{
					System.out.println("ȸ������ ���� ���� !!!");
				}
			}
		}else{
			System.out.println("ISUD �����ڸ� �Է��ϼ��� !!!!");		
		}
	}
}