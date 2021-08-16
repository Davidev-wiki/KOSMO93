//package
package a.b.c.ch3;
//import


public class ExCast_3 {
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("ExCast_3.main()함수 시작");
		
		//지역변수 정의
		System.out.println("\n----------------------------------------------------------");
		System.out.println("지역변수 정의 : int i = 10; , byte b = (byte) i;");
		System.out.println("----------------------------------------------------------");
		int i = 10;
		byte b = (byte) i;

		System.out.println(i);
		System.out.println("문자열 'i'를 2진수로 표현 : " + Integer.toBinaryString(i));
		System.out.println(b);
		System.out.println("문자열'b'를 2진수로 표현 : " + Integer.toBinaryString(b));
	
		//지역변수 정의
		//지역변수 정의
		System.out.println("\n----------------------------------------------------------");
		System.out.println("지역변수 정의 : int i1 = 1000; , byte b1 = (byte) i1;");
		System.out.println("----------------------------------------------------------");
		int i1 = 1000;
		byte b1 = (byte)i1;
		System.out.println(i1);
		System.out.println(b1);

		System.out.println("Byte의 최대값 : " + Byte.MAX_VALUE);
		System.out.println("Byte의 최소값 : " + Byte.MIN_VALUE);
	
		System.out.println("문자열 'b1'을 2진수로 표현 : " + Integer.toBinaryString(b1));	
		
		System.out.println("\n----------------------------------------------------------");
		System.out.println("지역변수 정의 : double d = 3.14; , int i2 = (int) d;");
		System.out.println("----------------------------------------------------------");
		double d = 3.14;
		int i2 = (int)d;
		System.out.println("d : " + d);
		System.out.println("i2 : " + i2);
		System.out.println("\n*설명 : double 타입 'd'를 int타입(정수형)으로 바꾸면 소수점 아래를 버림.");
		System.out.println("(지수부만 출력, 가수부 버림)\n");
		
		System.out.println("ExCast_3.main()함수 종료");
	}
}
