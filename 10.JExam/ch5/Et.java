//package
package a.b.c.ch5;
//import
import java.util.Scanner;
import a.b.c.ch5.EtVO;

public class Et
{
	//���
	//�������
	//������
	
	//�Լ� ���
	// �� ���� �Է�
	// �� ���� ����
	public void getInformation(EtVO etvo){
		String getVal = etvo.getInfo();
		System.out.println("������ ������ "+ getVal +" �Դϴ�.");
	}
	// �� ���� ����
	// �� ���� ����

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		//ȸ�� ������ �־�δ� ���� Ŭ���� ����� ���� ����
		//ȸ�� ����

		//�Է� ���� ���� : �ѱ��� ȸ�� �̸�, ����, ����ó, �ּ�
		String kname = "";
		int kage = 0;
		String khp = "";
		String kaddress = "";
		
		System.out.println("�Է��� �� : " + args[0]);
		if (1 == args.length)
		{	
			String isud = "";
			System.out.println("\n>> ���� ���� �ϰ� �;��?  [i] : ���Խ���  [s] : ������ȸ  [u] : ��������  [d] : ȸ����������  >> : ");

			Scanner sc = new Scanner(System.in);
			isud = sc.next();
			// <if -> if : �Է� ���� i �� ��� ����>
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println(" - �� ȸ�������� ������ ���۵˴ϴ�! - ");
			}
			// <if -> if : �Է� ���� s �� ��� ����>
			if ("S".equals(isud.toUpperCase()))
			{
				System.out.println(" - �� ȸ������ ��ȸ�� ���۵˴ϴ�! - ");
				//<To do insert : ���� Ŭ�������� ���� �������� �Լ�>
				System.out.println("ȸ�� �̸��� �Է����ּ���. : ");
				kname = sc.next();
				EtVO etvo = new EtVO();
				etvo.setInfo(kname); 
				
				Et et = new Et();
				et.getInformation(etvo);
			}
			// <if -> if : �Է� ���� u �� ��� ����>
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println(" - �� ȸ������ ������ ���۵˴ϴ�! - ");
			}
			// <if -> if : �Է� ���� d �� ��� ����>
			if ("D".equals(isud.toUpperCase()))
			{
				System.out.println(" - �� ȸ������ ������ ���۵˴ϴ�! - ");
			}
		}else {
			System.out.println("�� ���� �Է��߳�.. �� ���� ����..");
		}
		/*
		if (0 < args.length < 5)
		{
			String uival = args[0]
			if ("")
			{
			}
			Scanner sc = new Scanner();
			String uival = sc.next();
			if (uival == )
			{
			}
		}else{
			System.out.println("����� ���ų�?");
		}
		
		*/
	}
}
