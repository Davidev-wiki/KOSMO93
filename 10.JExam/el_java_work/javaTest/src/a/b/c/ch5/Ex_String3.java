package a.b.c.ch5;

public class Ex_String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s0 = 1 + "";
		String s1 = String.valueOf(1);
		String s2 = Integer.toString(1);
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);

		
		
		int i0 = Integer.parseInt("1");
		System.out.println(i0);

		String sval[] = {"010","1111","2222"};
		
		int sval0 = Integer.parseInt(sval[0]);
		int sval1 = Integer.parseInt(sval[1]);
		int sval2 = Integer.parseInt(sval[2]);
		
		System.out.println(sval0);
		System.out.println(sval1);
		System.out.println(sval2);

		
		for (int i=0; i < sval.length; i++) {
			int iv = Integer.parseInt(sval[i]);
			System.out.println("iv ÀÇ °ª : " + iv);
		}
	}

}
