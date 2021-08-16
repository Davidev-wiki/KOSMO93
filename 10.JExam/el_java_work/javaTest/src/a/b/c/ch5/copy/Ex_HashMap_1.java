package a.b.c.ch5.copy;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex_HashMap_1 {

	public ArrayList hashMap() {

		HashMap hm0 = new HashMap();

		hm0.put("이름", "김바다");
		hm0.put("나이", 29);
		hm0.put("주소", "광명시 소하동");

		HashMap hm1 = new HashMap();

		hm1.put("이름", "윤종서");
		hm1.put("나이", 33);
		hm1.put("주소", "관악구 신림동");

		HashMap hm2 = new HashMap();

		hm2.put("이름", "최현준");
		hm2.put("나이", 29);
		hm2.put("주소", "양천구 신월동");

		ArrayList aList = new ArrayList();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);

		return aList;
	}

	// 제네릭을 사용한 예제 함수

	public ArrayList<HashMap<String, String>> hashMapGeneric() {

		HashMap<String, String> hm0 = new HashMap<String, String>();
		hm0.put("이름", "조준휘");
		hm0.put("나이", "33");
		hm0.put("주소", "부천시 상동");

		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("이름", "전용구");
		hm1.put("나이", "27");
		hm1.put("주소", "금천구 가산동");

		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("이름", "김찬기");
		hm2.put("나이", "34");
		hm2.put("주소", "서울시 양천구");

		ArrayList<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);

		return aList;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// main()함수 시작
		// 자신의 클래스 메모리에 올려 객체로 만듬
		Ex_HashMap_1 ex1 = new Ex_HashMap_1();

		// 함수 실행해서 ArrayList에 넣음
		ArrayList aList = ex1.hashMap();

		// 이때 aList에 들어간 요소의 개수
		System.out.println("aList.size() : " + aList.size());

		// aList에 들어간 요소들 중 '키'가 "이름"인 것 get
		for (int i = 0; i < aList.size(); i++) {

			// ArrayList를 Hash맵 타입에 넣기도 하네
			HashMap hm = (HashMap) aList.get(i);
			Object obj1 = hm.get("이름");
			String name1 = (String) obj1;
			System.out.println("이름 : " + name1);
		}

		// 제네릭 예제 함수 꺼내기

		ArrayList<HashMap<String, String>> aList1 = ex1.hashMapGeneric();
		System.out.println("제네릭 예제 aList1.size() 의 값 : " + aList.size());

		for (int i = 0; i < aList.size(); i++) {

			HashMap<String, String> hm = aList1.get(i);

			String name1 = hm.get("이름");
			String age1 = hm.get("나이");
			String addr1 = hm.get("주소");

			System.out.println(name1 + " : " + age1 + " : " + addr1);

		}

	}

}
