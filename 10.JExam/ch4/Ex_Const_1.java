
package a.b.c.ch4;

public class Ex_Const_1 extends ConstTest_2 {

	// ������
	public Ex_Const_1(){
		super("�θ�Ŭ���� ������ ȣ��");
		System.out.println("[�ڽ�Ŭ����] [�⺻������]Ex_Const_1() ������ : ");
	}

	public Ex_Const_1(String src){
		super(src);
		System.out.println("[�ڽ�Ŭ����] [�����ε���]Ex_Const_1(String src) ������ : ");
		System.out.println("[�ڽ�Ŭ����] [�����ε���]Ex_Const_1(String src) ������ src >>> : " + src);
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		System.out.println("\n--- main�Լ� ���� ---!\n");
		System.out.println("\n--- ec1 ��ü ���� ---!\n");
		Ex_Const_1 ec1 = new Ex_Const_1();
		System.out.println("ec1�� �� : " + ec1);

		System.out.println("\n--- ec2 ��ü ���� ---!\n");
		Ex_Const_1 ec2 = new Ex_Const_1("�θ�Ŭ���� ������ȣ��");
		System.out.println("ec2 >>> : " + ec2);

		System.out.println("\n--- main�Լ� ���� ---!\n");
	}
}
