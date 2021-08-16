package a.b.c;

public class HelloClass {

	public HelloClass(){
		System.out.println(1);
	}
	
	public HelloClass(int x) {
		System.out.println(1 + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("abc");
		
		int x = 1;
		HelloClass hc = new //(HelloClass) HelloClass();
		HelloClass hc1 = new //(HelloClass) HelloClass(x);
	
		
		//TestVO tvo = new TestVO();

		//String sss = tvo.maddr;
		//System.out.println(sss);
		//System.out.println(tvo);
		
		
		
		
		// new String("abc"); == "abc"
		// new TestVO("a", "b") == "a", "b" 
	}
}
