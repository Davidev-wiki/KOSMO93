
/*
[������ �� �ʿ��� �غ�]
- ����Ŭ���� �����ϴ� (java database connection) ����̹�
- ����̹� �Ŵ���
- URL : �����ϰ��� �ϴ� ��ǻ��, ���α׷��� ��Ʈ��ȣ, SID(or Global Database Name : ������)
- ID : ������
- PW : ���
*/

package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class KckConnProperty {
	// ��� 
		// �����ͺ��̽� ���� ���� : DataSource : �����δ� �����ͺ��̽� ���������� �����ͼҽ���� �θ���. 
		// �����ͺ��̽� ���� �������� ������ �־�� �ϴ°� 
		// 1. jdbc ����̹� ������ ���ӽ����̽� 
		// 2. �����ͺ��̽� ���� url 
		// 3. ������
		// 4. �������� �н����� 
		private static final String ORCL_JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
		private static final String ORCL_USER = "kck00";
		private static final String ORCL_PASS = "kck1234";
		
		
		// �����ͺ��̽� ����̹��� ã��, ���� ���� �ϴ� �Լ� 
		// �߻��Լ��� �ƴ� static �Ϲ��Լ�
		// ConnProperty.getConnection() ���� ����ϸ� �ȴ�. 
		public static Connection getConnection() {
			
			Connection conn = null;
			
			try {
				Class.forName(KckConnProperty.ORCL_JDBC_DRIVER);	
				conn = DriverManager.getConnection( KckConnProperty.ORCL_URL
						                           ,KckConnProperty.ORCL_USER
						                           ,KckConnProperty.ORCL_PASS);
				
			}catch (Exception e) {
				System.out.println(   "ConnProperty :: �����ͺ��̽��� �����ϴµ� \n"
						            + "����̹� �Ǵ� ���� �������� ������ ���� >>> : \n" 
									+ e.getMessage() + "\n");
			}
			
			return conn;
		}
		
		// ���� �����ϴ� �Լ� : ���߿� �˷��ֽñ��.
	}
