
/*
사칙 연산 프로그램 만들기
사칙 연산자 : +, -, *, /
변수 : main 함수 지역변수 int x , int y 초기화는 각각 20, 10으로 한다.

더하기 함수 : public int addM(int x, int y)
빼기 함수 : public int subM(int x, int y)
곱하기 함수 : public int mulM(int x, int y)
나누기 함수 : public int divM(int x, int y)

각 연산자 함수 블럭에서 하고 결과는 int sum으로 받는다.
각 연산자 함수 블럭에서 리턴은 지역변수 int sum으로 받는다.

main()함수에서 각 연산자 함수를 호출해서 결과 값을 하기 지역 변수로 받아서 콘솔에 출력한다.
int addV, int subV, int mulV, int divV 각 연산자 함수 호출은 참조변수를 이용한다.

패키지는 a.b.c.ch3;으로 한다.

*/

//패키지 선언
package a.b.c.ch3;

//import

//class선언

public class ExData_6 {
	//상수
	//멤버 변수
	//생성자
	
	//함수
	public int addM(int x, int y){
		System.out.println("\nExData_6.addM() 함수 시작------------------------------");
		int sum = x + y;
		System.out.println("\nExData_6.addM() 함수 종료------------------------------");
		return sum;
	}

	public int subM(int x, int y){
	System.out.println("\nExData_6.subM() 함수 시작------------------------------");
	int sum = x - y;
	System.out.println("\nExData_6.subM() 함수 종료------------------------------");
		return sum;
	}

	public int mulM(int x, int y){
	System.out.println("\nExData_6.mulM() 함수 시작------------------------------");
	int sum = x * y;
	System.out.println("\nExData_6.mulM() 함수 종료------------------------------");
	return sum;
	}

	public int divM(int x, int y){
	System.out.println("\nExData_6.divM() 함수 시작------------------------------");
	int sum = x / y;
	System.out.println("\nExData_6.divM() 함수 종료------------------------------");
	return sum;
	}

	public static void main(String[] args) {

	System.out.println("ExData_6.main() 함수 시작------------------------------");
	
	// 지역 변수 초기화
	int x = 20;
	int y = 10;

	// 객체 생성
	System.out.println("\nExData_6 객체 생성-----------------------------------------\n");
	ExData_6 ed6 = new ExData_6();
	System.out.println("\nExData_6 객체 주소값 : [" + ed6+"]");

	// 지역 변수로 각각의 함수 결과 값 받기
	
	// 더하기 함수
	int addV = ed6.addM(x, y);
	System.out.println(">> 더하기 함수를 지역변수 addV로 받아와 실행합니다 : " + addV);
	
	// 빼기 함수
	int subV = ed6.subM(x, y);
		System.out.println("\n>> 빼기 함수를 지역변수 subV로 받아와 실행합니다 : " + subV);
	
	// 곱하기 함수
	int mulV = ed6.mulM(x, y);
		System.out.println("\n>> 곱하기 함수를 지역변수 mulV로 받아와 실행합니다 : " + mulV);
	
	// 나누기 함수
	int divV = ed6.divM(x, y);
		System.out.println("\n>> 나누기 함수를 지역변수 divV로 받아와 실행합니다 : " + divV);


	System.out.println("\n ExData_6.main() 함수 종료------------------------------");

	}//end of main()


} //end of ExData_6 class