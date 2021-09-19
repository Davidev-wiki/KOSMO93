//package
package a.b.c.ch3;
//import


public class ExFlow_8_3
{

	public static void main(String[] args) {
		//TODO Auto-generated method stub.

		for(int i = 1 ; i <= 9 ; i++) { 
			System.out.println("구구단을 외자! " + i + "단");
			for(int j = 1 ; j <= 9 ; j++){
				System.out.println("(" + i +" x "+ j + ") = " + (i*j));
			}
			System.out.println("\n");
		}

			for(int i = 1 ; i <= 10 ; i++) { 
				System.out.println("");
				for(int j = 1 ; j <= 10 ; j++){
					System.out.print("*");
			}
		}
		System.out.println("");
	}
}
