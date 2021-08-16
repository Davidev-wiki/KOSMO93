package a.b.c.ch4.mem;
import java.util.Scanner;
import a.b.c.ch4.mem.vo.Ex_MemberVO;

public class Ex_Member_1 {
	/*
		콘솔 어플리케이션으로 회원가입을 하는 프로그램 만든다.
		회원정보는 명령행 인수로 받는다. 
		회원정보 데이터는 VO에 넣어서 사용한다.
		회원정보는 
		회원번호 : mnum
		회원이름 : mname
		회원아이디 : mid
		회원비밀번호 : mpw
		회원휴대폰번호 : mhp
		회원이메일주소 : memail
		회원주소 : maddr

		패키지 : a.b.c.ch4.mem
		메인클래스는 : a.b.c.ch4.mem.Ex_Member
		캉통클래스 : a.b.c.ch4.mem.vo.Ex_MemberVO
		//나중에 함* 다오인터페이스 : a.b.c.ch4.mem.dao.Ex_MemberDAO
		//나중에 함* 다오클래스 : a.b.c.ch4.mem.dao.Ex_MemberDAOImpl

		만드는 순선
		1. VO 만들기 
		2. DAO
		3. main 만들기
	*/

	//멤버변수

	//생성자
	public Ex_Member(){
		System.out.println("Ex_Member() 생성자");
	}

	//함수	
	//회원 입력 (EX_MemberVO클래스에서 getter함수를 이용해 가져온 값 출력)
	public int memInsert(Ex_MemberVO exvo){
		System.out.println("\nmemInsert() 함수가 시작됩니다!-\n");
		System.out.println("JVM이 나타낸 exvo의 주소값 : " + exvo);
		System.out.println("exvo의 Mnum : " + exvo.getMnum());
		System.out.println("exvo의 Mname : " + exvo.getMname());
		System.out.println("exvo의 Mid : " + exvo.getMid());
		System.out.println("exvo의 Mpw : " + exvo.getMpw());
		System.out.println("exvo의 Mhp : " + exvo.getMhp());
		System.out.println("exvo의 Memail : " + exvo.getMemail());
		System.out.println("exvo의 Maddr : " + exvo.getMaddr());

		int nCnt = 0;
		
		if (true){
			nCnt = 1;
		}
		
		return nCnt;
	}

	// 회원정보 조회
	public Ex_MemberVO memSelect(Ex_MemberVO exvo){
		System.out.println("\nEx_Member.memSelect() 함수가 시작됩니다!-\n ");
		
		return null;
	}
	
	// 회원정보 수정
	public int memUpdate(Ex_MemberVO exvo){
		System.out.println("\nEx_Member.memUpdate() 함수가 시작됩니다!-\n");
		
		return 0;
	}

	// 회원정보 삭제 
	public int memDelete(Ex_MemberVO exvo){
		System.out.println("\nEx_Member.memDelete() 함수가 시작됩니다!-\n");
		
		return 0;
	}


	public static void main(String args[]){
		
	//지역변수
	String mnum = "";
	String mname = "";
	String mid	= "";
	String mpw = "";
	String mhp = ""; 
	String memail = ""; 
	String maddr = "";

	//로직 : 입력 갯수에 맞게 정확히 입력되면 프로그램 작동
	if (1 == args.length)
		{
			String isud = args[0];

			// 회원가입
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println("회원가입 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);
				
				System.out.println("회원이름를 key-in 하시오 >>> : ");
				mname = sc.next();
				System.out.println("입력한 회원이름 >>> : " + mname);
				
				System.out.println("아이디를 key-in 하시오 >>> : ");
				mid = sc.next();
				System.out.println("입력한 아이디 >>> : " + mid);
				
				System.out.println("비밀번호를 key-in 하시오 >>> : ");
				mpw = sc.next();
				System.out.println("입력한 비밀번호 >>> : " + mpw);

				System.out.println("핸드폰번호를 key-in 하시오 >>> : ");
				mhp = sc.next();
				System.out.println("입력한 핸드폰번호 >>> : " + mhp);

				System.out.println("이메일를 key-in 하시오 >>> : ");
				memail = sc.next();
				System.out.println("입력한 이메일 >>> : " + memail);
				
				System.out.println("회원주소를 key-in 하시오 >>> : ");
				maddr = sc.next();
				System.out.println("입력한 회원주소 >>> : " + maddr);
				sc.nextLine();

				// 회원가입
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
							
				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				exvo.setMname(mname);
				exvo.setMid(mid);
				exvo.setMpw(mpw);
				exvo.setMhp(mhp);
				exvo.setMemail(memail);
				exvo.setMaddr(maddr);

				// Value Objec exvo 참조변수를 memInsert 아규먼트로 넘기기
				int nCntInsert = exm_1.memInsert(exvo);

				System.out.println("nCntInsert >>> : " + nCntInsert);
				if (nCntInsert == 1)
				{
					System.out.println("회원가입 성공 !!!");
				}else{
					System.out.println("회원가입 실패 !!!");
				}
			}

			// 회원 조회
			if ("S".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원조회 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);

				// 회원 조회
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);

				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				
				// Value Objec exvo 참조변수를 memSelect 아규먼트로 넘기기
				exm_1.memSelect(exvo);
			}

			// 회원정보 수정 
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원수정 주소 정보를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);
				
				System.out.println("회원주소를 key-in 하시오 >>> : ");
				maddr = sc.next();
				System.out.println("입력한 회원주소 >>> : " + maddr);
				
				// 회원정보 수정 
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);				
				exvo.setMaddr(maddr);

				// Value Objec exvo 참조변수를 memUpdate 아규먼트로 넘기기
				int nCntUpdate = exm_1.memUpdate(exvo);

				System.out.println("nCntUpdate >>> : " + nCntUpdate);
				if (nCntUpdate == 1)
				{
					System.out.println("회원정보 수정 성공 !!!");
				}else{
					System.out.println("회원정보 수정 실패 !!!");			
				}
			}

			// 회원정보 삭제
			if ("D".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("회원삭제할 회원번홀를 입력 하세요 >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("회원번호를 key-in 하시오 >>> : ");
				mnum = sc.next();
				System.out.println("입력한 회원번호 >>> : " + mnum);

				// 회원정보 삭제
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object 세팅하기 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);

				// Value Objec exvo 참조변수를 memDelete 아규먼트로 넘기기
				int nCntDelete = exm_1.memDelete(exvo);

				System.out.println("nCntDelete >>> : " + nCntDelete);
				if (nCntDelete == 1)
				{
					System.out.println("회원정보 삭제 성공 !!!");
				}else{
					System.out.println("회원정보 삭제 실패 !!!");
				}
			}
		}else{
			System.out.println("ISUD 구분자를 입력하세용 !!!!");		
		}
	}
}