//package
package a.b.c.ch3;
//import

public class ET
	{
/*
상수
멤버변수
생성자
함수
*/

//main함수
public static void main(String[] args) {
		
	String str[] = {"자바","씨","파이선","자바스크립트","안드로이드"};
	
	for (String lang : str)
	{
		System.out.println("lang : " + lang);
	}
	
	for (String a : args)
	{
		System.out.println("사용자 입력값 a : " + a);
	}

	for (int i=0;i<args.length; i++)
	{
		System.out.println("입력된 args의 배열의 길이 : " + args.length);
		System.out.println("args[" + i  +"] : "+ args[i]);
	}

	}// end of main
}// end of class