package a.b.c.swing.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.common.KckBoardConnProperty;
import a.b.c.common.KckConnProperty2;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberDAOImpl implements SwingMemberDAO {

	// 전체 조회
	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smSelectAll()함수 진입함");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectAllQuery());
			
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		} catch (Exception e) {
			System.out.println("데이터 조회중 문제가 발생했습니다.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}

	// 조건조회 : 일반 (회원 번호로 조회)
	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smSelect()함수 진입함");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectQuery());
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("데이터 조회중 문제가 발생했습니다.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}

	// 조건조회 : 이름
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo){
		System.out.println("SwingMemberDAOImpl.smSelectName()함수 진입함");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectNameQuery());
			pstmt.clearParameters();
			
			// 플레이스홀더에 세팅할 값
			// 물음표 (첫번째, 들어갈 값)
			pstmt.setString(1, svo.getSwname());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("데이터 조회중 문제가 발생했습니다.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}
		System.out.println("SwingMemberDAOImpl.smSelectName()함수 종료함");

		return aList;
	}
	
	// 조건조회 : 아이디
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo){
		System.out.println("SwingMemberDAOImpl.smSelectId()함수 진입함");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<SwingMemberVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmSelectIDQuery());
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwid());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<SwingMemberVO>();

				while (rsRs.next()) {

					SwingMemberVO _svo = new SwingMemberVO();

					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));

					aList.add(_svo);
				}
			}

			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("데이터 조회중 문제가 발생했습니다.");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}
		
	// 등록
	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smInsert()함수 진입함");

		// 연결 정보와 쿼리 세팅.
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = KckBoardConnProperty.getConnection();
			// 요청을 기재해서 보낼 때 쿼리문을 적어보내주는데,
			// 그 쿼리문 내에는 플레이스 홀더가 있다.
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmInsertQuery());
			System.out.println("DB에 다음의 쿼리문을 전송했습니다!  >> " + SwingMemberSqlMap.getsmInsertQuery());

			pstmt.clearParameters();
			//플레이스 홀더 자리에 들어갈 아규먼트는 VO객체로 전달받은 값들이다. 
			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwname());
			pstmt.setString(3, svo.getSwid());
			pstmt.setString(4, svo.getSwpw());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			if (nCnt > 0) {
				bool = true;
			}
			System.out.println("등록된 건 수 : " + nCnt);

			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB와 연결해서 입력하는 중 에러가 발생했어요! : " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	// 수정
	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smUpdate()함수 진입함");

		// 연결 정보와 쿼리 세팅.
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmUpdateQuery());
			System.out.println("DB에 다음의 쿼리문을 전송했습니다!  >> " + SwingMemberSqlMap.getsmUpdateQuery());

			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwname());
			pstmt.setString(2, svo.getSwnum());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			if (nCnt > 0) {
				bool = true;
			}
			System.out.println("등록된 건 수 : " + nCnt);

			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB와 연결해서 업데이트하는중에 문제가 발생했어요 >> " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	// 삭제
	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl.smDelete()함수 진입함");


		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmDeleteQuery());
			System.out.println("DB에 다음의 쿼리문을 전송했습니다!  >> " + SwingMemberSqlMap.getsmDeleteQuery());

			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			if (nCnt > 0) {
				bool = true;
			}
			System.out.println("등록된 건 수 : " + nCnt);

			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB에 연결해 삭제하는 도중 문제가 생겼어요 >> " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	// 로그인
	public int smLoginCheck(SwingMemberVO svo) {
		System.out.println("SwingMemberDAOImpl smLoginCheck() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		int nCnt = 0;
		
		try{
			conn = KckConnProperty2.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmLoginCheckQuery());
			System.out.println("로그인 체크  :: \n" + SwingMemberSqlMap.getSmLoginCheckQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwid());
			pstmt.setString(2, svo.getSwpw());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				while (rsRs.next()){
					nCnt = rsRs.getInt(1);
				}
			}
			
			KckConnProperty2.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 로그인체크 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KckConnProperty2.conClose(conn, pstmt, rsRs);
		}
		
		return nCnt;
		
	}

}
