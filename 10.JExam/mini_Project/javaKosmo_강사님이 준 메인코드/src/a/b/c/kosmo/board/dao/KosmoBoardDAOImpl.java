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
		System.out.println("HbeBoardDAOImpl hboardSelectAll() �Լ� ���� >>> : ");		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<KosmoBoardVO> aList = null;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardSelectAllQueryMap());
			System.out.println("��ü��ȸ :: \n" + KosmoBoardSqlMap.getHboardSelectAllQueryMap());
			
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
			System.out.println(" ��ü��ȸ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}	

	@Override
	public ArrayList<KosmoBoardVO> hboardSelect(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardSelect() �Լ� ���� >>> : ");		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<KosmoBoardVO> aList = null;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardSelectQueryMap());
			System.out.println("������ȸ :: \n" + KosmoBoardSqlMap.getHboardSelectQueryMap());
			
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
			System.out.println(" ��ü��ȸ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}

	@Override
	public int hboardInsert(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardInsert() �Լ� ���� >>> : ");
				
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardInsertQueryMap());
			System.out.println("�μ�Ʈ :: \n" + KosmoBoardSqlMap.getHboardInsertQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());
			pstmt.setString(2, hvo.getBsubject());
			pstmt.setString(3, hvo.getBwriter());
			pstmt.setString(4, hvo.getBcontents());	
			pstmt.setString(5, hvo.getBpw());			
								
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " �� ��� �Ǿ��� ");			
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" �μ�Ʈ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

	@Override
	public int hboardUpdate(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardUpdate() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardUpdateFQueryMap());
			System.out.println("������Ʈ :: \n" + KosmoBoardSqlMap.getHboardUpdateFQueryMap());
			
			pstmt.clearParameters();
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBsubject());
			pstmt.setString(2, hvo.getBcontents());
			pstmt.setString(3, hvo.getBnum());						
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " �� ���� �Ǿ��� ");			
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" ������Ʈ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

	@Override
	public int hboardDelete(KosmoBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardDelete() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardDeleteQueryMap());
			System.out.println("����Ʈ :: \n" + KosmoBoardSqlMap.getHboardDeleteQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());						
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " �� ���� �Ǿ��� ");			
			
			KosmoConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" ����Ʈ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

}
