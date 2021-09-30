package a.b.c.com.common;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class OracleMetaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		
		try{
			con = CommonXML.getConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
			
			DatabaseMetaData dm = con.getMetaData();
			
			System.out.println("DatabaseMetaData : " + dm + "\n");
			System.out.println("===============================");
			
			System.out.println("DBMS �̸� : " + dm.getDatabaseProductName());
			System.out.println("DBMS ���� : " + dm.getDatabaseProductVersion());
			System.out.println("JDBC ����̹� �̸� : " + dm.getDriverName());
			
			ResultSetMetaData rsm = rs.getMetaData();
			System.out.println("\nResultSetMetaData rsm : " + rsm + "\n");
			
			int colCount = rsm.getColumnCount();
			System.out.println("colCount : " + colCount + "\n");
			
			for (int i=1; i < colCount; i++){
				
				System.out.println(rsm.getColumnName(i) + "\t");
			
			}
			
			System.out.println("\n ====================================");
			
			while (rs.next()){
				
				for (int i=1; i < colCount; i++){
					System.out.println(rs.getString(i) + "\t");
				}
				System.out.println("");
			}

		} catch(Exception e) {
			System.out.println("DB�� ������ �����͸� ��ȸ�� ������ ������ �߻��߾��. " + e.getMessage());
		} finally{
			
		}
		
		
		
	}

}
