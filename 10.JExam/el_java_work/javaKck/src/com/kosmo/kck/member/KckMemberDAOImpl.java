package com.kosmo.kck.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.kosmo.kck.common.KckConnProperty;

public class KckMemberDAOImpl implements KckMemberDAO {

	@Override
	public ArrayList<KckMemberVO> kmemselectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckMemberDAOImpl.kmemselectAll() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KckMemberVO> aList = null;
		
		try {
			conn = KckConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberSelectAllQuery());
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
				
				aList = new ArrayList<KckMemberVO>();
				
				while (rsRs.next()) {
					
					KckMemberVO kvo = new KckMemberVO();
					
					kvo.setKnum(rsRs.getString(1));
					kvo.setKname(rsRs.getString(2));
					kvo.setKid(rsRs.getString(3));
					kvo.setKpw(rsRs.getString(4));
					kvo.setKbirth(rsRs.getString(5));
					kvo.setKgender(rsRs.getString(6));
					kvo.setKtel(rsRs.getString(7));
					kvo.setKhp(rsRs.getString(8));
					kvo.setKemail(rsRs.getString(9));
					kvo.setKaddr(rsRs.getString(10));
					kvo.setKhobby(rsRs.getString(11));
					kvo.setKphoto(rsRs.getString(12));
					kvo.setKskill(rsRs.getString(13));
					kvo.setKjob(rsRs.getString(14));
					kvo.setDeleteyn(rsRs.getString(15));
					kvo.setInsertdate(rsRs.getString(16));
					kvo.setUpdatedate(rsRs.getString(17));
					
					aList.add(kvo);
				}				
			}
			KckConnProperty.conClose(conn, pstmt, rsRs);
			
		}catch(Exception e) {
			System.out.println("DB에서 전체 조회중 에러가 발생했어요! : " + e.getMessage());
		}finally {
			KckConnProperty.conClose(conn, pstmt, rsRs);
		}
		return aList;
	}

	@Override
	public ArrayList<KckMemberVO> kmemselect(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean kmemInsert(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kmemUpdate(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean kmemDelete(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<KckMemberVO> kmemSelectName(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KckMemberVO> kmemSelectId(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean kmemIdCheck(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
