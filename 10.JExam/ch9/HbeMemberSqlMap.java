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
	    sb.append("	AND   A.HNUM   = ?					\n");

	    return sb.toString();
	}
	
}
