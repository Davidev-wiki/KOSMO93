package a.b.c.ch6;

public class Ex_Math_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("       �� 12345 ȸ  \n");
		System.out.println("-----------------");
		String n0 = "";

		for (int n = 0; n < 5; n++) {

			int lotto[] = new int[6];

			for (int i = 0; i < 6; i++) {

				// (int) ĳ���� �� Math�Լ��� Ÿ���� ����?
				lotto[i] = (int) (Math.random() * 45) + 1;

				// ������ ��ȣ�� �ߺ��ؼ� ������ �ʵ��� ����
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i--;
						break;
					}
				}
			}
			// 1�ڸ� ������ ��� �տ� '0'�� �ٿ��ִ� ���� �����
			for (int i = 0; i < lotto.length; i++) {

				n0 = String.valueOf(lotto[i]);

				if (1 == n0.length()) {
					n0 = "0" + n0;
				}
				// ���� �ڿ� �� ĭ�� ���� �߰�
				n0 += " ";
				System.out.print(n0);
			}
			System.out.println();
		}		
		System.out.println("-----------------");
		System.out.println(" �ݾ�     5,000��");

	}

}
