//package
package a.b.c.ch3;
//import


public class ExOper_1 {
	//상수
	//멤버변수
	int num;
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		int num = 10;
		
		//데이터 타입 int형인 지역 변수 num을 호출, 콘솔에 출력해보시오.
		System.out.println(num);
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);

		num = -num;
		System.out.println(num);
		
		System.out.println( 5 - 3 );
		System.out.println( 3 - 5 );

		System.out.println( 5 / 3 );
		System.out.println( 3 / 5 );
		
		System.out.println( 5 % 3 );
		System.out.println( 3 % 5 );


		int gameScore = 150;
		
		//gameScore가 1증가한 다음 lastScore1에 대입
		//ex) ++A : A에 1을 더해서 변수에 대입해주세요.
		int lastScore1 = ++gameScore;
		System.out.println(lastScore1);

		//gameScore가 1감소한 다음 lastScore2에 대입
		//ex) --A : A에 1을 빼고나서 변수에 대입해주세요. 
		int lastScore2 = --gameScore;
		System.out.println(lastScore2);


		// -------------------------------------------------


		int gameScore1 = 150;
		// gameScore를 먼저 변수에 대입하고나서 1을 더한다.
		int lastScore11 = gameScore1++;
		System.out.println(lastScore11);
		// gameScore를 먼저 변수에 대입하고나서 1을 뺀다.
		int lastScore22 = gameScore1--;
		System.out.println(lastScore22);

	}
}
