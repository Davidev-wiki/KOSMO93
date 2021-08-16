//package
package a.b.c.ch5;
//import
import java.util.Scanner;
import a.b.c.ch5.EtVO;

public class Et
{
	//상수
	//멤버변수
	//생성자
	
	//함수 기능
	// 고객 정보 입력
	// 고객 정보 선택
	public void getInformation(EtVO etvo){
		String getVal = etvo.getInfo();
		System.out.println("고객님의 정보는 "+ getVal +" 입니다.");
	}
	// 고객 정보 수정
	// 고객 정보 삭제

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		//회원 정보를 넣어두는 깡통 클래스 만들고 정보 저장
		//회원 정보

		//입력 받을 정보 : 한국의 회원 이름, 나이, 연락처, 주소
		String kname = "";
		int kage = 0;
		String khp = "";
		String kaddress = "";
		
		System.out.println("입력한 값 : " + args[0]);
		if (1 == args.length)
		{	
			String isud = "";
			System.out.println("\n>> 무슨 일을 하고 싶어요?  [i] : 가입시작  [s] : 정보조회  [u] : 정보수정  [d] : 회원정보삭제  >> : ");

			Scanner sc = new Scanner(System.in);
			isud = sc.next();
			// <if -> if : 입력 값이 i 인 경우 로직>
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println(" - 곧 회원가입이 절차가 시작됩니다! - ");
			}
			// <if -> if : 입력 값이 s 인 경우 로직>
			if ("S".equals(isud.toUpperCase()))
			{
				System.out.println(" - 곧 회원정보 조회가 시작됩니다! - ");
				//<To do insert : 깡통 클래스에서 정보 가져오는 함수>
				System.out.println("회원 이름을 입력해주세요. : ");
				kname = sc.next();
				EtVO etvo = new EtVO();
				etvo.setInfo(kname); 
				
				Et et = new Et();
				et.getInformation(etvo);
			}
			// <if -> if : 입력 값이 u 인 경우 로직>
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println(" - 곧 회원정보 수정이 시작됩니다! - ");
			}
			// <if -> if : 입력 값이 d 인 경우 로직>
			if ("D".equals(isud.toUpperCase()))
			{
				System.out.println(" - 곧 회원정보 삭제가 시작됩니다! - ");
			}
		}else {
			System.out.println("쫌 많이 입력했네.. 한 개만 써줘..");
		}
		/*
		if (0 < args.length < 5)
		{
			String uival = args[0]
			if ("")
			{
			}
			Scanner sc = new Scanner();
			String uival = sc.next();
			if (uival == )
			{
			}
		}else{
			System.out.println("제대로 쓴거냐?");
		}
		
		*/
	}
}
