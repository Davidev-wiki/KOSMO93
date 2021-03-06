package a.b.c.com.kosmo.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.board.sql.BoardSqlMap;
import a.b.c.com.kosmo.board.vo.BoardVO;

public class BoardDAOImpl implements BoardDAO {

	@Override
	public ArrayList<BoardVO> boardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardSelectAll()함수 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList<BoardVO> aList = null;

		try {
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(BoardSqlMap.getBoardSelectAllQuery());
			System.out.println("SelectAllQuery : " + BoardSqlMap.getBoardSelectAllQuery());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<BoardVO>();

				while (rsRs.next()) {
					// _bvo를 할 이유가 없어서 bvo로 시도함
					BoardVO bvo = new BoardVO();

					bvo.setBnum(rsRs.getString(1));
					bvo.setBsubject(rsRs.getString(2));
					bvo.setBwriter(rsRs.getString(3));
					bvo.setBpw(rsRs.getString(4));
					bvo.setBmemo(rsRs.getString(5));
					bvo.setBphoto(rsRs.getString(6));
					bvo.setDeleteyn(rsRs.getString(7));
					bvo.setInsertdate(rsRs.getString(8));
					bvo.setUpdatedate(rsRs.getString(9));

					aList.add(bvo);

					// 전체조회 함수 호출
					BoardVO.printBoardVO(bvo);
				}

			}
			ConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("DB에 연결해 전체 조회 시도중 에러가 났어요! : " + e);
		} finally {
			ConnProperty.conClose(conn, pstmt, rsRs);
		}

		return aList;
	}

	@Override
	public ArrayList<BoardVO> boardSelect(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardSelect()함수 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;

		ArrayList aList = null;

		try {
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(BoardSqlMap.getBoardSelectQuery());
			System.out.println("SelctQuery : " + BoardSqlMap.getBoardSelectQuery());
			pstmt.clearParameters();

			pstmt.setString(1, bvo.getBnum());

			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				aList = new ArrayList<BoardVO>();

				while (rsRs.next()) {

					BoardVO _bvo = new BoardVO();

					_bvo.setBnum(rsRs.getString(1));
					_bvo.setBsubject(rsRs.getString(2));
					_bvo.setBwriter(rsRs.getString(3));
					_bvo.setBpw(rsRs.getString(4));
					_bvo.setBmemo(rsRs.getString(5));
					_bvo.setBphoto(rsRs.getString(6));
					_bvo.setDeleteyn(rsRs.getString(7));
					_bvo.setInsertdate(rsRs.getString(8));
					_bvo.setUpdatedate(rsRs.getString(9));

					aList.add(_bvo);

					// 조건조회 출력 함수
					BoardVO.printlnBoardVO(_bvo);
				}
			}

			ConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {

			System.out.println("DB에 접속해 조건조회중 에러가 났어요! : " + e);

		} finally {

			ConnProperty.conClose(conn, pstmt, rsRs);
		}
		return aList;
	}

	@Override
	public boolean boardInsert(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardInsert()함수 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		// Insert는 값을 받아오지 않으니까 resultSet은 사용하지 않음
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(BoardSqlMap.getBoardInsertQuery());
			System.out.println("INSERT Query : " + BoardSqlMap.getBoardInsertQuery());

			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());
			pstmt.setString(2, bvo.getBsubject());
			pstmt.setString(3, bvo.getBwriter());
			pstmt.setString(4, bvo.getBpw());
			pstmt.setString(5, bvo.getBmemo());
			pstmt.setString(6, bvo.getBphoto());

			nCnt = pstmt.executeUpdate();

			if (!conn.getAutoCommit())
				conn.commit();
			System.out.println("nCnt : " + nCnt + "건 등록 완료되었습니다!");

			if (nCnt > 0) {
				bool = true;
			}

			ConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("nCnt 등록 실패! : " + e);
		} finally {
			ConnProperty.conClose(conn, pstmt);
		}

		return bool;
	}

	@Override
	public boolean boardUpdate(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardUpdate()함수 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		// Update는 값을 받아오지 않으니까 resultSet은 사용하지 않음
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(BoardSqlMap.getBoardUpdateQuery());
			System.out.println("Update Query : " + BoardSqlMap.getBoardUpdateQuery());

			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBsubject());
			pstmt.setString(2, bvo.getBmemo());
			pstmt.setString(3, bvo.getBnum());

			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit())
				conn.commit();
			System.out.println("nCnt : " + nCnt + "건 수정되었습니다.");

			if (nCnt > 0)
				bool = true;

			ConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB에 접속해 Update도중 에러가 났어요 : " + e);
		} finally {
			ConnProperty.conClose(conn, pstmt);
		}

		return bool;

	}

	@Override
	public boolean boardDelete(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardDelete()함수 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(BoardSqlMap.getBoardDeleteQuery());
			System.out.println("Delete Query : " + BoardSqlMap.getBoardDeleteQuery());

			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());

			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit())
				conn.commit();
			System.out.println("nCnt : " + nCnt + "건 삭제 되었습니다.");

			if (nCnt > 0) {
				bool = true;
			}

			ConnProperty.conClose(conn, pstmt);

		} catch (Exception e) {
			System.out.println("DB에 접속해 삭제중 에러가 발생했어요 : " + e);
		} finally {
			ConnProperty.conClose(conn, pstmt);

		}

		return bool;
	}

}
