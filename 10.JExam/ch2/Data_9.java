package a.b.c.ch2;

public class Data_9 {

	public void aMethod(int x1, int y1){
		System.out.println("Data_9 Ŭ������ public void aMethod() �Լ��� ȣ��Ǹ� ��µǴ� ù �����Դϴ�.");
		System.out.println("�� �Լ����� int�� �Ű����� 'x1'�� 'y1'�� ������� �Ҵ�Ǿ� �ֽ��ϴ�.");
		System.out.println("�� �Լ��� ������ �Ű����� 'x1'�� 'y1'�� ���� ���� int�� ���� 'sum1'�� �ʱ�ȭ �մϴ�.");
		int sum1 = x1 + y1;
		System.out.println(" sum1 = " + sum1);
		System.out.println("'static'�� ������ �������� 'd9'�� �̿���(d9.aMethod(x, y)) ȣ���߽��ϴ�.");
		System.out.println("'void'�� ���� ���� ���� ���� �Լ��̴�, ������ ������ �̿��� ���� �������� �ʾҾ��.");
	}

	public static void aaMethod(int x2, int y2){
		System.out.println("Data_9 Ŭ������ public static void aaMethod() �Լ��� ȣ��Ǹ� ��µǴ� ù �����Դϴ�. ");
		System.out.println("�� �Լ����� int�� �Ű����� 'x2'�� 'y2'�� ������� �Ҵ�Ǿ� �ֽ��ϴ�.");
		System.out.println("�� �Լ��� ������ �Ű����� 'x2'�� 'y2'�� ���� ���� int�� ���� 'sum2'�� �ʱ�ȭ �մϴ�.");
		int sum2 = x2 + y2;
		System.out.println(" sum2 = " + sum2);
		System.out.println("'static'�� �ֳ׿�, �޸𸮿� �ö� ������ ���� ��θ� �Է��ؼ�(Data_9.aaMethod()) ȣ���߾��.");
		System.out.println("'void'�� ���� ���� ���� ���� �Լ��̴�, ������ ������ �̿��� ���� �������� �ʾҾ��.");
	}

	public int bMethod(int x3, int y3){
		System.out.println("Data_9 Ŭ������ public int bMethod() �Լ��� ȣ��Ǹ� ��µǴ� ù �����Դϴ�. ");
		System.out.println("�� �Լ����� int�� �Ű����� 'x3'�� 'y3'�� ������� �Ҵ�Ǿ� �ֽ��ϴ�.");
		System.out.println("�� �Լ��� ������ �Ű����� 'x3'�� 'y3'�� ���� ���� int�� ���� 'sum3'�� �ʱ�ȭ �մϴ�.");
		int sum3 = x3 + y3;
		System.out.println(" sum3 = " + sum3);
		System.out.println("'static'�� ������ �������� 'd9'�� �̿���(d9.bMethod(x, y)) ȣ���߽��ϴ�.");
		System.out.println("'int��' ���� ���� �߻��ϴ� �Լ��̴�, ������ ���� ������ ������ �ʿ��մϴ�!");
		return sum3;
	}

	public static int bbMethod(int x4, int y4){
		System.out.println("Data_9 Ŭ������ public static int bbMethod() �Լ��� ȣ��Ǹ� ��µǴ� ù �����Դϴ�. ");
		System.out.println("�� �Լ����� int�� �Ű����� 'x4'�� 'y4'�� ������� �Ҵ�Ǿ� �ֽ��ϴ�.");
		System.out.println("�� �Լ��� ������ �Ű����� 'x4'�� 'y4'�� ���� ���� int�� ���� 'sum4'�� �ʱ�ȭ �մϴ�.");
		int sum4 = x4 + y4;
		System.out.println(" sum4 = " + sum4);
		System.out.println("'static'�� �ֳ׿�, �޸𸮿� �ö� ������ ���� ��θ� �Է��ؼ�(Data_9.bbMethod()) ȣ���߾��.");
		System.out.println("'int��' ���� ���� �߻��ϴ� �Լ��̴�, ������ ���� ������ ������ �ʿ��մϴ�!");
		return sum4;
	}

	public static void main(java.lang.String[] args){
		
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("main�Լ��� ����˴ϴ�.");
			System.out.println("-----------------------------------------------------------------------------");
		int x = 1;
			System.out.println("���� ���� int x = 1; �ʱ�ȭ �Ϸ�");
		int y = 2;
			System.out.println("���� ���� int y = 2; �ʱ�ȭ �Ϸ�");
			System.out.println("-----------------------------------------------------------------------------");
		
			System.out.println("<Data_9Ŭ������ aaMethod(x, y) �Լ��� �����մϴ�.>");
		Data_9.aaMethod(x, y);
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("<Data_9Ŭ������ bbMethod(x, y) �Լ��� �����մϴ�.>");
		int i = Data_9.bbMethod(x, y);
			System.out.println("<���� ���� int�� ���� 'i'�� ����Ǿ����ϴ�! >");
			System.out.println(" i �� = " + i);
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("<Data_9Ŭ������ d9��ü�� �����մϴ�.>");
		Data_9 d9 = new Data_9();
			System.out.println("<Data_9Ŭ������ aMethod(x, y) �Լ��� �����մϴ�.>");
		d9.aMethod(x, y);
			System.out.println("-----------------------------------------------------------------------------");

			System.out.println("������ d9��ü�� bMethod(x, y) �Լ��� �����մϴ�..>");
		int i1 = d9.bMethod(x, y);
			System.out.println("<���� ���� int�� ���� 'i1'�� ����Ǿ����ϴ�! >");
			System.out.println(" i1 �� = " + i1);
			System.out.println("-------------------------------------------------------------------���α׷� ����!");

	} 
} 