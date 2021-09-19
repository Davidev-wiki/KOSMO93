package aaa.bbb.ccc;

public class CImpl implements C {    //하나의 자바파일 예제이므로 public이 생략되어있음.	
	
	@Override
	public void c(){
		System.out.println("\nCImpl.c() 함수 시작 >>> ");
		System.out.println("c() >>> : ");
		System.out.println("CImpl.c() 함수 끝 >>> \n");
	}

	@Override
	public void c_1(){
		System.out.println("\nCImpl.c_1() 함수 시작 >>> ");
		System.out.println("c_1() >>> : ");
		System.out.println("CImpl.c_1() 함수 끝 >>> \n");
	}

	@Override
	public int c_2(){
		System.out.println("\nCImpl.c_2() 함수 시작 >>> ");
		System.out.println("c_2() >>> : ");
		System.out.println("CImpl.c_2() 함수 끝 >>> \n");
		return 0;
	}

	@Override
	public boolean c_3(){
		System.out.println("\nCImpl.c()_3 함수 시작 >>> ");
		System.out.println("c_3() >>> : ");
		System.out.println("CImpl.c()_3 함수 끝 >>> \n");
		return false;
	}
}