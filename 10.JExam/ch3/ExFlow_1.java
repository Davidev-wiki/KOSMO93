//package
package a.b.c.ch3;
//import

public class ExFlow_1
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		

		// if 테스트---------------------------------------
		System.out.println("\n [[[ if 문은 조건식의 결과가 true일 때만 수행된다. ]]]\n");

		if (true)
		{
			System.out.println("조건식의 결과가 true입니다 ");
		}
		

		//if, else 테스트----------------------------------------
		
		if (false)
		{
		}else{
			System.out.println("조건식 결과가 false이다. 여기는 else블럭");
		}

		
		//boolean 활용 if 테스트 ---------------------------------

		boolean bool = false;

		if (!bool) //지역변수
		{
			System.out.println("if의 조건이 !bool이다. true이면 출력되는 문장");
		}

		System.out.println("bool의 값은? : " + bool);
		
		if (bool)
		{

		}else{
			System.out.println("bool이 참이 아닐때 실행되는 문장");
		}

		int x = 1;
		int y = 0;
		System.out.println("x / y하기 전 테스트");
		int sum = x / y;  // 컴파일은 가능한데 출력하면 에러 발생
		System.out.println(sum);

		//if (sum > 0)
		{
		}
	}
}
