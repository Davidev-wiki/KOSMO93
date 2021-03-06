package a.b.c.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.common.KckBoardConnProperty;
import a.b.c.board.sql.KckBoardSqlMap;
import a.b.c.board.vo.KckBoardVO;

public class KckBoardDAOImpl implements KckBoardDAO {

	@Override
	public ArrayList<KckBoardVO> kboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardSelectAll함수 시작-");
		// 데이터베이스에 정보(데이터소스, 쿼리문) 전달하기.
		// 결과 값을 읽어서 get함수로 깡통에 데이터 담기
		// 그 깡통을 배열에 담는다.

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<KckBoardVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			// 쿼리문을 재료로 연결 시도
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardSelectAllQueryMap());
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<KckBoardVO>();

				while (rsRs.next()) {

					KckBoardVO _kvo = new KckBoardVO();
					_kvo.setBnum(rsRs.getString(1));
					_kvo.setBsubject(rsRs.getString(2));
					_kvo.setBwriter(rsRs.getString(3));
					_kvo.setBcontents(rsRs.getString(4));
					_kvo.setBpw(rsRs.getString(5));
					_kvo.setDeleteyn(rsRs.getString(6));
					_kvo.setInsertdate(rsRs.getString(7));
					_kvo.setUpdatedate(rsRs.getString(8));

					aList.add(_kvo);
				}
			}
			// 연결 해제
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("깡통에 데이터를 값을 저장하는데 문제가 발생했습니다. : " + e);
		}

		return aList;
	}

	@Override
	public ArrayList<KckBoardVO> kboardSelect(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardSelect 함수 시작-");
		// 데이터베이스에 정보(데이터소스, 쿼리문) 전달하기.
		// 결과 값을 읽어서 get함수로 깡통에 데이터 담기
		// 그 깡통을 배열에 담는다.

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<KckBoardVO> aList = null;

		try {
			conn = KckBoardConnProperty.getConnection();
			// 쿼리문을 재료로 연결 시도
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardSelectQueryMap());
			// parameter clear ???????????
			pstmt.clearParameters();
			// 아규먼트로 들어온 놈 setString??????
			pstmt.setString(1, kvo.getBnum());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<KckBoardVO>();

				while (rsRs.next()) {

					KckBoardVO _kvo = new KckBoardVO();
					_kvo.setBnum(rsRs.getString(1));
					_kvo.setBsubject(rsRs.getString(2));
					_kvo.setBwriter(rsRs.getString(3));
					_kvo.setBcontents(rsRs.getString(4));
					_kvo.setBpw(rsRs.getString(5));
					_kvo.setDeleteyn(rsRs.getString(6));
					_kvo.setInsertdate(rsRs.getString(7));
					_kvo.setUpdatedate(rsRs.getString(8));

					aList.add(_kvo);
				}
			}
			// 연결 해제
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception eq) {
			System.out.println("깡통에 데이터를 값을 저장하는데 문제가 발생했습니다. : " + eq.getMessage());
			System.out.println("에러 : " + eq);
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;

	}

	@Override
	public int kboardInsert(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardInsert() 함수 진입-");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try {
			conn =  KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardInsertQueryMap());
			
			pstmt.clearParameters();
			
			// 5줄 이해안감......
			pstmt.setString(1, kvo.getBnum());
			pstmt.setString(2, kvo.getBsubject());
			pstmt.setString(3, kvo.getBwriter());
			pstmt.setString(4, kvo.getBcontents());
			pstmt.setString(5, kvo.getBpw());
			
			nCnt = pstmt.executeUpdate();
			
			if (!conn.getAutoCommit()) conn.commit();
			System.out.println(nCnt + "건 등록 완료!");
			
			KckBoardConnProperty.conClose(conn, pstmt);
		} catch(Exception e) {
			System.out.println("DB에 등록하는데 실패햇.. : " + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	@Override
	public int kboardUpdate(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardUpdate() 함수 진입-");

		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardUpdateQueryMap());

			pstmt.clearParameters();
			// 이해안감.....
			pstmt.setString(1, kvo.getBsubject());
			pstmt.setString(2, kvo.getBcontents());
			pstmt.setString(3, kvo.getBwriter());
			pstmt.setString(4, kvo.getBnum());

			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit())
				conn.commit();

		} catch (Exception e) {
			System.out.println("업뎃 실패..ㅠ : " + e.getMessage());
		}

		return nCnt;
	}

	@Override
	public int kboardDelete(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardDelete()함수 진입-");
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;

		try {
			// conn은 연결정보.
			conn = KckBoardConnProperty.getConnection();

			// pstmt는 쿼리정보.
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardDeleteQueryMap());

			// ㅅㅂ...
			pstmt.clearParameters();
			// 이게 뭐람..
			pstmt.setString(1, kvo.getBnum());

			// update 실행해주세요
			nCnt = pstmt.executeUpdate();
			// 커밋 안되었으면 커밋해주세요
			if (!conn.getAutoCommit())
				conn.commit();

			// 그럼 이만.. 연결 종료하기
			KckBoardConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("삭제에 실패했습니다.." + e.getMessage());
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt);
		}

		return nCnt;
	}

}
