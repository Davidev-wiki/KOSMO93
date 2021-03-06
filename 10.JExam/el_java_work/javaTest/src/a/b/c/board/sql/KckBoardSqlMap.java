package a.b.c.board.sql;

public abstract class KckBoardSqlMap {

	public static String getKboardChabunQueryMap() {

		StringBuffer sb = new StringBuffer();
		// 채번 쿼리 : NVL, MAX값, SUBSTR 기술 사용됨
		// 채번 쿼리 결과 : 고정값 '1'이다. 1회용 쿼리이다.
		sb.append(" SELECT  											\n");
		sb.append("         NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM    KCK_BOARD A 								\n");

		return sb.toString();
	}

	public static String getKboardSelectAllQueryMap() {

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
		sb.append("		 KCK_BOARD A 					\n");
		sb.append("	WHERE DELETEYN = 'Y'				\n");
		sb.append("	ORDER BY 1 DESC						\n");

		return sb.toString();
	}

	public static String getKboardSelectQueryMap() {

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
		sb.append("		 KCK_BOARD A 					\n");
		sb.append("	WHERE DELETEYN = 'Y'				\n");
		// 여기 물음표에 값이 들어오나?
		sb.append("	AND   A.BNUM   = ?					\n");

		return sb.toString();
	}

	public static String getKboardInsertQueryMap() {

		StringBuffer sb = new StringBuffer();
		// insert into 명령어 와 입력값 체크
		sb.append("	INSERT INTO 						\n");
		sb.append("		KCK_BOARD 				    	\n");
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

	}

	public static String getKboardUpdateQueryMap() {

		// update 명령어 사용방법 모름
		StringBuffer sb = new StringBuffer();

		// ? : 기존 코드에 입력된 값을 대체하는 역할인 플레이스홀더
		sb.append("	UPDATE  							\n");
		sb.append("		   KCK_BOARD 			    	\n");
		sb.append("	SET  								\n");
		sb.append("		   BSUBJECT	  		= ?			\n");
		sb.append("		  ,BCONTENTS		= ?			\n");
		sb.append("		  ,BWRITER		    = ?			\n");
		sb.append("		  ,UPDATEDATE 		= SYSDATE	\n");
		sb.append("	WHERE  BNUM 			= ?			\n");
		sb.append("	AND    DELETEYN 		= 'Y'  		\n");

		return sb.toString();

	}

	public static String getKboardDeleteQueryMap() {

		// delete 명령어 사용하지 않음.
		// 회원여부인 deleteyn 을 n으로 수정해 조회되지 않게 만듬.
		StringBuffer sb = new StringBuffer();
		sb.append("	UPDATE  							\n");
		sb.append("		   KCK_MEMBER 			    	\n");
		sb.append("	SET  								\n");
		sb.append("		   DELETEYN 	= 'N'			\n");
		sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  KNUM 		= ?				\n");
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");

		return sb.toString();

	}

}
