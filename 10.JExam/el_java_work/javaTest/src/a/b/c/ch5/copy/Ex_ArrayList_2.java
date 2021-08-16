package a.b.c.ch5.copy;

import java.util.ArrayList;

import a.b.c.TestVO;

public class Ex_ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n제너릭 : <String> 리스트 내에는 String만 허용----------------------------------------------\n");

		// 제너릭 : String 모든 데이터 타입을 String으로 통일
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("오재영");
		System.out.println("aList.add(\"add\"); 이후 aList의 값 : " + aList);
		aList.add("25");
		System.out.println("aList.add(25); 이후 aList의 값 : " + aList);
		aList.add("2021-07-21");
		System.out.println("aList.add(\"2021-07-21\")이후 aList의 값 : " + aList);
		System.out.println("aList의 사이즈 : " + aList.size());

		System.out.println("\n----------------------------------------------\n");

		// for 반복문을 이용해 출력하기 get()함수 이용하기.
		for (int i = 0; i < aList.size(); i++) {
			System.out.println("aList의 " + i + "번 째 값 : " + aList.get(i));
		}

		System.out.println("\n제너릭 : <Integer> 리스트 내에는 Integer만 허용----------------------------------------------\n");

		// 제너릭 : Integer 모든 데이터 타입을 Integer로 통일
		ArrayList<Integer> al0 = new ArrayList<Integer>();
		al0.add(1);
		System.out.println("al0.add(1) 이후 al0 의 값 : " + al0);
		al0.add(new Integer(100));
		System.out.println("al0.add(new Integer(100)) 이후 al0 의 값 : " + al0);
		System.out.println("al0의 사이즈 : " + al0.size());

		System.out.println("\n----------------------------------------------\n");

		// for 반복문을 이용해 출력하기 get()함수 이용하기.
		for (int i = 0; i < al0.size(); i++) {
			System.out.println("al0의 " + i + "번 째 값 : " + al0.get(i));
		}

		System.out.println("\n제너릭 : <참조변수> 리스트 내에는 참조변수만 허용----------------------------------------------\n");

		// 제너릭 : 사용자정의 클래스 모든 데이터 타입을 참조변수로 통일
		ArrayList<TestVO> al1 = new ArrayList<TestVO>();
		al1.add(new TestVO("넘버1", "아이디1", "비번1", "핸펀1", "주소1"));
		System.out.println("al1.add(new TestVO())이후 al1의 값 : " + al1);

		al1.add(new TestVO("넘버2", "아이디2", "비번2", "핸펀2", "주소2"));
		System.out.println("al1.add(new TestVO())이후 al1의 값 : " + al1);

		al1.add(new TestVO("넘버3", "아이디3", "비번3", "핸펀3", "주소3"));
		System.out.println("al1.add(new TestVO())이후 al1의 값 : " + al1);

		System.out.println("al1의 사이즈 : " + al1.size());

		System.out.println("\n----------------------------------------------\n");

		// for 반복문을 이용해 출력하기 get()함수 이용하기.
		// 값을 메모리에 하나씩 저장하기 위해서 공간을 생성함 (객체 만들기) 그 공간에 이전에 아규먼트를 넣어 만든 객체를 담는다. 
		for (int i = 0; i < al1.size(); i++) {

			TestVO tvo = al1.get(i);

			System.out.println("tvo.getMnum()으로 가져온 넘버 : " + tvo.getMnum());
			System.out.println("tvo.getMid()으로 가져온 아이디 : " + tvo.getMnum());
			System.out.println("tvo.getMpw()으로 가져온 비번 : " + tvo.getMpw());
			System.out.println("tvo.getMhp()으로 가져온 핸드폰번호 : " + tvo.getMhp());
			System.out.println("tvo.getMaddr()으로 가져온 주소 : " + tvo.getMaddr());

			System.out.println("\n");
		}

		System.out.println("\n----------------------------------------------\n");

	}

}