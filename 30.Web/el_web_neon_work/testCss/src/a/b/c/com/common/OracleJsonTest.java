package a.b.c.com.common;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class OracleJsonTest {

	@SuppressWarnings("unchecked")
	public static String getJson(String tableName) {

		Connection con = null;
		Statement stmt = null;
		ResultSet rsRs = null;
		ResultSetMetaData resultMeta = null;
		int colCount = 0;
		String jArrStr = "";

		try {

			con = CommonJSON.getConnection();
			stmt = con.createStatement();
			rsRs = stmt.executeQuery("SELECT * FROM " + tableName);

			resultMeta = rsRs.getMetaData();
			colCount = resultMeta.getColumnCount();

			JSONArray jArr = new JSONArray();
			JSONObject jObj = null;

			while (rsRs.next()) {

				jObj = new JSONObject();

				for (int i = 0; i < colCount; i++) {

					String columnName = resultMeta.getColumnName(i + 1);
					String dataName = rsRs.getString(i + 1);

					jObj.put(columnName, dataName);

				}

				if (jObj != null) {

					jArr.add(jObj);
					jArrStr = jArr.toString();

				}

			}
			System.out.println("jArr : " + jArr);
			System.out.println("jArrStr = jArr.toString() : " + jArrStr);
		} catch (SQLException e) {
			System.out.println("getJson() : " + e);
		} finally {

		}

		return jArrStr;
	}

	public static boolean jsonParse(String fileName, String jsonVal) {

		boolean bool = false;

		try {

			BufferedWriter bw = new BufferedWriter(
					new FileWriter(CommonJSON.JSON_FILE_PATH + "/" + fileName.toLowerCase() + ".json"));
			bw.write(jsonVal);
			bw.flush();
			bw.close();

			bool = true;

		} catch (IOException e) {
			System.err.println(e);
		}

		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DB에서 테이블을 조회한 데이터 결과를 json 파일로 만들기!

		try {

			Scanner sc = new Scanner(System.in);
			System.out.println("json 파일을 생성할 테이블 이름을 입력하세요! >> ");
			String tableName = sc.next();

			if (tableName != null && tableName.length() > 0) {
				String s = OracleJsonTest.getJson(tableName);
				System.out.println("OracleJsonTest.getJson()에서 테이블 이름을 전달하고 받아온 결과값 s : \n" + s);
				// 위 함수에서 리턴되는 것은 ?

				if (s.length() > 0) {

					boolean bool = OracleJsonTest.jsonParse(tableName, s);

					if (bool) {

						File f = new File(CommonJSON.JSON_FILE_PATH + "/" + tableName.toLowerCase() + ".json");
						System.out.println("\n" + f.getName() + "파일 생성 완료!");

					} else {
						System.out.println("파일 생성 실패!");
					}

				} else {

				}

			} else {

			}

		} catch (Exception e) {
			System.out.println("Error 발생!! : " + e.getMessage());
		}

	}

}
