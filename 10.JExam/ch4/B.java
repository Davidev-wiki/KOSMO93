package aaa.bbb;

import java.util.Date;

public abstract class B
{
	/*
	public B(){
		System.out.println("B() 생성자");
	}
	*/
	// 추상 함수 : 함수에 {} 없다 : 함수를 구현 할 수가 없다. 
	// 추상 함수를 사용하려면 클래스 상속을 해서 
	// 자식 클래스에서 추상 함수를 오버라이딩 해서 
	// {} 추가한 후 구현체를 만는다. 
	public abstract void b();
	// public abstract void b(){}
	/*
	C:\00.KOSMO93\10.JExam\ch4>javac -d . Ex_A.java
	Ex_A.java:29: error: abstract methods cannot have a body
        public abstract void b(){}
                             ^
	1 error
	*/
	public abstract void b_1();
	public abstract void b_2();
	// 추상클래스에서도 일반 함수를 허락한다. 
	public void bM(){
		System.out.println("\n나는 추상클래스 B에 있는 일반함수 bM() 이다.\n");
	}

	public static void staticB(){
		System.out.println("\n>> 나는 추상클래스 B에 있는 static이 붙은 함수 staticB() 이다. ");
		System.out.println("static이 붙은 함수를 호출해서 변경하면 안된다.\n");
	}

	public static Date getInstance(){
		return new Date();
	}
}