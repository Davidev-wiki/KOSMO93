package a.b.c.kosmo.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.kosmo.board.sql.KosmoBoardSqlMap;
import a.b.c.kosmo.board.vo.KosmoBoardVO;
import a.b.c.common.KosmoConnProperty;

public class KosmoBoardDAOImpl implements KosmoBoardDAO {

	@Override
	public ArrayList<KosmoBoardVO> hboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardSelectAll() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<KosmoBoardVO> aList = null;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardSelectAllQueryMap());
			System.out.println("전체조회 :: \n" + KosmoBoardSqlMap.getHboardSelectAllQueryMap());
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<KosmoBoardVO>();
			
				while (rsRs.next()){
					
					KosmoBoardVO _hvo = new KosmoBoardVO();
					_hvo.setBnum(rsRs.getString(1));
					_hvo.setBsubject(rsRs.getString(2));
					_hvo.setBwriter(rsRs.getString(3));
					_hvo.setBcontents(rsRs.getString(4));
					_hvo.setBpw(rsRs.getString(5));					
					_hvo.setDeleteyn(rsRs.getString(6));
					_hvo.setInsertdate(rsRs.getString(7));
					_hvo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_hvo);
				}
			}
			
			KosmoConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 전체조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}	

	@Override
	public ArrayList<KosmoBoardVO> hboardSelect(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardSelect() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<KosmoBoardVO> aList = null;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardSelectQueryMap());
			System.out.println("조건조회 :: \n" + KosmoBoardSqlMap.getHboardSelectQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<KosmoBoardVO>();
			
				while (rsRs.next()){
					
					KosmoBoardVO _hvo = new KosmoBoardVO();
					_hvo.setBnum(rsRs.getString(1));
					_hvo.setBsubject(rsRs.getString(2));
					_hvo.setBwriter(rsRs.getString(3));
					_hvo.setBcontents(rsRs.getString(4));
					_hvo.setBpw(rsRs.getString(5));					
					_hvo.setDeleteyn(rsRs.getString(6));
					_hvo.setInsertdate(rsRs.getString(7));
					_hvo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_hvo);
				}
			}
			
			KosmoConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 전체조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}

	@Override
	public int hboardInsert(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardInsert() 함수 진입 >>> : ");
				
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardInsertQueryMap());
			System.out.println("인서트 :: \n" + KosmoBoardSqlMap.getHboardInsertQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());
			pstmt.setString(2, hvo.getBsubject());
			pstmt.setString(3, hvo.getBwriter());
			pstmt.setString(4, hvo.getBcontents());	
			pstmt.setString(5, hvo.getBpw());			
								
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 등록 되었음 ");			
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 인서트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

	@Override
	public int hboardUpdate(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardUpdate() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardUpdateFQueryMap());
			System.out.println("업데이트 :: \n" + KosmoBoardSqlMap.getHboardUpdateFQueryMap());
			
			pstmt.clearParameters();
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBsubject());
			pstmt.setString(2, hvo.getBcontents());
			pstmt.setString(3, hvo.getBnum());						
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 수정 되었음 ");			
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 업데이트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

	@Override
	public int hboardDelete(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardDelete() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardDeleteQueryMap());
			System.out.println("딜리트 :: \n" + KosmoBoardSqlMap.getHboardDeleteQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());						
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 삭제 되었음 ");			
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 딜리트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

}
