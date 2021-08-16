package a.b.c.ch6;

public class Ex_Math_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("       제 12345 회  \n");
		System.out.println("-----------------");
		String n0 = "";

		for (int n = 0; n < 5; n++) {

			int lotto[] = new int[6];

			for (int i = 0; i < 6; i++) {

				// (int) 캐스팅 전 Math함수의 타입은 뭐지?
				lotto[i] = (int) (Math.random() * 45) + 1;

				// 동일한 번호가 중복해서 나오지 않도록 설계
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i--;
						break;
					}
				}
			}
			// 1자리 숫자인 경우 앞에 '0'을 붙여주는 서식 만들기
			for (int i = 0; i < lotto.length; i++) {

				n0 = String.valueOf(lotto[i]);

				if (1 == n0.length()) {
					n0 = "0" + n0;
				}
				// 숫자 뒤에 한 칸의 여백 추가
				n0 += " ";
				System.out.print(n0);
			}
			System.out.println();
		}		
		System.out.println("-----------------");
		System.out.println(" 금액     5,000원");

	}

}
