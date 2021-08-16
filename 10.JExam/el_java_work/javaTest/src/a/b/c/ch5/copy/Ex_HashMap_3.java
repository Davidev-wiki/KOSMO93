package a.b.c.ch5.copy;

import java.util.HashMap;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Ex_HashMap_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// {} 해시맵 생성 key, value 모두 String으로.
		HashMap<String, String> hm = new HashMap<String, String>();
		
		// 데이터 저장
		hm.put("이름", "오재영");
		hm.put("나이", "25");
		hm.put("주소", "의정부 호원동");
		
		
		// 데이터 가져와서 변수에 담기
		String name = hm.get("이름");
		String age = hm.get("나이");
		String addr = hm.get("주소");
		
		
		// 콘솔에 출력하기
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("addr : " + addr);
		
		
		System.out.println("\n=====================================\n");

		System.out.println("hm.keySet()함수는  [key] 만 나열해준다. : " + hm.keySet());
		System.out.println("hm.values()함수는  [value] 만 나열해준다. : " + hm.values());
		System.out.println("hm.entrySet()함수는  [key : value] 형태로 나열해준다. : " + hm.entrySet());

		System.out.println("\n=====================================\n");
		
		
		// iterator() 가 뭐하는 함수??
		/*
			hm.keySet() : 이름, 나이, 주소 가 배열로 있음 
			.iterator() : hm.keySet() 함수에서 리턴한 [이름, 나이, 주소] 데이터를 Iterator keys 참조변수에 대입한다.
		                                    다른 말로 Iterator keys 참조변수가 hm.keySet() 함수에서 리턴한 [이름, 나이, 주소] 데이터를 가르킨다.
		*/		
		Iterator keys = hm.keySet().iterator();
		
		
		// Iterator 참조변수 keys를 이용, 이터레이터에 들어있는 데이터를 hasNext()함수로 확인하기
		// iterator타입 keys변수에 next()함수로 입력값을 받은 것을 String타입 key에 저장 
		while (keys.hasNext()) {
			String key = (String)keys.next();
			String value = "";
			
			if("이름".equals(key)) {
				value = (String)hm.get(key);
			}
			if("나이".equals(key)) {
				value = (String)hm.get(key);
			}
			if("주소".equals(key)) {
				value = (String)hm.get(key);
			}
			System.out.println(key + " : " + value);
		}
		
		
		
		
		
		
		
		
	}

}
