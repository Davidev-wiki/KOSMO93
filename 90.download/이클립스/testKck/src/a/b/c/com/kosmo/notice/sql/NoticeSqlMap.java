package a.b.c.com.kosmo.notice.sql;

public abstract class NoticeSqlMap {

	public static String getMaxChabunQuery(){
		System.out.println("NoticeSqlMap.getChabunQuery() 실행");

		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT  /*+ INDEX_DESC(A SYS_C0012126) */ 			\n");
		sb.append("         NVL(MAX(SUBSTR(A.NNUM, -4)), 0) + 1 MAXNUM	\n");
		sb.append(" FROM    MVC_NOTICE A 								\n");
		
		System.out.println("NoticeSqlMap.getChabunQuery() 리턴 완료");

		return sb.toString();
	}
	public static String noticeSelectAllQuery(){		
		System.out.println("NoticeSqlMap.noticeSelectAllQuery() 실행");
		
		StringBuffer sb = new StringBuffer();

		sb.append("	SELECT 									\n");
		sb.append("		 A.NNUM				NNUM			\n");
		sb.append("		,A.NSUBJECT			NSUBJECT		\n");
		sb.append("		,A.NMEMO			NMEMO			\n");
		sb.append("		,A.NPHOTO			NPHOTO			\n");
		sb.append("		,A.DELETEYN			DELETEYN		\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE		\n");
		sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE		\n");
		sb.append("	FROM  MVC_NOTICE A						\n");
		sb.append("	ORDER BY 1 DESC							\n");
		
		System.out.println("NoticeSqlMap.noticeSelectAllQuery() 리턴 완료");
		
		return sb.toString();
	}
	public static String noticeSelectQuery(){	
		System.out.println("NoticeSqlMap.noticeSelectQuery() 실행");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("	SELECT 									\n");
		sb.append("		 A.NNUM				NNUM			\n");
		sb.append("		,A.NSUBJECT			NSUBJECT		\n");
		sb.append("		,A.NMEMO			NMEMO			\n");
		sb.append("		,A.NPHOTO			NPHOTO			\n");
		sb.append("		,A.DELETEYN			DELETEYN		\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE		\n");
		sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE		\n");
		sb.append("	FROM  MVC_NOTICE A						\n");
		sb.append("	WHERE DELETEYN	= 'Y'					\n");
		sb.append("	AND	  A.NNUM	=  ?					\n");  // P.H1 

		
		System.out.println("NoticeSqlMap.noticeSelectQuery() 리턴 완료");
		
		return sb.toString();
	}
	public static String noticeInsertQuery(){	
		System.out.println("NoticeSqlMap.noticeInsertQuery() 실행");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("	INSERT INTO 							\n");
		sb.append("		 MVC_NOTICE (						\n");
		sb.append("							 NNUM			\n");
		sb.append("							,NSUBJECT		\n");
		sb.append("							,NMEMO			\n");
		sb.append("							,NPHOTO			\n");
		sb.append("							,DELETEYN		\n");
		sb.append("							,INSERTDATE		\n");
		sb.append("							,UPDATEDATE		\n");
		sb.append("		) VALUES (							\n");
		sb.append("							   ?			\n"); // P.H1
		sb.append("							  ,?			\n"); // P.H2
		sb.append("							  ,?			\n"); // P.H3
		sb.append("							  ,?			\n"); // P.H4
		sb.append("							  ,'Y'			\n");
		sb.append("							,SYSDATE			\n");
		sb.append("							,SYSDATE			\n");		
		sb.append("		)									\n");
		
		System.out.println("NoticeSqlMap.noticeInsertQuery() 리턴 완료");
		
		return sb.toString();
	}
	public static String noticeUpdateQuery(){		
		System.out.println("NoticeSqlMap.noticeUpdateQuery");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("	UPDATE 									\n");
		sb.append("		 	MVC_NOTICE 						\n");
		sb.append("	SET										\n");
		sb.append("			 NSUBJECT		=  ?			\n"); // P.H1
		sb.append("			,NMEMO			=  ?			\n"); // P.H2
		sb.append("			,UPDATEDATE		=  SYSDATE		\n");
		sb.append("	WHERE  	 NNUM 			=  ?			\n"); // P.H3
		sb.append("	AND    	 DELETEYN 		= 'Y'  			\n");

		System.out.println("NoticeSqlMap.noticeUpdateQuery() 리턴 완료");
		
		return sb.toString();
	}
	public static String noticeDeleteQuery(){		
		System.out.println("NoticeSqlMap.noticeDeleteQuery() 실행");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" UPDATE 									\n");
		sb.append("		   	 MVC_NOTICE			    		\n");	
		sb.append("	SET  									\n");		
		sb.append("	  		DELETEYN		='N'			\n");
		sb.append("		  ,UPDATEDATE 		= SYSDATE		\n");
		sb.append("	WHERE  	 NNUM 			= ?				\n"); 
		sb.append("	AND    DELETEYN 		= 'Y'  			\n");

		System.out.println("NoticeSqlMap.noticeDeleteQuery() 리턴 완료");
		
		return sb.toString();
	}
	
}
