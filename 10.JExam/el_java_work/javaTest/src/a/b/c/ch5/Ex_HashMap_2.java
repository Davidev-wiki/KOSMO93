package a.b.c.ch5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex_HashMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ؽø� ����� : Ű = StringŸ��, ��� = StringŸ��
		HashMap<String, String> hm = new HashMap<String, String>();

		// �ؽøʿ� ������ ���� {�̸� : �̱���, ���� : 27, �ּ� : ���� �ϻ�}
		hm.put("�̸�", "�̱���");
		hm.put("����", "27");
		hm.put("�ּ�", "���� �ϻ�");

		// �ؽø��� ������ ������ ������ ����
		String name = hm.get("�̸�");
		String age = hm.get("����");
		String addr = hm.get("�ּ�");

		// �ֿܼ� �� ���� ���
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);

		// ����(sort) �Լ�?
		System.out.println("\n=====================================\n");

		System.out.println("hm.keySet()�Լ���  [key] �� �������ش�. : " + hm.keySet());
		System.out.println("hm.values()�Լ���  [value] �� �������ش�. : " + hm.values());
		System.out.println("hm.entrySet()�Լ���  [key : value] ���·� �������ش�. : " + hm.entrySet());

		System.out.println("\n=====================================\n");

		// Itorator() ����
		Iterator<String> keys = hm.keySet().iterator();

		// hasNext() �Լ� : 'Ŀ��' �Լ���� �Ѵ�.
		while (keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println("Itorator : " + key + " : " + value);
		}
		System.out.println();

		// ���� for���̴�.
		for (String key1 : hm.keySet()) {
			String value1 = hm.get(key1);
			System.out.println("keySet() : " + key1 + " : " + value1);
		}
		System.out.println();

		// entrySet()
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println("entrySet() : " + entry.getKey() + " : " + entry.getValue());
		}

	}

}
