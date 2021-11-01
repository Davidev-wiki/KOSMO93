package a.b.c.com.paging;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class ConnProperty {
	
	public static final String KOS_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String KOS_USER = "scott";
	public static final String KOS_PASS = "tiger";
	public static final String KOS_DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	public static Connection getConnection(){
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty.KOS_DRIVER);
			conn = DriverManager.getConnection(ConnProperty.KOS_URL
											  ,ConnProperty.KOS_USER
											  ,ConnProperty.KOS_PASS);
		}catch(Exception e) {
			System.out.println("드라이버 찾기에 문제 발생 >> : " + e.getMessage());
		}
		
		return conn;
	}// end of getConnection 함수
	
	public static void conClose(Connection conn
							   ,PreparedStatement pstmt
							   ,ResultSet rsRs) {
		try {
			if(rsRs != null) try {rsRs.close(); rsRs = null;} catch(Exception ex) {}
			if(pstmt != null) try {pstmt.close(); pstmt = null;} catch(Exception ex) {}
			if(conn != null) try {conn.close(); conn = null;} catch(Exception ex) {}
		}
		catch(Exception e) {}
	}// end of conClose 함수 (매개변수 3개)
	
	public static void conClose(Connection conn, PreparedStatement pstmt) {
		try {
			if(pstmt != null) try {pstmt.close(); pstmt = null;} catch(Exception e) {}
			if(conn != null) try {conn.close(); conn = null;} catch(Exception e) {}
		}
		catch(Exception e2) {}
	}// end of conClose 함수 (매개변수 2개)

}
