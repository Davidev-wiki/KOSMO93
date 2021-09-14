package a.b.c.com.kosmo.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.book.sql.BookSqlMap;
import a.b.c.com.kosmo.book.vo.BookVO;

public class BookDAOImpl implements BookDAO {

	@Override
	public ArrayList<BookVO> bookSelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<BookVO> bookSelect(BookVO bvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int bookInsert(BookVO bvo) {
		// TODO Auto-generated method stub
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());

			pstmt = conn.prepareStatement(BookSqlMap.getBookInsertQuery());
			
			System.out.println("bookInsert Query : " + BookSqlMap.getBoardInsertQuery());
			
			pstmt.clearParameters();
			
			pstmt.setString(1, bvo.getBnum());
			pstmt.setString(2, bvo.getBtitle());
			pstmt.setString(3, bvo.getBauth());
			pstmt.setString(4, bvo.getIsbn());
			pstmt.setString(5, bvo.getBcomp());
			pstmt.setString(6, bvo.getBprice());
			pstmt.setString(7, bvo.getDeleteyn());
			pstmt.setString(8, bvo.getInsertdate());
			pstmt.setString(9, bvo.getInsertdate());
			
			nCnt = pstmt.executeUpdate();
			
			// getAutoCommit() : 이 Connection 객체에 대한 현재 자동 커밋 모드를 검색합니다. 
			// return 값 : 이 Connection 객체의 자동 커밋 모드의 현재 상태
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());
			System.out.println("nCnt : " + nCnt + "건 등록되었습니다!");
			
			ConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e){
			System.out.println("");
			
		} finally{
			ConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	@Override
	public int bookUpdate(BookVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int bookDelete(BookVO bvo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
