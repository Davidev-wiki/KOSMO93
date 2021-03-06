//package
package a.b.c.ch3;
//import


public class ExOper_2 {
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		System.out.println("\ntrue / false 비교 연산자 -------------------------");
		// 관계 연산자는 연산의 결과를 논리 값(true, false)으로 반환함
		System.out.println( 3 < 5 ); //3이 5보다 작냐? true
		System.out.println( 3 > 5 ); //3이 5보다 크냐? false
		System.out.println( 3 <= 5 ); //3이 5보다 작거나 같냐? true
		System.out.println( 3 >= 5 ); //3이 5보다 크거나 같냐? false
		System.out.println( 3 == 5 ); //3이 5와 같냐? false
		System.out.println( 3 != 5 ); //3이 5와 같지 않냐? true
	
		System.out.println("\nbool 변수에 값을 대입하기 -------------------------");
		//boolean 타입 변수 bool의 값을 false로 초기화
		boolean bool = false;

		bool = 3 < 5;  //bool 변수에 연산 값을 대입 true
		System.out.println("3 < 5 = " + bool);
		bool = 3 > 5;  //bool 변수에 연산 값을 대입 false
		System.out.println("3 > 5 = " + bool);
		bool = 3 <= 5;  //bool 변수에 연산 값을 대입 true
		System.out.println("3 <= 5 = " + bool);
		bool = 3 >= 5;  //bool 변수에 연산 값을 대입 false
		System.out.println("3 >= 5 = " + bool);
		bool = 3 == 5;  //bool 변수에 연산 값을 대입 false
		System.out.println("3 == 5 = " + bool);
		bool = 3 != 5;  //bool 변수에 연산 값을 대입 true
		System.out.println("3 != 5 = " + bool);

		
		System.out.println("\n 문자 비교하기 ----------------------------------");
		
		bool = 'a' < 'b';
		System.out.println(bool);
		
		bool = 'A' < 'B';
		System.out.println(bool);

		bool = 'A' < 40;
		System.out.println(bool);

		bool = 'A' < 0x65; //'0x65' 는 16진수
		System.out.println(bool);

		bool = 'a' < '가';
		System.out.println(bool);
		
		bool = '가' < '나';
		System.out.println(bool);		
		
		System.out.println("\n--------------------------------------------");
		System.out.println("\n*작은 따옴표 (\' \')안에 는 한글자(문자)가 와야한다");
		System.out.println("\n*큰 따옴표 (\" \")안에 는 두 글자 이상이 와야한다");
/*
		bool = '가나' < '다라';
		System.out.println(bool);

		bool = "가" < "나";
		System.out.println(bool);
*/

		System.out.println("\n 논리 연산------------------------------------\n");
		System.out.println("* 논리 연산은 관계 연산의 결과 값으로 관계 연산을 한다.\n");

		boolean bVal1 = 5 > 3;
		System.out.println("bVal1 = 5 > 3; 결과 : " + bVal1);
		boolean bVal2 = 5 > 2;
		System.out.println("\nbVal2 = 5 > 2; 결과 : " + bVal1);
		
		boolean bVal = 5 > 3 && 5 > 2;
		System.out.println("\nbVal = 5 > 3 && 5 > 2; 결과 : " + bVal);
		
		System.out.println("\n && 는 두 개 모두 참이어야 함");

		System.out.println("\n------------------------------------------\n");
		


		boolean bV  = 5 > 3 || 5 > 2;
		
		System.out.println("boolean bV  = 5 > 3 || 5 > 2;의 값 : " + bV);
		
		boolean bV1 = 5 > 3;
		System.out.println("\nboolean bV1  = 5 > 3;의 값 : " + bV1);
		
		boolean bV2 = 5 > 2;
		System.out.println("\nboolean bV2  = 5 > 2;의 값 : " + bV2);
		
		boolean bV3 = true && true;
		System.out.println("\nboolean bV3  = true && true; 의 값 : " + bV3);

		System.out.println("\n || 는 둘 중 하나만 참이어도 참!");

		System.out.println("\n-----------------------------------------------------------------------------\n");


		//자바 논리연산의 단축평가 : short-circuit 현상
		System.out.println("\n[[자바 논리연산의 단축평가 : short-circuit 현상 살펴보기 ]]");
		System.out.println("\nint num1 = 10;, int i = 2; 초기화");
		
		int num1 = 10;
		int i = 2;


		// 첫 번째 비교값이 false일 때  &&
		System.out.println("첫 번째 비교값이 false일 때  &&연산자");
		boolean v = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
		System.out.println("boolean v = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10); 에서 v의 값 : " + v);
		System.out.println("num1 : " + num1);
		System.out.println("i : " + i);

		System.out.println("\n &&연산자 앞에 false가 오는 경우 뒤에 비교군을 계산하지도 않고 무조건 false라고 하는 것 ");

		
		// 첫 번째 비교값이 true일 때  &&
		System.out.println("첫 번째 비교값이 true일 때  &&연산자");
		boolean v1 = ((num1 = num1 + 10) > 10) && ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) > 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v1);
		System.out.println(num1);
		System.out.println(i);

		// 첫 번째 비교값이 true일 때  ||
				System.out.println("첫 번째 비교값이 true일 때  ||연산자");
		boolean v2 = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) > 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v2);
		System.out.println(num1);
		System.out.println(i);
		
		// 첫 번째 비교값이 false일 때  ||
				System.out.println("첫 번째 비교값이 false일 때  ||연산자");
		boolean v3 = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
		System.out.println((num1 = num1 + 10) < 10);
		System.out.println((i = i + 2) < 10);
		System.out.println(v3);
		System.out.println(num1);
		System.out.println(i);



//----------------------------------------------------------


		// 복합 대입 연산자
		System.out.println("\n 복합 대입 연산자 >>>>>>>>>>>>>>\n");
		int s = 10;
		System.out.println(s += 10);
		System.out.println(s -= 10);
		System.out.println(s *= 10);
		System.out.println("\n-----------------------------------------------------------------------------\n");

		// 삼항 연산자  :  조건 연산자  :  if조건문
		System.out.println("\n삼항 연산자 : 조건 연산자 >>>>>>>>>>\n");
		System.out.println("\n 조건 연산자의 구조 >>>> [ 조건 ? 참일 때 : 거짓일 때; ]\n");
		
		int n = (5 > 3) ? 10 : 20;
		System.out.println("int n = (5 > 3) ? 10 : 20;에서 n의 값 : " + n);

		int n1 = (5 < 3) ? 10 : 20;
		System.out.println("int n = (5 < 3) ? 10 : 20;에서 n1의 값 : " + n1);

		boolean b = (true) ? true : false;
		System.out.println("boolean b = (true) ? true : false;에서 b의 값" + b);

		boolean b1 = (false) ? true : false;
		System.out.println("boolean b1 = (false) ? true : false;에서 b1의 값" + b1);


	}
}
