//package

//import
import a.b.c.ch5.EtVO;

public class ET_1{
	//상수
	//멤버변수
	//생성자
	public ET_1(){
		System.out.println("지금 메모리에 올라갔습니다 ^^");
	}
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
	
		System.out.println("일반 호출");

		System.out.println(ET_1());

		System.out.println("객체 사용해서 호출");
		ET_1 et_1 = new ET_1();
		System.out.println(et_1);

		EtVO etvo = new EtVO();
		System.out.println(etvo);
	}
}
