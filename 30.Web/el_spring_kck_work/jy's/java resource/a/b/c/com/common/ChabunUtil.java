package a.b.c.com.common;

public abstract class ChabunUtil {
	
	public static final String BIZ_GUBUN_B = "B"; // 게시판 : BOARD
	public static final String BIZ_GUBUN_RB = "RB";
	
	// type : D : 20210001, M : YYYYMM , Y : YYYY, N : 
	public static String numPad(String t, String c) {
		System.out.println("ChabunUtil :: numPad 함수 진입 >>");
		
		for(int i=c.length(); i< 4; i++) {
			c = "0" + c;
		}// end of for문
		String ymd = DateFormatUtil.ymdFormats(t);
		return ymd.concat(c);
	}// end of numPad 함수
	
	// 게시글 글 번호
	public static String getBoardChabun(String type, String memNum) {
		System.out.println("ChabunUtil :: getBoardChabun 함수 진입 >>");
		return BIZ_GUBUN_B.concat(ChabunUtil.numPad(type, memNum));
	}// end of getBoardChabun 함수
	
	public static String getRboardChabun(String type, String memNum) {
		System.out.println("ChabunUtil :: getRboardChabun 함수 진입 >>");
		return BIZ_GUBUN_RB.concat(ChabunUtil.numPad(type, memNum));
	}// end of getRboardChabun 함수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ChabunUtil :: main 함수 진입 >>");
		
		String c = "1";
		System.out.println(">> :" + ChabunUtil.getBoardChabun("N", c));
		System.out.println(">> : " + ChabunUtil.getRboardChabun("N", c));
	}// end of main 함수

}
