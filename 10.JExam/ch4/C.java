package aaa.bbb.ccc;

public interface C {        //하나의 자바파일 예제이므로 public이 생략되어있음.

	// JVM은 인터페이스 내의 일반 함수를 보면 abstract 키워드가 없어도 있는 것(무조건 추상함수)으로 인식한다. 
	public /*abstract*/ void c();
	public /*abstract*/ void c_1();
	public /*abstract*/ int c_2();
	public /*abstract*/ boolean c_3();

	// jdk 1.8 : SE 8 에서 interface에 defalut, static 함수 사용가능
	public default int defalutM(){
		System.out.println("\nC.defalutM() 함수 시작 >>> ");

		System.out.println("interface 의 defalut 함수 >>> : ");
		System.out.println("참조변수로 함수를 호출할 수 있다..");
		System.out.println("implements 한 클래스에서 재정의 할 수 있다.");

		System.out.println("C.defalutM() 함수 끝 >>> ");
		return 0;
	}

	// jdk 1.8 : SE 8 에서 interface에 defalut, static 함수 사용가능
	public static boolean staticM(){
		System.out.println("\nC.staticM() 함수 시작 >>> ");

		System.out.println("interface 의 static 함수 >>> : ");
		System.out.println("반드시 클래스명.함수이름() 으로 호출해야 한다.");
		System.out.println("재정의 하면 안된다.");
		boolean bool = false;

		System.out.println("C.staticM() 함수 끝 >>> ");
		return bool;
	}
}