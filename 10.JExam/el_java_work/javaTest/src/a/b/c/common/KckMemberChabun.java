package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.mem.sql.KckMemberSqlMap;

// 채번 쿼리 만들어주는 함수
public class KckMemberChabun {

	public static final String BIZ_GUBUN_M = "M"; // 업무구분코드
	
	/*
	 * 오늘 날짜 받아오기 public static String ymdFormats() { return new
	 * SimpleDateFormat("yyyyMMdd").format(new Date()); }
	 * 
	 * 0001 자리수 채우는 함수, commNO 의 수 보고 0 개수 채우기 public static String numPad(String s)
	 * {
	 * 
	 * int sLen = s.length(); for (int i=sLen; i < 4; i++) { s = "0" + s; } return
	 * s; }
	 */
	
	public static String ymdNum() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = KckConnProperty2.getConnection();
			pstmt = conn.prepareStatement(KckMemberSqlMap.getKckMemberChabunQuery());
			System.out.println("회원 채번 쿼리 : KckMemberSqlMap.getKckMemberChabunQuery() >> : ");
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs != null) {
				while(rsRs.next()) {
					commNO = rsRs.getString("COMMNO");
				}
				
			}else {
				System.out.println("채번 쿼리 실패했어요..");
			}
			
			// DB에서 가져온 맥스값 ::1
			System.out.println("commNO 맥스값 1 : " + commNO);
			
			// DB에서 가져온 맥스값 ::1 에다가 공백을 0으로 채우기
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO에 0채워서 4자리 만들기 : " + commNO);
			
			// 현재 날짜 형식 붙여주기 : 20210809 + 0001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("날짜형식 붙여줬어요 : " + commNO);
			
			// 업무구분 코드 (M) 붙여주기
			commNO = KckMemberChabun.BIZ_GUBUN_M.concat(commNO);
			System.out.println("최종 형식 : " + commNO);
			
			KckConnProperty2.conClose(conn, pstmt, rsRs);
			
		} catch(Exception e) {
			System.out.println("DB에러났어요.. : " + e);
		} finally {
			KckConnProperty2.conClose(conn, pstmt, rsRs);
		}
		
		return commNO;
	}
	
	public static void main(String args[]) {
		String commNO = KckMemberChabun.ymdNum();
		System.out.println("commNO :" + commNO);
	}
	
}
