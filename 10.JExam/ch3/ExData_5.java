//package
package a.b.c.ch3;
//import


/*
	ExData_5 Ŭ��������
	�������� �ְ�, static Ű���� ���� �Լ� addMethod()�� ����
	�Ű����� int x, int y�� �޾Ƽ�
	���ϱ� ����� return Ű����  ��� ������ �����

	�����Լ����� addMethod()��
	�������� int�� x, y�� ������ �� 10, 20���� �ʱ�ȭ �ؼ�
	�ƱԸ�Ʈ�� �����ؼ�
	int sum ���� ������ ������� ������ �ֿܼ� ����Ͻÿ�.

*/

public class  ExData_5 {
	//���
	//�������
	//������
	
	//�Լ� : ������ O, static X
	public int addMethod(int x, int y) {
		System.out.println("ExData_5.addMethod() ---�Լ� ����!---");
		//���� ����� return������
		System.out.println("ExData_5.addMethod() ---�Լ� ����!---");
		return x + y;
		
		// int sum = x + y;
		// return sum;
	}
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("ExData_5.addMethod() ����!");
		// ���� ���� �ʱ�ȭ
		int x = 10;
		int y = 20;
		
		// static�� �����Ƿ� ExData_5�� ��ü�� ���� ȣ��
		//ExData_5 ed5 = new ExData_5();
		
		// �������� int sum�� ����� ����
		//int sum = ed5.addMethod(x, y);
		
		// �ֿܼ� ����ϱ� 1)
		//System.out.println(sum);

		// ȣ�� ��� 2
		int sum1 = new ExData_5().addMethod(x, y);
		System.out.println(sum1);
	} //end of main

} //end of ExData_5
