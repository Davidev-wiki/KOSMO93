//package
package a.b.c.ch3;
//import


public class Test_1{
	//���
	//�������
	//������
	
	//�Լ�

	// ���ϰ� ����
	public int a() {
		System.out.println("<Test_1.a()�Լ� ����>");
		System.out.println("<Test_1.a()�Լ� ��>");
		return 1+2;
	}
	
	public void b() {
		System.out.println("<Test_1.a()�Լ� ����>");
		System.out.println("<Test_1.a()�Լ� ��>");
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("<Test_1.main()�Լ� ����>");
		System.out.println("< a() �Լ��� ȣ���մϴ�. >");
		// Test_1 Ŭ������ �̿��ϴ� �������� ����
		Test_1 t1 = new Test_1();
		t1.a();
		System.out.println("< a() �Լ��� ȣ��Ϸ�! >");
		System.out.println("< a() �Լ��� ���ϰ��� �޾ƿ� ����մϴ�. >");
		int i = t1.a();
		System.out.println("i : " + i);
		System.out.println("< a() �Լ��� ���ϰ� ��¿Ϸ�! >\n");
		System.out.println("< b() �Լ��� ȣ���մϴ�. >");
		
		t1.b();
		System.out.println("< b() �Լ��� ȣ��Ϸ�! >\n");

		System.out.println("<Test_1.main()�Լ� ��>");

	}
}
