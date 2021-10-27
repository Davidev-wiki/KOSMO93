package a.b.c.com.paging;

import java.sql.Connection;
import java.sql.Statement;

/*
	*테이블 생성 완료
	*시퀀스 생성 완료
	* descripton
	* mref     :	원본 게시물 번호
	* mstep    :	같은 원본 게시물에 대한 답변글 내에서의 순서 
	* mdepth   :	답변의 단계 (예, 원본=0, 원본의 답변=1, 답변의 답변=2, ...)
*/

public class InsertData {
	
	public void insertData() throws Exception{
		
		Connection con = ConnProperty.getConnection();
		Statement stmt = con.createStatement();
		String sqls = null;
		
	//  for (long i=0; i < insert를 원하는 데이터 건 수; i++)
		for (long i=0; i < 200; i++) {
			sqls = "INSERT INTO SE_BOARD VALUES("
													+"B_SEQ.NEXTVAL,"
													+ "'" + i + "', " 
													+ "'" + i + "', " 
													+ "'" + i + "', " 
													+ "'" + i + "', " 
													+ "'" + i + "', " 
													+ " 1, 1, 1, DEFAULT, 1)";
			int nCount = stmt.executeUpdate(sqls);
			
			// 지정한 단위마다 커밋하기.
			if (nCount % 1000 == 0) con.commit();
			if (nCount % 100 == 0) con.commit();
		}
		// 등록 후 커밋
		con.commit();
		stmt.close(); stmt=null;
		con.close(); con=null;
	}
	
	// main() 시작
	public static void main(String[] args) throws Exception{
		
		new InsertData().insertData();
		
	}

}
