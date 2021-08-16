package a.b.c.ch5;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.TestVO;

public class Ex_ArrayList_3 {
// arrayList ������ ����
// �����ͺ��̽����� ���� ��ȸ�ؼ� �������� ������ ���Ե� ����.
// ���������� ��ü �Ǵ� �����ڷ����� Ư���� ��찡 �ƴ��̻� default ������ �ʱ�ȭ�ؼ� ����ؾ� �Ѵ�.(�� ������ ���Ŀ�)
// �� 4�� �� �ɼ������� �� ���� ��ǥ ���α׷��� ����

	// ���� Ÿ�� : TestVOŸ��
	public ArrayList<TestVO> memSelect() {

		// 'aList'��� �̸��� �� ����Ʈ�� ����
		ArrayList<TestVO> aList = new ArrayList<TestVO>();

		// 3���� ������ ���Ƿ� ���� (������ ��ü��)
		for (int i = 0; i < 3; i++) {

			TestVO tvo = new TestVO();

			tvo.setMnum("num_" + i);
			tvo.setMid("id_" + i);
			tvo.setMpw("pw_" + i);
			tvo.setMhp("hp_" + i);
			tvo.setMaddr("addr_" + i);

			// aList �� ���� �������� ������ ��ü�� �߰�
			aList.add(tvo);

			System.out.println("\n�� �����Ͱ� �߰��Ǿ����ϴ�!");
			System.out.println(aList);
		}

		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n ���� �Լ� ����----");
		System.out.print("\n��ȸ Ű���带 �Է��ϼ���  : [S] ������ȸ , [SALL] ��ü ��ȸ ");

		// ����� �Է� �� �޴� ��� ����
		Scanner sc = new Scanner(System.in);
		String isud = sc.next();

		// ����� �Է°� ����
		isud = isud.toUpperCase();

		// ����� �Է°� ���͸�
		if ("S".equals(isud)) {
			System.out.println("������� �Է� �� isud : " + isud);
		}
		if ("SALL".equals(isud)) {
			System.out.println("������� �Է� �� isud : " + isud);

			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();

			// memSelect()�Լ� : *����Ʈ�� �����Ѵ�. (*����Ʈ: �� ����Ʈ�� ��ü 3���� ���. ������ ��ü�� ���� �����Ͱ� ��
			// �ִ�.)

			ArrayList<TestVO> aList = ex3.memSelect();

			System.out.println("\naList.size : " + aList.size());
			System.out.println("aList�� �� : " + aList);

			// �� ������ ����Ʈ Ǯ��
			if (aList.size() > 0) {
				// ��ü�� ����� �ϳ��� ���
				for (int i = 0; i < aList.size(); i++) {
					TestVO tvo = aList.get(i);

					System.out.print(tvo.getMnum());
					System.out.print(tvo.getMid());
					System.out.print(tvo.getMpw());
					System.out.print(tvo.getMhp());
					System.out.println(tvo.getMaddr());

				}
			}

		}

	}

}
