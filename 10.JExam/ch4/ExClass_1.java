//package
package a.b.c.ch4;
//import
import java.lang.Object;

public class ExClass_1 extends Object
{ 
	//���
	//�������
	//������
	public ExClass_1(){
		System.out.println("ExClass_1() ������");
	}

	//�Լ�
	public String toString(){
		
		String str = "�� java.lang.Object root Ŭ������ �ִ� toString() �Լ��̴�.";
		String str1 = "����� ���� Ŭ���� ExClass_1Ŭ�������� java.lang.Object �θ� Ŭ������ �ִ� ";
		String str2 = "toString()�Լ��� �ҷ��ٰ� �����ؼ� ����ϴ� ���̴�.";
		String str3 = "�θ� Ŭ������ �ִ� �ڿ� �� �Լ��� �ҷ��� ����ϴ� �������̵��̴�.";
		
		//
		return	str.concat(str1).concat(str2).concat(str3);
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n<ExClass_1.main() ����>\n");
		//ObjectŬ������ �ִ� toString �Լ��� ����ϱ����� �޸𸮿� �ø�
		System.out.println("\n��ü ����\n");
		ExClass_1 ec1 = new ExClass_1();

		System.out.println("\n��ü ���� �Ϸ�\n");
		System.out.println("ec1 �������� ��� (to.String)������: " + ec1);
		System.out.println("\nec1.toString() ��� : " + ec1.toString());

		System.out.println("\nExClass_1.main() ����");

	}
}
/*
ec1���� ���� ���� ����ִ� ���� �ּҰ� ���;� �ϴµ�
����ؼ� �������̵��� ���� ���̸� �ٷ� ��µǾ���.

>> JVM�� ��� �޾� �������̵� �� ���� ������ ���������� ����� �� �ּҰ� ��� �������̵� �� ������ �����ش�.?!


*/