//package
package a.b.c.ch4;
//import


public class Ex_Const extends ConstTest_1
{
	//상수
	//멤버변수
	//생성자
	public Ex_Const(){
		this("김찬기", 34);
		System.out.println("Ex_Const의 자기 자신 클래스에 있는 생성자입니다 : ");
			/*
			1. this() :  디스 함수라고 부른다. 자바에서 기능이 정의된 함수이다.
			2. 자기자신 클래스에서 오버로드된 생성자를 매개변수가 같은 생성자를 호출하는 함수이다.
			3. this() 함수는 생성자 블럭에서 맨 상단에 위치해야 한다.  JVM 규칙이다.	
		*/
	}

	public Ex_Const(String name){
		this(name, 34);
		System.out.println("오버로딩된 Ex_Const(String name) 생성자입니다. : ");
		System.out.println("name >>> : " + name);
	}

	public Ex_Const(int age){
		super("David");
		System.out.println("오버로딩된 Ex_Const(int age) 생성자입니다 : ");
		System.out.println("age >>> : " + age);
		/*
			1. super() :  슈퍼 함수라고 부른다. 자바에서 기능이 정의된 함수이다.
			2. 자기자신 클래스에서 상속해준 부모 클래스이 생성자를 호출한다.
			3. super() 함수는 생성자 블럭에서 맨 상단에 위치해야 한다.  JVM 규칙이다.	
		*/
	}

	public Ex_Const(String name, int age){
		super();
		System.out.println("오버로딩된 Ex_Const(String name, int age) 생성자입니다 : ");
		System.out.println("name, age >>> : " + name +", "+ age);
	}


	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n=== 메인함수 시작 ===!\n");
		
		Ex_Const ec = new Ex_Const();

		// java.lang.Objec.toString();
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		// ec >>> : a.b.c.ch4.Ex_Const@15db9742
		System.out.println("\nJVM이 정한 Ex_Const() 생성자의 참조변수가 있는 주소값 .toString()이 생략  >>> : " + ec);  //.toString() 생략된 것
		System.out.println("위와 동일한 코드인데 참조변수.toString()이 붙음 >>> : " + ec.toString());
		System.out.println("\n===================================================================\n");
		System.out.println("ec.getClass()  : " + ec.getClass());
		System.out.println("ec.getClass().getName()  : " + ec.getClass().getName());
		System.out.println("ec.hashCode()  : " + Integer.toHexString(ec.hashCode()));
		// System.identityHashCode(Object x)
		System.out.println("기계에 저장된 주소값 : " + System.identityHashCode(ec));
		
		// 생성자 오버로딩 호출 하기 
		System.out.println("\n*** 생성자 오버로딩 호출하기 ***!\n");
		System.out.println("Ex_Const클래스를 복제한 'ec_1' 객체 생성");
		Ex_Const ec_1 = new Ex_Const("김찬기");
		System.out.println("ec_1 주소값 : " + ec_1); // toString() 생략된 것 

		System.out.println("\nEx_Const클래스를 복제한 'ec_2' 객체 생성");
		Ex_Const ec_2 = new Ex_Const(34);
		System.out.println("ec_2 주소값 : " + ec_2); // toString() 생략된 것 
		
		System.out.println("\nEx_Const클래스를 복제한 'ec_3' 객체 생성");
		Ex_Const ec_3 = new Ex_Const("김찬기", 34);
		System.out.println("ec_3 주소값 : " + ec_3); // toString() 생략된 것 
		
		System.out.println("\n=== 메인함수 종료 ===!\n");

	}
}
