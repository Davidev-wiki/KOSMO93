
package a.b.c.ch3;

public class ExCast_4 
{

	public static void main(String[] args) {
	
	String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	for (int i=0; i <= str.length(); i++)
	{
		char val = str.charAt(i);

		System.out.print("[" + val + "] : ");
		System.out.print("[" + Integer.toBinaryString(val) + "] : ");
		System.out.print("[" + Integer.toOctalString(val) + "] : ");
		System.out.print("[" + (int) val + "] : ");
		System.out.println("[" + Integer.toHexString(val) + "]");
	}	

	}
}