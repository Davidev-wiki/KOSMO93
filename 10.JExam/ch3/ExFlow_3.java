//package
package a.b.c.ch3;
//import

public class ExFlow_3 
{
	//���
	//�������
	//������
	
	//�Լ�

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		int age = 9;
		int charge = 0;

		if (age < 8)
		{
			charge = 1000;
			System.out.println("������ �Ƶ�");
		}
		else if (age < 14)
		{
			charge = 2000;
			System.out.println("�ʵ��Դϴ�");
		}
		else if (age < 20)
		{
			charge = 2000;
			System.out.println("��, ����л��Դϴ�");
		}
		else {
			charge = 3000;
			System.out.println("�ʵ�");
		}
		System.out.println("������ "+ charge +"�� �Դϴ�.");
	}
}
