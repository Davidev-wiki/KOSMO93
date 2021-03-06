package a.b.c.ch6;

public class Ex_invoke_1 {

	public Ex_invoke_1() {
		System.out.println("Ex_Invoke_1() 생성자 >>> : ");
	}

	public int aM() {
		System.out.println(" aM 함수 시작!");
		System.out.println(" aM 함수 진행중");
		// aM()함수 블럭에서 bM()함수를 호출한다. (invoke)
		int sum = bM();
		System.out.println("aM() sum : " + sum);
		System.out.println(" aM 함수 종료-");

		return sum;
	}

	public int bM() {
		System.out.println(" bM 함수 시작!");
		System.out.println(" bM 함수 진행중");
		// bM()함수 블럭에서 cM()함수를 호출한다. (invoke)
		int sum = cM();
		System.out.println("bM() sum : " + sum);
		System.out.println(" bM 함수 종료-");

		return sum;
	}

	public int cM() {
		System.out.println(" cM 함수 시작!");
		System.out.println(" cM 함수 진행중");
		// cM()함수 블럭에서 dM()함수를 호출한다. (invoke)
		int sum = dM();
		System.out.println("cM() sum : " + sum);
		System.out.println(" cM 함수 종료-");

		return sum;
	}

	public int dM() {
		System.out.println(" dM 함수 시작!");
		System.out.println(" dM 함수 진행중");
		int sum = 1 / 0;
		System.out.println("dM() sum : " + sum);
		System.out.println(" dM 함수 종료-");

		return sum;
	}

	// main() 함수가 있으면 콘솔 어플리케이션이라고 부른다.
	// 콘솔 어플리케이션에서 함수의 시작점은 main() 함수 이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_1 :: main() 함수 시작 : ");
		System.out.println("Ex_Invoke_1 :: main() 함수 첫 라인 부터 인터프리트 방식으로 수행 된다. : ");

		// 사용자 정의 클래스 참조변수 사용하기
		Ex_invoke_1 exi = new Ex_invoke_1();
		System.out.println("exi 주소값 : " + exi);

		// 메인함수 블럭에서 참조변수 exi 로 aM()를 호출한다. invoke 한다.
		int sum = exi.aM();
		System.out.println("main함수에서 호출한 sum의 값  : " + sum);
		
		System.out.println("프로그램 호출 순서 : Main() -> aM() -> bm() -> cM() -> dM() -> cM() -> bM() -> aM() -> Main()");
		
	}
}

