package a.b.c.ch6;

public class Ex_Math_5 {

	public static int max(int x, int y, int z) {
		int max = x;
		
		if (y >= max) {
			max = y;
		}
		if (z >= max) {
			max = z;
		}
		return max;
	}
	
	public static int min(int x, int y, int z) {
		int min = x;
		
		if (y <= min) {
			min = y;
		}
		if (z <= min) {
			min = z;
		}
		return min;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = Ex_Math_5.max(11, 2, 3);
		System.out.println("max : " + max);
		
		int min = Ex_Math_5.min(11, 2, 3);
		System.out.println("min : " + min);
		
	}

}
