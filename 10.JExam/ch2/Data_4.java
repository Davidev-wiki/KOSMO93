package a.b.c.ch2;

public class Data_4 {

	//�������
	static byte b;
	static char c;
	static short s;
	static int i;
	static float f;
	static double d;
	static boolean bo;
	static String str;

	//������
	public Data_4(){
		System.out.println("Data_4 Ŭ���� Data_4() ������");
	}

		public static void main(java.lang.String[] args) {
			
			System.out.println("��ü�� ���� ����մϴ�.");
			System.out.println("-----------------------------");
			Data_4 d4 = new Data_4();
			
			System.out.println(d4.b);
			System.out.println(d4.c);
			System.out.println(d4.s);
			System.out.println(d4.i);
			System.out.println(d4.f);
			System.out.println(d4.d);
			System.out.println(d4.bo);
			System.out.println(d4.str);


			System.out.println("-----------------------------");
			System.out.println("Static Ű���带 �ٿ��� ����մϴ�.");
			System.out.println(Data_4.b);
			System.out.println(Data_4.c);
			System.out.println(Data_4.s);
			System.out.println(Data_4.i);
			System.out.println(Data_4.f);
			System.out.println(Data_4.d);
			System.out.println(Data_4.bo);
			System.out.println(Data_4.str);

	} //end of main �Լ�

} //end of Data_4 Ŭ����
