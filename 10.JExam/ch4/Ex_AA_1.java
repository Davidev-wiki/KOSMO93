// package
package a.b.c.ch4;

// import


public class Ex_AA_1 implements A_interface, B_interface, C_interface
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	@Override
	public void a(){
		System.out.println("�������̵��� a() �Լ�");
	}

	@Override
	public void b(){
		System.out.println("�������̵��� b() �Լ�");
	}

	@Override
	public void c(){
		System.out.println("�������̵��� c() �Լ�");
	}
	
	@Override
	public void d(){
		System.out.println("�������̵��� d() �Լ�");
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		// �ڽ�Ŭ���� �ڽ�Ŭ������������ = new �ڽ�Ŭ����() �ν��Ͻ�
		// �ڽ�Ŭ�������������� �θ� �������̽����� �������̵��� �Լ��� ������ �� �ִ�. 
		//Ex_AA_1 ea1 = new Ex_AA_1();
		//System.out.println("�ڽĺ������� �޸𸮿� �÷��� �ڽ�Ŭ���� Ÿ�� ���������� ������ �ּ� �� : " + ea1);
		//ea1.a();
		//ea1.b();
		//ea1.c();
		//ea1.c();

		// �θ��������̽�Ŭ���� �θ��������̽�Ŭ������������ = new �ڽ�Ŭ����() �ν��Ͻ� 
		// �θ��������̽�Ŭ������������ ������ �ڱ��ڽ� �θ��������̽�Ŭ�������� ������ �Լ��� ��� ���� 

		A_interface ai = new Ex_AA_1();
		System.out.println("\nA_�������̽� ��ü ai �� �� : " + ai);
		System.out.print("ai.a()�� �� : ");
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
		System.out.println("\nB_�������̽� ��ü bi �� �� : " + bi);
		System.out.print("bi.b()�� �� : ");
		bi.b();

		C_interface ci = new Ex_AA_1();
		System.out.println("\nC_�������̽� ��ü ci �� �� : " + ci);
		System.out.print("ci.c()�� �� : ");
		ci.c();
		System.out.print("ci.d()�� �� : ");
		ci.d();
	}
}