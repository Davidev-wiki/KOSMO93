package a.b.c.com.test;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.Statement;

public class SQLiteTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conn = null; 
		
		try { 

			Class.forName("org.sqlite.JDBC");  
			String dbFile = "C:\\00.KOSMO93\\50.Python\\basic\\testDataBase\\db\\est2.sqlite"; 
			conn = DriverManager.getConnection("jdbc:sqlite:" + dbFile); 
 
			Statement stmt = conn.createStatement(); 			
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
			if(conn != null) { 
				try { conn.close(); }catch(Exception e) {} 
			} 
		}
	}	
}
