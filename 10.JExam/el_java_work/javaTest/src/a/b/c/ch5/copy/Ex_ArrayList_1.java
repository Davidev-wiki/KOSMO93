package a.b.c.ch5.copy;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList ��ü �����
		ArrayList aList = new ArrayList();
		// for �ݺ����� �̿��� '�۾�A'�� �ݺ��ϰ� ArrayList�� ����
		// �۾�A : ����Ŭ������ ��ü�� ���� DB�� �����ؼ� �־��
		for (int i = 0; i < 3; i++) {

			TestVO tvo = new TestVO();

			tvo.setMnum("00_" + i);
			tvo.setMid("ai_" + i);
			tvo.setMpw("ai12_" + i);
			tvo.setMhp("010_" + i);
			tvo.setMaddr("Seoul_" + i);

			aList.add(tvo);
			System.out.println("tvo : " + tvo);
		}
		// ArrayList �� ���� ���
		System.out.println("aList.size() : " + aList.size());

		// for �ݺ������� ArrayList�� �����ŭ(�ȿ� �ִ°� ���� �� get()�ؼ� ���)

		for (int i = 0; i < aList.size(); i++) {
			System.out.println("\naList�� " + i + "�� °�� �ִ� �� �����Դϴ�.\n");

			TestVO tvo = (TestVO) aList.get(i);

			System.out.println(" " + tvo.getMnum());
			System.out.println(" " + tvo.getMid());
			System.out.println(" " + tvo.getMpw());
			System.out.println(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMaddr());
		}

		// ���ʸ� : Generic : ������ Ÿ���� ���� �Ѵ�(�Ѱ����� ����ؾ� �Ѵ�.)
		System.out.println("\n------------------���ʸ����� �غ���--------------------\n");

		ArrayList<TestVO> aList1 = new ArrayList<TestVO>();

		for (int i = 0; i < 3; i++) {

			TestVO tvo1 = new TestVO();

			tvo1.setMnum("00_" + i);
			tvo1.setMid("ai_" + i);
			tvo1.setMpw("ai12_" + i);
			tvo1.setMhp("010_" + i);
			tvo1.setMaddr("Seoul_" + i);

			aList1.add(tvo1);

			System.out.println(aList1);

		}
		System.out.println(aList1.size());
		for (int i = 0; i < aList1.size(); i++) {

			System.out.println(i + " >>> : " + aList1.get(i));

			TestVO tvo1 = (TestVO) aList1.get(i);

			System.out.print(" " + tvo1.getMnum());
			System.out.print(" " + tvo1.getMid());
			System.out.print(" " + tvo1.getMpw());
			System.out.print(" " + tvo1.getMhp());
			System.out.println(" " + tvo1.getMaddr());
		}

	}
}
