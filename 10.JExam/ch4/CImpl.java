package aaa.bbb.ccc;

public class CImpl implements C {    //�ϳ��� �ڹ����� �����̹Ƿ� public�� �����Ǿ�����.	
	
	@Override
	public void c(){
		System.out.println("\nCImpl.c() �Լ� ���� >>> ");
		System.out.println("c() >>> : ");
		System.out.println("CImpl.c() �Լ� �� >>> \n");
	}

	@Override
	public void c_1(){
		System.out.println("\nCImpl.c_1() �Լ� ���� >>> ");
		System.out.println("c_1() >>> : ");
		System.out.println("CImpl.c_1() �Լ� �� >>> \n");
	}

	@Override
	public int c_2(){
		System.out.println("\nCImpl.c_2() �Լ� ���� >>> ");
		System.out.println("c_2() >>> : ");
		System.out.println("CImpl.c_2() �Լ� �� >>> \n");
		return 0;
	}

	@Override
	public boolean c_3(){
		System.out.println("\nCImpl.c()_3 �Լ� ���� >>> ");
		System.out.println("c_3() >>> : ");
		System.out.println("CImpl.c()_3 �Լ� �� >>> \n");
		return false;
	}
}