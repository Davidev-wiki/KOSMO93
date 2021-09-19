//package
package a.b.c.ch3;
//import


public class ExCast_1{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		
		
		// byte 타입의 지역변수 b를 선언함과 동시에 리터럴 10을 초기화
		byte b = 10;
		// int 타입의 지역변수 i를 선언함과 동시에 'b'를 대입
		int i = b;

		//콘솔에 b 출력
		System.out.println(b);
		//콘솔에 i 출력
		System.out.println(i);

		// 자바 규칙)
		// 자바에서는 대입연산자 '='를 중심으로 좌, 우의 데이터 타입이 동일해야 한다.
		// 예) int i = (int)b; 
		// (int)를 쓰지 않아도 가능한 이유는 '묵시적(자동) 형변환'때문이다.
		// 작은 데이터타입(byte)에서 큰 데이터타입(int)로 변경될 때는 자동 형변환!

		// int타입 변수 'i1'선언함과 동시에 리터럴 20 초기화 
		int i1 = 20;
		// float타입 변수 'f'선언과 동시에 'i1'대입
		float f = i1;
		
		System.out.println(i1);
		System.out.println(f);

		//double 타입 변수 d 선언.
		double d;
		//변수 'd'에 i(10)와 f(20.0) 를 더한 값을 대입.
		//double 타입으로 자동 변환되어 'd'를 출력하면 소수점 '30.0'이 출력됨
		d = i + f;
		System.out.println(d);


	}
}
