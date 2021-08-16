package a.b.c.ch6;

public class Ex_String {

	String orginFileName = "Hello.java";

	public void strIndexOf() {
		
		
		String fullName = "Hello.java";
		int index = fullName.indexOf('.');
		int index1 = fullName.indexOf(".");
		
		String fileName = fullName.substring(0, index);
		System.out.println("fileName : " + fileName);
		
		String extenstions = fullName.substring(index+1);
		System.out.println("extenstions : " + extenstions);
		
		
	}

	public void strLastIndexOf() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		public String substring(int beginIndex)
//		public String substring(int beginIndex, int endIndex)
		/*
		 * "unhappy".substring(2) returns "happy" "Harbison".substring(3) returns
		 * "bison" "emptiness".substring(9) returns "" (an empty string)
		 * "hamburger".substring(4, 8) returns "urge" "smiles".substring(1, 5) returns
		 * "mile"
		 */
		/*
		 * index = length() -1 length() = index + 1 0 1 2 3 4 5 6 u n h a p p y u =
		 * s0.charAt(0) n = s0.charAt(1) h = s0.charAt(2) a = s0.charAt(3) p =
		 * s0.charAt(4) p = s0.charAt(5) y = s0.charAt(6)
		 */

		/*
		System.out.println("\n---------- API 예제 ----------\n");

		System.out.println("[예제 문자 : unhappy]");
		String s0 = "unhappy";
		System.out.println("s0.length() : " + s0.length());
		System.out.println("s0.charAt(2) : " + s0.charAt(2));
		String s01 = s0.substring(2);
		System.out.println("s0.charAt(2) :: s0.substring(2) >>> : " + s01);

		System.out.println("\n[예제 문자 : Harbison]");
		String s1 = "Harbison";
		System.out.println("s1.length() >>> : " + s1.length());
		System.out.println("s1.charAt(3) >>> : " + s1.charAt(3));
		String s11 = s1.substring(3);
		System.out.println("s1.charAt(3) :: s0.substring(3) >>> : " + s11);

		try {
			System.out.println("\n[예제 문자 : emptiness]");
			String s2 = "emptiness";
			System.out.println("s2.length() >>> : " + s2.length());
			System.out.println("s2.charAt(3) >>> : " + s2.charAt(9));
			String s22 = s2.substring(3);
			System.out.println("s2.charAt(3) :: s2.substring(3) >>> : " + s22);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("\n[예제 문자 : hamburger]");
		String s3 = "hamburger";
		System.out.println("s3.length() >>> : " + s3.length());
		System.out.println("s3.charAt(4) >>> : " + s3.charAt(4));
		System.out.println("s3.charAt(8) >>> : " + s3.charAt(8));
		String s33 = s3.substring(4, 8);
		System.out.println("s1.substring(4, 8) >>> : " + s33);

		System.out.println("\n[예제 문자 : smiles]");
		String s4 = "smiles";
		System.out.println("s4.length() >>> : " + s4.length());
		System.out.println("s4.charAt(1) >>> : " + s4.charAt(1));
		System.out.println("s4.charAt(5) >>> : " + s4.charAt(5));
		String s44 = s4.substring(1, 5);
		System.out.println("s4.substring(1, 5) >>> : " + s44);


		*/

		Ex_String exs = new Ex_String();
		exs.strIndexOf();
		exs.strLastIndexOf();
		 
	}

}
