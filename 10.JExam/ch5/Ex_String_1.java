//package
package a.b.c.ch5;
//import


public class Ex_String_1
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n>> 메인함수 시작합니다!-\n");
		
		String s = "";
		int sLen = s.length();
		System.out.println("sLen의 값 : " + sLen);

		String s1 = "       ";
		int sLen1 = s1.length(); 
		System.out.println("sLen1의 값 : " + sLen1);

		String s2 = "   kosmo  hello  world    ";
		System.out.println("s2 의 값 : " + s2);
		int sLen2 = s2.length();
		System.out.println("sLen2 의 값 : " + sLen2);


		String s3 = s2.trim();
		System.out.println("s3 의 값 : " + s3);
		int sLen3 = s3.length();
		System.out.println("sLen3 의 값 : " + sLen3);

		String sNull = null;
		System.out.println("sNull의 값 : " + sNull);


		System.out.println("\n약속의 3주 동안 배운 것 중 제일 중요한것---\n");
		System.out.println("자바의 80%인 String은 항상 0과 null 값을 제외하고 쓴다.(해킹 및 오류 방지)\n");
		
		String sVal = "";
		if (sVal !=null && sVal.length() > 0)
		{
			System.out.println("길이가 0인 데이터 걸러내기 :: length() 0 Validation : ");
		}
		String sVal1 = null;
		if (sVal1 !=null && sVal1.length() > 0)
		{
			System.out.println("null 데이터 걸러내기 :: null Validation : ");
		}
		System.out.println("\n>> 메인함수 종료!-\n");
	}
}
