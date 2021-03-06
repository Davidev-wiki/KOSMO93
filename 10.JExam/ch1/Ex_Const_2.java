package a.b.c.ch1;

public class Ex_Const_2 {

	// 함수 a() : 리턴형이 없는 함수 
	public void a(){
		System.out.println("Ex_Const_2 :: void a() 함수");
	}

	// 함수 b() : 리턴형이 있는 함수 : 리턴형은 String : 문자열 
	public String b(){
		return "Ex_Const_2 :: String b() 함수";
	}

	// main 함수 : 콘솔 어플리케이션의 시작점 
	public static void main(String args[]){

		Ex_Const_2 ex_c2 = new Ex_Const_2();
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("Ex_Const_2객체 만들었어요~ 주소 : " + ex_c2);
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("리턴형이 없는(=void 키워드가 있는) 'ex_c2.a()'함수는 print()함수로 호출할 수 없네요;;");
		System.out.println("*에러 메세지 : 'void' type not allowed here");
		System.out.println("그냥 ex_c2.a()를 써서 함수를 갖고와볼게요? 아래와 같이 나옵니다.");
		ex_c2.a();

		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("String 리턴형이 있는 ex_c2.b()함수는 오른쪽과 같이 print()함수로 잘 출력됩니다. : " + ex_c2.b());

		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("결론 : 리턴형있으면 print()로 값을 출력할수 있지만, 리턴형 없는 함수(void)는 그냥 함수 전체를 소환하자!");
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		System.out.println("아랫줄에 'String str = ex_c2.b();' 문법으로 리턴형이 있는 b()함수를 변수에 리턴값을 담아놓고 변수로 호출해볼게요!");
		String str = ex_c2.b();
		System.out.println("새로 만든 str 변수의 값 (=함수 b()) : " + str);
	
	} // end of main 함수 

} // end of Ex_5 클래스 