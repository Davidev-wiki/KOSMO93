package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_String_1 {

	public static String mnum(String nCnt) {
		
		
	// 내가 짠 코드	
		String mnum = "";
		if (1 == nCnt.length()) {
			mnum = "000" + nCnt;
		} else if (2 == nCnt.length()) {
			mnum = "00" + nCnt;
		} else if (3 == nCnt.length()) {
			mnum = "0" + nCnt;
		} else {
			mnum = nCnt;
		}
		
	/* 반복을 줄이는 방법, for 반복문
		int nn = nCnt.length();
		
		for (int i=nn; i < 4; i++) {
			nCnt = "0" + nCnt;
		}
	*/	

		return mnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 년도월일+ 4자리 수로 자동 생성
		// ex) 202107230002

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String d = sdf.format(new Date());
		System.out.println("d의 값 : " + d);

		String mnum = "";
		String nCnt = "";

		// 생성 리미트 No.0001 ~ 9999
		for (int i = 1; i < 10000; i++) {
			nCnt = String.valueOf(i);

			mnum = d + Ex_String_1.mnum(nCnt);

			System.out.println("생성된 회원번호 mnum : " + mnum);
		}

	}

}
