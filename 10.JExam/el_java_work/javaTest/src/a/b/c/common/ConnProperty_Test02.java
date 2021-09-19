package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class ConnProperty_Test02 {

	private static final String ORCL_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
	private static final String ORCL_USER = "test02";
	private static final String ORCL_PASS = "1234";
	
	
	public static Connection getConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty_Test02.ORCL_DRIVER);
			conn = DriverManager.getConnection( ConnProperty_Test02.ORCL_URL, 
												ConnProperty_Test02.ORCL_USER, 
												ConnProperty_Test02.ORCL_PASS);
			
		} catch(Exception e) {
			System.out.println("데이터 연결 도중 문제가 발생했다" + e.getMessage());
		}
		
		return conn;
	}
}
