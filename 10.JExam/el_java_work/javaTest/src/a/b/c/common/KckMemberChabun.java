package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.mem.sql.KckMemberSqlMap;

// ä�� ���� ������ִ� �Լ�
public class KckMemberChabun {

	public static final String BIZ_GUBUN_M = "M"; // ���������ڵ�
	
	/*
	 * ���� ��¥ �޾ƿ��� public static String ymdFormats() { return new
	 * SimpleDateFormat("yyyyMMdd").format(new Date()); }
	 * 
	 * 0001 �ڸ��� ä��� �Լ�, commNO �� �� ���� 0 ���� ä��� public static String numPad(String s)
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
			System.out.println("ȸ�� ä�� ���� : KckMemberSqlMap.getKckMemberChabunQuery() >> : ");
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs != null) {
				while(rsRs.next()) {
					commNO = rsRs.getString("COMMNO");
				}
				
			}else {
				System.out.println("ä�� ���� �����߾��..");
			}
			
			// DB���� ������ �ƽ��� ::1
			System.out.println("commNO �ƽ��� 1 : " + commNO);
			
			// DB���� ������ �ƽ��� ::1 ���ٰ� ������ 0���� ä���
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO�� 0ä���� 4�ڸ� ����� : " + commNO);
			
			// ���� ��¥ ���� �ٿ��ֱ� : 20210809 + 0001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("��¥���� �ٿ����� : " + commNO);
			
			// �������� �ڵ� (M) �ٿ��ֱ�
			commNO = KckMemberChabun.BIZ_GUBUN_M.concat(commNO);
			System.out.println("���� ���� : " + commNO);
			
			KckConnProperty2.conClose(conn, pstmt, rsRs);
			
		} catch(Exception e) {
			System.out.println("DB���������.. : " + e);
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
