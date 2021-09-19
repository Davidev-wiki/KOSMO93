package a.b.c.ch6;

import java.lang.reflect.Method;

public class Ex_ClassName {

	public void aM() {
		System.out.println("Ex_ClassName.aM()�Լ���");
	}

	public void bM() {
		System.out.println("Ex_ClassName.bM()�Լ���");
	}

	public void cM() {
		System.out.println("Ex_ClassName.cM()�Լ���");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ڽ�Ŭ�������� �ڽ�Ŭ������������ ���� = new �ڽ�Ŭ����������()����
		Ex_ClassName cn = new Ex_ClassName();
		System.out.println("cn : " + cn);
		System.out.println("cn.getclass(); ȣ��! : " + cn.getClass());
		System.out.println("cn.getclass().getName() ȣ��! : " + cn.getClass().getName());

		Object obj = new Ex_ClassName();
		System.out.println("\n�θ�Ŭ���� �������� = new �ڽ�Ŭ����()������ : " + obj);

		// ��ü ����ȯ reference casting
		System.out.println("\n<Reference Casting>\n");
		Ex_ClassName cn1 = (Ex_ClassName) obj;
		System.out.println("\ncn1 : " + cn1);
		System.out.println("cn1.getClass : " + cn1.getClass());
		System.out.println("cn1.getClass.getName : " + cn1.getClass().getName());
		System.out.println("\n======================================================");

		try {

			Class cc = Class.forName("a.b.c.ch6.Ex_ClassName");
			System.out.println("cc : " + cc);

			Ex_ClassName cc1 = (Ex_ClassName) cc.newInstance();
			System.out.println("cc1 : " + cc1);
			cc1.aM();

			System.out.println("\n ------------------------------------------- \n");

			// ���༺ ���α׷�, �ҹ�����or ���ڿ� ���̴� �ڵ�. ��ȸ, ���� ��� ����. feat.��ų�� ���� ����
			Method m[] = cc.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(" >> " + m[i].toString());

				String findM = m[i].getName();
				System.out.println("m[" + i + "].getName() : " + findM);
			}

			System.out.println("\n ------------------------------------------- \n");

			Class aList = Class.forName("java.util.ArrayList");
			java.util.ArrayList aList1 = (java.util.ArrayList) aList.newInstance();
			System.out.println("aList1 : " + aList);

			Class d = Class.forName("java.util.Date");
			java.util.Date dd = (java.util.Date) d.newInstance();
			System.out.println("dd : " + dd);
		} catch (Exception e) {
			System.out.println("���� ���� e : " + e.getMessage());
		}
		System.out.println("���α׷� ��~!");
	}

}
