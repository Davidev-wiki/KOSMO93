package a.b.c.swing.member.sql;

import java.util.ArrayList;

import a.b.c.swing.member.vo.SwingMemberVO;

public abstract class SwingMemberSqlMap {
	
	public static String getsmSelectAllQuery() {
		return "";
	};
	
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









