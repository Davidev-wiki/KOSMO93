package a.b.c.ch2;

public class Data_8 {

	// void �Լ�, �Ϲ��Լ�
	// ���� : �������� ����ϱ� : Ŭ�����̸� �������� = new �������̸�();
	//        ��������.�Լ��̸�();
	// Data_8 d8 = new Data_8();
	// d8.aMethod();
	public void aMethod(){
		System.out.println("�� ������ Data_8 Ŭ������ public void aMethod() �Լ��� ���๮�� �Դϴ�!");
		System.out.println("'static'�� �����Ƿ� ���������� �̿��� ȣ���ؾ� �մϴ�.");
		System.out.println("'void'Ű���带 ���� return ���� ���׿�.");

	}

	// void �Լ�, static  �Լ� 
	// ���� : Ŭ�����̸�.�Լ��̸�();
	// Data_8.aaMethod();
	public static void aaMethod(){
		System.out.println("�� ������ Data_8 Ŭ������ public static void aaMethod()�Լ��� ���๮�� �Դϴ�!");
		System.out.println("'static'�� �ֳ׿�. �޸𸮿� �ö� ������ ��θ� ���� ���� ȣ���� �� �ֽ��ϴ�.");
		System.out.println("'void'Ű���带 ���� return ���� ���׿�.");
	}

	// �������� �ִ� �Լ�, �Ϲ� �Լ�
	// �������� ����ϱ�, �������� �޾Ƽ� ����ϱ� 
	// Data_8 d8 = new Data_8();
	// int i = d8.bMethod();
	public int bMethod(){
		System.out.println("�� ������ Data_8 Ŭ������ public int bMethod() �Լ��� ���๮�� �Դϴ�!");
		System.out.println("'static'�� �����Ƿ� ���������� �̿��� ȣ���ؾ� �մϴ�.");
		System.out.println("�������� 'int'�Դϴ�. ������ ��� ���� �������ϴ�. ������ �̿��� ���� �����ϼ���.");
		return 1;
	}

	// �������� �ִ� �Լ�, static �Լ� 
	// Ŭ�����̸�.�Լ��̸�(); ������ �ޱ�
	// int i = Data_8.bbMethod();
	public static int bbMethod(){
		System.out.println("�� ������ Data_8 Ŭ������ public static int bbMethod() �Լ��� ���๮�� �Դϴ�!");
				System.out.println("'static'�� �ֳ׿�. �޸𸮿� �ö� ������ ��θ� ���� ���� ȣ���� �� �ֽ��ϴ�.");
		System.out.println("�������� 'int'�Դϴ�. ������ ��� ���� �������ϴ�. ������ �̿��� ���� �����ϼ���.");
		return 1;
	}

	public static void main(java.lang.String[] args){
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("main�Լ��� ����˴ϴ�.");
		System.out.println("-----------------------------------------------------------------------------");
		// static �Լ� ����ϱ� 
		// Ŭ�����̸�.�Լ��̸�
		System.out.println("Data_8.aaMethod() �Լ��� ����˴ϴ�.");
		Data_8.aaMethod();
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("Data_8.bbMethod() �Լ��� ����˴ϴ�.");
		System.out.println("Data_8.aaMethod() �Լ��� int Ÿ�� ���� 'i' �� �ʱ�ȭ�˴ϴ�.");
		int i = Data_8.bbMethod();
		System.out.println("int Ÿ���� ���� 'i' ���� ����մϴ�.");
		System.out.println("i = " + i);
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("Data_8Ŭ������ 'd8'�� ��ü�� �����˴ϴ�.");
		// static ���� �Լ� : �������� �̿��ϱ� : �ν��Ͻ� �ؼ� ����ϱ� : new ������ ����ϱ� 
		// ��������.�Լ��̸�
		Data_8 d8 = new Data_8();
		System.out.println("�������� 'd8'�κ��� aMethod() �Լ��� ȣ��˴ϴ�.");
		d8.aMethod();
		System.out.println("-----------------------------------------------------------------------------");
		
		System.out.println("�������� 'd8'�κ��� bMethod() �Լ��� ȣ���մϴ�.");
		System.out.println("���� ���� �ִ� bMethod() �Լ��� int �� ���� 'i1'�� ���� ���� �����մϴ�.");
		int i1 = d8.bMethod();
		System.out.println("int �� ���� 'i1'�� ���� �����߽��ϴ�.");
		System.out.println("i1�� ���� " + i1 + " �Դϴ�.");
		System.out.println("------------------------------------------------------------------���α׷� ����!");


	} // end of main �Լ� 	
} // end of Data_6


