package a.b.c.com.kosmo.board.sql;

public class BoardSqlMap {

	// Max채번 쿼리
	public static String getMaxChabunQuery(){
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("SELECT 										  	\n");
		sb.append("	  NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 MAXNUM 	\n");
		sb.append("FROM  MVC_BOARD A 								\n");
		
		return sb.toString();
	}
	
	// 전체조회 쿼리문
	public static String getBoardSelectAllQuery() {
		System.out.println("BoardSqlMap.getBoardSelectAllQuery()함수 진입");

		StringBuffer sb = new StringBuffer();

		sb.append("  SELECT  								\n");
		sb.append("      A.BNUM 		BNUM 				\n");
		sb.append("      ,A.BSUBJECT 	BSUBJECT 			\n");
		sb.append("      ,A.BWRITER 	BWRITER 			\n");
		sb.append("      ,A.BPW 		BPW 				\n");
		sb.append("      ,A.BMEMO 		BMEMO 				\n");
		sb.append("      ,A.BPHOTO 		BPHOTO 				\n");
		sb.append("      ,A.DELETEYN 		DELETEYN 		\n");
		sb.append("      ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE 	\n");
		sb.append("      ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE 	\n");
		sb.append("  FROM 		 							\n");
		sb.append("  MVC_BOARD A 		 					\n");
		sb.append("  WHERE A.DELETEYN = 'Y' 				\n");
		sb.append("  ORDER BY 1 DESC 		 				\n");

		return sb.toString();
	}

	// 조건조회 쿼리문
	public static String getBoardSelectQuery() {
		System.out.println("BoardSqlMap.getBoardSelectQuery()함수 진입");

		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 								\n");
		sb.append("      A.BNUM 		BNUM 			\n");
		sb.append("		,A.BSUBJECT  	BSUBJECT 		\n");
		sb.append("		,A.BWRITER  	BWRITER 		\n");
		sb.append("		,A.BPW  		BPW   			\n");
		sb.append("		,A.BMEMO  		BMEMO			\n");
		sb.append("		,A.BPHOTO  		BPHOTO			\n");
		sb.append("		,A.DELETEYN  	DELETEYN		\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
		sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");
		sb.append("	FROM 								\n");
		sb.append("		 MVC_BOARD A 					\n");
		sb.append("	WHERE A.DELETEYN = 'Y'				\n");
		sb.append("	AND   A.BNUM 	 =  ?  				\n");

		return sb.toString();
	}

	// 글 등록 쿼리문
	public static String getBoardInsertQuery() {
		System.out.println("BoardSqlMap.getBoardInsertQuery()함수 진입");

		StringBuffer sb = new StringBuffer();

		sb.append("	INSERT INTO 						\n");
		sb.append("		MVC_BOARD 				    	\n");
		sb.append("		          (			    		\n");
		sb.append("     			 BNUM 				\n"); // COLUMN 1
		sb.append("				  	,BSUBJECT 			\n"); // COLUMN 2
		sb.append("					,BWRITER 			\n"); // COLUMN 3
		sb.append("					,BPW   				\n"); // COLUMN 4
		sb.append("					,BMEMO			    \n"); // COLUMN 5
		sb.append("					,BPHOTO			    \n"); // COLUMN 6
		sb.append("					,DELETEYN			\n"); // COLUMN 7
		sb.append("					,INSERTDATE			\n"); // COLUMN 8
		sb.append("					,UPDATEDATE			\n"); // COLUMN 9
		sb.append("			      )						\n");
		sb.append("	       VALUES (  					\n");
		sb.append("						 ? 				\n");// placeholder 1
		sb.append("						,?   			\n");// placeholder 2
		sb.append("						,?   			\n");// placeholder 3
		sb.append("						,?   			\n");// placeholder 4
		sb.append("						,? 				\n");// placeholder 5
		sb.append("						,? 				\n");// placeholder 6
		sb.append("						,'Y'			\n");
		sb.append("						,SYSDATE 		\n");
		sb.append("						,SYSDATE 		\n");
		sb.append("	                )                   \n");

		return sb.toString();
	}

	// 글 업데이트 쿼리문
	public static String getBoardUpdateQuery() {
		System.out.println("BoardSqlMap.getBoardUpdateQuery()함수 진입");

		StringBuffer sb = new StringBuffer();

		sb.append("	UPDATE		 						\n");
		sb.append("		MVC_BOARD 				    	\n");
		sb.append("	SET						    		\n");
		sb.append("     	 BSUBJECT 		= ?			\n");// placeholder 1
		sb.append("			,BMEMO 			= ?			\n");// placeholder 2
		sb.append("			,UPDATEDATE 	= SYSDATE	\n");
		sb.append("	WHERE 	 BNUM 			= ?  		\n");// placeholder 3
		sb.append("	AND		 DELETEYN 		= 'Y'		\n");

		return sb.toString();
	}

	// 글 삭제 쿼리문
	public static String getBoardDeleteQuery() {
		System.out.println("BoardSqlMap.getBoardDeleteQuery()함수 진입");

		StringBuffer sb = new StringBuffer();

		//update mvc_model set deleteyn='n', updatedate=sysdate where bnum=? and  deleteyn='y'
		sb.append("	UPDATE  							\n");	
		sb.append("		   MVC_BOARD 			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  BNUM	 		= ?				\n");	    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");
		
		return sb.toString();
	}

}
