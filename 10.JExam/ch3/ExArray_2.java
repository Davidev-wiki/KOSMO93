//package
package a.b.c.ch3;
//import


public class ExArray_2 {
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		System.out.println();

		//배열 선언 및 초기화 방법 1
		String str[] = new String[]{"abc", "def", "ghi"};
		System.out.println("str 출력 : " + str);
		System.out.println("스트링 배열의 길이를 나타내는 'str.length' 출력 : " + str.length);

		System.out.println("\n----------------------------------------------------\n");
		//배열의 길이를 int형 변수 'strLen'에 초기화
		int strLen = str.length;
		//반복문으로 배열의 요소를 조회하기
		for (int i=0; i < strLen; i++ )
		{	
			System.out.println("========================================================");
			//배열의 요소를 순서대로 출력
			System.out.println("\n >> str변수의 ["+i+"]번 째 값 : " + str[i]);
			for (int j=0; j < str[i].length(); j++)
			{
				//문자 쪼개기 : 문자를 쪼개서 가지고 오는 'charAt()' 함수
				System.out.print("\n문자열 str[i]의 ["+ j +"]번째 문자 : " + str[i].charAt(j)+ " | 16진수로 변경 : 0x");
				//16진수로 바꾸기 : 문자를 숫자로 바꾸는 인코딩 함수 Integer.toHexString()
				System.out.println(Integer.toHexString(str[i].charAt(j)));
			}
			System.out.println("========================================================");
		}

		System.out.println("\n----------------------------------------------------\n");
		
		//배열 선언 및 초기화 방법 2
		String str1[] = {"abc", "def", "ghi"};
		System.out.println("str1 출력 : " + str1);
		System.out.println("스트링 배열의 길이를 나타내는 'str1.length'출력 : " + str1.length);

		System.out.println("\n----------------------------------------------------\n");
		int str1Len = str1.length;
		for (int i=0; i < str1Len; i++ )
		{
			System.out.println("========================================================");
			System.out.println("\n >> str1변수의 ["+i+"]번 째 값 : " + str1[i]);
			for (int j=0; j < str1[i].length() ; j++)
			{
				System.out.print("\n문자열 str1[i]의 [" + j + "]번째 문자 : " + str1[i].charAt(j) + " | 16진수로 변경 : 0x");
				System.out.println(Integer.toHexString(str1[i].charAt(j)));
			}
			System.out.println("========================================================");
		}



	}
}
