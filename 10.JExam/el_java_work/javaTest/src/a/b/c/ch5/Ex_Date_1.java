package a.b.c.ch5;

import java.util.Date;

public class Ex_Date_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		/*
		 * Date Ŭ������ epoch�ð� (����ũ)�� �����Ѵ�. 1970�� 1�� 1�� 00:00:00�ð��� �������� ������ �ð���
		 * millisecond�� ��ȯ�Ѵ�.
		 */

		// ��
		// public int getYear()
		int year = d.getYear();
		System.out.println("Year : " + year);
		year = year + 1900;
		System.out.println("���� �⵵�� getYear() + 1900�� �ؾ� �Ѵ� : " + year);

		// ��
		// public int getMonth()
		int month = d.getMonth();
		System.out.println("\nMonth : " + month);
		month = month + 1;
		System.out.println("���� ���� getMonth() + 1�� �ؾ� �Ѵ� : " + month);

		// ��
		// public int getDate()
		int Date = d.getDate();
		System.out.println("\ngetDate() : " + Date);
		System.out.println("�������� �� ��µȴ�..");
		
		// ��¥ �������� ǥ��
		String time = year + "." + month + "." + Date;
		System.out.println("time : " + time);

		time = time.replace('.', '-');
		System.out.println("time : " + time);

		time = time.replace('-', '/');
		System.out.println("time : " + time);

	}

}
