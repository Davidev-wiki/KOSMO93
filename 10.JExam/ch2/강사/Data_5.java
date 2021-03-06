package a.b.c.ch2;


public class Data_5 {
	
	/*
	필드 : 멤버변수 
	1. 상수			static 존재 | 클래스명.변수명으로 사용
	2. 클래스변수     static 존재 | 클래스명.변수명으로 사용
	---------------------------------------------------
	3. 전역변수		static 없음 |  참조변수로 사용
	4. 멤버변수		static 없음 |  참조변수로 사용
	*/

	// 상수는 자바소스코드 맨 상단에 위치한다. 
	// 상수 : constant : 변하지 않는 수 : 변하면 안되는 수 
	// 상수 사용방법은 : 클래스이름.상수변수명 : Data_5.XXX_XXXX 
	public static final String XXX_XXXX = "난 문자 상수다.";
	public static final int XXX_XX = 0; // 숫자 상수 

	// 멤버변수
	int iVal;
	String sVal;

	// 클래스변수
	static int siVal;
	static String ssVal;

	// 전역변수 : 멤버변수에 접근제한자(access modifier) public 선언한 변수
	// 사용방법 : 참조변수 이용하기 
	public int giVal;
	public String gsVal;


	public static void main(java.lang.String[] args){
		System.out.println("----상수 테스트----");
		System.out.println("문자 상수 : " + Data_5.XXX_XXXX);
		System.out.println("숫자 상수 : " + Data_5.XXX_XX);
		System.out.println("");

		System.out.println("----클래스 변수 테스트----");
		System.out.println("클래스 변수 int 타입 : " + Data_5.siVal);
		System.out.println("클래스 변수 String 타입 : " + Data_5.ssVal);
		System.out.println("");

		System.out.println("----멤버 변수 테스트----");
		Data_5 d5 = new Data_5();
		System.out.println("iVal >>> : " + d5.iVal);
		System.out.println("sVal >>> : " + d5.sVal);
		System.out.println("");

		System.out.println("----전역 변수 테스트----");
		System.out.println("giVal >>> : " + d5.giVal);
		System.out.println("gsVal >>> : " + d5.gsVal);
		System.out.println("");

	} // end of main 함수 	
} // end of Data_4

