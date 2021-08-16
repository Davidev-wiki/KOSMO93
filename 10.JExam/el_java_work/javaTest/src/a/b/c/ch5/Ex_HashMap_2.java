package a.b.c.ch5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex_HashMap_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 해시맵 만들기 : 키 = String타입, 밸류 = String타입
		HashMap<String, String> hm = new HashMap<String, String>();

		// 해시맵에 데이터 저장 {이름 : 이근희, 나이 : 27, 주소 : 고양시 일산}
		hm.put("이름", "이근희");
		hm.put("나이", "27");
		hm.put("주소", "고양시 일산");

		// 해시맵의 데이터 가져와 변수에 저장
		String name = hm.get("이름");
		String age = hm.get("나이");
		String addr = hm.get("주소");

		// 콘솔에 각 변수 출력
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);

		// 정렬(sort) 함수?
		System.out.println("\n=====================================\n");

		System.out.println("hm.keySet()함수는  [key] 만 나열해준다. : " + hm.keySet());
		System.out.println("hm.values()함수는  [value] 만 나열해준다. : " + hm.values());
		System.out.println("hm.entrySet()함수는  [key : value] 형태로 나열해준다. : " + hm.entrySet());

		System.out.println("\n=====================================\n");

		// Itorator() 등장
		Iterator<String> keys = hm.keySet().iterator();

		// hasNext() 함수 : '커서' 함수라고 한다.
		while (keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println("Itorator : " + key + " : " + value);
		}
		System.out.println();

		// 향상된 for문이다.
		for (String key1 : hm.keySet()) {
			String value1 = hm.get(key1);
			System.out.println("keySet() : " + key1 + " : " + value1);
		}
		System.out.println();

		// entrySet()
		for (Map.Entry<String, String> entry : hm.entrySet()) {
			System.out.println("entrySet() : " + entry.getKey() + " : " + entry.getValue());
		}

	}

}
