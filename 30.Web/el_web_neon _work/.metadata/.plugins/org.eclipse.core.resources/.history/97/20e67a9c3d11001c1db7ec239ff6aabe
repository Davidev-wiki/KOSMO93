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
		return null;
	}

	@Override
	public ArrayList<BoardVO> boardSelect(BoardVO bvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean boardInsert(BoardVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BoardDAOImpl.boardInsert()함수 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
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
		return false;
	}

	@Override
	public boolean boardDelete(BoardVO bvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
