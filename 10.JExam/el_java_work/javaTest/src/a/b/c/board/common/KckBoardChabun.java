package a.b.c.board.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.board.sql.KckBoardSqlMap;
import a.b.c.board.vo.KckBoardVO;

public class KckBoardChabun {

	public static final String BIZ_GUBUN_M = "M"; // ȸ��
	public static final String BIZ_GUBUN_B = "B"; // �Խ���

	public static String gubunNum() {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";

		try {
			conn = KckBoardConnProperty.getConnection();
			pstmt = conn.prepareStatement(KckBoardSqlMap.getKboardChabunQueryMap());
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {
				while (rsRs.next()) {
					KckBoardVO kvo = new KckBoardVO();
					commNO = rsRs.getString("COMMNO");
				}
			} else {
				System.out.println("ä���� �����߾��, ������ Ȯ�����ּ���..");
			}
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("DB�� ������ �Ұ��ϰų� ä���� �Ұ����մϴ�..");
		} finally {
			KckBoardConnProperty.conClose(conn, pstmt, rsRs);

		}

		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String commNO = KckBoardChabun.gubunNum();
		System.out.println("ä�� �Ϸ�� commNO�� �� : " + commNO);
	}

}
