//package
package a.b.c.ch3;
//import


public class ExData_4
{
	// ���
	// �������
	// ������
	
	// �Լ�

	// ��� (4)�� ȣ��� �Լ�
	public void add_0(int x, int y){
		System.out.println("add_0 �Լ��� ���۵Ǿ����ϴ� \n");
		System.out.println("add_0 �Լ��� ���� ���� ���� void �Լ��Դϴ�.");
		System.out.println("�ƱԸ�Ʈ(���� ��) x , y���� ���� �Ű����� int x, int y �� �����մϴ�.");
		System.out.println("int x = x; , int y = y;");
		System.out.println("int x = " + x);
		System.out.println("int y = " + y);
		System.out.println("System.out.println(x + y); �Լ��� x + y���� ����մϴ�.");
		System.out.println(x + y);
		System.out.println("add_0 �Լ��� ����Ǿ����ϴ�. ");
		System.out.println("------------------------------------------------------");
	}
	// ��� (5)�� ȣ��� �Լ�

	public void add_1(int x, int y){
		System.out.println("add_1 �Լ��� ���۵Ǿ����ϴ� \n");
		System.out.println("add_1 �Լ��� ���� ���� ���� void �Լ��Դϴ�.");
		System.out.println("�ƱԸ�Ʈ x�� y�� int x�� int y�� ���� �����մϴ�.");
		System.out.println("int x = x; , int y = y;");
		System.out.println("int�� ���� sum�� x�� y�� ���� ���� �����մϴ�.");
		System.out.println("int sum = x + y;");
		int sum = x + y;
		System.out.println("System.out.println(sum);�� sum�� ���� ȣ���մϴ�. >> sum : ");
		System.out.println(sum);
		System.out.println("add_1 �Լ��� ����Ǿ����ϴ�. ");
		System.out.println("------------------------------------------------------");
	}
	// ��� (6)�� ȣ��� �Լ�
	
	public int add_2(int x, int y){
		System.out.println("add_2 �Լ��� ���۵Ǿ����ϴ� \n");
		System.out.println("add_2 �Լ��� ���� ���� int���� �Լ��Դϴ�.");
		System.out.println("x + y�� ������ �ٷ� ���� ������ toss �մϴ�.");
		System.out.println("�Լ��� ȣ���ϴ� ������ ������ ��� ���� ���Դϴ�.");
		System.out.println("add_2 �Լ��� ����Ǿ����ϴ�.");
		System.out.println("------------------------------------------------------");
		return x + y;
	}

	// ��� (7)�� ȣ��� �Լ�
		public int add_3(int x, int y){
		System.out.println("add_3 �Լ��� ���۵Ǿ����ϴ� \n");
		System.out.println("add_2 �Լ��� ���� ���� int���� �Լ��Դϴ�.");
		System.out.println("int�� ���� sum�� x�� y�� ���� ���� �����մϴ�.");
		System.out.println("int sum = x + y;");
		int sum = x + y;
		System.out.println("return sum; ���� ����� �������ϴ�.");
		System.out.println("add_3 �Լ��� ����Ǿ����ϴ�.");
		System.out.println("------------------------------------------------------");
		return sum;
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		
		// 1+1�� ���� ��Ÿ���� ���α׷�
		System.out.println("\n-----------------main�Լ��� �����մϴ�-----------------\n");

		// ���(1)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 1)\n");
		System.out.println("�Ʒ��� ���� print()�Լ� ���ڰ��� 1 + 1 �� �־� ����մϴ�.");
		System.out.println("System.out.println(1 + 1);");
		System.out.println(1 + 1);
		System.out.println("------------------------------------------------------");

		// ���(2)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 2)\n");
		System.out.println("int�� �������� x, y�� ���� �ʱ�ȭ �մϴ�.");
		System.out.println("int x = 1; , int y = 1;");
		int x = 1;
		int y = 1;
		System.out.println("�׸��� print()�Լ��� ����մϴ�. System.out.println(x + y);");
		System.out.println(x + y);
		System.out.println("------------------------------------------------------");
		
		// ���(3)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 3)\n");
		System.out.println("int�� ���� 'sum'�� x�� y�� ���� ���� �ʱ�ȭ �� �� sum�� ����մϴ�.");
		System.out.println("int sum = x + y;");
		int sum = x + y;
		System.out.println("System.out.println(sum);");
		System.out.println(sum);
		System.out.println("------------------------------------------------------");
		
		// ��ü����
		System.out.println("4��° ��� ���ʹ� ���������� ����ϹǷ� ��ü�� �����մϴ�.");
		ExData_4 ed4 = new ExData_4();
		System.out.println("'ed4' ��ü ���� �Ϸ�!");
		System.out.println("------------------------------------------------------");
		
		// ���(4)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 4)\n");
		System.out.println("�������� ed4�� �̿��� add_0 �Լ��� �Ű����� x, y�� �־� ��ȯ�մϴ�.");
		System.out.println("ed4.add_0(x, y);");
		ed4.add_0(x, y);


		// ���(5)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 5)\n");
		System.out.println("�������� ed4�� �̿��� add_1 �Լ��� �Ű����� x, y�� �־� ��ȯ�մϴ�.");
		ed4.add_1(x, y);
		

		// ���(6)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 6)\n");
		System.out.println("�������� ed4�� �̿��� add_2 �Լ��� �Ű����� x, y�� �ְ�, ���� ���� int�� ���� 'sum_2'�� ��� ����մϴ�.");
		int sum_2 = ed4.add_2(x, y);
		System.out.println(sum_2);
		

		// ���(7)
		System.out.println("1+1�� ���� ��Ÿ���� ��� 7)\n");
		System.out.println("�������� ed4�� �̿��� add_3 �Լ��� �Ű����� x, y�� �ְ�, ���� ���� int�� ���� 'sum_3'�� ��� ����մϴ�.");
		int sum_3 = ed4.add_3(x, y);
		System.out.println(sum_3);


		System.out.println("\n-----------------main�Լ��� �����մϴ�-----------------");
		
	}
}
