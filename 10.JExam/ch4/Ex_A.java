// package
package aaa.bbb;

// import
import java.util.Date;
import java.util.Calendar;

/*
오버라이딩 : Overrideing
1. 상속 관계에서 일어나는 일이다. : extends, implements 
2. 부모클래스에 있는 자원 중 함수를 자식클래스로 함수를 가져오는 행위
3. 오버라이딩 한 함수 위에는  @Override 라고 오버라이드 어노테이션을 기술해야 한다. 
*/
public class Ex_A extends B
/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
Ex_A.java:7: error: Ex_A is not abstract and does not override abstract method b() in B
public class Ex_A extends B
       ^
1 error
*/
{
	// 상수 
	// 멤버변수
	// 생성자

	// 함수 
	// jdk 1.5 추가된 @ 어노테이션 기술 
	// 1. 함수에 대한 설명
	// 2. 실제로 인터페이스 역할 : 물리적 기능을 하는 것
	// @Override : 부모클래스에서 b() 함수를 자식클래스로 오버라이딩 했다 
	@Override
	public void b(){
		System.out.println("B 추상클래스에있는 b() 추상함수를 Ex_A 자식클래스로 오버라이딩 했다. ");
	}

	@Override
	public void b_1(){
		System.out.println("B 추상클래스에있는 b_1() 추상함수를 Ex_A 자식클래스로 오버라이딩 했다. ");
	}

	@Override
	public void b_2(){
		System.out.println("B 추상클래스에있는 b_2() 추상함수를 Ex_A 자식클래스로 오버라이딩 했다. ");
	}

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// B 추상 클래스 사용하기 
		// 1. 추상 클래스는 자기 자신 클래스를 인스턴스 할 수가 없다.
		// 2. 추상 클래스를 사용하는 방법이 여러개 있다.
		// 3. 상속하는 방법이 있다. 
		// 4. 추상 클래스는 클래스 이기 때문에 extends 키워드를 사용해서 상속한다. 
		// 5. 추상 클래스를 상속하면 자식 클래스에 추상함수는 꼭 오버라이이딩 해야 한다. 
		// B b = new B();
		
		// 자식클래스선언 자식클래스 참조변수선언 = new 자식클래스() 인스턴스 
		System.out.println("\n>> main start \n");
		System.out.println("\n자식 객체 생성 \n");
		Ex_A ea = new Ex_A();
		System.out.println("\n객체로 함수 b() 호출\n");
		ea.b();

		// 어렵겠지만 가능하면 부모클래스 참조변수를 사용하자 
		// 부모클래스선언 부모클래스 참조변수선언 = new 자식클래스() 인스턴스 
		System.out.println("\n>> 부모 클래스로 객체 생성 : 생성자가 없음.\n");
		B b1 = new Ex_A();
		System.out.println("\n부모클래스로 만든 객체로 함수 b() 호출 \n");
		b1.b();

		// 클래스이름.일반함수이름();
		System.out.println("\n부모클래스에 있는 staticB()함수 호출 \n");
		B.staticB();

		// 추상클래스에서는 getInstance() 함수로 객체를 메모리에 올린다.
		// new 키워드 vs getInstance() 함수
		// new 키워드 : new 인스턴스할 때 마다 주소값이 변경된다.
		// getInstance() : 최초에 메모리에 올린 주소값 하나만 사용한다. 		
		
		System.out.println("\nB클래스를 메모리에 올려 Date타입 변수 d에 저장 : Date d = B.getInstance\n");
		Date d = B.getInstance();
		System.out.println("\nB.getInstance해서 변수 d에 담았을 때 d의 값 : " + d);
		System.out.println("기계가 가르키는 d의 주소값 : " + System.identityHashCode(d));
		System.out.println("\nDate클래스를 객체로 만들어 변수 da에 저장 : Date d = new Date()\n");
		Date da = new Date();
		System.out.println("\nDate클래스를 객체로 만들어 da에 담았을 때 da의 값 : " + da);
		System.out.println("기계가 가르키는 da의 주소값 : " + System.identityHashCode(da));

		// 빌트인 Calendar 클래스 를 getInstance() 함수로 사용해 보기 
		System.out.println("\nCalendar클래스를 메모리에 올려 rightNow 변수에 초기화\n");
		Calendar rightNow = Calendar.getInstance();
		System.out.println("rightNow 의 값 : " + rightNow);

		System.out.println("\n>> end of main() \n");
	}
}

// 추상 클래스
// 추상 함수를 만들려면 클래스도 추상 클래스여야 한다. abstract 키워드를 사용해야 한다. 
/*
C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
Ex_A.java:23: error: B is not abstract and does not override abstract method b() in B
class B
^
1 error
*/