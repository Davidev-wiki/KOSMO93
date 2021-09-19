package a.b.c.ch6;

public class Ex_Invoke {

	public void aM() {
		System.out.println(" aM 함수 시작!");
		System.out.println(" aM 함수 진행중");
		// aM()함수 블럭에서 bM()함수를 호출한다. (invoke)
		bM();
		System.out.println(" aM 함수 종료-");
	}

	public void bM() {
		System.out.println(" bM 함수 시작!");
		System.out.println(" bM 함수 진행중");
		// bM()함수 블럭에서 cM()함수를 호출한다. (invoke)
		cM();
		System.out.println(" bM 함수 종료-");
	}

	public void cM() {
		System.out.println(" cM 함수 시작!");
		System.out.println(" cM 함수 진행중");
		// cM()함수 블럭에서 dM()함수를 호출한다. (invoke)
		dM();
		System.out.println(" cM 함수 종료-");
	}

	public void dM() {
		System.out.println(" dM 함수 시작!");
		System.out.println(" dM 함수 진행중");

		System.out.println(" dM 함수 종료-");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke 클래스 main() 함수 시작!");
		System.out.println("Ex_Invoke 클래스 main() 함수 첫 라인부터 인터프리트 방식으로 수행된다.");

		// 사용자 정의 클래스 참조변수 사용하기
		Ex_Invoke exi = new Ex_Invoke();
		System.out.println("exi의 주소값 : " + exi);

		// 메인 함수 블럭에서 참조변수 exi로 aM()함수를 호출한다. invoke한다.
		exi.aM();

	}

}
