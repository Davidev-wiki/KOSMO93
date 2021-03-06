package a.b.c.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.KckConnProperty2;
import a.b.c.mem.sql.KckMemberSqlMap;
import a.b.c.mem.vo.KckMemberVO;

public class KckMemberDAOImpl implements KckMemberDAO {

	@Override
	public ArrayList<KckMemberVO> kmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KckMemberDAOImpl.kmemSelectAll 함수가 시작되었습니다.");
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rsRs = null;
		
		ArrayList<KckMemberVO> aList = null;
		
		try {
			
			conn = a.b.c.common.KckConnProperty2.getConnection();
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberSelectAllQuery());
			
			System.out.println("전체 조회 \n" + KckMemberSqlMap.getKckMemberSelectAllQuery());
			
			rsRs = pstmt.executeQuery();
			
			if(rsRs!=null) {
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
		} catch(Exception e) {
			System.out.println("kmemSelectAll() 함수에서 디비연결 또는 쿼리에서 문제가 생겼슴 >>> : " + e.getMessage());		}
		
		return aList;
	}

	@Override
	public ArrayList<KckMemberVO> kmemSelect(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberDAOImpl.kmemSelect 함수가 시작되었습니다.");
		KckMemberVO.printlnKckMemberVO(kvo);
		
		Connection conn = null;
		PreparedStatement pstmt= null;
		ResultSet rsRs = null;
		
		ArrayList<KckMemberVO> aList = null;
		
		try {
			
			conn = a.b.c.common.KckConnProperty2.getConnection();
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberSelectQuery());
			
			System.out.println("조건 조회 \n" + KckMemberSqlMap.getKckMemberSelectQuery());
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다.
			pstmt.setString(1, kvo.getKnum());
			rsRs = pstmt.executeQuery();
			
			if(rsRs!=null) {
				aList = new ArrayList<KckMemberVO>();
				
				while (rsRs.next()) {
					
					KckMemberVO _kvo = new KckMemberVO();
					
					_kvo.setKnum(rsRs.getString(1));
					_kvo.setKname(rsRs.getString(2));
					_kvo.setKid(rsRs.getString(3));
					_kvo.setKpw(rsRs.getString(4));
					_kvo.setKbirth(rsRs.getString(5));
					_kvo.setKgender(rsRs.getString(6));
					_kvo.setKtel(rsRs.getString(7));
					_kvo.setKhp(rsRs.getString(8));
					_kvo.setKemail(rsRs.getString(9));
					_kvo.setKaddr(rsRs.getString(10));
					_kvo.setKhobby(rsRs.getString(11));
					_kvo.setKphoto(rsRs.getString(12));
					_kvo.setKskill(rsRs.getString(13));
					_kvo.setKjob(rsRs.getString(14));
					_kvo.setDeleteyn(rsRs.getString(15));
					_kvo.setInsertdate(rsRs.getString(16));
					_kvo.setUpdatedate(rsRs.getString(17));
					
					aList.add(_kvo);
				}
			}
			
		} catch(Exception e) {
			System.out.println("kmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼슴 >>> : " + e.getMessage());
			
		}	
		
		return aList;
	}

	@Override
	public boolean kmemInsert(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberDAOImpl.kmemInsert()함수 진입");
		//KckMemberVO.printlnKckMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = KckConnProperty2.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberInsertQuery());
			System.out.println("입력하기 >>> : \n"+ KckMemberSqlMap.getKckMemberInsertQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKnum()); // 202108060007
			pstmt.setString(2, kvo.getKname()); // GGGG
			pstmt.setString(3, kvo.getKid());   // GG00
			pstmt.setString(4, kvo.getKpw());
			pstmt.setString(5, kvo.getKbirth());
			pstmt.setString(6, kvo.getKgender());
			pstmt.setString(7, kvo.getKtel());
			pstmt.setString(8, kvo.getKhp());			
			pstmt.setString(9, kvo.getKemail());
			pstmt.setString(10, kvo.getKaddr());
			pstmt.setString(11, kvo.getKhobby());
			pstmt.setString(12, kvo.getKphoto());
			pstmt.setString(13, kvo.getKskill());
			pstmt.setString(14, kvo.getKjob());
		
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt : " + nCnt + " 건 등록 완료 되었습니다. ");
			
			if (nCnt > 0) { bool = true;}
			
			KckConnProperty2.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다.  : " + e);
		}finally {
			try {
				KckConnProperty2.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}

	@Override
	public boolean kmemUpdate(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberDAOImpl kmemUpdate() 함수 진입 >>> : ");
		KckMemberVO.printlnKckMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = KckConnProperty2.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberUpdateQuery());
			System.out.println("수정하기 >>> : \n"+ KckMemberSqlMap.getKckMemberUpdateQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKemail());
			pstmt.setString(2, kvo.getKaddr());
			pstmt.setString(3, kvo.getKhobby());			
			pstmt.setString(4, kvo.getKjob());
			pstmt.setString(5, kvo.getKnum()); 
		
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 수정 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			KckConnProperty2.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KckConnProperty2.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}


	@Override
	public boolean kmemDelete(KckMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KckMemberDAOImpl kmemDelete() 함수 진입 >>> : ");
		KckMemberVO.printlnKckMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = KckConnProperty2.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberDeleteQuery());
			System.out.println("삭제하기 >>> : \n"+ KckMemberSqlMap.getKckMemberDeleteQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getKnum()); 
		
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 삭제 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			KckConnProperty2.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KckConnProperty2.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;	
	}

}
