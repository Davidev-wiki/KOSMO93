//package
package a.b.c.ch3;
//import


public class ExFlow_2
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		//멤버 변수
		System.out.println("\n멤버 변수 선언 및 초기화 : int age = 7;\n");
		int age = 7;
		
		//---------- 방법 1
		System.out.println("if조건 (age >= 8) : 'false'가 예상됨. else문장이 실행됩니다. \n");
		if (age >= 8)
		{
			System.out.println("학교에 다닙니다.");
		}else{
			System.out.println("else >> 학교에 다니지 않습니다.");
		}

		//---------- 방법 2 (더 나은 방법)

		boolean bool = age >= 8;
		
		System.out.println("\nboolean bool = age >= 8; 초기화, 변수 bool의 값 : " + bool);
		
		System.out.println("\nif조건 (bool) : 'false'가 예상됨. else문장이 실행됩니다. \n");
		if (bool)
		{
			System.out.println("학교에 다닙니다.");
		}else {
			System.out.println("else >>  학교에 다니지 않습니다.");
		}


	}
}
