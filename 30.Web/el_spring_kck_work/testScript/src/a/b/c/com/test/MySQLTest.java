package a.b.c.com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLTest {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		String mysql_url = "jdbc:mysql://localhost:3306/member?serverTimezone=UTC";
		String mysql_user = "root";
		String mysql_pw = "1234";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conn = DriverManager.getConnection(mysql_url, mysql_user, mysql_pw);
				Statement stmt = conn.createStatement();
				ResultSet rsRs = stmt.executeQuery("SELECT * FROM remember");
				
				while(rsRs.next()) {
					String mid = rsRs.getString("mid");
					String mpw = rsRs.getString("mpw");
					String mname = rsRs.getString("mname");
					String memail = rsRs.getString("memail");
					String mtel = rsRs.getString("mtel");
					String mloc = rsRs.getString("mloc");
					String mdate = rsRs.getString("mdate");

					System.out.print(mid + "");
					System.out.print(mpw + "");
					System.out.print(mname + "");
					System.out.print(memail + "");
					System.out.print(mtel + "");
					System.out.print(mloc + "");
					System.out.println(mdate);		
					
				}
			
		} catch (Exception e){
			System.out.println("DB에러가 발생했습니다. >>> : " + e);
		} 
		
	}
	
}
