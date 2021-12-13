package a.b.c.com.test;

// JDBC 드라이버 다운링크
// https://javalibs.com/artifact/org.xerial/sqlite-jdbc
	
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement;
	
public class SQLiteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null; 
		
		try { 
			// SQLite JDBC 체크
			Class.forName("org.sqlite.JDBC"); 
			
			// SQLite 데이터베이스 파일에 연결 String 
			String dbFile = "C:\\Users\\82107\\Desktop\\git repo\\50.Python\\basic\\testDataBase\\db\\est.sqlite"; 
			con = DriverManager.getConnection("jdbc:sqlite:" + dbFile); 
			
			// SQL 수행 :: 커서함수로 row 하나씩 읽어오기 
			Statement stmt = con.createStatement(); 
			
			ResultSet rsRs = stmt.executeQuery("SELECT item_id, name, price FROM items"); 
			
			while(rsRs.next()) { 
					String item_id = rsRs.getString("item_id"); 
					String name = rsRs.getString("name"); 
					String price = rsRs.getString("price"); 
					System.out.println(item_id + " " + name + " " + price); 
			} 
		}catch(Exception e) { 
			System.out.println(e);
		}finally { 
			if(con != null) { 
				try {con.close();}catch(Exception e) {} 
			} 
		}
	}	
}
