package a.b.c.ch5.copy;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ex_HashMap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// {} �ؽø� ���� key, value ��� String����.
		HashMap<String, String> hm = new HashMap<String, String>();
		
		// ������ ����
		hm.put("�̸�", "���翵");
		hm.put("����", "25");
		hm.put("�ּ�", "������ ȣ����");
		
		
		// ������ �����ͼ� ������ ���
		String name = hm.get("�̸�");
		String age = hm.get("����");
		String addr = hm.get("�ּ�");
		
		
		// �ֿܼ� ����ϱ�
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);
		
		
		System.out.println("\n=====================================\n");

		System.out.println("hm.keySet()�Լ���  [key] �� �������ش�. : " + hm.keySet());
		System.out.println("hm.values()�Լ���  [value] �� �������ش�. : " + hm.values());
		System.out.println("hm.entrySet()�Լ���  [key : value] ���·� �������ش�. : " + hm.entrySet());

		System.out.println("\n=====================================\n");
		
		
		// iterator() �� ���ϴ� �Լ�??
		/*
			hm.keySet() : �̸�, ����, �ּ� �� �迭�� ���� 
			.iterator() : hm.keySet() �Լ����� ������ [�̸�, ����, �ּ�] �����͸� Iterator keys ���������� �����Ѵ�.
		                                    �ٸ� ���� Iterator keys ���������� hm.keySet() �Լ����� ������ [�̸�, ����, �ּ�] �����͸� ����Ų��.
		*/		
		Iterator keys = hm.keySet().iterator();
		
		
		// Iterator �������� keys�� �̿�, ���ͷ����Ϳ� ����ִ� �����͸� hasNext()�Լ��� Ȯ���ϱ�
		// iteratorŸ�� keys������ next()�Լ��� �Է°��� ���� ���� StringŸ�� key�� ���� 
		while (keys.hasNext()) {
			String key = (String)keys.next();
			String value = "";
			
			if("�̸�".equals(key)) {
				value = (String)hm.get(key);
			}
			if("����".equals(key)) {
				value = (String)hm.get(key);
			}
			if("�ּ�".equals(key)) {
				value = (String)hm.get(key);
			}
			System.out.println(key + " : " + value);
		}
		
		
		
		
		
		
		
		
	}

}
