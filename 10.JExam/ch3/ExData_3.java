package a.b.c.ch3;

/*
ExData_3클래스에
public void primeVal()함수 만들어서
main함수에서 primVal()호출해서 실행시키시오

primeVal()함수가 실행되면
기초 자료형 byte char short int long float double 의
최대값, 최소값을 콘솔에 출력하시오
*/

public class ExData_3 {


public void primeVal(){
	
		System.out.println(">>>>> ExData_3클래스의 primeVal 함수 시작 \n");
		
		//byte
		System.out.println("byte MAX_VALUE : " + Byte.MAX_VALUE);
		System.out.println("byte MIN_VALUE : " + Byte.MIN_VALUE);


		//char
		System.out.println("Character MAX_VALUE : " + Character.MAX_VALUE);
		System.out.println("Character MIN_VALUE : " + Character.MIN_VALUE);


		//short 
		System.out.println("Short MAX_VALUE : " + Short.MAX_VALUE);
		System.out.println("Short MIN_VALUE : " + Short.MIN_VALUE);


		//int 
		System.out.println("Integer MAX_VALUE : " + Integer.MAX_VALUE);
		System.out.println("Integer MIN_VALUE : " + Integer.MIN_VALUE);


		//long 
		System.out.println("Long MAX_VALUE : " + Long.MAX_VALUE);
		System.out.println("Long MIN_VALUE : " + Long.MIN_VALUE);


		//float 
		System.out.println("Float MAX_VALUE : " + Float.MAX_VALUE);
		System.out.println("FLoat MIN_VALUE : " + Float.MIN_VALUE);


		//double 
		System.out.println("Double MAX_VALUE : " + Double.MAX_VALUE);
		System.out.println("Double MIN_VALUE : " + Double.MIN_VALUE);

		System.out.println("\n>>>>> ExData_3클래스의 primeVal 함수 종료\n");

}


public static void main(String[] args) {
	
	System.out.println("-----------ExData_3 main함수 시작----------\n");

	ExData_3 ed3 = new ExData_3();
	ed3.primeVal();	
	
	System.out.println("-----------ExData_3 main함수 끝----------");
	
	}//end of main
}//end of ExData_3