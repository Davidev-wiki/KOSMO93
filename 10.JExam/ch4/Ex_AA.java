// package
package aaa.bbb.ccc;

// import

public class Ex_AA
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("\n main 함수 시작!- \n");
		// 인터페이스 사용하는 방법
		System.out.println("\n >> C c = new CImpl(); 해서 인터페이스 클래스 C를 객체로 만든다.");
		C c = new CImpl();
		System.out.println("\n >> c함수 호출\n");
		c.c();
		System.out.println("\n >> c_1함수 호출\n");
		c.c_1();
		System.out.println("\n int c_2 = c.c_2();로 함수 호출 \n");
		int c_2 = c.c_2();
		System.out.println("c_2의 값 : " + c_2);

		System.out.println("\n boolean c_3 = c.c_3();로 함수 호출 \n");
		boolean c_3 = c.c_3();
		System.out.println("c_3의 값 : " + c_3);

		// 호출방법 : 참조변수명.함수명()
		int defalutM = c.defalutM();
		System.out.println("defalutM >>> : " + defalutM);
		
		// 호출방법 : 클래스명.함수명()
		boolean staticM = C.staticM();
		System.out.println("staticM >>> : " + staticM);

		System.out.println("\n main 함수 종료!- \n");
	}
}

