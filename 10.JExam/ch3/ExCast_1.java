//package
package a.b.c.ch3;
//import


public class ExCast_1{
	//���
	//�������
	//������
	
	//�Լ�

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		
		
		// byte Ÿ���� �������� b�� �����԰� ���ÿ� ���ͷ� 10�� �ʱ�ȭ
		byte b = 10;
		// int Ÿ���� �������� i�� �����԰� ���ÿ� 'b'�� ����
		int i = b;

		//�ֿܼ� b ���
		System.out.println(b);
		//�ֿܼ� i ���
		System.out.println(i);

		// �ڹ� ��Ģ)
		// �ڹٿ����� ���Կ����� '='�� �߽����� ��, ���� ������ Ÿ���� �����ؾ� �Ѵ�.
		// ��) int i = (int)b; 
		// (int)�� ���� �ʾƵ� ������ ������ '������(�ڵ�) ����ȯ'�����̴�.
		// ���� ������Ÿ��(byte)���� ū ������Ÿ��(int)�� ����� ���� �ڵ� ����ȯ!

		// intŸ�� ���� 'i1'�����԰� ���ÿ� ���ͷ� 20 �ʱ�ȭ 
		int i1 = 20;
		// floatŸ�� ���� 'f'����� ���ÿ� 'i1'����
		float f = i1;
		
		System.out.println(i1);
		System.out.println(f);

		//double Ÿ�� ���� d ����.
		double d;
		//���� 'd'�� i(10)�� f(20.0) �� ���� ���� ����.
		//double Ÿ������ �ڵ� ��ȯ�Ǿ� 'd'�� ����ϸ� �Ҽ��� '30.0'�� ��µ�
		d = i + f;
		System.out.println(d);


	}
}
