package a.b.c.ch1;

public class ������ {

	// ��� ���� 
	public String name;
	public String role;

	// ������ 
	public ������(String name, String role){
		this.name = name;
		this.role = role;
	}
	// main �Լ� : �ܼ� ���ø����̼��� ������ 
	public static void main(String args[]){
		
		System.out.println("--------------------------");
		������ �Ƶ� = new ������("����", "�Ƶ�");
		System.out.println("�Ƶ�� ����� '������'�� �ִ� �ּ� : " + �Ƶ�);
		System.out.println("�Ƶ� '������'�� ���� : " + �Ƶ�.role);
		System.out.println("������ �θ��ϴ� : " + �Ƶ�.name);
		System.out.println("--------------------------");

		������ �л� = new ������("�����⾾", "������");
		System.out.println("�л����� ����� '������'�� �ִ� �ּ� : " + �л�);
		System.out.println("�Ʒû� '������'�� ���� : " + �л�.role);
		System.out.println("���簡 �θ��ϴ� : " + �л�.name);
		System.out.println("--------------------------");

		������ ģ�� = new ������("�����", "���");
		System.out.println("ģ���� ����� '������'�� �ִ� �ּ� : " + ģ��);
		System.out.println("ģ�� '������'�� ���� : " + ģ��.role);
		System.out.println("ģ���� �θ��ϴ� : " + ģ��.name);
		System.out.println("--------------------------");
		
	} // end of main �Լ� 
} // end of Ex_5 Ŭ���� 