package a.b.c.com.common;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OracleXmlTest {

	// XML의 선언부를 변수로 저장.
	public static final String XML_PROLOG = "<?xml version='1.0' encoding='euc-kr'?>"; 
	
	// DB에 연결해서 데이터를 가지고 오는 기능의 함수. getXml()
	public String getXml(final String tableName) throws Exception {
		System.out.println("String tableName : " + tableName);

		Connection con = null;
		Statement stmt = null;
		ResultSet rsRs = null;

		ResultSetMetaData resultMeta = null;
		int colCount = 0;
		StringBuffer strBuffer = new StringBuffer(XML_PROLOG);

		try {
			con = CommonXML.getConnection();
			stmt = con.createStatement();
			rsRs = stmt.executeQuery("SELECT * FROM " + tableName);

			resultMeta = rsRs.getMetaData();

			colCount = resultMeta.getColumnCount();
			System.out.println(tableName + " 테이블 컬럼 카운드 >>> : " + colCount);

			strBuffer.append("\n");
			strBuffer.append("<" + tableName.toUpperCase() + ">");
			strBuffer.append("\n");

			while (rsRs.next()) {
				for (int i = 0; i < colCount; i++) {
					strBuffer.append("<" + resultMeta.getColumnName(i + 1) + ">");
					strBuffer.append(rsRs.getString(i + 1));
					strBuffer.append("</" + resultMeta.getColumnName(i + 1) + ">");
					strBuffer.append("\n");
				}
			}
			strBuffer.append("</" + tableName.toUpperCase() + ">");
			strBuffer.append("\n");
		} catch (SQLException e) {
			System.out.println(" getXML() : " + e);
		} finally {
		}

		return strBuffer.toString();
	}

	
	// 파일을 만들어서 내용을 쓰고 저장하고 닫는 기능의 함수. xmlParse()
	public static boolean xmlParse(String fileName, String xmlVal) {

		boolean bool = false;

		try {

			BufferedWriter bw = new BufferedWriter(
					new FileWriter(CommonXML.XML_FILE_PATH + "/" + fileName.toLowerCase() + ".xml"));
			bw.write(xmlVal);
			bw.flush();
			bw.close(); // 무조건 닫아줘야한다.

			bool = true;
		} catch (IOException e) {
			System.err.println(e);
		}

		return bool;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			// 가지고 올 데이터의 테이블 이름을 입력받아서
			// xml파일을 만들어주는 로직 실행.
			
			// 밑에 로직에 String xmlVal = ox.getXml(fileName); 이렇게 함수 쓰기위해
			// new를 사용해 메모리에 올린다
			OracleXmlTest ox = new OracleXmlTest();
			
			// 스캐너 생성.
			Scanner sc = new Scanner(System.in);
			System.out.println("테이블 이름을 입력하세요! : ");
			
			// 사용자 입력값을 변수에 담는다.
			String tableName = sc.next();

			// 길이를 체크해서 테이블이름이 잘 입력되었다면 아래 로직을 실행한다.
			if (tableName.length() > 0) {

				// final : 변경하지 마세요
				// 테이블이름 -> 파일이름으로 변수 설정
				final String fileName = tableName;
			
				// getXml 함수를 이용해서 DB에서 데이터를 모두 읽어온다.
				String xmlVal = ox.getXml(fileName);
				System.out.println("Oralce String Data를 xml로 생성 >>> : \n" + xmlVal);
				
				if (xmlVal != null && xmlVal.length() > 0) {
						
					boolean bool = xmlParse(fileName, xmlVal);
					if (bool) {
						System.out.println(CommonXML.XML_FILE_PATH + " 디렉토리에 " + fileName + ".xml 파일이 잘 생성 되었습니다. ");
					} else {
						System.out.println(" 파일이 생성 되지 않았습니다. ");
					}
				}
			} else {
				System.out.println("java OracleXmlTest 테이블이름 ");
			}

		} catch (Exception e) {
			System.out.println("에러 발생 ! : " + e.getMessage());
		}
	}
}
