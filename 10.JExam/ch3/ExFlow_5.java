//package
package a.b.c.ch3;
//import


public class ExFlow_5
{
	//���
	//�������
	//������
	
	//�Լ�

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n�����Լ� ����------------------------------------\n");
		int ranking = 1;
		char medalColor = '\u0000'; // �Ǵ� ' ';�� �ʱ�ȭ
		switch (ranking)
		{
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default:
					medalColor = 'A';
		}

		System.out.println(ranking + "�� �޴� ����" + medalColor + "�Դϴ�.");
		System.out.println("\n-------------------------------------------\n");
		ranking = 3;
		String mColor = ""; // �Ǵ� "null";�� �ʱ�ȭ

		switch (ranking)
		{
			case 1: mColor = "�ݸ޴�";
					break;
			case 2: mColor = "���޴�";
					break;
			case 3: mColor = "���޴�";
					break;
			default:
					mColor = "������ ���Ǹ� �μ���";
		}

		System.out.println(ranking + "�� �޴� ����" + mColor + "�Դϴ�.");
		System.out.println("\n-------------------------------------------\n");
		String medal = "GOLD";
		switch (medal)
		{
			case "GOLD": 
					System.out.println("�ݸ޴��Դϴ�.");
					break;
			case "SILVER": 
					System.out.println("���޴��Դϴ�.");
					break;
			case "BRONZE": 
					System.out.println("���޴��Դϴ�.");
					break;
			default:
					System.out.println("��޴��Դϴ�.");
					break;
		}
		System.out.println("\n-------------------------------------------");
		System.out.println("\n�����Լ� ����------------------------------------\n");}
}
