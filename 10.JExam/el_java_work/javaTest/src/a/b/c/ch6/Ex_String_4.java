package a.b.c.ch6;

public class Ex_String_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sVal = "Hello Java Testing !!";
		boolean bool = sVal.contains("Hello");

		System.out.println("bool : " + bool);

		String sVal1 = "학교종이 땡땡땡 어서 모이자";

		bool = sVal1.contains("학교종");
		System.out.println("bool : " + bool);

		bool = sVal1.contains("땡땡땡");
		System.out.println("bool : " + bool);

		// compareTo()
		// 리턴 값 : 0, 음수, 양수의 int
		// 0 : 두개의 문자열이 동일
		// 양수 : compareTo()를 호출하는 객체가 인자보다 사전적으로 순서가 앞설 때
		// 음수 : 인자가 객체보다 사전적으로 순서가 앞설 때
		System.out.println("\ncompareTo()-----------------------\n");
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "World";
		System.out.println("s1.compareTo(s1) : " + s1.compareTo(s2));
		System.out.println("s1.compareTo(s3) : " + s1.compareTo(s3));
		System.out.println("s3.compareTo(s1) : " + s3.compareTo(s1));

		System.out.println("\ncompareTo()함수는 abc.. , ABC.. 순서같이 사전처럼 알파벳 순서대로 정렬한다.");
		System.out.println("비교하는 대상이 동일하면 \'0\'을 출력하고");
		System.out.println("비교대상이 (-)음수로 나오면 사전적으로 뒤에 위치해 있다는 말이다.");
		System.out.println("비교대상이 양의 정수로 나오면 사전적으로 앞에 위치해 있다는 말이다.");

	}

}
