package a.b.c.ch4;

public class Ex_MessageTest
{
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		//������� �ڿ� ȣ��~!
		Ex_MessageInterface eme = new Ex_MessageInterfaceEngImpl();
		eme.sayHello("David");

		Ex_MessageInterface emk = new Ex_MessageInterfaceKorImpl();
		emk.sayHello("��������");

		Ex_MessageInterface ex_mk = new Ex_MessageInterfaceKorImpl();
		ex_mk.sayHello("�������");

		Ex_MessageInterface ex_me = new Ex_MessageInterfaceEngImpl();
		ex_me.sayHello("David");
	}
}
