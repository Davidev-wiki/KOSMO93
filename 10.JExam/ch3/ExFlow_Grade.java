//package
package a.b.c.ch3;
//import
import java.util.Scanner;
/*
��Ű�� �̸� : a.b.c.ch3;
Ŭ���� �̸� : ExFlow_Grade
�Լ� �̸� : gradeFun
���� : ���� : int score
    : ���� : char grade
Scanner Ŭ����, nextInt() �Լ��� �̿�, �ֿܼ� ����ϱ�.

1. Scanner Ŭ������ �̿��ϴ� ���.
2. Scanner Ŭ������ �̿����� �ʴ� ���.
*/
/* <��� ����>
A ��� : 90~100
B ��� : 80~89
C ��� : 70~79
D ��� : 60~69
E ��� : 50~59
F ��� : 50 �̸�
*/

public class ExFlow_Grade {
	//���
	//�������
	//������
	
	//�Լ�
	public void gradeFun(){
		
		System.out.println("������ �� ���ΰ���?");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade;

		if (0 <= score && score <= 100)
		{
			if (score >= 90)
			{
				grade = 'A';
			}else if(score >= 80)
			{
				grade = 'B';
			}else if(score >= 70)
			{
				grade = 'C';
			}else if(score >= 60)
			{
				grade = 'D';
			}else if(score >= 50)
			{
				grade = 'E';
			}else{
				grade = 'F';
			}
			System.out.println("����� " + grade + "�Դϴ�.");
		}else {
			System.out.println("�� ���� ��ȭ��..?");
		}
	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		ExFlow_Grade eg = new ExFlow_Grade();
		eg.gradeFun();
	}
}
