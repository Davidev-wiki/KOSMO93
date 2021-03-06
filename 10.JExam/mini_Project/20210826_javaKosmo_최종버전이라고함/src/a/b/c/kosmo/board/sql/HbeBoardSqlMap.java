package a.b.c.kosmo.board.sql;

public abstract class HbeBoardSqlMap {
	
	// 게시판 글번호 채번 
	public static String getHboardChabunQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT  /*+ INDEX_DESC(SYS_C0011061)*/				\n");
		sb.append("         NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM    HBE_BOARD A 								\n");	   	  

	    return sb.toString();
	};
	
	// 전체 조회
	public static String getHboardSelectAllQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.BNUM 		BNUM 			\n");
		sb.append("		,A.BSUBJECT  	BSUBJECT 		\n");
		sb.append("		,A.BWRITER  	BWRITER 		\n");
		sb.append("		,A.BCONTENTS  	BCONTENTS		\n");	 
	    sb.append("		,A.BPW  		BPW   			\n");	    	    
	    sb.append("		,A.DELETEYN 	BDELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 HBE_BOARD A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	ORDER BY 1 DESC						\n");

	    return sb.toString();
	};
	
	// 조건 조회
	public static String getHboardSelectQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.BNUM 		BNUM 			\n");
		sb.append("		,A.BSUBJECT  	BSUBJECT 		\n");
		sb.append("		,A.BWRITER  	BWRITER 		\n");
		sb.append("		,A.BCONTENTS  	BCONTENTS		\n");	 
	    sb.append("		,A.BPW  		BPW   			\n");	    	    
	    sb.append("		,A.DELETEYN 	BDELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 HBE_BOARD A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.BNUM   = ?					\n");

	    return sb.toString();
	};
	
	// 등록
	public static String getHboardInsertQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	INSERT INTO 						\n");	
		sb.append("		HBE_BOARD 				    	\n");
		sb.append("		          (			    		\n");
		sb.append("     			 BNUM 				\n"); // COLUMN 1
		sb.append("				  	,BSUBJECT 			\n"); // COLUMN 2
		sb.append("					,BWRITER 			\n"); // COLUMN 3
		sb.append("					,BCONTENTS			\n"); // COLUMN 4
	    sb.append("					,BPW   				\n"); // COLUMN 5	    
	    sb.append("					,DELETEYN			\n"); // COLUMN 6
	    sb.append("					,INSERTDATE			\n"); // COLUMN 7
	    sb.append("					,UPDATEDATE			\n"); // COLUMN 8
		sb.append("			      )						\n");
		sb.append("	       VALUES (  					\n");			
		sb.append("						 ? 				\n");// placeholder 1
	    sb.append("						,?   			\n");// placeholder 2
	    sb.append("						,?   			\n");// placeholder 3
	    sb.append("						,?   			\n");// placeholder 4
	    sb.append("						,? 				\n");// placeholder 5
	    sb.append("						,'Y'			\n");// placeholder 6
	    sb.append("						,SYSDATE 		\n");// placeholder 7
	    sb.append("						,SYSDATE 		\n");// placeholder 8	
		sb.append("	              )						\n");		
		
		return sb.toString();
	};
	
	// 수정
	public static String getHboardUpdateFQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   HBE_BOARD 			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   BSUBJECT	  		= ?			\n");	    
	    sb.append("		  ,BCONTENTS		= ?			\n");	    	    
	    sb.append("		  ,UPDATEDATE 		= SYSDATE	\n");
		sb.append("	WHERE  BNUM 			= ?			\n");	    
		sb.append("	AND    DELETEYN 		= 'Y'  		\n");		
					
		return sb.toString();		
	};
	
	// 삭제 
	public static String getHboardDeleteQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   HBE_BOARD 			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  BNUM	 		= ?				\n");	    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
					
		return sb.toString();	
	};
	
	// 제목 조회
	public static String getHboardSelectSubjectQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 									\n");
		sb.append("      A.BNUM 		BNUM 				\n");
		sb.append("		,A.BSUBJECT  	BSUBJECT 			\n");
		sb.append("		,A.BWRITER  	BWRITER 			\n");
		sb.append("		,A.BCONTENTS  	BCONTENTS			\n");	 
	    sb.append("		,A.BPW  		BPW   				\n");	    	    
	    sb.append("		,A.DELETEYN 	BDELETEYN			\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 									\n");
	    sb.append("		 HBE_BOARD A 						\n");
	    sb.append("	WHERE DELETEYN = 'Y'					\n");
	    sb.append("	AND   A.BSUBJECT  LIKE '%' || ? || '%'  \n"); 

	    return sb.toString();
	};
	
	// 작성자 조회
	public static String getHboardSelectWriterQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 									\n");
		sb.append("      A.BNUM 		BNUM 				\n");
		sb.append("		,A.BSUBJECT  	BSUBJECT 			\n");
		sb.append("		,A.BWRITER  	BWRITER 			\n");
		sb.append("		,A.BCONTENTS  	BCONTENTS			\n");	 
	    sb.append("		,A.BPW  		BPW   				\n");	    	    
	    sb.append("		,A.DELETEYN 	BDELETEYN			\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 									\n");
	    sb.append("		 HBE_BOARD A 						\n");
	    sb.append("	WHERE DELETEYN = 'Y'					\n");
	    sb.append("	AND   A.BWRITER  LIKE '%' || ? || '%'   \n"); 

	    return sb.toString();
	};
	
}
