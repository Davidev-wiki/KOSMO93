//package
package a.b.c.ch3;
//import


public class ExArray_3 {
	//상수
	//멤버변수
	//생성자
	
	//함수

	// main() 함수 : 프로그램 시작점
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
	
		int [][] arr = {{1, 2, 3}, {4, 5, 6}};

		for (int i=0; i < arr.length; i++)
		{
			System.out.println("arr["+i+"]의 값(저장된 주소) : "+ arr[i]);
			for (int j=0; j < arr[i].length; j++)
			{
				System.out.println("arr["+i+"]["+j+"]의 값(저장된 주소) : " + arr[i][j]);
			}
		}

		//행열 매트릭스화 하기

		
		for (int i=0; i < arr.length; i++)
		{
			for (int j=0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
