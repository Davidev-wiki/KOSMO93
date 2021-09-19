// package
package a.b.c.ch4;

// import


public class Ex_AA_1 implements A_interface, B_interface, C_interface
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	@Override
	public void a(){
		System.out.println("오버라이딩한 a() 함수");
	}

	@Override
	public void b(){
		System.out.println("오버라이딩한 b() 함수");
	}

	@Override
	public void c(){
		System.out.println("오버라이딩한 c() 함수");
	}
	
	@Override
	public void d(){
		System.out.println("오버라이딩한 d() 함수");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// 자식클래스 자식클래스참조변수 = new 자식클래스() 인스턴스
		// 자식클래스참조변수로 부모 인터페이스에서 오버라이드한 함수를 참조할 수 있다. 
		//Ex_AA_1 ea1 = new Ex_AA_1();
		//System.out.println("자식복제본을 메모리에 올려서 자식클래스 타입 참조변수에 저장한 주소 값 : " + ea1);
		//ea1.a();
		//ea1.b();
		//ea1.c();
		//ea1.c();

		// 부모인터페이스클래스 부모인터페이스클래스참조변수 = new 자식클래스() 인스턴스 
		// 부모인터페이스클래스참조변수 가지고 자기자신 부모인터페이스클래스에서 선언한 함수만 사용 가능 

		A_interface ai = new Ex_AA_1();
		System.out.println("\nA_인터페이스 객체 ai 의 값 : " + ai);
		System.out.print("ai.a()의 값 : ");
		ai.a();
		//ai.b();
		/*		
			C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_AA_1.java
			Ex_AA_1.java:50: error: cannot find symbol
							ai.b();
							  ^
			  symbol:   method b()
			  location: variable ai of type A_interface
			1 error
		*/
		
		B_interface bi = new Ex_AA_1();
		System.out.println("\nB_인터페이스 객체 bi 의 값 : " + bi);
		System.out.print("bi.b()의 값 : ");
		bi.b();

		C_interface ci = new Ex_AA_1();
		System.out.println("\nC_인터페이스 객체 ci 의 값 : " + ci);
		System.out.print("ci.c()의 값 : ");
		ci.c();
		System.out.print("ci.d()의 값 : ");
		ci.d();
	}
}