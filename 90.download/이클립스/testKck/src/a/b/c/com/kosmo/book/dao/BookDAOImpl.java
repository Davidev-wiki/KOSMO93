package a.b.c.com.kosmo.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.book.sql.BookSqlMap;
import a.b.c.com.kosmo.book.vo.BookVO;

public class BookDAOImpl implements BookDAO {

	@Override
	public ArrayList<BookVO> bookSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("BookDAOImpl.bookSelectAll() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<BookVO> aList = null;
		
		try{
			
			conn = ConnProperty.getConnection();
			
			pstmt = conn.prepareStatement(BookSqlMap.getBookSelectAllQuery());
			
			System.out.println("bookSelectAll의 Query값 : " + BookSqlMap.getBookSelectAllQuery());
			
			rsRs = pstmt.executeQuery();
			
			System.out.println("Query문 실행한 후 받아온 rsRs의 값 : " + rsRs);

			if(rsRs != null){
				
				aList = new ArrayList<BookVO>();
				
				while(rsRs.next()){
					
					BookVO bvo = new BookVO();
					
					bvo.setBnum(rsRs.getString(1));
					bvo.setBtitle(rsRs.getString(2));
					bvo.setBauth(rsRs.getString(3));
					bvo.setIsbn(rsRs.getString(4));
					bvo.setBcomp(rsRs.getString(5));
					bvo.setBprice(rsRs.getString(6));
					bvo.setBqty(rsRs.getString(7));
					bvo.setBcover(rsRs.getString(8));
					bvo.setDeleteyn(rsRs.getString(9));
					bvo.setInsertdate(rsRs.getString(10));
					bvo.setUpdatedate(rsRs.getString(11));
					
					aList.add(bvo);
				}
				
			}
			
			ConnProperty.conClose(conn, pstmt, rsRs);
		} catch(Exception e){
			System.out.println("DB에서 전체 데이터를 가져오는 도중 문제가 발생했습니다.  error : "  + e);
		} finally{
			ConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		System.out.println("BookDAOImpl.bookSelectAll() 종료");

		return aList;
	}

	@Override
	public ArrayList<BookVO> bookSelect(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookDAOImpl.bookSelect() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<BookVO> aList = null;
		
		try{
			
			conn = ConnProperty.getConnection();
			
			pstmt = conn.prepareStatement(BookSqlMap.getBookSelectQuery());
			
			System.out.println("bookSelect의 Query값 : " + BookSqlMap.getBookSelectQuery());
			pstmt.clearParameters();
			pstmt.setString(1, bvo.getBnum());
			
			rsRs = pstmt.executeQuery();
			
			System.out.println("Query문 실행한 후 받아온 rsRs의 값 : " + rsRs);

			if(rsRs != null){
				
				aList = new ArrayList<BookVO>();
				
				while(rsRs.next()){
					
					BookVO _bvo = new BookVO();
					
					_bvo.setBnum(rsRs.getString(1));
					_bvo.setBtitle(rsRs.getString(2));
					_bvo.setBauth(rsRs.getString(3));
					_bvo.setIsbn(rsRs.getString(4));
					_bvo.setBcomp(rsRs.getString(5));
					_bvo.setBprice(rsRs.getString(6));
					_bvo.setBqty(rsRs.getString(7));
					_bvo.setBcover(rsRs.getString(8));
					_bvo.setDeleteyn(rsRs.getString(9));
					_bvo.setInsertdate(rsRs.getString(10));
					_bvo.setUpdatedate(rsRs.getString(11));
					
					aList.add(_bvo);
				}
				
			}
			
			ConnProperty.conClose(conn, pstmt, rsRs);
		} catch(Exception e){
			System.out.println("DB에서 해당 데이터를 가져오는 도중 문제가 발생했습니다.  error : "  + e);
		} finally{
			ConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		System.out.println("BookDAOImpl.bookSelect() 종료");

		return aList;
	}

	@Override
	public int bookInsert(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookDAOImpl.bookInsert() 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());

			pstmt = conn.prepareStatement(BookSqlMap.getBookInsertQuery());
			
			System.out.println("getBookInsert Query : \n" + BookSqlMap.getBookInsertQuery());
			
			pstmt.clearParameters();
			
			pstmt.setString(1, bvo.getBnum());
			pstmt.setString(2, bvo.getBtitle());
			pstmt.setString(3, bvo.getBauth());
			pstmt.setString(4, bvo.getIsbn());
			pstmt.setString(5, bvo.getBcomp());
			pstmt.setString(6, bvo.getBprice());
			pstmt.setString(7, bvo.getBqty());
			pstmt.setString(8, bvo.getBcover());
			
			nCnt = pstmt.executeUpdate();
			
			System.out.println("가져온 nCnt 의 값 : " + nCnt);
			
			// getAutoCommit() : 이 Connection 객체에 대한 현재 자동 커밋 모드를 검색합니다. 
			// return 값 : 이 Connection 객체의 자동 커밋 모드의 현재 상태
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());
			System.out.println("nCnt : " + nCnt + "건 등록되었습니다!");
			
			ConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e){
			System.out.println("DB에 입력하는데 문제가 발생했습니다. : " + e);
			
		} finally{
			ConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	@Override
	public int bookUpdate(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookDAOImpl.bookUpdate() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());

			pstmt = conn.prepareStatement(BookSqlMap.getBookUpdateQuery());
			
			System.out.println("getBookUpdate Query : \n" + BookSqlMap.getBookUpdateQuery());
			
			pstmt.clearParameters();
			
			pstmt.setString(1, bvo.getBprice());
			pstmt.setString(2, bvo.getBqty());
			pstmt.setString(3, bvo.getBnum());
			
			nCnt = pstmt.executeUpdate();
			
			System.out.println("가져온 nCnt 의 값 : " + nCnt);
			
			// getAutoCommit() : 이 Connection 객체에 대한 현재 자동 커밋 모드를 검색합니다. 
			// return 값 : 이 Connection 객체의 자동 커밋 모드의 현재 상태
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());
			System.out.println("nCnt : " + nCnt + "건 수정되었습니다!");
			
			ConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e){
			System.out.println("DB에 수정하는데 문제가 발생했습니다. : " + e);
			
		} finally{
			ConnProperty.conClose(conn, pstmt);
		}
		System.out.println("BookDAOImpl.bookUpdate() 종료");

		return nCnt;
	}

	@Override
	public int bookDelete(BookVO bvo) {
		// TODO Auto-generated method stub
		System.out.println("BookDAOImpl.bookDelete() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());

			pstmt = conn.prepareStatement(BookSqlMap.getBookDeleteQuery());
			
			System.out.println("getBookDelete Query : \n" + BookSqlMap.getBookDeleteQuery());
			
			pstmt.clearParameters();
			
			pstmt.setString(1, bvo.getBnum());
			
			nCnt = pstmt.executeUpdate();
			
			System.out.println("가져온 nCnt 의 값 : " + nCnt);
			
			// getAutoCommit() : 이 Connection 객체에 대한 현재 자동 커밋 모드를 검색합니다. 
			// return 값 : 이 Connection 객체의 자동 커밋 모드의 현재 상태
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("conn.getAutoCommit() : " + conn.getAutoCommit());
			System.out.println("nCnt : " + nCnt + "건 삭제되었습니다!");
			
			ConnProperty.conClose(conn, pstmt);
			
		} catch(Exception e){
			System.out.println("DB에 삭제하는데 문제가 발생했습니다. : " + e);
			
		} finally{
			ConnProperty.conClose(conn, pstmt);
		}
		System.out.println("BookDAOImpl.bookDelete() 종료");

		return nCnt;
	}

}
