package a.b.c.com.test;

// https://javalibs.com/artifact/org.xerial/sqlite-jdbc
	
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement;
	
public class SQLiteTest2 {
	
	
	public void selectSQLite(String price_1, String price_2) {

		Connection conn = null; 
		
		try { 

			Class.forName("org.sqlite.JDBC");  
			String dbFile = "C:\\00.KOSMO93\\50.Python\\basic\\testDataBase\\db\\est2.sqlite"; 
			conn = DriverManager.getConnection("jdbc:sqlite:" + dbFile); 
 
			Statement stmt = conn.createStatement(); 	
			String sql =  "SELECT item_id, name, price FROM items "
						+ "WHERE price >= "+ price_1 + " AND price <=" + price_2;			
			System.out.println("퀴리 >>> : \n" + sql);
			
			ResultSet rsRs = stmt.executeQuery(sql); 
			
			while(rsRs.next()) { 
					String item_id = rsRs.getString("item_id"); 
					String name = rsRs.getString("name"); 
					String price = rsRs.getString("price"); 
					System.out.println(item_id + " " + name + " " + price); 
			} 
		}catch(Exception e) { 
			System.out.println(e);
		}finally { 
			if(conn != null) { 
				try { conn.close(); }catch(Exception e) {} 
			} 
		}		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQLiteTest2 st2 = new SQLiteTest2();
		String price_1 = "4000";
		String price_2 = "7000";
		st2.selectSQLite(price_1, price_2);
	}	
}
