//package
package a.b.c.ch3;
//import


public class ExArray_2_2 {
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		//향상된 for

		//배열
		String strArray[] = {"Java", "Android", "C", "JavaScript", "Python"};

		//String타입의 변수 'lang'에 strArray의 요소를 순서대로 대입해 실행문을 처리
		for (String lang : strArray)
		{
			System.out.println("lang 의 값 : " + lang);
		}
		System.out.println("\n================================================\n");

		System.out.println("String타입의 'a' 변수에 사용자 입력값 args 받아오기 >>>>>");
		for (String a : args)
		{
			System.out.println("입력 값 : " + a);
		}
		System.out.println("\n================================================\n");

		System.out.println("'배열' args의 길이를 이용한 출력 >>>>>");
		for (int i=0; i < args.length;i++ )
		{
			System.out.println("args[" + i + "] : " + args[i]);
		}

	}
}
