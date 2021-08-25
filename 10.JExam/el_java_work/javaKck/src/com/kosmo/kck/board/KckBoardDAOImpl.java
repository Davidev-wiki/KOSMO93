package com.kosmo.kck.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kosmo.kck.common.KckConnProperty;

public class KckBoardDAOImpl implements KckBoardDAO {

	@Override
	public ArrayList<KckBoardVO> kboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardSelectAll()함수 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KckBoardVO> aList = null;
		
		try {
			conn = KckConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardSelectAllQueryMap());
			rsRs = pstmt.executeQuery();
			
			if (rsRs != null) {
				aList = new ArrayList<KckBoardVO>();
				
				while(rsRs.next()) {
					
					KckBoardVO kvo = new KckBoardVO();
					
					kvo.setBnum(rsRs.getString(1));
					kvo.setBsubject(rsRs.getString(2));
					kvo.setBwriter(rsRs.getString(3));
					kvo.setBcontents(rsRs.getString(4));
					kvo.setBpw(rsRs.getString(5));
					kvo.setDeleteyn(rsRs.getString(6));
					kvo.setInsertdate(rsRs.getString(7));
					kvo.setUpdatedate(rsRs.getString(8));
					
					aList.add(kvo);
				}
			}
			KckConnProperty.conClose(conn, pstmt, rsRs);			
		} catch(Exception e) {
			System.out.println("전체 조회를 위해 DB에 연결 중 문제가 발생했어요! : " + e.getMessage());
		} finally {
			KckConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public ArrayList<KckBoardVO> kboardSelect(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckBoardDAOImpl.kboardSelect()함수 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KckBoardVO> aList = null;
		
		try {
			conn = KckConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardSelectAllQueryMap());
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBnum());
			rsRs = pstmt.executeQuery();
			
			if (rsRs != null) {
				aList = new ArrayList<KckBoardVO>();
				
				while(rsRs.next()) {
					
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
			KckConnProperty.conClose(conn, pstmt, rsRs);			
		} catch(Exception e) {
			System.out.println("전체 조회를 위해 DB에 연결 중 문제가 발생했어요! : " + e.getMessage());
		} finally {
			KckConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public int kboardInsert(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int kboardUpdate(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int kboardDelete(KckBoardVO kvo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
