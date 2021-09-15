package a.b.c.com.kosmo.book.sql;

public class BookSqlMap {

	// Max채번 쿼리
	public static String getMaxChabunQuery(){
		System.out.println("BookSqlMap.getMaxChabunQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
				
		sb.append(" SELECT  /*+ INDEX_DESC(SYS_C0011177) */ 			\n");
		sb.append("         NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 MAXNUM	\n");
		sb.append(" FROM    TEST_BOOK A 								\n");
		
		return sb.toString();
	}
	
	// 전체조회 쿼리문
	public static String getBookSelectAllQuery() {
		System.out.println("BookSqlMap.getBoardSelectAllQuery()함수 진입");
		
		StringBuffer sb = new StringBuffer();

		return sb.toString();
	}

	// 조건조회 쿼리문
	public static String getBookSelectQuery() {
		System.out.println("BookSqlMap.getBookSelectQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
		
		
		return sb.toString();
	}

	// 글 등록 쿼리문
	public static String getBookInsertQuery() {
		System.out.println("BookSqlMap.getBookSelectQuery()함수 진입");

		StringBuffer sb = new StringBuffer();

		sb.append("	INSERT INTO 						\n");
		sb.append("		KCK_BOOK (			    		\n");
		sb.append("      			 BNUM 				\n");
		sb.append("					,BTITLE 			\n");
		sb.append("					,BAUTH 				\n");
	    sb.append("					,ISBN   			\n");	    
	    sb.append("					,BCOMP 				\n");	    
	    sb.append("					,BPRICE				\n");	    
	    sb.append("					,BQTY 				\n");
	    sb.append("					,BCOVER   			\n");	    
	    sb.append("					,DELETEYN			\n");
	    sb.append("					,INSERTDATE			\n");
	    sb.append("					,UPDATEDATE	)		\n");
	    sb.append("	       VALUES (  					\n");		
		sb.append("     				 ? 				\n"); // placeholder 1
		sb.append("						,? 				\n"); // placeholder 2
	    sb.append("						,?   			\n"); // placeholder 3
	    sb.append("						,?   			\n"); // placeholder 4
	    sb.append("						,? 				\n"); // placeholder 5
	    sb.append("						,? 				\n"); // placeholder 6
	    sb.append("						,?				\n"); // placeholder 7
	    sb.append("						,?				\n"); // placeholder 8
	    sb.append("						,'Y'			\n"); // placeholder 9
	    sb.append("						,SYSDATE 		\n"); // placeholder 10
	    sb.append("						,SYSDATE 		\n"); // placeholder 11	
		sb.append("	              )						\n");

		return sb.toString();
	}

	// 글 업데이트 쿼리문
	public static String getBookUpdateQuery() {
		System.out.println("BookSqlMap.getBookSelectQuery()함수 진입");

		StringBuffer sb = new StringBuffer();



		return sb.toString();
	}

	// 글 삭제 쿼리문
	public static String getBookDeleteQuery() {
		System.out.println("BookSqlMap.getBookSelectQuery()함수 진입");

		StringBuffer sb = new StringBuffer();


		
		return sb.toString();
	}

}
