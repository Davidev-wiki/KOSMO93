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
					// 입력된 아이디와 비번에 맞는 ID값
					nCnt = rsRs.getInt(1);
					System.out.println("가지고 온 nCnt 값 : " + nCnt);
				}

			}
			ConnProperty.conClose(conn, pstmt, rsRs);

		} catch (Exception e) {
			System.out.println("DB에 연결해 정보를 받아오는 중 에러가 발생했어요.. " + e.getMessage());
		} finally {
			ConnProperty.conClose(conn, pstmt, rsRs);

		}

		return nCnt;
	}

}
