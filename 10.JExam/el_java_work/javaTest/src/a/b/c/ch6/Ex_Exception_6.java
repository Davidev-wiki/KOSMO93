package a.b.c.ch6;

public class Ex_Exception_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main�Լ� �����մϴ�! -");

		int argsL = args.length;

		if (argsL == 2) {
			String sX = args[0];
			String sY = args[1];
			System.out.println("args�� ù ��° �� sX : " + sX);
			System.out.println("args�� ù ��° �� sX : " + sY);

			try {
				int x = Integer.parseInt(sX);
				int y = Integer.parseInt(sY);
				int z = x / y;
				System.out.println(x + " / " + y + " = " + z);
			} catch (Exception e) {
				System.out.println("���� �߻�! : " + e.getMessage());
			}

		} else {
			System.out.println("�ֿܼ� �����͸� �Է��ϼ���-!");
		}

		System.out.println("main�Լ� ����! -");

	}

}
