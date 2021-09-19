// package
package a.b.c.ch3;

// import


public class ExArray_1_1
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		char[] cA = new char[26];
		char ch = 'A';

		for (int i=0; i < cA.length; i++)
		{
			// 요소에 값 대입 
			cA[i] = ch;
			ch++;
		}

		for (int i=0; i < cA.length; i++ )
		{
			// 요소의 값을 조회, 아스키 10진수로 형변환 해서 조회 
			System.out.println(cA[i] + " , " + (int)cA[i]);
			System.out.print(" : " + Integer.toBinaryString((int)cA[i]));
			System.out.print(" : " + Integer.toOctalString((int)cA[i]));
			System.out.print(" : " + Integer.toHexString((int)cA[i]));

			// 8진수, 16진수로 조회 해보기 print 사용해서 한 줄로 보여주기, 각 알파벳 대문자를 
		}

	}
}
