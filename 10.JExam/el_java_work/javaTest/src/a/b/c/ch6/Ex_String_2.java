package a.b.c.ch6;

import java.util.StringTokenizer;

public class Ex_String_2 {
	public void charSplit(String sVal) {

		System.out.println("\n 함수 내 들어온 sval : " + sVal);

		if (sVal != null && sVal.length() > 0) {
			// 쪼개서 배열에 넣기
			String sChar[] = sVal.split("@");

			// 하나씩 출력하기
			for (int i = 0; i < sChar.length; i++) {
				System.out.println(sChar[i]);
			}
		}
	}

	public void charToken(String sVal) {

		System.out.println("\n 함수 내 들어온 sval : " + sVal);

		if (sVal != null && sVal.length() > 0) {

			StringTokenizer st = new StringTokenizer(sVal, "@^ |");

			while (st.hasMoreTokens()) {
				System.out.println("nextToken, 무슨 의미? : " + st.nextToken());
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sVal = "a b^c,d ef,g|h^i,jk|l,m^no";
		sVal = sVal.replace(',', '@');

		System.out.println(sVal);

		Ex_String_2 es2 = new Ex_String_2();
		es2.charSplit(sVal);
		es2.charToken(sVal);
	}

}
