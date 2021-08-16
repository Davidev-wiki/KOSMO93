package a.b.c.ch5.copy;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList aList = new ArrayList();
		System.out.println("aList�� �� : " + aList);
		System.out.println("aList�� HashCode �� : " + System.identityHashCode(aList));

		System.out.println("\n---------------------------------\n");

		HashMap hp = new HashMap();
		System.out.println("hp�� �� : " + hp);
		System.out.println("hp�� HashCode �� : " + System.identityHashCode(hp));

		System.out.println("\n---------------------------------\n");

		// key�� ������ '�����' �� �ǹǷ� �սǿ� ����. (stack ����?)
		hp.put("Ű", "���"); //��� : String
		System.out.println("hp : " + hp);

		hp.put("�̸�", "�����"); //��� : String
		System.out.println("hp : " + hp);

		hp.put("����", 29); //��� : Integer
		System.out.println("hp : " + hp);

		hp.put("����", 4); //��� : Integer
		System.out.println("hp : " + hp);

		hp.put("����", 50); //��� : Integer
		System.out.println("hp : " + hp);

		hp.put('��', 25); //��� : Integer
		System.out.println("");
		
		hp.put('��', 21); //��� : Integer
		System.out.println("");
		
		
		System.out.println(hp.size());

		// HashMap ������ �������� ��� : ����ȯ : object : String s0 = hp.get("�̸�"); �Ұ�

		// Object�� StringŸ������ �� ��ȯ �ϴ� 5���� ��� (�� ��ȯ �� �����͸� ����)
		Object obj0_1 = hp.get("����");
		Integer s0_1 = (Integer) hp.get("����");
		String s1_1 = hp.get("����").toString();
		String s2_1 = String.valueOf(hp.get("����"));
		String s3_1 = hp.get("����") + "";

		System.out.print("\nobj0_1 : " + obj0_1);
		System.out.print(",  s0 : " + s0_1);
		System.out.print(",  s1 : " + s1_1);
		System.out.print(",  s2 : " + s2_1);
		System.out.println(",  s3 : " + s3_1);

		// �̸�
		Object obj0_2 = hp.get("�̸�");
		String s0_2 = (String) hp.get("�̸�");
		String s1_2 = hp.get("�̸�").toString();
		String s2_2 = String.valueOf(hp.get("�̸�"));
		String s3_2 = hp.get("�̸�") + "";

		System.out.print("\nobj0_2 : " + obj0_2);
		System.out.print(",  s0 : " + s0_2);
		System.out.print(",  s1 : " + s1_2);
		System.out.print(",  s2 : " + s2_2);
		System.out.println(",  s3 : " + s3_2);

		// ���̸� Integer��
		Object obj0_3 = hp.get("����");
		Integer s0_3 = (Integer) obj0_3;
		String s1_3 = hp.get("����").toString();
		String s2_3 = String.valueOf(hp.get("����"));
		String s3_3 = hp.get("����") + "";
		System.out.println("obj0_3 >>> : " + obj0_3);
		System.out.println("s0_3 >>> : " + s0_3);
		System.out.println("s1_3 >>> : " + s1_3);
		System.out.println("s2_3 >>> : " + s2_3);
		System.out.println("s3_3 >>> : " + s3_3);

		// '��'�� Integer��
		Object obj0_4 = hp.get('��');
		Integer s0_4 = (Integer) obj0_4;
		String s1_4 = hp.get('��').toString();
		String s2_4 = String.valueOf(hp.get('��'));
		String s3_4 = hp.get('��') + "";
		System.out.println("obj0_4 >>> : " + obj0_4);
		System.out.println("s0_4 >>> : " + s0_4);
		System.out.println("s1_4 >>> : " + s1_4);
		System.out.println("s2_4 >>> : " + s2_4);
		System.out.println("s3_4 >>> : " + s3_4);
		
	}

}
