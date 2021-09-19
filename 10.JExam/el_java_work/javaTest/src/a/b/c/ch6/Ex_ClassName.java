package a.b.c.ch6;

import java.lang.reflect.Method;

public class Ex_ClassName {

	public void aM() {
		System.out.println("Ex_ClassName.aM()함수당");
	}

	public void bM() {
		System.out.println("Ex_ClassName.bM()함수당");
	}

	public void cM() {
		System.out.println("Ex_ClassName.cM()함수당");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자식클래스선언 자식클래스참조변수 선언 = new 자식클래스생성자()선언
		Ex_ClassName cn = new Ex_ClassName();
		System.out.println("cn : " + cn);
		System.out.println("cn.getclass(); 호출! : " + cn.getClass());
		System.out.println("cn.getclass().getName() 호출! : " + cn.getClass().getName());

		Object obj = new Ex_ClassName();
		System.out.println("\n부모클래스 참조변수 = new 자식클래스()생성자 : " + obj);

		// 객체 형변환 reference casting
		System.out.println("\n<Reference Casting>\n");
		Ex_ClassName cn1 = (Ex_ClassName) obj;
		System.out.println("\ncn1 : " + cn1);
		System.out.println("cn1.getClass : " + cn1.getClass());
		System.out.println("cn1.getClass.getName : " + cn1.getClass().getName());
		System.out.println("\n======================================================");

		try {

			Class cc = Class.forName("a.b.c.ch6.Ex_ClassName");
			System.out.println("cc : " + cc);

			Ex_ClassName cc1 = (Ex_ClassName) cc.newInstance();
			System.out.println("cc1 : " + cc1);
			cc1.aM();

			System.out.println("\n ------------------------------------------- \n");

			// 사행성 프로그램, 불법게임or 도박에 쓰이는 코드. 조회, 쓰기 모두 가능. feat.스킬을 뺏어 쓰기
			Method m[] = cc.getDeclaredMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println(" >> " + m[i].toString());

				String findM = m[i].getName();
				System.out.println("m[" + i + "].getName() : " + findM);
			}

			System.out.println("\n ------------------------------------------- \n");

			Class aList = Class.forName("java.util.ArrayList");
			java.util.ArrayList aList1 = (java.util.ArrayList) aList.newInstance();
			System.out.println("aList1 : " + aList);

			Class d = Class.forName("java.util.Date");
			java.util.Date dd = (java.util.Date) d.newInstance();
			System.out.println("dd : " + dd);
		} catch (Exception e) {
			System.out.println("에러 낫슴 e : " + e.getMessage());
		}
		System.out.println("프로그램 끝~!");
	}

}
