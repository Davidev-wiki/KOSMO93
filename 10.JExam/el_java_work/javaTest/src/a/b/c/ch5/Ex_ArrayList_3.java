package a.b.c.ch5;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.TestVO;

public class Ex_ArrayList_3 {
// arrayList 마지막 예제
// 데이터베이스에서 값을 조회해서 가져오는 연습이 포함된 예제.
// 지역변수는 객체 또는 기초자료형도 특별한 경우가 아닌이상 default 값으로 초기화해서 사용해야 한다.(상세 설명은 추후에)
// 약 4달 후 능숙해져야 할 최종 목표 프로그램의 형태

	// 리턴 타입 : TestVO타입
	public ArrayList<TestVO> memSelect() {

		// 'aList'라는 이름의 빈 리스트를 생성
		ArrayList<TestVO> aList = new ArrayList<TestVO>();

		// 3개의 데이터 임의로 세팅 (각각의 객체로)
		for (int i = 0; i < 3; i++) {

			TestVO tvo = new TestVO();

			tvo.setMnum("num_" + i);
			tvo.setMid("id_" + i);
			tvo.setMpw("pw_" + i);
			tvo.setMhp("hp_" + i);
			tvo.setMaddr("addr_" + i);

			// aList 에 만든 고객데이터 세팅한 객체를 추가
			aList.add(tvo);

			System.out.println("\n고객 데이터가 추가되었습니다!");
			System.out.println(aList);
		}

		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n 메인 함수 시작----");
		System.out.print("\n조회 키워드를 입력하세요  : [S] 조건조회 , [SALL] 전체 조회 ");

		// 사용자 입력 값 받는 기능 구현
		Scanner sc = new Scanner(System.in);
		String isud = sc.next();

		// 사용자 입력값 제한
		isud = isud.toUpperCase();

		// 사용자 입력값 필터링
		if ("S".equals(isud)) {
			System.out.println("사용자의 입력 값 isud : " + isud);
		}
		if ("SALL".equals(isud)) {
			System.out.println("사용자의 입력 값 isud : " + isud);

			Ex_ArrayList_3 ex3 = new Ex_ArrayList_3();

			// memSelect()함수 : *리스트를 리턴한다. (*리스트: 빈 리스트에 객체 3개가 담긴. 각각의 객체에 고객의 데이터가 들어가
			// 있다.)

			ArrayList<TestVO> aList = ex3.memSelect();

			System.out.println("\naList.size : " + aList.size());
			System.out.println("aList의 값 : " + aList);

			// 고객 데이터 리스트 풀기
			if (aList.size() > 0) {
				// 객체를 만들어 하나씩 담기
				for (int i = 0; i < aList.size(); i++) {
					TestVO tvo = aList.get(i);

					System.out.print(tvo.getMnum());
					System.out.print(tvo.getMid());
					System.out.print(tvo.getMpw());
					System.out.print(tvo.getMhp());
					System.out.println(tvo.getMaddr());

				}
			}

		}

	}

}
