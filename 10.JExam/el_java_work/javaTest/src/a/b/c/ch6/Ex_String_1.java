package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_String_1 {

	public static String mnum(String nCnt) {
		
		
	// ���� § �ڵ�	
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
		
	/* �ݺ��� ���̴� ���, for �ݺ���
		int nn = nCnt.length();
		
		for (int i=nn; i < 4; i++) {
			nCnt = "0" + nCnt;
		}
	*/	

		return mnum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �⵵����+ 4�ڸ� ���� �ڵ� ����
		// ex) 202107230002

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String d = sdf.format(new Date());
		System.out.println("d�� �� : " + d);

		String mnum = "";
		String nCnt = "";

		// ���� ����Ʈ No.0001 ~ 9999
		for (int i = 1; i < 10000; i++) {
			nCnt = String.valueOf(i);

			mnum = d + Ex_String_1.mnum(nCnt);

			System.out.println("������ ȸ����ȣ mnum : " + mnum);
		}

	}

}
