package a.b.c.ch5.copy;

public class Ex_String_2 extends java.lang.Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자열이 같은 경우
		// 스트링 클래스 문자열 비교 함수 equals()
		String s1 = "abc";
		String s2 = "abc";

		System.out.println("String s1 출력 : " + s1);
		System.out.println("String s2 출력 : " + s2);
		System.out.println("System.identityHashCode(s1) 출력 : " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) 출력 : " + System.identityHashCode(s2));

		boolean b = s1.equals(s2);
		System.out.println("b >>> : " + b);
		if (b) {
			System.out.println("b가 true일 때 출력되는 문장!");
		}
		System.out.println("\n");

		boolean b1_1 = s1 == s2;
		System.out.println("b1_1, s1 == s2 의 주소값을 비교한 값  : " + b1_1);

		System.out.println("\n");

		// 문자열이 다른경우
		String ss1 = "abcd";
		String ss2 = "abcde";
		System.out.println("String ss1과 String ss2 문자열을 비교한 결과를 'b1'에 초기화");
		boolean b1 = ss1.equals(ss2);
		System.out.println("b1 의 값 : " + b1);

		System.out.println("\n");

		String s3 = new String("abc");
		String s4 = new String("abc");

		System.out.println("new String(\"abc\")으로 새로 만든 객체를 담은 s3 >>> : " + s3);
		System.out.println("new String(\"abc\")으로 새로 만든 객체를 담은 s4 >>> : " + s4);
		System.out.println("System.identityHashCode(s3) >>> : " + System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4) >>> : " + System.identityHashCode(s4));

		boolean b2 = s3.equals(s4);
		System.out.println("\ns3와 s4의 문자열을 비교해 b2 변수에 초기화 한 값 : " + b2);

		boolean b2_1 = s3 == s4;
		System.out.println("\ns3와 s4의 주소 값을 비교해 b2_1에 초기화 한 값 >>> : " + b2_1);

	}

}
