package aaa.bbb;

import java.util.Date;

public abstract class B
{
	/*
	public B(){
		System.out.println("B() ������");
	}
	*/
	// �߻� �Լ� : �Լ��� {} ���� : �Լ��� ���� �� ���� ����. 
	// �߻� �Լ��� ����Ϸ��� Ŭ���� ����� �ؼ� 
	// �ڽ� Ŭ�������� �߻� �Լ��� �������̵� �ؼ� 
	// {} �߰��� �� ����ü�� ���´�. 
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
	// �߻�Ŭ���������� �Ϲ� �Լ��� ����Ѵ�. 
	public void bM(){
		System.out.println("\n���� �߻�Ŭ���� B�� �ִ� �Ϲ��Լ� bM() �̴�.\n");
	}

	public static void staticB(){
		System.out.println("\n>> ���� �߻�Ŭ���� B�� �ִ� static�� ���� �Լ� staticB() �̴�. ");
		System.out.println("static�� ���� �Լ��� ȣ���ؼ� �����ϸ� �ȵȴ�.\n");
	}

	public static Date getInstance(){
		return new Date();
	}
}