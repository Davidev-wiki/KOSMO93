package a.b.c.swing.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.common.KckBoardConnProperty;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberDAOImpl implements SwingMemberDAO {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

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
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getsmInsertQuery());
			System.out.println("DB에 다음의 쿼리문을 전송했습니다!  >> " + SwingMemberSqlMap.getsmInsertQuery());

			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwnum());
			pstmt.setString(3, svo.getSwnum());
			pstmt.setString(4, svo.getSwnum());

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

			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwname());

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

}
