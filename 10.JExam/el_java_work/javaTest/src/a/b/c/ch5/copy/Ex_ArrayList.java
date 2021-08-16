package a.b.c.ch5.copy;

import java.util.ArrayList;

public class Ex_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList aList = new ArrayList();

		System.out.println("aList.size() : " + aList.size());
		System.out.println("현재 aList의 값 : " + aList);

		aList.add(1);
		System.out.println("aList.add(1); 이후 aList의 값 : " + aList);

		aList.add(new Integer("100"));
		System.out.println("aList.add(new Integer(\"100\")); 이후 aList의 값 : " + aList);

		aList.add("양성휘");
		System.out.println("aList.add(\"양성휘\"); 이후 aList의 값 : " + aList);

		aList.add(new String("이다희"));
		System.out.println("aList.add(new String(\"이다희\")); 이후 aList의 값 : " + aList);

		aList.add('c');
		System.out.println("aList.add('c'); 이후 aList의 값 : " + aList);

		aList.add(false);
		System.out.println("aList.add(false); 이후 aList의 값 : " + aList);

		aList.add(aList);
		System.out.println("aList.add(aList)); 이후 aList의 값 : " + aList);

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); 이후 aList의 값 : " + aList);
		System.out.println("aList.size() : " + aList.size());

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); 이후 aList의 값 : " + aList);
		System.out.println("aList.size() : " + aList.size());

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); 이후 aList의 값 : " + aList);
		System.out.println("aList.size() : " + aList.size());

		aList.add(new a.b.c.TestVO());
		System.out.println("aList.add(new a.b.c.TestVO()); 이후 aList의 값 : " + aList);
		System.out.println("aList.size() : " + aList.size());

		for (int i = 0; i < aList.size(); i++) {
			System.out.println(i + "번 째 출력 : " + aList.get(i));
		}

	}

}
