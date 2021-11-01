/*
CREATE TABLE SE_BOARD(
    MNUM   NUMBER(8)      NOT NULL,
    MTITLE VARCHAR2(50)   NOT NULL,
    MNAME  VARCHAR2(50)   NOT NULL,
    MEMAIL VARCHAR2(50)   NOT NULL,
    MAREA  VARCHAR2(2000) NOT NULL,
    MPASS  VARCHAR2(20)   NOT NULL,
    MREF   NUMBER(8)      NOT NULL,
    MSTEP  NUMBER(8)      NOT NULL,
    MDEPTH NUMBER(8)      NOT NULL,
    MWRITEDAY DATE        DEFAULT SYSDATE,
    MHINTS NUMBER(8)      NULL
);

CREATE SEQUENCE B_SEQ INCREMENT BY 1 START WITH 1;

----------------------------------------------------------
description
mref : 원본 게시물 번호
mstep : 같은 원본 게시물에 대한 답변글 내에서의 순서
mdepth : 답변의 단계 (예, 원본 = 0, 원본의 답변=1, 답변의 답변=2 ,...)
*/

package a.b.c.com.paging;

import java.sql.Connection;
import java.sql.Statement;

public class InsertData {

	public void insertData() throws Exception{
		System.out.println("InsertData 함수 진입 >>");
		
		Connection con = ConnProperty.getConnection();
		Statement stmt = con.createStatement();
		String sqls = null;
		
		for(long i=0; i<200; i++) {
			sqls = "INSERT INTO SE_BOARD VALUES ("
										+ "B_SEQ.NEXTVAL,"
										+ "'" + i + "',"
										+ "'" + i + "',"
										+ "'" + i + "',"
										+ "'" + i + "',"
										+ "'" + i + "',"
										+ " 1, 1, 1, DEFAULT,1)";
			
			int nCount = stmt.executeUpdate(sqls);
			if(nCount % 100 == 0) con.commit();
		}// end of for문
		
		con.commit();
		stmt.close(); stmt = null;
		con.close(); con = null;
	}// end of insertData 함수
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("InsertData main 함수 진입 >>");
		new InsertData().insertData();
	}// end of main 함수

}
