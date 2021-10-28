package a.b.c.com.common;

public abstract class ChabunUtil {
	 
	 public static final String BIZ_GUBUN_M = "M";
	 public static final String BIZ_GUBUN_B = "B"; 
	 public static final String BIZ_GUBUN_RB = "RB"; 
	 public static final String BIZ_GUBUN_N = "NB"; 
	 
	 // type : D : 20210001, M : YYYYMM, Y : YYYY, N :
	 public static String numPad(String t, String c) {
		 
		 for (int i=c.length(); i<4; i++) {
			 c= "0" + c;
		 }
		 String ymd = DateFormUtil.ymdFormats(t);
		 
		 return ymd.concat(c);
	 }
	 
	 // member 채번로직
	 public static String getMemChabun(String type, String memNum) {
		 
		 return BIZ_GUBUN_M.concat(ChabunUtil.numPad(type, memNum));
	 }
	 
	 // board 채번로직
	 public static String getBoardChabun(String type, String memNum) {
		 
		 return BIZ_GUBUN_B.concat(ChabunUtil.numPad(type, memNum));
	 }
	 
	 // Rboard 채번로직. R이 ㅁ머였지...? : 댓글
	 public static String getRboardChabun(String type, String memNum) {
		 
		 return BIZ_GUBUN_RB.concat(ChabunUtil.numPad(type, memNum));
	 }
	 
	 // notice 채번로직
	 public static String getNoticeChabun(String type, String memNum) {
		 
		 return BIZ_GUBUN_B.concat(ChabunUtil.numPad(type, memNum));
	 }
	 
	 public static void main(String[] args)  {
		 
		 String c = "1";
		 System.out.println(">>> : " + ChabunUtil.getMemChabun("m", c));
		 System.out.println(">>> : " + ChabunUtil.getBoardChabun("N", c));
		 System.out.println(">>> : " + ChabunUtil.getRboardChabun("N", c));
		 System.out.println(">>> : " + ChabunUtil.getNoticeChabun("N", c));
		 
	 }
	 
}
