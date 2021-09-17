package a.b.c.com.kosmo.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.mem.sql.MemberSqlMap;
import a.b.c.com.kosmo.mem.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public ArrayList<MemberVO> memberSelectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberVO> memberSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memberInsert() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("커넥션의 오토커밋 여부 : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(MemberSqlMap.getMemberInsertQuery());
			System.out.println("실행된 쿼리문 : " + MemberSqlMap.getMemberInsertQuery());
			
			// pstmt실행 전 쿼리 데이터에 파라미터 전달하기
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getMnum());
			pstmt.setString(2, mvo.getMname()); 
			pstmt.setString(3, mvo.getMid());   
			pstmt.setString(4, mvo.getMpw());
			pstmt.setString(5, mvo.getMgender());
			pstmt.setString(6, mvo.getMbirth());
			pstmt.setString(7, mvo.getMhp());
			pstmt.setString(8, mvo.getMtel());						
			pstmt.setString(9, mvo.getMemail());
			pstmt.setString(10, mvo.getMzonecode());
			pstmt.setString(11, mvo.getMroadaddress());
			pstmt.setString(12, mvo.getMjibunaddress());
			pstmt.setString(13, mvo.getMhobby());
			pstmt.setString(14, mvo.getMinfo());
			pstmt.setString(15, mvo.getMphoto());
			pstmt.setString(16, mvo.getMadmin());
			
			nCnt = pstmt.executeUpdate();
			System.out.println("업데이트 실행  : " + nCnt + "건 완료!");
			if(!conn.getAutoCommit()) conn.getAutoCommit();
			
			if (nCnt > 0) {
				bool = true;
			}
			
			ConnProperty.conClose(conn, pstmt);
			
		}catch(Exception e){
			
			System.out.println("DB에 Insert하는데 문제가 발생했어요! : " + e);
			
		}finally{
			
			ConnProperty.conClose(conn, pstmt);
		}
		
		System.out.println("MemberDAOImpl.memberInsert() 종료");
	
		return bool;
	}

	@Override
	public boolean memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
