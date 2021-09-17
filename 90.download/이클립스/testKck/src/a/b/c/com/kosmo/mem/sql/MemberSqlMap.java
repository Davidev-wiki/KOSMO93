package a.b.c.com.kosmo.mem.sql;

public abstract class MemberSqlMap {
	
	// MaxChabun 쿼리 
	public static String getMaxChabunQuery() {
		return "";
	}
	
	// 전체 조회
	public static String getMemberSelectAllQuery(){
		return "";
	} 
	
	// 회원번호 조건조회
	public static String getMemberSelectQuery(){
		return "";
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
	    sb.append("					,MGIBUNADDRESS 		\n"); // COLUMN 12
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
		
		return "";
	}
	
	// 회원 삭제
	public static String getMemberDeleteQuery(){
		
		return "";
	}
	
}
