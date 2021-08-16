package a.b.c.ch5.copy;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ArrayList 객체 만들기
		ArrayList aList = new ArrayList();
		// for 반복문을 이용해 '작업A'를 반복하고 ArrayList에 넣음
		// 작업A : 깡통클래스로 객체를 만들어서 DB를 세팅해서 넣어둠
		for (int i = 0; i < 3; i++) {

			TestVO tvo = new TestVO();

			tvo.setMnum("00_" + i);
			tvo.setMid("ai_" + i);
			tvo.setMpw("ai12_" + i);
			tvo.setMhp("010_" + i);
			tvo.setMaddr("Seoul_" + i);

			aList.add(tvo);
			System.out.println("tvo : " + tvo);
		}
		// ArrayList 의 개수 출력
		System.out.println("aList.size() : " + aList.size());

		// for 반복문으로 ArrayList의 사이즈만큼(안에 있는거 전부 다 get()해서 출력)

		for (int i = 0; i < aList.size(); i++) {
			System.out.println("\naList의 " + i + "번 째에 있는 고객 정보입니다.\n");

			TestVO tvo = (TestVO) aList.get(i);

			System.out.println(" " + tvo.getMnum());
			System.out.println(" " + tvo.getMid());
			System.out.println(" " + tvo.getMpw());
			System.out.println(" " + tvo.getMhp());
			System.out.println(" " + tvo.getMaddr());
		}

		// 제너릭 : Generic : 데이터 타입을 한정 한다(한가지만 사용해야 한다.)
		System.out.println("\n------------------제너릭으로 해보기--------------------\n");

		ArrayList<TestVO> aList1 = new ArrayList<TestVO>();

		for (int i = 0; i < 3; i++) {

			TestVO tvo1 = new TestVO();

			tvo1.setMnum("00_" + i);
			tvo1.setMid("ai_" + i);
			tvo1.setMpw("ai12_" + i);
			tvo1.setMhp("010_" + i);
			tvo1.setMaddr("Seoul_" + i);

			aList1.add(tvo1);

			System.out.println(aList1);

		}
		System.out.println(aList1.size());
		for (int i = 0; i < aList1.size(); i++) {

			System.out.println(i + " >>> : " + aList1.get(i));

			TestVO tvo1 = (TestVO) aList1.get(i);

			System.out.print(" " + tvo1.getMnum());
			System.out.print(" " + tvo1.getMid());
			System.out.print(" " + tvo1.getMpw());
			System.out.print(" " + tvo1.getMhp());
			System.out.println(" " + tvo1.getMaddr());
		}

	}
}
