package a.b.c.ch9.kckmem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.kck.vo.KckMemberVO2;
import a.b.c.ch9.kckmem.sql.KckMemberSqlMap;
import a.b.c.common.KckConnProperty2;

public class KckMember2 {

	// 전체 조회 함수
	public ArrayList<KckMemberVO2> kmemSelectAll() {
		System.out.println("KckMember2.kmemSelectAll() 함수 진입 ");

		Connection conn = null;                       // 채널 구축 & 연결 시도
		PreparedStatement pstmt = null;               // '성명서'를 전달하고 결과를 받아오는 녀석 초기화.
		ResultSet rsRs = null;						  // 결과 값을 파일로

		ArrayList<KckMemberVO2> aList = null;

		try {
			// '미리 설정해둔 데이터 소스'로 초기화한다.
			conn = KckConnProperty2.getConnection();
			/*
			   '따로 분리해둔 쿼리문'이 적힌 함수를 넣어 값을 초기화한다.
			   'prepareStatement'가  구현체인 아래 jdbc드라이버에게 
			   [쿼리문]과 [Connection에 적힌  URL, ID, PW]를 전달한다.  
			   'oracle.jdbc.driver.OraclePreparedStatementWrapper'
			   
			    전달된 [쿼리문]은 오라클 데이터베이스에 있는 [Optimizer]가 실행시킨다.
			   
			*/ 
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberSelectAllQuery());
			//System.out.println("전체조회 쿼리문 \n" + KckMemberSqlMap.getKckMemberSelectAllQuery());
			/*
				 쿼리 전달의 Entry point = executQuery() 함수 
				 ResultSet의 구현체인 아래 JDBC 드라이버를 통해 결과를 받아온다.
				 oracle.jdbc.driver.OracleResultSetImpl
				 실행 결과는 파일의 형태의 메모리 구조를 가진다. 
			*/
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<KckMemberVO2>();
				/*
					 ReseltSet = 데이터테이블의 결과 집합. 
					 while문과 커서 기능의 'next 함수'를 같이 사용해  반복한다.
					 깡통클래스를 새로 인스턴스하고 리턴된 '데이터 열' 을 하나씩 순차적으로 세팅(set)한다.
					 1~17열 (컬럼) 까지 데이터가 모두 세팅되면 그 객체를 배열에 담는다.
					 배열 안에 들어간 이 객체 안에는 데이터 테이블에서  첫 번째 줄(row) 데이터만 담겨있다.
					 두 번째 반복에는 2번째 줄(row) 데이터가 들어간 객체가 생성된 후 세팅
					 세 번째 반복시엔 3번째 줄(row) 데이터가 들어간 객체가 생성된 후 세팅
					 ... 커서가 모든 데이터 테이블의 끝에 다다르면 종료된다.
					 [깡통1(DB의 첫 번째 줄), 깡통2(DB의 두 번째 줄), 깡통3(DB의 세 번째 줄), ... ]
				*/
				while (rsRs.next()) {

					KckMemberVO2 kvo = new KckMemberVO2();
					kvo.setKnum(rsRs.getString(1));
					kvo.setKname(rsRs.getString(2));
					kvo.setKid(rsRs.getString(3));
					kvo.setKpw(rsRs.getString(4));
					kvo.setKbirth(rsRs.getString(5));
					kvo.setKgender(rsRs.getString(6));
					kvo.setKtel(rsRs.getString(7));
					kvo.setKhp(rsRs.getString(8));
					kvo.setKemail(rsRs.getString(9));
					kvo.setKaddr(rsRs.getString(10));
					kvo.setKhobby(rsRs.getString(11));
					kvo.setKphoto(rsRs.getString(12));
					kvo.setKskill(rsRs.getString(13));
					kvo.setKjob(rsRs.getString(14));
					kvo.setDeleteyn(rsRs.getString(15));
					kvo.setInsertdate(rsRs.getString(16));
					kvo.setUpdatedate(rsRs.getString(17));

					aList.add(kvo);
				}
			}
		} catch (Exception e) {
			System.out.println("kmemSelectAll() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}

		return aList;
	}

	// 조건 조회 함수
	public ArrayList<KckMemberVO2> kmemSelect(KckMemberVO2 kvo) {
		System.out.println("KckMember.kmemSelect() 함수 진입 ");
		// 아랫줄은 굳이 필요없는 코드 세팅과정을 보여주기위해 일부러 만든 코드같음
		//KckMemberVO2.printlnKckMemberVO(kvo);

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<KckMemberVO2> aList = null;

		try {

			conn = KckConnProperty2.getConnection();
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberSelectQuery());
			// System.out.println("조건조회 \n" + KckMemberSqlMap.getKckMemberSelectQuery());

			pstmt.clearParameters();
			//
			pstmt.setString(1, kvo.getKnum());
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<KckMemberVO2>();

				while (rsRs.next()) {

					KckMemberVO2 _kvo = new KckMemberVO2();
					_kvo.setKnum(rsRs.getString(1));
					_kvo.setKname(rsRs.getString(2));
					_kvo.setKid(rsRs.getString(3));
					_kvo.setKpw(rsRs.getString(4));
					_kvo.setKbirth(rsRs.getString(5));
					_kvo.setKgender(rsRs.getString(6));
					_kvo.setKtel(rsRs.getString(7));
					_kvo.setKhp(rsRs.getString(8));
					_kvo.setKemail(rsRs.getString(9));
					_kvo.setKaddr(rsRs.getString(10));
					_kvo.setKhobby(rsRs.getString(11));
					_kvo.setKphoto(rsRs.getString(12));
					_kvo.setKskill(rsRs.getString(13));
					_kvo.setKjob(rsRs.getString(14));
					_kvo.setDeleteyn(rsRs.getString(15));
					_kvo.setInsertdate(rsRs.getString(16));
					_kvo.setUpdatedate(rsRs.getString(17));

					aList.add(_kvo);
				}
			}
		} catch (Exception e) {
			System.out.println("kmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}

		return aList;
	}

	// 회원 등록
	public boolean kmemInsert(KckMemberVO2 kvo) {
		System.out.println("KckMember kmemInsert() 함수 진입 >>> : ");
		KckMemberVO2.printlnKckMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = KckConnProperty2.getConnection();
			
			// Connection의 현재 자동 커밋 모드를 검색 후 리턴한다.
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemInsertQuery());
			System.out.println("입력하기 >>> : \n"+ KckMemberSqlMap.getKckMemInsertQuery());
  			
			// 파라미터 클리어 꼭 하기  : why? 보안? 메모리 관리?
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKnum()); // 202108060007
			pstmt.setString(2, kvo.getKname()); // GGGG
			pstmt.setString(3, kvo.getKid());   // GG00
			pstmt.setString(4, kvo.getKpw());
			pstmt.setString(5, kvo.getKbirth());
			pstmt.setString(6, kvo.getKgender());
			pstmt.setString(7, kvo.getKtel());
			pstmt.setString(8, kvo.getKhp());			
			pstmt.setString(9, kvo.getKemail());
			pstmt.setString(10, kvo.getKaddr());
			pstmt.setString(11, kvo.getKhobby());
			pstmt.setString(12, kvo.getKphoto());
			pstmt.setString(13, kvo.getKskill());
			pstmt.setString(14, kvo.getKjob());
			
			// 쿼리문 전달 시작 
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 execute() 함수를 사용하면 된다. 
			nCnt = pstmt.executeUpdate();	
			// 커밋체크. 혹시나 오토커밋이 안되었다면 커밋하기.
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 등록 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			KckConnProperty2.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KckConnProperty2.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}

	// 회원 수정 
	public boolean kmemUpdate(KckMemberVO2 kvo) {
		System.out.println("KckMember kmemUpdate() 함수 진입 >>> : ");
		KckMemberVO2.printlnKckMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = KckConnProperty2.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemUpdateQuery());
			System.out.println("수정하기 >>> : \n"+ KckMemberSqlMap.getKckMemUpdateQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKemail());
			pstmt.setString(2, kvo.getKaddr());
			pstmt.setString(3, kvo.getKhobby());			
			pstmt.setString(4, kvo.getKjob());
			pstmt.setString(5, kvo.getKnum()); 
	

			// 쿼리문 전달 시작 
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 execute() 함수를 사용하면 된다. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 수정 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			KckConnProperty2.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KckConnProperty2.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}
	
	// 회원 삭제
	public boolean kmemDelete(KckMemberVO2 kvo) {
		System.out.println("KckMember kmemDelete() 함수 진입 >>> : ");
		KckMemberVO2.printlnKckMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = KckConnProperty2.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemDeleteQuery());
			System.out.println("삭제하기 >>> : \n"+ KckMemberSqlMap.getKckMemDeleteQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getKnum()); 

			
			// 쿼리문 전달 시작 
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 execute() 함수를 사용하면 된다. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 삭제 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			KckConnProperty2.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KckConnProperty2.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;	
		}
	
	// main() 함수
	public static void main(String[] args) {

		System.out.print("회원정보 CRUD :: ISUD 테스트를 시작합니다.  : ");
		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("\n\n회원정보 전체조회:SA, 조건조회:S, 등록:I, 수정:U, 삭제:D, 종료:Q");

			String isud = sc.next().toUpperCase();

			if ("Q".equals(isud))
				break;

			if ("SA".equals(isud)) {
				System.out.println("회원정보 전체조회  : " + isud);

				KckMember2 km = new KckMember2();

				ArrayList<KckMemberVO2> aList = km.kmemSelectAll();

				if (aList != null && aList.size() > 0) {
					for (int i = 0; i < aList.size(); i++) {

						KckMemberVO2 kvo = aList.get(i);
						KckMemberVO2.printKckMemberVO(kvo);
					}
					System.out.println("--회원 정보 전체 조회가 종료됩니다.--");
				} else {
					System.out.println("aList 에 데이터가 엄슴  : " + aList);
				}
			}
			if ("S".equals(isud)) {
				System.out.println("회원정보 조건조회  : " + isud);

				System.out.println("조회조건 회원번호를 입력하세요. >>> : ");
				Scanner scs = new Scanner(System.in);
				// key-in code
				String knum = scs.next();
				
				// 객체 생성
				KckMember2 km = new KckMember2();
				
				// 깡통 객체 생성
				KckMemberVO2 kvo = null;
				kvo = new KckMemberVO2();
				
				// key-in 내용을 깡통에 세팅
				kvo.setKnum(knum);

				ArrayList<KckMemberVO2> aList = km.kmemSelect(kvo);

				if (aList != null && aList.size() > 0) {
					for (int i = 0; i < aList.size(); i++) {

						KckMemberVO2 _kvo = aList.get(i);
						KckMemberVO2.printlnKckMemberVO(_kvo);
					}
				} else {
					System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
				}
			}
			if ("I".equals(isud)) {
				System.out.println("회원정보 등록 >>> : " + isud);
				
				String knum = "202108061111";
				String kname = "name1";
				String kid = "id1";
				String kpw = "pw1234"; 
				String kbirth = "20210909";
				String kgender = "01";
				String ktel = "03212341234";
				String khp = "01012341234"; 
				String kemail = "GG00@naver.com";
				String kaddr = "서울 양천구 신정로170"; 
				String khobby = "01";
				String kphoto = "abc06.jpg";
				String kskill = "특기7";
				String kjob = "01";
			
				KckMember2 km = new KckMember2();
				
				KckMemberVO2 kvo = null;
				kvo = new KckMemberVO2();
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
				
				boolean bool = km.kmemInsert(kvo);

				if (bool) {
					System.out.println("회원 정보 입력 성공 >>> : " + bool);	
					
					ArrayList<KckMemberVO2> aList = km.kmemSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							KckMemberVO2 _kvo = aList.get(i);
							KckMemberVO2.printKckMemberVO(_kvo);
						}		
					}else {
						System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
					}
				}else {
					System.out.println("회원 정보 입력 실패 >>> : " + bool);
				}	
				

			}
			if ("U".equals(isud)) {
				System.out.println("회원정보 수정 >>> : " + isud);
				
				String knum = "202108060007";				
				String kemail = "FF00@naver.com";
				String kaddr = "서울 금천구 가산동 6622"; 
				String khobby = "04";				
				String kjob = "02";
			
				KckMember2 km = new KckMember2();
				
				KckMemberVO2 kvo = null;
				kvo = new KckMemberVO2();
				kvo.setKnum(knum);			
				kvo.setKemail(kemail);
				kvo.setKaddr(kaddr);
				kvo.setKhobby(khobby);								
				kvo.setKjob(kjob);
				
				boolean bool = km.kmemUpdate(kvo);
				if (bool) {
					System.out.println("회원 정보 수정 성공 >>> : " + bool);	
					
					ArrayList<KckMemberVO2> aList = km.kmemSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							KckMemberVO2 _kvo = aList.get(i);
							KckMemberVO2.printKckMemberVO(_kvo);
						}		
					}else {
						System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
					}
				}else {
					System.out.println("회원 정보 수정 실패 >>> : " + bool);
				}	
				
			}
			if ("D".equals(isud)) {
				System.out.println("회원정보 삭제 >>> : " + isud);
				
				String knum = "202108060007";				
			
				KckMember2 km = new KckMember2();
				
				KckMemberVO2 kvo = null;
				kvo = new KckMemberVO2();
				kvo.setKnum(knum);			
				
				boolean bool = km.kmemDelete(kvo);
				
				if (bool) {
					System.out.println("회원 정보 삭제 성공 >>> : " + bool);	
					
					ArrayList<KckMemberVO2> aList = km.kmemSelectAll();

					if (aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							
							KckMemberVO2 _kvo = aList.get(i);
							KckMemberVO2.printKckMemberVO(_kvo);
						}		
					}else {
						System.out.println("aList 에 데이터가 없네요 >>> : " + aList);
					}
				}else {
					System.out.println("회원 정보 삭제 실패 >>> : " + bool);
				}					
			}
		}
	}
}




