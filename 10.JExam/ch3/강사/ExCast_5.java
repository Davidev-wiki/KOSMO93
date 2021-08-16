// package
package a.b.c.ch3;

// import


public class ExCast_5 
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		char c0 = str.charAt(0);		
		System.out.println("Integer.toBinaryString(c0) >>> : " + Integer.toBinaryString(c0));	
		System.out.println("Integer.toOctalString(c0) >>> : " + Integer.toOctalString(c0));
		System.out.println("(int)c0 >>> : " + (int)c0);
		System.out.println("Integer.toHexString(c0) >>> : " + Integer.toHexString(c0));
		System.out.println("c0 >>> : " + c0);

		char c1 = str.charAt(1);
		System.out.println("Integer.toBinaryString(c1) >>> : " + Integer.toBinaryString(c1));	
		System.out.println("Integer.toOctalString(c1) >>> : " + Integer.toOctalString(c1));
		System.out.println("(int)c1 >>> : " + (int)c1);
		System.out.println("Integer.toHexString(c1) >>> : " + Integer.toHexString(c1));
		System.out.println("c1 >>> : " + c1);


		char c2 = str.charAt(2);
		char c3 = str.charAt(3);
		char c4 = str.charAt(4);
		char c5 = str.charAt(5);
		char c6 = str.charAt(6);
		char c7 = str.charAt(7);
		char c8 = str.charAt(8);
		char c9 = str.charAt(9);
		char c10 = str.charAt(10);
		char c11 = str.charAt(11);
		char c12 = str.charAt(12);
		char c13 = str.charAt(13);
		char c14 = str.charAt(14);
		char c15 = str.charAt(15);
		char c16 = str.charAt(16);
		char c17 = str.charAt(17);
		char c18 = str.charAt(18);
		char c19 = str.charAt(19);
		char c20 = str.charAt(20);
		char c21 = str.charAt(21);
		char c22 = str.charAt(22);
		char c23 = str.charAt(23);
		char c24 = str.charAt(24);
		char c25 = str.charAt(25);
		System.out.println("Integer.toBinaryString(c25) >>> : " + Integer.toBinaryString(c25));	
		System.out.println("Integer.toOctalString(c25) >>> : " + Integer.toOctalString(c25));
		System.out.println("(int)c25 >>> : " + (int)c25);
		System.out.println("Integer.toHexString(c25) >>> : " + Integer.toHexString(c25));
		System.out.println("c25 >>> : " + c25);

		System.out.println("str.length() >>> : " + str.length());
		for (int i=0; i < str.length(); i++)
		{	
			char c = str.charAt(i);
			System.out.print(Integer.toBinaryString(c) + " : ");
			System.out.print(Integer.toOctalString(c) + " : ");
			System.out.print((int)c + " : ");
			System.out.print("0x" + Integer.toHexString(c) + " : ");
			System.out.println(c);			
		}
	}
}
