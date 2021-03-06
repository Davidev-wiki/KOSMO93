package a.b.c.com.kosmo.book.sql;

public class BookSqlMap {

	// Max채번 쿼리
	public static String getMaxChabunQuery(){
		System.out.println("BookSqlMap.getMaxChabunQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
				
		sb.append(" SELECT  /*+ INDEX_DESC(SYS_C0011177) */ 			\n");
		sb.append("         NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 MAXNUM	\n");
		sb.append(" FROM    KCK_BOOK A 								\n");
		
		return sb.toString();
	}
	
	// 전체조회 쿼리문
	public static String getBookSelectAllQuery() {
		System.out.println("BookSqlMap.getBookSelectAllQuery()함수 진입");
		
		StringBuffer sb = new StringBuffer();

		sb.append(" SELECT 															\n");
		sb.append("   		  A.BNUM 								BNUM			\n");
		sb.append("   		 ,A.BTITLE 								BTITLE			\n");
		sb.append("   		 ,A.BAUTH 								BAUTH			\n");
		sb.append("   		 ,A.ISBN 								BISBN			\n");
		sb.append("   		 ,A.BCOMP 								BCOMP			\n");
		sb.append("   		 ,A.BPRICE 								BPRICE			\n");
		sb.append("   		 ,A.BQTY 								BQTY			\n");
		sb.append("   		 ,A.BCOVER 								BCOVER			\n");
		sb.append("   		 ,A.DELETEYN 							DELETEYN		\n");
		sb.append("   		 ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE		\n");
		sb.append("   		 ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE		\n");
		sb.append(" FROM	KCK_BOOK A												\n");
		sb.append(" WHERE 	A.DELETEYN=								'Y'				\n");
		sb.append(" ORDER BY 1 DESC													\n");
		
		return sb.toString();
	}

	// 조건조회 쿼리문
	public static String getBookSelectQuery() {
		System.out.println("BookSqlMap.getBookSelectQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 															\n");
		sb.append("   		  A.BNUM 								BNUM			\n");
		sb.append("   		 ,A.BTITLE 								BTITLE			\n");
		sb.append("   		 ,A.BAUTH 								BAUTH			\n");
		sb.append("   		 ,A.ISBN 								BISBN			\n");
		sb.append("   		 ,A.BCOMP 								BCOMP			\n");
		sb.append("   		 ,A.BPRICE 								BPRICE			\n");
		sb.append("   		 ,A.BQTY 								BQTY			\n");
		sb.append("   		 ,A.BCOVER 								BCOVER			\n");
		sb.append("   		 ,A.DELETEYN 							DELETEYN		\n");
		sb.append("   		 ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE		\n");
		sb.append("   		 ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE		\n");
		sb.append(" FROM	KCK_BOOK A												\n");
		sb.append(" WHERE 	A.DELETEYN=								'Y'				\n");
		sb.append(" AND     A.BNUM = 								 ?				\n");
		
		return sb.toString();
	}

	// 글 등록 쿼리문
	public static String getBookInsertQuery() {
		System.out.println("BookSqlMap.getBookInsertQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
		
		sb.append("	INSERT INTO 						\n");
		sb.append("		KCK_BOOK (			    		\n");
		sb.append("      			 BNUM 				\n"); // Data 1
		sb.append("					,BTITLE 			\n"); // Data 2
		sb.append("					,BAUTH 				\n"); // Data 3
	    sb.append("					,ISBN   			\n"); // Data 4	    
	    sb.append("					,BCOMP 				\n"); // Data 5	    
	    sb.append("					,BPRICE				\n"); // Data 6	    
	    sb.append("					,BQTY 				\n"); // Data 7
	    sb.append("					,BCOVER   			\n"); // Data 8	    
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
		System.out.println("BookSqlMap.getBookUpdateQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
		// 가격 & 수량만 업데이트 가능
		sb.append("	UPDATE  							\n");	
		sb.append("		   	 KCK_BOOK 			    	\n");	
		sb.append("	SET  								\n");		
		sb.append("			 BPRICE 		= ?			\n");	    	    
		sb.append("			,BQTY			= ?			\n");	    
	    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
		sb.append("	WHERE  	 BNUM 			= ?			\n");	    
		sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");

		return sb.toString();
	}

	// 글 삭제 쿼리문
	public static String getBookDeleteQuery() {
		System.out.println("BookSqlMap.getBookDeleteQuery()함수 진입");

		StringBuffer sb = new StringBuffer();

		sb.append("	UPDATE  							\n");	
		sb.append("		   	 KCK_BOOK 			    	\n");	
		sb.append("	SET  								\n");		
		sb.append("		   DELETEYN 	= 'N'			\n");	    	   
		sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  	 BNUM 			= ?			\n");	    
		sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");
		
		return sb.toString();
	}

}
