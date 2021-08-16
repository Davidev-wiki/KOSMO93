//package
package a.b.c.ch4;
//import
import java.lang.Object;

public class ExClass_1 extends Object
{ 
	//상수
	//멤버변수
	//생성자
	public ExClass_1(){
		System.out.println("ExClass_1() 생성자");
	}

	//함수
	public String toString(){
		
		String str = "난 java.lang.Object root 클래스에 있는 toString() 함수이다.";
		String str1 = "사용자 정의 클래스 ExClass_1클래스에서 java.lang.Object 부모 클래스에 있는 ";
		String str2 = "toString()함수를 불러다가 변경해서 사용하는 중이다.";
		String str3 = "부모 클래스에 있는 자원 중 함수를 불러다 사용하는 오버라이딩이다.";
		
		//
		return	str.concat(str1).concat(str2).concat(str3);
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n<ExClass_1.main() 시작>\n");
		//Object클래스에 있는 toString 함수를 사용하기위해 메모리에 올림
		System.out.println("\n객체 생성\n");
		ExClass_1 ec1 = new ExClass_1();

		System.out.println("\n객체 생성 완료\n");
		System.out.println("ec1 참조변수 출력 (to.String)생략됨: " + ec1);
		System.out.println("\nec1.toString() 출력 : " + ec1.toString());

		System.out.println("\nExClass_1.main() 종료");

	}
}
/*
ec1에는 원래 값이 담겨있는 방의 주소가 나와야 하는데
상속해서 오버라이딩된 값이 보이면 바로 출력되었다.

>> JVM이 상속 받아 오버라이딩 된 값이 있으면 참조변수를 출력할 때 주소값 대신 오버라이딩 된 내용을 보여준다.?!


*/