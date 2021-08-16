package a.b.c.ch5;

public class Ex_Math {

	public int addM(int x, int y) {
		return x + y;
	}

	public int subM(int x, int y) {
		return x - y;
	}

	public int mulM(int x, int y) {
		return x * y;
	}

	public int divM(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if (2 == args.length) {
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);

			Ex_Math em = new Ex_Math();
			int sum = em.addM(x, y);
			System.out.println(x + " + " + y + " = " + sum);

			em.subM(x, y);
			int sub = em.subM(x, y);
			System.out.println(x + " - " + y + " = " + sub);

			em.mulM(x, y);
			int mul = em.mulM(x, y);
			System.out.println(x + " * " + y + " = " + mul);

			em.divM(x, y);
			int div = em.divM(x, y);
			System.out.println(x + " / " + y + " = " + div);

		} else {
			System.out.println("2개만 입력해줘..");
		}
	}
}