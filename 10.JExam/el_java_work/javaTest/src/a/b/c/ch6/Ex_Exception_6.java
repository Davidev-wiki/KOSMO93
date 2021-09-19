package a.b.c.ch6;

public class Ex_Exception_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main함수 시작합니다! -");

		int argsL = args.length;

		if (argsL == 2) {
			String sX = args[0];
			String sY = args[1];
			System.out.println("args의 첫 번째 값 sX : " + sX);
			System.out.println("args의 첫 번째 값 sX : " + sY);

			try {
				int x = Integer.parseInt(sX);
				int y = Integer.parseInt(sY);
				int z = x / y;
				System.out.println(x + " / " + y + " = " + z);
			} catch (Exception e) {
				System.out.println("에러 발생! : " + e.getMessage());
			}

		} else {
			System.out.println("콘솔에 데이터를 입력하세요-!");
		}

		System.out.println("main함수 종료! -");

	}

}
