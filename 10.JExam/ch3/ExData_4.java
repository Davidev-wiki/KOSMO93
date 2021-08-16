//package
package a.b.c.ch3;
//import


public class ExData_4
{
	// 상수
	// 멤버변수
	// 생성자
	
	// 함수

	// 방법 (4)에 호출된 함수
	public void add_0(int x, int y){
		System.out.println("add_0 함수가 시작되었습니다 \n");
		System.out.println("add_0 함수는 리턴 값이 없는 void 함수입니다.");
		System.out.println("아규먼트(인자 값) x , y값을 각각 매개변수 int x, int y 에 대입합니다.");
		System.out.println("int x = x; , int y = y;");
		System.out.println("int x = " + x);
		System.out.println("int y = " + y);
		System.out.println("System.out.println(x + y); 함수로 x + y값을 출력합니다.");
		System.out.println(x + y);
		System.out.println("add_0 함수가 종료되었습니다. ");
		System.out.println("------------------------------------------------------");
	}
	// 방법 (5)에 호출된 함수

	public void add_1(int x, int y){
		System.out.println("add_1 함수가 시작되었습니다 \n");
		System.out.println("add_1 함수는 리턴 값이 없는 void 함수입니다.");
		System.out.println("아규먼트 x와 y를 int x와 int y에 각각 대입합니다.");
		System.out.println("int x = x; , int y = y;");
		System.out.println("int형 변수 sum에 x와 y를 더한 값을 대입합니다.");
		System.out.println("int sum = x + y;");
		int sum = x + y;
		System.out.println("System.out.println(sum);로 sum의 값을 호출합니다. >> sum : ");
		System.out.println(sum);
		System.out.println("add_1 함수가 종료되었습니다. ");
		System.out.println("------------------------------------------------------");
	}
	// 방법 (6)에 호출된 함수
	
	public int add_2(int x, int y){
		System.out.println("add_2 함수가 시작되었습니다 \n");
		System.out.println("add_2 함수는 리턴 값이 int형인 함수입니다.");
		System.out.println("x + y를 연산해 바로 리턴 값으로 toss 합니다.");
		System.out.println("함수를 호출하는 곳에서 변수에 담아 사용될 것입니다.");
		System.out.println("add_2 함수가 종료되었습니다.");
		System.out.println("------------------------------------------------------");
		return x + y;
	}

	// 방법 (7)에 호출된 함수
		public int add_3(int x, int y){
		System.out.println("add_3 함수가 시작되었습니다 \n");
		System.out.println("add_2 함수는 리턴 값이 int형인 함수입니다.");
		System.out.println("int형 변수 sum에 x와 y를 더한 값을 대입합니다.");
		System.out.println("int sum = x + y;");
		int sum = x + y;
		System.out.println("return sum; 으로 결과를 내보냅니다.");
		System.out.println("add_3 함수가 종료되었습니다.");
		System.out.println("------------------------------------------------------");
		return sum;
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		
		// 1+1의 값을 나타내는 프로그램
		System.out.println("\n-----------------main함수를 시작합니다-----------------\n");

		// 방법(1)
		System.out.println("1+1의 값을 나타내는 방법 1)\n");
		System.out.println("아래와 같이 print()함수 인자값에 1 + 1 을 넣어 출력합니다.");
		System.out.println("System.out.println(1 + 1);");
		System.out.println(1 + 1);
		System.out.println("------------------------------------------------------");

		// 방법(2)
		System.out.println("1+1의 값을 나타내는 방법 2)\n");
		System.out.println("int형 지역변수 x, y를 각각 초기화 합니다.");
		System.out.println("int x = 1; , int y = 1;");
		int x = 1;
		int y = 1;
		System.out.println("그리고 print()함수로 출력합니다. System.out.println(x + y);");
		System.out.println(x + y);
		System.out.println("------------------------------------------------------");
		
		// 방법(3)
		System.out.println("1+1의 값을 나타내는 방법 3)\n");
		System.out.println("int형 변수 'sum'에 x와 y를 더한 값을 초기화 한 후 sum을 출력합니다.");
		System.out.println("int sum = x + y;");
		int sum = x + y;
		System.out.println("System.out.println(sum);");
		System.out.println(sum);
		System.out.println("------------------------------------------------------");
		
		// 객체생성
		System.out.println("4번째 방법 부터는 참조변수를 사용하므로 객체를 생성합니다.");
		ExData_4 ed4 = new ExData_4();
		System.out.println("'ed4' 객체 생성 완료!");
		System.out.println("------------------------------------------------------");
		
		// 방법(4)
		System.out.println("1+1의 값을 나타내는 방법 4)\n");
		System.out.println("참조변수 ed4를 이용해 add_0 함수에 매개변수 x, y를 넣어 소환합니다.");
		System.out.println("ed4.add_0(x, y);");
		ed4.add_0(x, y);


		// 방법(5)
		System.out.println("1+1의 값을 나타내는 방법 5)\n");
		System.out.println("참조변수 ed4를 이용해 add_1 함수에 매개변수 x, y를 넣어 소환합니다.");
		ed4.add_1(x, y);
		

		// 방법(6)
		System.out.println("1+1의 값을 나타내는 방법 6)\n");
		System.out.println("참조변수 ed4를 이용해 add_2 함수에 매개변수 x, y를 넣고, 리턴 값을 int형 변수 'sum_2'에 담아 출력합니다.");
		int sum_2 = ed4.add_2(x, y);
		System.out.println(sum_2);
		

		// 방법(7)
		System.out.println("1+1의 값을 나타내는 방법 7)\n");
		System.out.println("참조변수 ed4를 이용해 add_3 함수에 매개변수 x, y를 넣고, 리턴 값을 int형 변수 'sum_3'에 담아 출력합니다.");
		int sum_3 = ed4.add_3(x, y);
		System.out.println(sum_3);


		System.out.println("\n-----------------main함수를 종료합니다-----------------");
		
	}
}
