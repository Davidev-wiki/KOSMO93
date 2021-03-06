//package
package a.b.c.ch3;
//import


public class ExCast_5 {
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n알파벳 A to Z 인코딩하기\n");
		
		System.out.println("\n----main()함수 시작----\n");
		
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char c0 = str.charAt(0);
		System.out.println("[" + c0 + "] <<< 0 번째 인덱스에 있는 문자 출력 값");
		System.out.println("[" + Integer.toBinaryString(c0) + "] <<< 0 번째 문자를 toBinaryString()으로 2진수로 출력");
		System.out.println("[" + Integer.toOctalString(c0) + "] <<< 0 번째 문자를 toOctalString()으로 8진수로 출력");
		System.out.println("[" + (int) c0 + "] <<< 0 번째 문자 int로 캐스팅 후 10진수로 출력");
		System.out.println("[" + Integer.toHexString(c0) + "] <<< 0 번째 문자를 toHexString()으로 16진수로 출력");

		System.out.println("\n");

		char c1 = str.charAt(1);
		System.out.println("[" + c1 + "] <<< 1 번째 인덱스에 있는 문자 출력 값");
		System.out.println("[" + Integer.toBinaryString(c1) + "] <<< 1 번째 문자를 toBinaryString()으로 2진수로 출력");
		System.out.println("[" + Integer.toOctalString(c1) + "] <<< 1 번째 문자를 toOctalString()으로 8진수로 출력");
		System.out.println("[" + (int) c1 + "] <<< 1 번째 문자 int로 캐스팅 후 10진수로 출력");
		System.out.println("[" + Integer.toHexString(c1) + "] <<< 1 번째 문자를 toHexString()으로 16진수로 출력");

		System.out.println("\n");

		char c2 = str.charAt(2);
		System.out.println("[" + c2 + "] <<< 2 번째 인덱스에 있는 문자 출력 값");
		System.out.println("[" + Integer.toBinaryString(c2) + "] <<< 2 번째 문자를 toBinaryString()으로 2진수로 출력");
		System.out.println("[" + Integer.toOctalString(c2) + "] <<< 2 번째 문자를 toOctalString()으로 8진수로 출력");
		System.out.println("[" + (int) c2 + "] <<< 2 번째 문자 int로 캐스팅 후 10진수로 출력");
		System.out.println("[" + Integer.toHexString(c2) + "] <<< 2 번째 문자를 toHexString()으로 16진수로 출력");

		System.out.println("\n");

		char c3 = str.charAt(3);
		System.out.println("[" + c3 + "] <<< 3 번째 인덱스에 있는 문자 출력 값");
		System.out.println("[" + Integer.toBinaryString(c3) + "] <<< 3 번째 문자를 toBinaryString()으로 2진수로 출력");
		System.out.println("[" + Integer.toOctalString(c3) + "] <<< 3 번째 문자를 toOctalString()으로 8진수로 출력");
		System.out.println("[" + (int) c3 + "] <<< 3 번째 문자 int로 캐스팅 후 10진수로 출력");
		System.out.println("[" + Integer.toHexString(c3) + "] <<< 3 번째 문자를 toHexString()으로 16진수로 출력");

		System.out.println("\n");

		System.out.println(".");
		System.out.println(".");
		System.out.println(".");
		System.out.println(".");

		char c25 = str.charAt(25);
		System.out.println("[" + c25 + "] <<< 25 번째 인덱스에 있는 문자 출력 값");
		System.out.println("[" + Integer.toBinaryString(c25) + "] <<< 25 번째 문자를 toBinaryString()으로 2진수로 출력");
		System.out.println("[" + Integer.toOctalString(c25) + "] <<< 25 번째 문자를 toOctalString()으로 8진수로 출력");
		System.out.println("[" + (int) c25 + "] <<< 25 번째 문자 int로 캐스팅 후 10진수로 출력");
		System.out.println("[" + Integer.toHexString(c25) + "] <<< 25 번째 문자를 toHexString()으로 16진수로 출력");

		System.out.println("\n");
		
	
		System.out.println("\n---------main()함수 종료---------\n");

		System.out.println("\n---------for 문을 사용해 인코딩---------\n");
		System.out.println("[알파벳] : 2진수 : 8진수 : 10진수 : 16진수\n");
		
		for (int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			System.out.print("["+ c +"] : ");
			System.out.print(Integer.toBinaryString(c) + " : ");
			System.out.print(Integer.toOctalString(c) + " : ");
			System.out.print((int)c + " : ");
			System.out.print(Integer.toHexString(c));
			System.out.println("");
		}

	}
}
