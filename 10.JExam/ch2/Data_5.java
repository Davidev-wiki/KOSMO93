package a.b.c.ch2;


public class Data_5 {

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
		System.out.println("상수 사용 테스트를 시작합니다.-----------------------------------------------------------");
		System.out.println("public static final 'String XXX_XXXX'에 할당된 메시지가 출력됩니다.");
		System.out.println("static이 메모리에 올려놓았으므로 직접 경로에서 참조합니다. Data_5.XXX_XXXX = " + Data_5.XXX_XXXX);
		System.out.println("public static final 'int XXX_XX'에 할당된 메시지가 출력됩니다.");
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("클래스 변수 사용 테스트를 시작합니다.------------------------------------------------------");
		System.out.println("static 'int siVal' 과 'String ssVal'에 할당된 메시지가 출력됩니다.");
		System.out.println("static이 메모리에 올려놓았으므로 직접 경로에서 참조합니다. 'Data_5.변수명'으로 출력합니다.");
		System.out.println("클래스 변수 int 타입 siVal = " + Data_5.siVal);
		System.out.println("클래스 변수 String 타입 ssVal = " + Data_5.ssVal);
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("멤버 변수 사용 테스트를 시작합니다.------------------------------------------------------");
		System.out.println("Data_5클래스로 객체를 생성합니다.");
		Data_5 d5 = new Data_5();
		System.out.println("객체가 생성되었습니다. 메모리에 저장된 주소 = " + d5);
		System.out.println("객체 'd5'를 이용해 멤버 변수 iVal를 호출합니다. 'd5.iVal' = " + d5.iVal);
		System.out.println("객체 'd5'를 이용해 멤버 변수 sVal를 호출합니다. 'd5.sVal' = " + d5.sVal);
		System.out.println("---------------------------------------------------------------------------------");

		System.out.println("전역 변수 사용 테스트를 시작합니다.------------------------------------------------------");
		System.out.println("*멤버 변수에'public' 키워드가 붙으면 전역 변수입니다!");
		System.out.println("static이 없으면 객체를 이용해 어디에서나 호출해서 사용이 가능합니다.");
		System.out.println("'d5.giVal' = " + d5.giVal);
		System.out.println("'d5.gsVal' = " + d5.gsVal);
		System.out.println("---------------------------------------------------------------------------------");

	} // end of main 함수 	
} // end of Data_5