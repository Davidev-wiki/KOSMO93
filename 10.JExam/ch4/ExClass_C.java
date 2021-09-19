//package
package a.b.c.ch4;
//import


public class ExClass_C extends ExClass_P
{
	//상수
	//멤버변수
	//생성자
	public ExClass_C(){
		System.out.println("자식클래스 생성자 입니다.");
	}
	
	//함수
	public String toString(){
		return "ㅋㅋㅋ";
	}

	
	//ExClass_P에서 갖고온 함수를 재정의
	public String exClass_b(){
		
		return "자식클래스에서 오버라이딩한 b() 함수 입니다.";
	}



	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\nExClass_C.main()함수 시작\n");
 
		/*
		    1. ExClass_C 클래스를 인스턴스하면
			2. extends ExClass_P 부모 클래스를 먼저 찾아서 메모리에 로드한다.
			3. 자식 클래스 ExClass_C를 메모리에 로드한다.

		*/
		System.out.println("객체 생성할게요!-\n");
		ExClass_C ecc = new ExClass_C(); //부모클래스 생성자가 호출됨.
		System.out.println("객체 생성 완료!-\n");

		
		System.out.println("생성된 객체의 참조변수 ecc 출력 : " + ecc); //오버라이딩된 함수 toString의 리턴값이 출력됨
		System.out.println("\n ecc.toString()출력 : " + ecc.toString());


		System.out.println("\n--------------------------\n");
		System.out.println("ecc객체의 a()함수를 'a'라는 변수에 초기화합니다!-\n");
		String a = ecc.exClass_a();
		System.out.println("a의 값 : " + a);
		System.out.println("\necc객체의 b()함수를 'b'라는 변수에 초기화합니다!-\n");
		String b = ecc.exClass_b();
		System.out.println("b의 값 : " + b);


		System.out.println("\nExClass_C.main()함수 종료\n");


	
	}
}
