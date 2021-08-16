package a.b.c.ch9.hbemem.sql;

public abstract class HbeMemberSqlMap {
	
	// 전체 조회
	public static String getHbeMemberSelectAllQuery(){
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.HNUM 		HNUM 			\n");
		sb.append("		,A.HNAME  		HNAME 			\n");
		sb.append("		,A.HID  		HID 			\n");
	    sb.append("		,A.HPW  		HPW   			\n");
	    sb.append("		,A.HBIRTH  		HBIRTH 			\n");
		sb.append("		,A.HGENDER  	HGENDER 		\n");
	    sb.append("		,A.HTEL  		HTEL   			\n");
	    sb.append("		,A.HHP  		HHP 			\n");
		sb.append("		,A.HEMAIL  		HEMAIL 			\n");		
	    sb.append("		,A.HADDR  		HADDR   		\n");
	    sb.append("		,A.HHOBBY  		HHOBBY 			\n");
	    sb.append("		,A.HPHOTO  		HPHOTO 			\n");
		sb.append("		,A.HSKILL  		HSKILL 			\n");
	    sb.append("		,A.HJOB  		HJOB   			\n");
	    sb.append("		,A.DELETEYN 	BDELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	    
	    sb.append("	FROM 								\n");
	    sb.append("		 HBE_MEMBER A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	ORDER BY 1 DESC						\n");

	    return sb.toString();
	}

	// 전체 조회
	public static String getHbeMemberSelectQuery(){
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.HNUM 		HNUM 			\n");
		sb.append("		,A.HNAME  		HNAME 			\n");
		sb.append("		,A.HID  		HID 			\n");
	    sb.append("		,A.HPW  		HPW   			\n");
	    sb.append("		,A.HBIRTH  		HBIRTH 			\n");
		sb.append("		,A.HGENDER  	HGENDER 		\n");
	    sb.append("		,A.HTEL  		HTEL   			\n");
	    sb.append("		,A.HHP  		HHP 			\n");
		sb.append("		,A.HEMAIL  		HEMAIL 			\n");		
	    sb.append("		,A.HADDR  		HADDR   		\n");
	    sb.append("		,A.HHOBBY  		HHOBBY 			\n");
	    sb.append("		,A.HPHOTO  		HPHOTO 			\n");
		sb.append("		,A.HSKILL  		HSKILL 			\n");
	    sb.append("		,A.HJOB  		HJOB   			\n");
	    sb.append("		,A.DELETEYN 	BDELETEYN		\n");
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	    
	    sb.append("	FROM 								\n");
	    sb.append("		 HBE_MEMBER A 					\n");
	    sb.append("	WHERE DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.HNUM   = ?					\n"); // placeholder 1

	    return sb.toString();
	}
	
public static String getHbeMemInsertQuery() {
		// 쿼리문에 사용하는 SELECT, INSERT, UPDATE, DELETE 
		// ? : 플레이스 홀더 는 그 쿼리문 에서 맨 처음에 사용한 것인 index 1 이다.
		// 이후는 순차로 증가한다. 
		StringBuffer sb = new StringBuffer();			
		sb.append("	INSERT INTO 						\n");	
		sb.append("		HBE_MEMBER 				    	\n");
		sb.append("		          (			    		\n");
		sb.append("      			 HNUM 				\n"); // COLUMN 1
		sb.append("					,HNAME 				\n"); // COLUMN 2
		sb.append("					,HID 				\n"); // COLUMN 3
	    sb.append("					,HPW   				\n"); // COLUMN 4
	    sb.append("					,HBIRTH				\n"); // COLUMN 5	    
	    sb.append("					,HGENDER 			\n"); // COLUMN 6	    
	    sb.append("					,HTEL   			\n"); // COLUMN 7	    
	    sb.append("					,HHP 				\n"); // COLUMN 8	    	    
	    sb.append("					,HEMAIL				\n"); // COLUMN 9
	    sb.append("					,HADDR 				\n"); // COLUMN 10	    	    
	    sb.append("					,HHOBBY				\n"); // COLUMN 11
	    sb.append("					,HPHOTO 			\n"); // COLUMN 12
	    sb.append("					,HSKILL				\n"); // COLUMN 13
	    sb.append("					,HJOB				\n"); // COLUMN 14	    	    	  
	    sb.append("					,DELETEYN			\n"); // COLUMN 15
	    sb.append("					,INSERTDATE			\n"); // COLUMN 16
	    sb.append("					,UPDATEDATE			\n"); // COLUMN 17
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
	    sb.append("						,'Y'			\n"); // placeholder 15
	    sb.append("						,SYSDATE 		\n"); // placeholder 16
	    sb.append("						,SYSDATE 		\n"); // placeholder 17	
		sb.append("	              )						\n");		
		
		return sb.toString();

	}
}
