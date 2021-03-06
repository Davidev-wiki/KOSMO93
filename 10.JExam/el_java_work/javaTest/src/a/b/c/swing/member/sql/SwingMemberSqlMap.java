package a.b.c.swing.member.sql;

public abstract class SwingMemberSqlMap {
	
	// 로그인 확인 쿼리문
	public static String getSmLoginCheckQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("       COUNT(A.SWNUM)  NCNT 			\n");		
	    sb.append("	FROM 								\n");	    
	    sb.append("		  SWING_MEMBER 	A 				\n");
	    sb.append("	WHERE A.DELETEYN 	= 'Y'			\n");	    
	    sb.append("	AND   A.SWID 	  	= ?				\n");
	    sb.append("	AND   A.SWPW  		= ?   			\n");

	    return sb.toString();
	}
	
	// 채번 쿼리문
	public static String getsmChabunQuery(){

		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT  											\n");
		sb.append("         NVL(MAX(SUBSTR(A.SWNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM    SWING_MEMBER A 								\n");	
		
		return sb.toString();
	}

	// 전체 조회 쿼리문
	public static String getsmSelectAllQuery() {

		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.SWNUM 		SWNUM 			\n");
		sb.append("		,A.SWNAME  		SWNAME 			\n");
		sb.append("		,A.SWID  		SWID 			\n");
		sb.append("		,A.SWPW  		SWPW			\n");	 	   	    	   
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 SWING_MEMBER A 				\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	ORDER BY 1 DESC						\n");
		
		return sb.toString();
	}
	
	// 조건 조회 쿼리문 : 회원 번호
	public static String getsmSelectQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT                   	  	 \n");
		sb.append("      A.SWNUM         SWNUM 	 	 \n");
		sb.append("     ,A.SWNAME        SWNAME 	 \n");
		sb.append("     ,A.SWID          SWID 		 \n");
		sb.append("     ,A.SWPW          SWPW 	     \n");
		sb.append("     ,A.DELETEYN      DELETEYN    \n");
		sb.append("     ,A.INSERTDATE    INSERTDATE  \n");
		sb.append("     ,A.UPDATEDATE    UPDATEDATE  \n");
		sb.append(" FROM SWING_MEMBER A 		  	 \n");
		sb.append(" WHERE DELETEYN = 'Y'		  	 \n");
		sb.append(" AND A.SWNUM = ? 			  	 \n");
		
		return sb.toString();
	};
	
	// 조건 조회 : 이름
	public static String getsmSelectNameQuery(){
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.SWNUM 		SWNUM 			\n");
		sb.append("		,A.SWNAME  		SWNAME 			\n");
		sb.append("		,A.SWID  		SWID 			\n");
		sb.append("		,A.SWPW  		SWPW			\n");	 	   	    	   
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 SWING_MEMBER A 				\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.SWNAME LIKE '%' || ? || '%' \n");// placeholder 1	
	    
	    return sb.toString();
	}
	
	// 조건 조회 : 아이디
	public static String getsmSelectIDQuery(){
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.SWNUM 		SWNUM 			\n");
		sb.append("		,A.SWNAME  		SWNAME 			\n");
		sb.append("		,A.SWID  		SWID 			\n");
		sb.append("		,A.SWPW  		SWPW			\n");	 	   	    	   
	    sb.append("		,A.DELETEYN 	DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	      
	    sb.append("	FROM 								\n");
	    sb.append("		 SWING_MEMBER A 				\n");
	    sb.append("	WHERE DELETEYN   = 'Y'				\n");
	    sb.append("	AND   A.SWID  LIKE '%' || ? || '%'	\n");// placeholder 1	
	    
	    return sb.toString();
	}	
	
	// 등록 쿼리문
	public static String getsmInsertQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO                   \n");
		sb.append("    SWING_MEMBER( SWNUM  	 \n");
		sb.append("                , SWNAME 	 \n");
		sb.append("                , SWID 		 \n");
		sb.append("                , SWPW 		 \n");
		sb.append("                , DELETEYN 	 \n");
		sb.append("                , INSERTDATE  \n");
		sb.append("                , UPDATEDATE) \n");
		sb.append("    VALUES(       ? 			 \n");
		sb.append("                , ? 			 \n");
		sb.append("                , ? 			 \n");
		sb.append("                , ? 			 \n");
		sb.append("                , 'Y' 		 \n");
		sb.append("                , SYSDATE 	 \n");
		sb.append("                , SYSDATE   ) \n");
		
		return sb.toString();
	};
	
	// 수정 쿼리문
	public static String getsmUpdateQuery() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" UPDATE                         \n");
		sb.append("    SWING_MEMBER                \n");
		sb.append(" SET                       	   \n");
		sb.append("       SWNAME    =  ? 	       \n");
		sb.append("     ,UPDATEDATE =  SYSDATE 	   \n");
		sb.append(" WHERE SWNUM     =  ?	       \n");
		sb.append(" AND DELETEYN    =  'Y' 	       \n");

		return sb.toString();
	};
	
	// 삭제 쿼리문
	public static String getsmDeleteQuery() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" UPDATE                         \n");
		sb.append("    SWING_MEMBER                \n");
		sb.append(" SET                       	   \n");
		sb.append("        DELETEYN   = 'N' 	   \n");
		sb.append("      , UPDATEDATE = SYSDATE    \n");
		sb.append(" WHERE  SWNUM      = ?	       \n");
		sb.append(" AND    DELETEYN   = 'Y'        \n");
		
		return sb.toString();
	};

	
}
