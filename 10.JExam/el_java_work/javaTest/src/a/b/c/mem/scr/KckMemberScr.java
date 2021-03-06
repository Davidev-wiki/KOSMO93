package a.b.c.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.common.KckMemberChabun;
import a.b.c.mem.service.KckMemberService;
import a.b.c.mem.service.KckMemberServiceImpl;
import a.b.c.mem.vo.KckMemberVO;

// 사용자 클래스 
public class KckMemberScr {
	// 전체 조회 함수
	public static void kmemSelectAll() {
		System.out.println("회원 전체 정보를 조회합니다!");

		KckMemberService kms = new KckMemberServiceImpl();

		ArrayList aList = kms.kmemSelectAll();

		if (aList != null && aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {

				KckMemberVO kvo = (KckMemberVO) aList.get(i);
				KckMemberVO.printKckMemberVO(kvo);
			}
		} else {
			System.out.println("aList에 데이터가 엄서용" + aList);
		}
	}
	
	// 조건 조회 함수
	public static void kmemSelect(String knum) {
		System.out.println("회원 조건 정보를 조회합니다!");

		KckMemberVO kvo = null;
		kvo = new KckMemberVO();
		kvo.setKnum(knum);
		
		// 인터페이스 객체 생성
		KckMemberService kms = new KckMemberServiceImpl();

		ArrayList<KckMemberVO> aList = kms.kmemSelect(kvo);

		if (aList != null && aList.size() > 0) {
			for (int i = 0; i < aList.size(); i++) {
				
				KckMemberVO _kvo = aList.get(i);
				KckMemberVO.printKckMemberVO(_kvo);
			}
		} else {
			System.out.println("aList에 데이터가 엄슴 : " + aList);
		}

	}

	public static void kmemInsert() {
		System.out.println("회원 정보를 등록합니다!");

		String knum = "202108090009";
		String kname = "KKKK";
		String kid = "KK00";
		String kpw = "KK1234";
		String kbirth = "20210808";
		String kgender = "01";
		String ktel = "01074101990";
		String khp = "01074101999";
		String kemail = "KK@abc.com";
		String kaddr = "신정로 180";
		String khobby = "01";
		String kphoto = "abc08.png";
		String kskill = "특기";
		String kjob = "01";

		KckMemberService kms = new KckMemberServiceImpl();

		KckMemberVO kvo = null;
		kvo = new KckMemberVO();

		// 채번 클래스의 함수 호출 결과를 초기화
		knum = KckMemberChabun.ymdNum();
		System.out.println("KckMemberScr.kmemInsert > KckMemberChabun.ymdNum()의 값 : " + knum);
		
		kvo.setKnum(knum);
		kvo.setKname(kname);
		kvo.setKid(kid);
		kvo.setKpw(kpw);
		kvo.setKbirth(kbirth);
		kvo.setKgender(kgender);
		kvo.setKtel(ktel);
		kvo.setKhp(khp);
		kvo.setKemail(kemail);
		kvo.setKaddr(kaddr);
		kvo.setKhobby(khobby);
		kvo.setKphoto(kphoto);
		kvo.setKskill(kskill);
		kvo.setKjob(kjob);

		boolean bool = kms.kmemInsert(kvo);

		if (bool) {
			System.out.println("회원 정보를 입력했어요~!" + bool);
		} else {
			System.out.println("정보 입력 실패!" + bool);
		}

	}

	public static void kmemUpdate() {
		System.out.println("회원 정보를 수정합니다!");

		String knum = "202108061111";
		String kemail = "kk00@abcde.com";
		String kaddr = "서울 도봉구 역삼로";
		String khobby = "04";
		String kjob = "02";

		KckMemberService kms = new KckMemberServiceImpl();

		KckMemberVO kvo = null;
		kvo = new KckMemberVO();

		kvo.setKnum(knum);
		kvo.setKemail(kemail);
		kvo.setKaddr(kaddr);
		kvo.setKhobby(khobby);
		kvo.setKjob(kjob);

		boolean bool = kms.kmemUpdate(kvo);

		if (bool) {
			System.out.println("회원 정보를 수정했어요~!" + bool);

		} else {
			System.out.println("정보 수정 실패!" + bool);

		}
	}

	public static void kmemDelete() {
		System.out.println("회원 정보를 삭제합니다!");

		String knum = "M2021080900001111";

		KckMemberService kms = new KckMemberServiceImpl();

		KckMemberVO kvo = null;
		kvo = new KckMemberVO();
		kvo.setKnum(knum);

		boolean bool = kms.kmemDelete(kvo);

		if (bool) {
			System.out.println("회원 정보를 삭제했어요~!" + bool);

		} else {
			System.out.println("정보 삭제 실패!" + bool);

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("회원 정보 CRUD : ISUD 테스트입니다! : ");
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n 어떤 업무를 하실래요? [1] 전체조회 ,  [2] 조건조회 , [3] 등록 , [4] 수정 , [5] 삭제 , [0] 종료");

			int isud = sc.nextInt();
			if (0 == isud) {
				System.out.println(" -프로그램 종료- ");
				break;
			}

			switch (isud) {
			case 1:
				try {
					KckMemberScr.kmemSelectAll();
				} catch (Exception e) {
					System.out.println("Error : " + e);
				}
				break;
			case 2:
				System.out.print("조회할 회원 번호를 입력하세요 : ");
				Scanner sc1 = new Scanner(System.in);
				try {
					String knum = sc1.next();
					KckMemberScr.kmemSelect(knum);
				} catch (Exception e) {
					System.out.println("Error : " + e);
				}
				break;
			case 3:
				try {
					KckMemberScr.kmemInsert();
				} catch (Exception e) {
					System.out.println("Error : " + e);
				}
				break;
			case 4:
				try {
					KckMemberScr.kmemUpdate();
				} catch (Exception e) {
					System.out.println("Error : " + e);
				}
				break;
			case 5:
				try {
					KckMemberScr.kmemDelete();
				} catch (Exception e) {
					System.out.println("Error : " + e);
				}
				break;

			}
		}

	}

}
