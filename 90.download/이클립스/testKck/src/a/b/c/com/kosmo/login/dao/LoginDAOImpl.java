package a.b.c.com.kosmo.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.com.common.ConnProperty;
import a.b.c.com.kosmo.login.sql.LoginSqlMap;
import a.b.c.com.kosmo.mem.vo.MemberVO;

public class LoginDAOImpl implements LoginDAO {

	@Override
	public int loginCheckCnt(MemberVO mvo) {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		int nCnt = 0;

		try {
			conn = ConnProperty.getConnection();
			pstmt = conn.prepareStatement(LoginSqlMap.getLoginCheckCntQuery());
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getMid());
			pstmt.setString(2, mvo.getMpw());
			rsRs = pstmt.executeQuery();

			if (rsRs != null) {

				while (rsRs.next()) {
					// �Էµ� ���̵�� ����� �´� ID��
					nCnt = rsRs.getInt(1);
					System.out.println("������ �� nCnt �� : " + nCnt);
				}

			}
			ConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("DB�� ������ ������ �޾ƿ��� �� ������ �߻��߾��.. " + e.getMessage());
		} finally {
			ConnProperty.conClose(conn, pstmt, rsRs);

		}

		return nCnt;
	}

}
