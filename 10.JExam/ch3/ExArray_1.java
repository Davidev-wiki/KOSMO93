//package
package a.b.c.ch3;
//import


public class ExArray_1
{

	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		System.out.println("\n---------------------------------------------------------------------------");
		int[] i = new int[3];
		System.out.println("int형 일차원 배열의 참조변수 i의 JVM의 주소값 : " + i);
		System.out.println("int형 일차원 배열의 참조변수 i의 CPU의 주소값 : " + System.identityHashCode(i));
		System.out.println("\n배열에 있는 요소의 값을 참조하는 방법.\n");
		System.out.println("int형 1차원 배열타입 참조변수 i의 첫 번째 요소의 값을 참조하기 i[0] : " + i[0]);
		System.out.println("int형 1차원 배열타입 참조변수 i의 첫 번째 요소의 값을 참조하기 i[1] : " + i[1]);
		System.out.println("int형 1차원 배열타입 참조변수 i의 첫 번째 요소의 값을 참조하기 i[2] : " + i[2]);
		
		System.out.println("\n---------------------------------------------------------------------------");
		//length 필드로 배열의 길이 알아보기
		int iLen = i.length;
		System.out.println("배열의 길이는 배열의 참조변수.length필드 사용 : 요소개수 -1 : " + iLen);
		System.out.println("\n---------------------------------------------------------------------------");
		//1차원 배열을 배열의 길이를 이용해서 for문으로 배열 요소 조회하기.
		for (int j = 0; j < iLen ; j++)
		{
			System.out.println("배열의 요소 순서인 j의 값 : " + j + ",  i의 j번째 배열은 i[j] : " + i[j]);
		}
		
		System.out.println("\n---------------------------------------------------------------------------");
		
		System.out.println("\ni[0], i[1], i[2]값에 각각 11, 12, 13을 초기화\n");
		
		i[0] = 11;
		i[1] = 12;
		i[2] = 13;

		for (int j = 0; j < iLen ; j++)
		{
			System.out.println("배열의 요소 순서인 j의 값 : " + j + ",  i의 j번째 배열은 i[j] : " + i[j]);
		}
		System.out.println("\n---------------------------------------------------------------------------");

		System.out.println("\n int[] ii = new int[] {1, 2, 3}; 배열 선언과 동시에 초기화!\n");
		System.out.println("---------------------------------------------------------------------------");
		int[] ii = new int[] {1, 2, 3};
		System.out.println("int형 일차원 배열의 참조변수 ii의 JVM의 주소값 : " + ii);
		for (int j=0;j<ii.length; j++)
		{
			System.out.println("ii[j]를 배열 순서대로 출력 : " + ii[j]);
		}

		System.out.println("\n int[] iii = {1, 2, 3}; 배열 선언과 동시에 초기화하는데 new int[] 생략하는 방법\n");
		System.out.println("---------------------------------------------------------------------------");
		int iii[] = {1, 2, 3};
		System.out.println("int형 일차원 배열의 참조변수 iii의 JVM의 주소값 : " + iii);
		for (int j=0;j<iii.length; j++)
		{
			System.out.println("iii[j]를 배열 순서대로 출력 : " + iii[j]);
		}

		System.out.println("\n---------------------------------------------------------------프로그램 종료\n");
	}
}
