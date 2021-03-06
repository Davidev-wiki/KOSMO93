package a.b.c.board.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class KckBoardConnProperty {

	// 상수
	private static final String ORCL_JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "kck00";
	private static final String ORCL_PASS = "kck1234";

	// 함수
	public static Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName(KckBoardConnProperty.ORCL_JDBC_DRIVER);
			conn = DriverManager.getConnection(KckBoardConnProperty.ORCL_URL, KckBoardConnProperty.ORCL_USER,
					KckBoardConnProperty.ORCL_PASS);
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 도중 문제 발생! : " + e.getMessage());
		}

		return conn;
	}
	
	// 연결 해제 함수
	public static void conClose(Connection conn, PreparedStatement pstmt, ResultSet rsRs) {
		try {
			if (rsRs != null)
				try {
					rsRs.close();
					rsRs = null;
				} catch (Exception ez) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
					pstmt = null;
				} catch (Exception ez) {
				}
			if (conn != null)
				try {
					conn.close();
					conn = null;
				} catch (Exception ez) {
				}

		} catch (Exception e) {

		}

	}
	
	// 연결 해제 함수
	public static void conClose(Connection conn, PreparedStatement pstmt) {
		try {
			if (pstmt != null)
				try {
					pstmt.close();
					pstmt = null;
				} catch (Exception ez) {
				}
			if (conn != null)
				try {
					conn.close();
					conn = null;
				} catch (Exception ez) {
				}

		} catch (Exception e) {

		}
	}

}
