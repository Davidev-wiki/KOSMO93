package a.b.c.ch5.copy;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList aList = new ArrayList();

		System.out.println("aList.size() : " + aList.size());
		System.out.println("���� aList�� �� : " + aList);

		aList.add(1);
		System.out.println("aList.add(1); ���� aList�� �� : " + aList);

		aList.add(new Integer("100"));
		System.out.println("aList.add(new Integer(\"100\")); ���� aList�� �� : " + aList);

		aList.add("�缺��");
		System.out.println("aList.add(\"�缺��\"); ���� aList�� �� : " + aList);

		aList.add(new String("�̴���"));
		System.out.println("aList.add(new String(\"�̴���\")); ���� aList�� �� : " + aList);

		aList.add('c');
		System.out.println("aList.add('c'); ���� aList�� �� : " + aList);

		aList.add(false);
		System.out.println("aList.add(false); ���� aList�� �� : " + aList);

		aList.add(aList);
		System.out.println("aList.add(aList)); ���� aList�� �� : " + aList);

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); ���� aList�� �� : " + aList);
		System.out.println("aList.size() : " + aList.size());

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); ���� aList�� �� : " + aList);
		System.out.println("aList.size() : " + aList.size());

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); ���� aList�� �� : " + aList);
		System.out.println("aList.size() : " + aList.size());

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); ���� aList�� �� : " + aList);
		System.out.println("aList.size() : " + aList.size());

		for (int i = 0; i < aList.size(); i++) {
			System.out.println(i + "�� ° ��� : " + aList.get(i));
		}

	}

}
