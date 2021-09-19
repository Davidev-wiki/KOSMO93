//package
package a.b.c.ch3;
//import


public class Test_1{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// 리턴값 있음
	public int a() {
		System.out.println("<Test_1.a()함수 시작>");
		System.out.println("<Test_1.a()함수 끝>");
		return 1+2;
	}
	
	public void b() {
		System.out.println("<Test_1.a()함수 시작>");
		System.out.println("<Test_1.a()함수 끝>");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("<Test_1.main()함수 시작>");
		System.out.println("< a() 함수를 호출합니다. >");
		// Test_1 클래스를 이용하는 참조변수 생성
		Test_1 t1 = new Test_1();
		t1.a();
		System.out.println("< a() 함수를 호출완료! >");
		System.out.println("< a() 함수의 리턴값을 받아와 출력합니다. >");
		int i = t1.a();
		System.out.println("i : " + i);
		System.out.println("< a() 함수의 리턴값 출력완료! >\n");
		System.out.println("< b() 함수를 호출합니다. >");
		
		t1.b();
		System.out.println("< b() 함수를 호출완료! >\n");

		System.out.println("<Test_1.main()함수 끝>");

	}
}
