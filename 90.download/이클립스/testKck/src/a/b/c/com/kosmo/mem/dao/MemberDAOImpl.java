package a.b.c.com.kosmo.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.mem.sql.MemberSqlMap;
import a.b.c.com.kosmo.mem.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	@Override
	public ArrayList<MemberVO> memberSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memberSelectAll() 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<MemberVO> aList = null;
		
		try {
			
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(MemberSqlMap.getMemberSelectAllQuery());
			
			System.out.println("전체조회 \n" + MemberSqlMap.getMemberSelectAllQuery());			
			
			rsRs = pstmt.executeQuery();			
			
			if (rsRs != null) {
				
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {
					
					MemberVO _mvo = new MemberVO();
					
					_mvo.setMnum(rsRs.getString(1)); 
					_mvo.setMname(rsRs.getString(2)); 
					_mvo.setMid(rsRs.getString(3));
					_mvo.setMpw(rsRs.getString(4));
					_mvo.setMgender(rsRs.getString(5));
					_mvo.setMbirth(rsRs.getString(6));
					_mvo.setMhp(rsRs.getString(7));					
					_mvo.setMtel(rsRs.getString(8));
					_mvo.setMemail(rsRs.getString(9));					
					_mvo.setMzonecode(rsRs.getString(10));
					_mvo.setMroadaddress(rsRs.getString(11));
					_mvo.setMjibunaddress(rsRs.getString(12));					
					_mvo.setMhobby(rsRs.getString(13));
					_mvo.setMinfo(rsRs.getString(14));
					_mvo.setMphoto(rsRs.getString(15));					
					_mvo.setMadmin(rsRs.getString(16));
					_mvo.setDeleteyn(rsRs.getString(17));
					_mvo.setInsertdate(rsRs.getString(18));
					_mvo.setUpdatedate(rsRs.getString(19));
					
					aList.add(_mvo);
					MemberVO.printlnMemberVO(_mvo);
				}				
			}
			
			ConnProperty.conClose(conn, pstmt, rsRs);
			
		}catch(Exception e) {
			
			System.out.println("DB에서 전체 조회중(또는 쿼리에서) 에러가 발생했어요.. : " + e.getMessage());
		
		}finally {
			
			ConnProperty.conClose(conn, pstmt, rsRs);
			
		}
		
		System.out.println("MemberDAOImpl.memberSelectAll() 종료");

		return aList;
	}

	@Override
	public ArrayList<MemberVO> memberSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memberSelect() 진입");

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try{
			
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(MemberSqlMap.getMemberSelectQuery());
			System.out.println("DB에 전달할 Query : " + MemberSqlMap.getMemberSelectQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getMnum());
			
			rsRs = pstmt.executeQuery();
			
			if(rsRs != null) {
			
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {
					
					MemberVO _mvo = new MemberVO();
					
					_mvo.setMnum(rsRs.getString(1));
					_mvo.setMname(rsRs.getString(2));
					_mvo.setMid(rsRs.getString(3));
					_mvo.setMpw(rsRs.getString(4));
					_mvo.setMgender(rsRs.getString(5));
					_mvo.setMbirth(rsRs.getString(6));
					_mvo.setMhp(rsRs.getString(7));					
					_mvo.setMtel(rsRs.getString(8));
					_mvo.setMemail(rsRs.getString(9));					
					_mvo.setMzonecode(rsRs.getString(10));
					_mvo.setMroadaddress(rsRs.getString(11));
					_mvo.setMjibunaddress(rsRs.getString(12));					
					_mvo.setMhobby(rsRs.getString(13));
					_mvo.setMinfo(rsRs.getString(14));
					_mvo.setMphoto(rsRs.getString(15));					
					_mvo.setMadmin(rsRs.getString(16));
					_mvo.setDeleteyn(rsRs.getString(17));
					_mvo.setInsertdate(rsRs.getString(18));
					_mvo.setUpdatedate(rsRs.getString(19));

					aList.add(_mvo);
				}
				
			} else {
				System.out.println("DB에서 데이터를 가져오지 못했어요..");
			}
			
			ConnProperty.conClose(conn, pstmt, rsRs);
			
		} catch (Exception e) {
			System.out.println("DB와 연결해 데이터 조회중 에러가 발생했어요.. : " + e.getMessage());
		} finally{
			ConnProperty.conClose(conn, pstmt, rsRs);
		}
		System.out.println("MemberDAOImpl.memberSelect() 종료");

		return aList;
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
			System.out.println("등록 실행  : " + nCnt + "건 완료!");
			if(!conn.getAutoCommit()) conn.getAutoCommit();
			
			if (nCnt > 0) {
				bool = true;
			}
			
			ConnProperty.conClose(conn, pstmt);
			
		}catch(Exception e){
			
			System.out.println("DB에 등록하는데 문제가 발생했어요! : " + e.getMessage());
			
		}finally{
			
			ConnProperty.conClose(conn, pstmt);
		}
		
		System.out.println("MemberDAOImpl.memberInsert() 종료");
	
		return bool;
	}

	@Override
	public boolean memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memberUpdate() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("커넥션의 오토커밋 여부 : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(MemberSqlMap.getMemberUpdateQuery());
			System.out.println("실행된 쿼리문 : " + MemberSqlMap.getMemberUpdateQuery());
			
			// pstmt실행 전 쿼리 데이터에 파라미터 전달하기
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getMemail());
			pstmt.setString(2, mvo.getMzonecode()); 
			pstmt.setString(3, mvo.getMroadaddress());   
			pstmt.setString(4, mvo.getMjibunaddress());
			pstmt.setString(5, mvo.getMhobby());
			pstmt.setString(6, mvo.getMnum());
			
			nCnt = pstmt.executeUpdate();
			System.out.println("업데이트 실행  : " + nCnt + "건 완료!");
			if(!conn.getAutoCommit()) conn.getAutoCommit();
			
			if (nCnt > 0) {
				bool = true;
			}
			
			ConnProperty.conClose(conn, pstmt);
			
		}catch(Exception e){
			
			System.out.println("DB에서 수정하는데 문제가 발생했어요! : " + e.getMessage());
			
		}finally{
			
			ConnProperty.conClose(conn, pstmt);
		}
		
		System.out.println("MemberDAOImpl.memberUpdate() 종료");
	
		return bool;
	}

	@Override
	public boolean memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAOImpl.memberDelete() 진입");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		
		try{
			
			conn = ConnProperty.getConnection();
			System.out.println("커넥션의 오토커밋 여부 : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(MemberSqlMap.getMemberDeleteQuery());
			System.out.println("실행된 쿼리문 : " + MemberSqlMap.getMemberDeleteQuery());
			
			// pstmt실행 전 쿼리 데이터에 파라미터 전달하기
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getMnum());
			
			nCnt = pstmt.executeUpdate();
			System.out.println("삭제 실행  : " + nCnt + "건 완료!");
			if(!conn.getAutoCommit()) conn.getAutoCommit();
			
			if (nCnt > 0) {
				bool = true;
			}
			
			ConnProperty.conClose(conn, pstmt);
			
		}catch(Exception e){
			
			System.out.println("DB에 연결해서 삭제하는데 문제가 발생했어요! : " + e.getMessage());
			
		}finally{
			
			ConnProperty.conClose(conn, pstmt);
		}
		
		System.out.println("MemberDAOImpl.memberDelete() 종료");
	
		return bool;
	}

}
