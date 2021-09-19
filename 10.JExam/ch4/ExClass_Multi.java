
// package
package a.b.c.ch4;

// import


public class ExClass_Multi 
{
	// 상수 
	// 멤버변수
	// 생성자
	public ExClass_Multi(){
		System.out.println("ExClass_Multi() 생성자 >>> : ");
	}

	// 함수 

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("\n메인함수를 실행합니다!-");
		System.out.println("\ninterface_A 클래스로 ia 객체를 생성합니다!-");
		System.out.println("\n생성자는 구현체인 Interface_AImpl클래스에 존재합니다!-");

		Interface_A ia = new Interface_AImpl();
		System.out.println("인터페이스 객체 ia로 interface_a()함수를 호출합니다.");
		ia.interface_a();
		System.out.println("\ninterface_a()함수 끝-");
		System.out.println("\nint형 변수 'b'에 interface_b()함수를 초기화합니다.");
		int b = ia.interface_b();
		System.out.println("\nb 의 값 : " + b);
		System.out.println("\nint형 변수 'c'에 interface_b()함수를 초기화합니다.");
		String c = ia.interface_c();
		System.out.println("\nc 의 값 : " + c);
		System.out.println("\nint형 변수 'd'에 interface_b()함수를 초기화합니다.");
		boolean d = ia.interface_d();
		System.out.println("\nd 의 값 : " + d);

		System.out.println("\n메인함수를 종료합니다!-");

	}
}

/*
컴파일 하는 방법
C:\00.KOSMO93\10.JExam\ch4>javac -d . ExClass_Multi.java Interface_A.java Interface_AImpl.java

실행
C:\00.KOSMO93\10.JExam\ch4>java a.b.c.ch4.ExClass_Multi
Interface_AImpl.interface_a() 함수 >>> :
b >>>: 100
c >>>: interface_c()
d >>>: false


*/