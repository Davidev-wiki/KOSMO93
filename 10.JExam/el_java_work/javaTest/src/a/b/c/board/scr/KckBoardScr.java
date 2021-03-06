package a.b.c.board.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.board.common.KckBoardChabun;
import a.b.c.board.service.KckBoardService;
import a.b.c.board.service.KckBoardServiceImpl;
import a.b.c.board.vo.KckBoardVO;

public class KckBoardScr {

	public static void kboardSelectAll() {
		System.out.println("KckBoardScr.kboardSelectAll()함수 진입-");

		try {
			KckBoardService kbs = new KckBoardServiceImpl();
	
			ArrayList<KckBoardVO> aList = kbs.kboardSelectAll();

			if (aList != null && aList.size() > 0) {
				// 배열 내부 모습 (깡통1 : 1행, 깡통2 : 2행, 깡통3 : 3행...)
				for (int i = 0; i < aList.size(); i++) {
					KckBoardVO kvo = aList.get(i);
					// 깡통 1, 2, 3... 돌아가면서 print함수 실행됨
					KckBoardVO.printKckBoardVO(kvo);
				}
			} else {
				System.out.println("aList가 비었네요..");
			}
		} catch (Exception e) {
			System.out.println("데이터를 배열로 가져왔지만 보여주는데 문제가 생겼네요 : " + e.getMessage());
		}
	}

	public static void kboardSelect(String bnum) {

		try {
			// 서비스 호출
			KckBoardService kbs = new KckBoardServiceImpl();
			KckBoardVO kvo = new KckBoardVO();
			kvo.setBnum(bnum);

			ArrayList<KckBoardVO> aList = kbs.kboardSelect(kvo);

			if (aList != null && aList.size() > 0) {
				for (int i = 0; i < aList.size(); i++) {
					KckBoardVO _kvo = aList.get(i);
					KckBoardVO.printlnKckBoardVO(_kvo);
				}
			} else {
				System.out.println("aList가 비었는데요..?");
			}
		} catch (Exception e) {
			System.out.println("조건에 맞는 데이터를 불러오는 중 에러가 발생했어요.. " + e.getMessage());
		}

	}

	public static void kboardInsert() {

		// 등록할 내용 : 글 번호 만드는 채번함수 연결
		String bnum = KckBoardChabun.gubunNum();
		String bsubject = "002";
		String bwriter = "글쓰니2";
		String bcontents = "글쓰기 테스트2";
		String bpw = "test1234";

		try {

			KckBoardService kbs = new KckBoardServiceImpl();
			KckBoardVO kvo = new KckBoardVO();

			// 위에 채번된 번호 가져와서 깡통에 세팅
			kvo.setBnum(bnum);
			kvo.setBsubject(bsubject);
			kvo.setBwriter(bwriter);
			kvo.setBcontents(bcontents);
			kvo.setBpw(bpw);

			// 세팅한 깡통을 서비스재료로 줬는데 nCnt는 뭐지??????? 건수리턴이네..
			int nCnt = kbs.kboardInsert(kvo);

			if (nCnt > 0) {
				System.out.println("게시글" + nCnt + "건 등록 완료!");
			} else {
				System.out.println("등록에 실패했어요..");
			}

		} catch (Exception e) {
			System.out.println("등록하는데 문제가 발생했어요..");
		}

	}

	public static void kboardUpdate() {
		
		String bsubject = "테슷트 제목 10";
		String bcontents = "글쓰기 테스트당";
		String bwriter = "김작가1";
		String bnum = "B0001";
		
		try {
			//서비스 호출
			KckBoardService kbs = new KckBoardServiceImpl();
			KckBoardVO kvo = new KckBoardVO();
			
			kvo.setBnum(bnum);
			kvo.setBsubject(bsubject);
			kvo.setBcontents(bcontents);
			kvo.setBwriter(bwriter);
			
			int nCnt = kbs.kboardUpdate(kvo);
			
			if(nCnt > 0) {
				System.out.println(nCnt + "건 수정완료!");
			} else {
				System.out.println("수정에 실패했어요..");
			}
			
		} catch(Exception e) {
			System.out.println("업데이트 중 오류가 발생했어요.. : " + e.getMessage());
		}
		
	}

	public static void kboardDelete() {
		
		String bnum = "1";
		
		try {
			KckBoardService kbs = new KckBoardServiceImpl();
			KckBoardVO kvo = new KckBoardVO();
			
			kvo.setBnum(bnum);
			
			int nCnt = kbs.kboardDelete(kvo);
			
			if(nCnt > 0) {
				System.out.println(nCnt + "건 수정완료!");
			} else {
				System.out.println("삭제에 실패했어요..");
			}

		} catch(Exception e) {
			System.out.println("삭제중 에러 발생! : " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("게시판 CRUD :: ISUD 테스트 : ");
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n 게시판 정보  || [1] 전체조회, [2] 조건조회, [3] 등록, [4] 수정, [5] 삭제, [0] 나가기");

			int isud = sc.nextInt();

			if (isud == 0) {
				System.out.println("-프로그램 종료-");
				break;
			}

			switch (isud) {
			// 전체 조회
			case 1:
				try {
					KckBoardScr.kboardSelectAll();
				} catch (Exception e) {

				}
				break;

			case 2:
				try {
					System.out.print("조회하려는 글 번호를 입력하세요 : ");
					Scanner sc1 = new Scanner(System.in);

					// 'String'이다
					String bnum = sc1.next();
					KckBoardScr.kboardSelect(bnum);
				} catch (Exception e) {

				}
				break;

			case 3:
				try {
					KckBoardScr.kboardInsert();
				} catch (Exception e) {

				}
				break;

			case 4:
				try {
					KckBoardScr.kboardUpdate();
				} catch (Exception e) {

				}
				break;

			case 5:
				try {
					KckBoardScr.kboardDelete();
				} catch (Exception e) {

				}
				break;
			}
		}
	}
}
