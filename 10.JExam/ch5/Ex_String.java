//package
package a.b.c.ch5;
//import


public class Ex_String
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n------------------------------------------------------------------\n");
		// s : 지역변수, 참조변수
		String s = "abc";
		System.out.println("String s의 값 : " + s);
		System.out.println("String s에 함수를 써서 출력한 값 System.identityHashCode(s) : " + System.identityHashCode(s));
		
		// s1 : s와 같은 값
		String s1 = "abc";
		System.out.println("String s1의 값 : " + s1);
		System.out.println("String s1에 함수를 써서 출력한 값 System.identityHashCode(s1) : " + System.identityHashCode(s1));

		System.out.println("\n------------------------------------------------------------------\n");

		// 문자열이 같은 's'와 's1' 모두 기계가 가리키는 주소의 값이 동일한데, 
		// ss1은 전혀 다른 문자이므로 새로운 메모리를 할당하게 됨.
		String ss1 = s + s1;
		System.out.println("String ss1의 값 : " + ss1);
		System.out.println("String ss1에 함수를 써서 출력한 값 System.identityHashCode(ss1) : " + System.identityHashCode(ss1));
		System.out.println("\n문자열이 같은 's'와 's1' 모두 기계가 가리키는 주소의 값이 동일한데,");
		System.out.println("ss1은 전혀 다른 문자이므로 새로운 메모리를 할당하게 됨.\n");	

		System.out.println("\n------------------------------------------------------------------\n");
	
		String s2 = "abcd";
		System.out.println("String s2의 주소 값 : " + s2);
		System.out.println("String s2에 함수를 써서 출력한 값 System.identityHashCode(s2) : " + System.identityHashCode(s2));
		

		String s3 = "abcd";
		System.out.println("String s3의 주소 값 : " + s3);
		System.out.println("String s3에 함수를 써서 출력한 값 System.identityHashCode(s3) : " + System.identityHashCode(s3));
	
		System.out.println("\n------------------------------------------------------------------\n");

		String s4 = new String("abc");
		System.out.println("\nString s4 = new String(\"abc\")의 값 : " + s4);
		System.out.println("String s4에 함수를 써서 출력한 값 System.identityHashCode(s4) : " + System.identityHashCode(s4));
		

		String s5 = new String("abc");
		System.out.println("\nString s5 = new String(\"abc\")의 값 : " + s5);
		System.out.println("String s5에 함수를 써서 출력한 값 System.identityHashCode(s5) : " + System.identityHashCode(s5));

		String s6 = new String("abcd");
		System.out.println("\nString s6 = new String(\"abcd\")의 값 : " + s6);
		System.out.println("String s6에 함수를 써서 출력한 값 System.identityHashCode(s6) : " + System.identityHashCode(s6));


		System.out.println("\n----------------------String 문자열 더하기 ----------------------------\n");
		// + 연산자를 사용해서 문자열 더할 수 있다 : 이것은 지양하라고 한다. 
		// public String concat(String str) : concat  함수 사용을 지향한다. 
		String sss = "abc";
		String sss1 = "abc";
		String sss2 = sss + sss1; // 지양
		System.out.println("sss2 >>> : " + sss2);
		String sss3 = sss.concat(sss1); // 지향 
		System.out.println("sss3 >>> : " + sss3);
		// String 문자열 더하기 할 때는 StringBuffer, StringBuilder 클래스 사용을 지향 한다.
	}
}
