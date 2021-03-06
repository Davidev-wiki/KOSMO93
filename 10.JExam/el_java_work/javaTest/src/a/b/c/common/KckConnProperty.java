
/*
[연결할 때 필요한 준비물]
- 오라클에서 제공하는 (java database connection) 드라이버
- 드라이버 매니저
- URL : 접속하고자 하는 컴퓨터, 프로그램의 포트번호, SID(or Global Database Name : 도메인)
- ID : 계정명
- PW : 비번
*/

package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;

public abstract class KckConnProperty {
	// 상수 
		// 데이터베이스 연결 정보 : DataSource : 앞으로는 데이터베이스 연결정보를 데이터소스라고 부른다. 
		// 데이터베이스 연결 정보에는 무엇이 있어야 하는가 
		// 1. jdbc 드라이버 시작점 네임스페이스 
		// 2. 데이터베이스 연결 url 
		// 3. 계정명
		// 4. 계정명의 패스워드 
		private static final String ORCL_JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
		private static final String ORCL_URL = "jdbc:oracle:thin:@localhost:1521:orclKOSMO00";
		private static final String ORCL_USER = "kck00";
		private static final String ORCL_PASS = "kck1234";
		
		
		// 데이터베이스 드라이버를 찾고, 연결 까지 하는 함수 
		// 추상함수가 아닌 static 일반함수
		// ConnProperty.getConnection() 이케 사용하면 된다. 
		public static Connection getConnection() {
			
			Connection conn = null;
			
			try {
				Class.forName(KckConnProperty.ORCL_JDBC_DRIVER);	
				conn = DriverManager.getConnection( KckConnProperty.ORCL_URL
						                           ,KckConnProperty.ORCL_USER
						                           ,KckConnProperty.ORCL_PASS);
				
			}catch (Exception e) {
				System.out.println(   "ConnProperty :: 데이터베이스를 연결하는데 \n"
						            + "드라이버 또는 연결 과정에서 문제가 생김 >>> : \n" 
									+ e.getMessage() + "\n");
			}
			
			return conn;
		}
		
		// 연결 해제하는 함수 : 나중에 알려주시기로.
	}
