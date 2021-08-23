package a.b.c.kosmo.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.common.KosmoConnProperty;
import a.b.c.kosmo.login.sql.KosmoLoginQueryMap;
import a.b.c.kosmo.mem.vo.KosmoMemberVO;


public class KosmoLoginDAOImpl implements KosmoLoginDAO {

	@Override
	public int hLoginCheck(KosmoMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeLoginDAOImpl hLoginCheck() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		int nCnt = 0;
		
		try{
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoLoginQueryMap.gethLoginCheckQuery());
			System.out.println("로그인 체크  :: \n" + KosmoLoginQueryMap.gethLoginCheckQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getHid());
			pstmt.setString(2, hvo.getHpw());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				while (rsRs.next()){
					nCnt = rsRs.getInt(1);
				}
			}
			
			KosmoConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 로그인체크 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			KosmoConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return nCnt;
	}
}
