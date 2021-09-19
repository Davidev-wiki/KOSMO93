// package
package a.b.c.ch3;

// import


public class ExArray_1_2
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		System.out.println("\n-----------------------------------------------------------------------------------------\n");

		//지역변수
		String aa ="abcdefghijklmnopqrstuvwxyz";
		String aA = aa.toUpperCase();
		String n = "0123456789";
		String m = "+-*/%";
		String s = "~!@#$%^&()[]{}";

		System.out.println("aa = " + aa);
		System.out.println("aa = " + aA);
		System.out.println("aa = " + n);
		System.out.println("aa = " + m);
		System.out.println("aa = " + s);
	
		
		//string 길이, 
		//charAt()를 이용해 각 지역변수를 콘솔에 출력
		//System.out.println("순서 - 문자 - 16진수);

		System.out.println("\n-----------------------------------------------------------------------------------------\n");

		char c = ' ';

		for (int i = 0 ; i < aa.length() ; i++)
		{
			c = aa.charAt(i);
			System.out.println("소문자 aa의 "+ i + "번째 문자는 " + c + "입니다. 16진수로 변환하면, 0x" + Integer.toHexString(c) + "입니다.");
		}
		System.out.println("\n-----------------------------------------------------------------------------------------\n");
		
		for (int i = 0 ; i < aA.length() ; i++)
		{
			c = aA.charAt(i);
			System.out.println("대문자 aA의 "+ i + "번째 문자는 " + c + "입니다. 16진수로 변환하면, 0x" + Integer.toHexString(c) + "입니다.");
		}
		System.out.println("\n-----------------------------------------------------------------------------------------\n");
		
		for (int i = 0 ; i < n.length() ; i++)
		{
			c = n.charAt(i);
			System.out.println("숫자 n의 "+ i + "번째 문자는 " + c + "입니다. 16진수로 변환하면, 0x" + Integer.toHexString(c) + "입니다.");
		}
		System.out.println("\n-----------------------------------------------------------------------------------------\n");
		
		for (int i = 0 ; i < m.length() ; i++)
		{
			c = m.charAt(i);
			System.out.println("연산자 m의 "+ i + "번째 문자는 " + c + "입니다. 16진수로 변환하면, 0x" + Integer.toHexString(c) + "입니다.");
		}
		System.out.println("\n-----------------------------------------------------------------------------------------\n");
		
		for (int i = 0 ; i < s.length() ; i++)
		{
			c = s.charAt(i);
			System.out.println("특수문자 s의 "+ i + "번째 문자는 " + c + "입니다. 16진수로 변환하면, 0x" + Integer.toHexString(c) + "입니다.");
		}
		System.out.println("\n-----------------------------------------------------------------------------------------\n");
		
	}
}
