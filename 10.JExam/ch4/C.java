package aaa.bbb.ccc;

public interface C {        //�ϳ��� �ڹ����� �����̹Ƿ� public�� �����Ǿ�����.

	// JVM�� �������̽� ���� �Ϲ� �Լ��� ���� abstract Ű���尡 ��� �ִ� ��(������ �߻��Լ�)���� �ν��Ѵ�. 
	public /*abstract*/ void c();
	public /*abstract*/ void c_1();
	public /*abstract*/ int c_2();
	public /*abstract*/ boolean c_3();

	// jdk 1.8 : SE 8 ���� interface�� defalut, static �Լ� ��밡��
	public default int defalutM(){
		System.out.println("\nC.defalutM() �Լ� ���� >>> ");

		System.out.println("interface �� defalut �Լ� >>> : ");
		System.out.println("���������� �Լ��� ȣ���� �� �ִ�..");
		System.out.println("implements �� Ŭ�������� ������ �� �� �ִ�.");

		System.out.println("C.defalutM() �Լ� �� >>> ");
		return 0;
	}

	// jdk 1.8 : SE 8 ���� interface�� defalut, static �Լ� ��밡��
	public static boolean staticM(){
		System.out.println("\nC.staticM() �Լ� ���� >>> ");

		System.out.println("interface �� static �Լ� >>> : ");
		System.out.println("�ݵ�� Ŭ������.�Լ��̸�() ���� ȣ���ؾ� �Ѵ�.");
		System.out.println("������ �ϸ� �ȵȴ�.");
		boolean bool = false;

		System.out.println("C.staticM() �Լ� �� >>> ");
		return bool;
	}
}