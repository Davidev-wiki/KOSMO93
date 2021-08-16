package a.b.c.ch5.copy;

import java.util.ArrayList;
import java.util.HashMap;

public class Ex_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList aList = new ArrayList();
		System.out.println("aList의 값 : " + aList);
		System.out.println("aList의 HashCode 값 : " + System.identityHashCode(aList));

		System.out.println("\n---------------------------------\n");

		HashMap hp = new HashMap();
		System.out.println("hp의 값 : " + hp);
		System.out.println("hp의 HashCode 값 : " + System.identityHashCode(hp));

		System.out.println("\n---------------------------------\n");

		// key가 같으면 '덮어쓰기' 가 되므로 손실에 주의. (stack 구조?)
		hp.put("키", "밸류"); //밸류 : String
		System.out.println("hp : " + hp);

		hp.put("이름", "장수옥"); //밸류 : String
		System.out.println("hp : " + hp);

		hp.put("나이", 29); //밸류 : Integer
		System.out.println("hp : " + hp);

		hp.put("나이", 4); //밸류 : Integer
		System.out.println("hp : " + hp);

		hp.put("레벨", 50); //밸류 : Integer
		System.out.println("hp : " + hp);

		hp.put('이', 25); //밸류 : Integer
		System.out.println("");
		
		hp.put('이', 21); //밸류 : Integer
		System.out.println("");
		
		
		System.out.println(hp.size());

		// HashMap 데이터 꺼내오는 방법 : 형변환 : object : String s0 = hp.get("이름"); 불가

		// Object를 String타입으로 형 변환 하는 5가지 방법 (형 변환 후 데이터를 꺼냄)
		Object obj0_1 = hp.get("레벨");
		Integer s0_1 = (Integer) hp.get("레벨");
		String s1_1 = hp.get("레벨").toString();
		String s2_1 = String.valueOf(hp.get("레벨"));
		String s3_1 = hp.get("레벨") + "";

		System.out.print("\nobj0_1 : " + obj0_1);
		System.out.print(",  s0 : " + s0_1);
		System.out.print(",  s1 : " + s1_1);
		System.out.print(",  s2 : " + s2_1);
		System.out.println(",  s3 : " + s3_1);

		// 이름
		Object obj0_2 = hp.get("이름");
		String s0_2 = (String) hp.get("이름");
		String s1_2 = hp.get("이름").toString();
		String s2_2 = String.valueOf(hp.get("이름"));
		String s3_2 = hp.get("이름") + "";

		System.out.print("\nobj0_2 : " + obj0_2);
		System.out.print(",  s0 : " + s0_2);
		System.out.print(",  s1 : " + s1_2);
		System.out.print(",  s2 : " + s2_2);
		System.out.println(",  s3 : " + s3_2);

		// 나이를 Integer로
		Object obj0_3 = hp.get("나이");
		Integer s0_3 = (Integer) obj0_3;
		String s1_3 = hp.get("나이").toString();
		String s2_3 = String.valueOf(hp.get("나이"));
		String s3_3 = hp.get("나이") + "";
		System.out.println("obj0_3 >>> : " + obj0_3);
		System.out.println("s0_3 >>> : " + s0_3);
		System.out.println("s1_3 >>> : " + s1_3);
		System.out.println("s2_3 >>> : " + s2_3);
		System.out.println("s3_3 >>> : " + s3_3);

		// '이'를 Integer로
		Object obj0_4 = hp.get('이');
		Integer s0_4 = (Integer) obj0_4;
		String s1_4 = hp.get('이').toString();
		String s2_4 = String.valueOf(hp.get('이'));
		String s3_4 = hp.get('이') + "";
		System.out.println("obj0_4 >>> : " + obj0_4);
		System.out.println("s0_4 >>> : " + s0_4);
		System.out.println("s1_4 >>> : " + s1_4);
		System.out.println("s2_4 >>> : " + s2_4);
		System.out.println("s3_4 >>> : " + s3_4);
		
	}

}
