//package
package a.b.c.ch5;
//import
import java.util.Date;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.HashMap;

public class Ex_Reference
{
	//상수
	public static final String CONST_VAL = "문자상수";

	//멤버변수
	String s;
	int i;

	//생성자
	public Ex_Reference(){
		System.out.println("Ex_Reference 생성자");
	}
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n>>>>>>>>>> 메인 함수 시작합니다-!\n");
		// 자신의 클래스 참조변수 선언
		Ex_Reference exr = new Ex_Reference();
		System.out.println("\nexr 주소값 : " + exr);
		System.out.println("\nSystem.identityHashCode(exr) 사용결과 값 : "+System.identityHashCode(exr));
		System.out.println("\n참조변수로 exr로 가져온 멤버변수 s 의 값 : " + exr.s);
		System.out.println("\n참조변수로 exr로 가져온 멤버변수 i 의 값 : " + exr.i);
		System.out.println("\n---------------------------------------------\n");
		
		// 다른 클래스 참조변수 선언 (같은 경로의 TestVO.java)
		TestVO tvo = new TestVO();
		System.out.println("tvo 주소값 : " + tvo);
		System.out.println("System.identityHashCode(tvo) 사용결과 값 : "+System.identityHashCode(tvo));
		System.out.println("\n---------------------------------------------\n");
		
		// String 클래스 참조변수 선언 [문자]
		String s = "abc";
		System.out.println("String s의 주소값 : " + s);
		System.out.println("System.identityHashCode(s) 사용결과 값 : "+System.identityHashCode(s));
		System.out.println("\n---------------------------------------------\n");

		String s1 = new String("abc");
		System.out.println("String s1의 주소값 : " + s1);
		System.out.println("System.identityHashCode(s1) 사용결과 값 : "+System.identityHashCode(s1));
		System.out.println("\n---------------------------------------------\n");
		
		// Integer 클래스 참조변수 선언 [숫자]
		Integer i = new Integer(10);
		System.out.println("Integer i의 주소값 : " + i);
		System.out.println("System.identityHashCode(i) 사용결과 값 : "+System.identityHashCode(i));
		System.out.println("\n---------------------------------------------\n");
		
		// Date 클래스 참조변수 선언 [날짜]
		Date d = new Date();
		System.out.println("Date d의 주소값 : " + d);
		System.out.println("System.identityHashCode(d) 사용결과 값 : "+System.identityHashCode(d));
		System.out.println("\n---------------------------------------------\n");
		
		// Calendar 클래스 참조변수 선언 [날짜]
		Calendar c = Calendar.getInstance();
		System.out.println("Calendar c의 주소값 : " + c);
		System.out.println("System.identityHashCode(c) 사용결과 값 : "+System.identityHashCode(c));
		System.out.println("\n---------------------------------------------\n");
	
		// int타입 배열 참조변수 선언 [배열]
		int ii[] = new int[3];
		System.out.println("int형 배열 ii의 주소값 : " + ii);
		System.out.println("System.identityHashCode(ii) 사용결과 값 : "+System.identityHashCode(ii));
		System.out.println("\n---------------------------------------------\n");
		
		// ArrayList 클래스 참조변수 선언 [데이터]
		ArrayList aList = new ArrayList();
		System.out.println("ArrayList aList의 주소값 : " + aList);
		System.out.println("System.identityHashCode(aList) 사용결과 값 : "+System.identityHashCode(aList));
		System.out.println("\n---------------------------------------------\n");
		
		// HashMap 클래스 참조변수 선언 [데이터]
		HashMap hp = new HashMap();
		System.out.println("HashMap hp의 주소값 : " + hp);
		System.out.println("System.identityHashCode(hp) 사용결과 값 : "+System.identityHashCode(hp));
		System.out.println("\n---------------------------------------------\n");
				System.out.println("\n>>>>>>>>>> 메인 함수 종료-!\n");
	}
}
