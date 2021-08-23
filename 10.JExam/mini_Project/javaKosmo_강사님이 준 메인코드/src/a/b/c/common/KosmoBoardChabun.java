package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//import java.util.Date;

import a.b.c.kosmo.board.sql.KosmoBoardSqlMap;


public class KosmoBoardChabun {
	
	public static final String BIZ_GUBUN_M = "M"; // ȸ��
	public static final String BIZ_GUBUN_B = "B"; // �Խ���
	

	// ä�� ����  �ҷ����� 
	public static String gubunNum() {
		
		// �������� ���� �ϰ� �ʱ�ȭ �ϱ� 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = KosmoConnProperty.getConnection();
			pstmt = conn.prepareStatement(KosmoBoardSqlMap.getHboardChabunQueryMap());
			System.out.println("�Խ���ä�� ���� >>> \n" + KosmoBoardSqlMap.getHboardChabunQueryMap());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNO = rsRs.getString("COMMNO");									
				}
			}else {
				System.out.println("ä������ ���� >>> : ");
			}
			
			// ��񿡼� ������  �ƽ��� :: 1
			System.out.println("commNO >>> : " + commNO);			
			// ��񿡼� ������  �ƽ��� :: 1 + 000 ä��� : 0001
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO >>> : " + commNO);		
			// �������� �ڵ� ���̱� : �Խ��� B
			commNO = KosmoBoardChabun.BIZ_GUBUN_B.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			KosmoConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("HbeMemberChabun gubunNum ��� ���� >>> : " + e.getMessage());
		}finally {
			KosmoConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNO = KosmoBoardChabun.gubunNum();
		System.out.println("main :: commNO >>> : " + commNO);
	}
}
