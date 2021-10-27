package a.b.c.com.paging;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class ConnProperty {
	
	// 연결 설정 : 상수로 초기화
	public static final String KOS_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	public static final String KOS_USER = "scott";
	public static final String KOS_PASS = "tiger";
	public static final String KOS_DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	// Connection Openning Method
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			
			Class.forName(ConnProperty.KOS_DRIVER);
			conn = DriverManager.getConnection(ConnProperty.KOS_URL
											  ,ConnProperty.KOS_USER
											  ,ConnProperty.KOS_PASS);
			
		} catch(Exception e) {
			System.out.println("Error : " + e.getMessage());
		}
		
		return conn;
	}

	// Connection Closing method
	// Overloading
	public static void conClose(Connection conn, PreparedStatement pstmt, ResultSet rsRs) {
		try {
			if(rsRs!=null) try {rsRs.close(); rsRs = null;} catch(Exception ex) {}
			if(pstmt!=null) try {pstmt.close(); pstmt = null;} catch(Exception ex) {}
			if(conn!=null) try {conn.close(); conn = null;} catch(Exception ex) {}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	// Connection Closing method
	// Overloading
	public static void conClose(Connection conn, PreparedStatement pstmt) {
		try {
			if(pstmt!=null) try {pstmt.close(); pstmt = null;} catch(Exception ex) {}
			if(conn!=null) try {conn.close(); conn = null;} catch(Exception ex) {}
		} catch(Exception e) {
			System.out.println(e);
		}
	}

} // end ouf Connproperty
