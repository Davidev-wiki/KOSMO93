package a.b.c.ch6;

public class Test {

	public static void main(String[] args) {

		int a[] = new int[10];
		int b[] = new int[10];

		for (int i = 0; i < 3; i++) {
			a[i] = i;
			for (int j = 0; j < 10; j++) {
				b[j] = j;
				System.out.println("(" + a[i] + ", " + b[j] + ")");
			}
		}

	}

}