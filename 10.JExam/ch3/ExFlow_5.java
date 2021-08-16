//package
package a.b.c.ch3;
//import


public class ExFlow_5
{
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n메인함수 시작------------------------------------\n");
		int ranking = 1;
		char medalColor = '\u0000'; // 또는 ' ';로 초기화
		switch (ranking)
		{
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default:
					medalColor = 'A';
		}

		System.out.println(ranking + "등 메달 색은" + medalColor + "입니다.");
		System.out.println("\n-------------------------------------------\n");
		ranking = 3;
		String mColor = ""; // 또는 "null";로 초기화

		switch (ranking)
		{
			case 1: mColor = "금메달";
					break;
			case 2: mColor = "은메달";
					break;
			case 3: mColor = "동메달";
					break;
			default:
					mColor = "참가에 의의를 두세요";
		}

		System.out.println(ranking + "등 메달 색은" + mColor + "입니다.");
		System.out.println("\n-------------------------------------------\n");
		String medal = "GOLD";
		switch (medal)
		{
			case "GOLD": 
					System.out.println("금메달입니다.");
					break;
			case "SILVER": 
					System.out.println("은메달입니다.");
					break;
			case "BRONZE": 
					System.out.println("동메달입니다.");
					break;
			default:
					System.out.println("노메달입니다.");
					break;
		}
		System.out.println("\n-------------------------------------------");
		System.out.println("\n메인함수 종료------------------------------------\n");}
}
