// package
package a.b.c.ch3;

// import
import java.util.Scanner;


public class ExFlow_5_1
{
	// ��� 
	// �������
	// ������
	

	// �Լ� 
	public String rankFun(int ranking){
		System.out.println("\nExFlow_5_1.rankFun �Լ� ����\n");
		// ��������, �����ڷ�������
		char medalColor = '\u0000'; // �����ڵ�� �ʱ�ȭ 
		
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
			System.out.println("\nExFlow_5_1.rankFun �Լ� ����\n");
		return ranking + "�� �޴��� ������ " + medalColor + "�Դϴ�.";		
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		System.out.println("\nExFlow_5_1.���� �Լ� ����\n");
		
		System.out.println("����� �Է��Ͻÿ� !!");
		Scanner sc = new Scanner(System.in);
		int ranking = sc.nextInt();
		if (0 < ranking && ranking <= 100)
		{
			ExFlow_5_1 ef1 = new ExFlow_5_1();
			String msg = ef1.rankFun(ranking);

			System.out.println("" + msg);
		}else{
			System.out.println("�˼��մϴ�, 1~100������� �޴��� �����˴ϴ�.");
		}
			System.out.println("\nExFlow_5_1.���� �Լ� ����\n");
	
	}
}