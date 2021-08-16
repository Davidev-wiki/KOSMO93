package a.b.c.ch6;

public class Ex_Exception_4 {

	public Ex_Exception_4() {

	}

	public void aM() throws Exception {
		System.out.println("\n---aM() ����!");
		System.out.println("aM()������...");
		bM();
		System.out.println("---aM() ��!\n");
	}

	public void bM() throws Exception {
		System.out.println("\n---bM() ����!");
		System.out.println("bM()������...");

		int[] iVal = new int[5];

		// ���� �߻� ����Ʈ i <= iVal.length �迭�� ���̺��� �� ���� �õ� => ArrayIndexOutOfBoundsException
		for (int i = 0; i < iVal.length; i++) {
			System.out.println("\niVal �迭�� " + i + "��° ���� " + iVal[i] + "�̴�!");
		}

		String msg = cM();
		System.out.println("bM() �� msg�� cM()�� ���ϰ��� ����Ų��. : " + msg);

		System.out.println("---bM() ��!\n");
	}

	public String cM() throws Exception {
		System.out.println("\n---cM() ����!");
		System.out.println("cM()������...");

		String msg = dM();
		System.out.println("cM() �� msg��dM()�� ���ϰ��� ����Ų��. : " + msg);

		System.out.println("---cM() ��!\n");

		return "����� cM() �Լ��ε� ���� �׽�Ʈ ����;";
	}

	public String dM() throws Exception {
		System.out.println("\n---dM() ����!");
		System.out.println("dM()������...");

		int x = 1;
		int y = 0;
		// ���� �߻� ����Ʈ 1/0 => ArithmeticException
		int z = x / y;

		System.out.println("z�� �� : " + z);
		System.out.println("---dM() ��!\n");

		return "����� dM() �Լ��ε� ���� �׽�Ʈ ����;";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main()�Լ� ����!-");

		try {
			Ex_Exception_4 ex4 = new Ex_Exception_4();
			System.out.println("ex4�� �� : " + ex4);
			ex4.aM();
		} catch (Exception e) {
			System.out.println("Exception ������ �߻��߳׿�.. : " + e.getMessage());

		} finally {
			System.out.println("�׷��� �Ұ� �ؾ���..");
		}

	}

}
