package a.b.c.com.kosmo.mem.sql;

public abstract class MemberSqlMap {
	
	// MaxChabun 쿼리 
	public static String getMaxChabunQuery() {
		System.out.println("MemberSqlMap.getMaxChabunQuery() 함수 진입");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT  /*+ INDEX_DESC(A SYS_C0012126) */ 			\n");
		sb.append("         NVL(MAX(SUBSTR(A.MNUM, -4)), 0) + 1 MAXNUM	\n");
		sb.append(" FROM    MVC_MEMBER A 								\n");
		
		System.out.println("MemberSqlMap.getMaxChabunQuery() 함수 종료");
		
		return sb.toString();
	}
	
	// 전체 조회
	public static String getMemberSelectAllQuery(){
		
		System.out.println("MemberSqlMap.getMemberSelectAllQuery() 함수 진입");
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 									\n");
		sb.append("      A.MNUM 			MNUM 			\n");
		sb.append("		,A.MNAME  			MNAME 			\n");
		sb.append("		,A.MID  			MID 			\n");
	    sb.append("		,A.MPW  			MPW   			\n");
	    sb.append("		,A.MGENDER  		MGENDER 		\n");
	    sb.append("		,A.MBIRTH  			MBIRTH 			\n");
	    sb.append("		,A.MHP  			MHP 			\n");
	    sb.append("		,A.MTEL  			MTEL   			\n");	   
		sb.append("		,A.MEMAIL  			MEMAIL 			\n");		
	    sb.append("		,A.MZONECODE  		MZONECODE   	\n");
	    sb.append("		,A.MROADADDRESS  	MROADADDRESS 	\n");
	    sb.append("		,A.MJIBUNADDRESS  	MJIBUNADDRESS 	\n");
		sb.append("		,A.MHOBBY  			MHOBBY 			\n");
	    sb.append("		,A.MINFO  			MINFO   		\n");
		sb.append("		,A.MPHOTO  			MPHOTO 			\n");
	    sb.append("		,A.MADMIN  			MADMIN   		\n");
	    sb.append("		,A.DELETEYN 		DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	    
	    sb.append("	FROM 								\n");
	    sb.append("		 MVC_MEMBER A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	ORDER BY 1 DESC						\n");

		
		System.out.println("MemberSqlMap.getMemberSelectAllQuery() 함수 종료");
		
		return sb.toString();
	} 
	
	// 회원번호 조건조회
	public static String getMemberSelectQuery(){
		System.out.println("MemberSqlMap.getMemberSelectQuery() 함수 시작");

		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 									\n");
		sb.append("      A.MNUM 			MNUM 			\n");
		sb.append("		,A.MNAME  			MNAME 			\n");
		sb.append("		,A.MID  			MID 			\n");
	    sb.append("		,A.MPW  			MPW   			\n");
	    sb.append("		,A.MGENDER  		MGENDER 		\n");
	    sb.append("		,A.MBIRTH  			MBIRTH 			\n");
	    sb.append("		,A.MHP  			MHP 			\n");
	    sb.append("		,A.MTEL  			MTEL   			\n");	   
		sb.append("		,A.MEMAIL  			MEMAIL 			\n");		
	    sb.append("		,A.MZONECODE  		MZONECODE   	\n");
	    sb.append("		,A.MROADADDRESS  	MROADADDRESS 	\n");
	    sb.append("		,A.MJIBUNADDRESS  	MJIBUNADDRESS 	\n");
		sb.append("		,A.MHOBBY  			MHOBBY 			\n");
	    sb.append("		,A.MINFO  			MINFO   		\n");
		sb.append("		,A.MPHOTO  			MPHOTO 			\n");
	    sb.append("		,A.MADMIN  			MADMIN   		\n");
	    sb.append("		,A.DELETEYN 		DELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	    
	    sb.append("	FROM 								\n");
	    sb.append("		 MVC_MEMBER A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.MNUM   = ?					\n");// placeholder 1
		
		System.out.println("MemberSqlMap.getMemberSelectQuery() 함수 종료");
		
		return sb.toString();
	} 
	
	// 회원 등록
	public static String getMemberInsertQuery(){ 		
		System.out.println("MemberSqlMap.getMemberInsertQuery() 진입");	
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("	INSERT INTO 						\n");	
		sb.append("		MVC_MEMBER 				    	\n");
		sb.append("		          (			    		\n");
		sb.append("      			 MNUM 				\n"); // COLUMN 1
		sb.append("					,MNAME 				\n"); // COLUMN 2
		sb.append("					,MID 				\n"); // COLUMN 3
	    sb.append("					,MPW   				\n"); // COLUMN 4
	    sb.append("					,MGENDER 			\n"); // COLUMN 5
	    sb.append("					,MBIRTH 			\n"); // COLUMN 6
	    sb.append("					,MHP 				\n"); // COLUMN 7
	    sb.append("					,MTEL   			\n"); // COLUMN 8	   
		sb.append("					,MEMAIL 			\n"); // COLUMN 9		
	    sb.append("					,MZONECODE   		\n"); // COLUMN 10
	    sb.append("					,MROADADDRESS 		\n"); // COLUMN 11
	    sb.append("					,MJIBUNADDRESS 		\n"); // COLUMN 12
		sb.append("					,MHOBBY 			\n"); // COLUMN 13
	    sb.append("					,MINFO   			\n"); // COLUMN 14
		sb.append("					,MPHOTO 			\n"); // COLUMN 15
	    sb.append("					,MADMIN   			\n"); // COLUMN 16
	    sb.append("					,DELETEYN			\n"); // COLUMN 17
	    sb.append("					,INSERTDATE			\n"); // COLUMN 18
	    sb.append("					,UPDATEDATE			\n"); // COLUMN 19	 	  
		sb.append("			      )						\n");
		sb.append("	       VALUES   					\n");
		sb.append("	       		 (  					\n");
		sb.append("     				 ? 				\n"); // placeholder 1
		sb.append("						,? 				\n"); // placeholder 2
	    sb.append("						,?   			\n"); // placeholder 3
	    sb.append("						,?   			\n"); // placeholder 4
	    sb.append("						,? 				\n"); // placeholder 5
	    sb.append("						,? 				\n"); // placeholder 6
	    sb.append("						,?				\n"); // placeholder 7
	    sb.append("						,?				\n"); // placeholder 8
	    sb.append("						,?				\n"); // placeholder 9
	    sb.append("						,?   			\n"); // placeholder 10
	    sb.append("						,? 				\n"); // placeholder 11
	    sb.append("						,? 				\n"); // placeholder 12
	    sb.append("						,?				\n"); // placeholder 13
	    sb.append("						,?				\n"); // placeholder 14
	    sb.append("						,?				\n"); // placeholder 14
	    sb.append("						,?				\n"); // placeholder 15
	    sb.append("						,'Y'			\n"); // placeholder 16
	    sb.append("						,SYSDATE 		\n"); // placeholder 18
	    sb.append("						,SYSDATE 		\n"); // placeholder 19	
		sb.append("	              )						\n");		

		System.out.println("MemberSqlMap.getMemberInsertQuery() 종료");	

		return sb.toString();
	}
	
	// 회원 수정
	public static String getMemberUpdateQuery(){
		System.out.println("MemberSqlMap.getMemberUpdateQuery() 진입");	
		
		StringBuffer sb = new StringBuffer();
		
		/*
		sb.append("	UPDATE		 						\n");
		sb.append("		MVC_BOARD 				    	\n");
		sb.append("	SET						    		\n");
		sb.append("     	 BSUBJECT 		= ?			\n");// placeholder 1
		sb.append("			,BMEMO 			= ?			\n");// placeholder 2
		sb.append("			,UPDATEDATE 	= SYSDATE	\n");
		sb.append("	WHERE 	 BNUM 			= ?  		\n");// placeholder 3
		sb.append("	AND		 DELETEYN 		= 'Y'		\n");
		 * */
		
		sb.append(" UPDATE 								\n");
		sb.append("		   	 MVC_MEMBER 			    \n");	
		sb.append("	SET  								\n");		
		sb.append("			 MEMAIL 		= ?			\n"); // placeholder 1	  
		sb.append("			,MZONECODE   	= ?			\n"); // placeholder 2	
		sb.append("			,MROADADDRESS 	= ?			\n"); // placeholder 3	
		sb.append("			,MJIBUNADDRESS 	= ?			\n"); // placeholder 4			   
		sb.append("			,MHOBBY 		= ? 		\n"); // placeholder 5	        	
	    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
		sb.append("	WHERE  	 MNUM 			= ?			\n"); // placeholder 6	    
		sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");
		
		System.out.println("MemberSqlMap.getMemberUpdateQuery() 종료");	

		return sb.toString();
	}
	
	// 회원 삭제
	public static String getMemberDeleteQuery(){
		System.out.println("MemberSqlMap.getMemberDeleteQuery() 진입");	
		
		StringBuffer sb = new StringBuffer();

		sb.append(" UPDATE 									\n");
		sb.append("		   	 MVC_MEMBER 			    	\n");	
		sb.append("	SET  									\n");		
		sb.append("	  		DELETEYN		='N'			\n");
		sb.append("		  ,UPDATEDATE 		= SYSDATE		\n");
		sb.append("	WHERE  	 MNUM 			= ?				\n"); // placeholder 1   
		sb.append("	AND    DELETEYN 		= 'Y'  			\n");
		
		System.out.println("MemberSqlMap.getMemberDeleteQuery() 종료");	

		return sb.toString();
	}
	
}
