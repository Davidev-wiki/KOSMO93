//package
package a.b.c.ch4;
//import


public class ExClass_C extends ExClass_P
{
	//���
	//�������
	//������
	public ExClass_C(){
		System.out.println("�ڽ�Ŭ���� ������ �Դϴ�.");
	}
	
	//�Լ�
	public String toString(){
		return "������";
	}

	
	//ExClass_P���� ����� �Լ��� ������
	public String exClass_b(){
		
		return "�ڽ�Ŭ�������� �������̵��� b() �Լ� �Դϴ�.";
	}



	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\nExClass_C.main()�Լ� ����\n");
 
		/*
		    1. ExClass_C Ŭ������ �ν��Ͻ��ϸ�
			2. extends ExClass_P �θ� Ŭ������ ���� ã�Ƽ� �޸𸮿� �ε��Ѵ�.
			3. �ڽ� Ŭ���� ExClass_C�� �޸𸮿� �ε��Ѵ�.

		*/
		System.out.println("��ü �����ҰԿ�!-\n");
		ExClass_C ecc = new ExClass_C(); //�θ�Ŭ���� �����ڰ� ȣ���.
		System.out.println("��ü ���� �Ϸ�!-\n");

		
		System.out.println("������ ��ü�� �������� ecc ��� : " + ecc); //�������̵��� �Լ� toString�� ���ϰ��� ��µ�
		System.out.println("\n ecc.toString()��� : " + ecc.toString());


		System.out.println("\n--------------------------\n");
		System.out.println("ecc��ü�� a()�Լ��� 'a'��� ������ �ʱ�ȭ�մϴ�!-\n");
		String a = ecc.exClass_a();
		System.out.println("a�� �� : " + a);
		System.out.println("\necc��ü�� b()�Լ��� 'b'��� ������ �ʱ�ȭ�մϴ�!-\n");
		String b = ecc.exClass_b();
		System.out.println("b�� �� : " + b);


		System.out.println("\nExClass_C.main()�Լ� ����\n");


	
	}
}
