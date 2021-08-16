package a.b.c.ch6;

public class Ex_Exception_4 {

	public Ex_Exception_4() {

	}

	public void aM() throws Exception {
		System.out.println("\n---aM() 시작!");
		System.out.println("aM()실행중...");
		bM();
		System.out.println("---aM() 끝!\n");
	}

	public void bM() throws Exception {
		System.out.println("\n---bM() 시작!");
		System.out.println("bM()실행중...");

		int[] iVal = new int[5];

		// 에러 발생 포인트 i <= iVal.length 배열의 길이보다 더 많이 시도 => ArrayIndexOutOfBoundsException
		for (int i = 0; i < iVal.length; i++) {
			System.out.println("\niVal 배열의 " + i + "번째 값은 " + iVal[i] + "이다!");
		}

		String msg = cM();
		System.out.println("bM() 의 msg는 cM()의 리턴값을 가리킨다. : " + msg);

		System.out.println("---bM() 끝!\n");
	}

	public String cM() throws Exception {
		System.out.println("\n---cM() 시작!");
		System.out.println("cM()실행중...");

		String msg = dM();
		System.out.println("cM() 의 msg는dM()의 리턴값을 가리킨다. : " + msg);

		System.out.println("---cM() 끝!\n");

		return "여기는 cM() 함수인데 예외 테스트 중임;";
	}

	public String dM() throws Exception {
		System.out.println("\n---dM() 시작!");
		System.out.println("dM()실행중...");

		int x = 1;
		int y = 0;
		// 에러 발생 포인트 1/0 => ArithmeticException
		int z = x / y;

		System.out.println("z의 값 : " + z);
		System.out.println("---dM() 끝!\n");

		return "여기는 dM() 함수인데 예외 테스트 중임;";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main()함수 시작!-");

		try {
			Ex_Exception_4 ex4 = new Ex_Exception_4();
			System.out.println("ex4의 값 : " + ex4);
			ex4.aM();
		} catch (Exception e) {
			System.out.println("Exception 에러가 발생했네요.. : " + e.getMessage());

		} finally {
			System.out.println("그래도 할건 해야죠..");
		}

	}

}
