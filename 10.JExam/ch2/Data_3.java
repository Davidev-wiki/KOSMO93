package a.b.c.ch2;

public class Data_3 {

	//�������
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;
	
	//������
	Data_3() {
		System.out.println("Data_3 Ŭ������ ������ Data_3()�Դϴ�.");
	}
		

		public static void main(java.lang.String[] args) {
				
			
			Data_3 d3 = new Data_3();
			System.out.println("DefaultValue�� d3�ּҰ� : " + d3);
			System.out.println("byte�� default �� : " + d3.b);
			System.out.println("char�� default �� : \'" + d3.c + "\'");
			System.out.println("short�� default �� : " + d3.s);
			System.out.println("int�� default �� : " + d3.i);
			System.out.println("float�� default �� : " + d3.f);
			System.out.println("double�� default �� : " + d3.d);
			System.out.println("boolean�� default �� : " + d3.bo);
			System.out.println("String�� default �� : " + d3.str);

			System.out.println("-----------------------------------------");

			DefaultValue dv = new DefaultValue();
			System.out.println("DefaultValue�� dv�ּҰ� : " + dv);
			System.out.println("byte�� default �� : " + dv.b);
			System.out.println("char�� default �� : \'" + dv.c + "\'");
			System.out.println("short�� default �� : " + dv.s);
			System.out.println("int�� default �� : " + dv.i);
			System.out.println("float�� default �� : " + dv.f);
			System.out.println("double�� default �� : " + dv.d);
			System.out.println("boolean�� default �� : " + dv.bo);
			System.out.println("String�� default �� : " + dv.str);
	
	} //end of main �Լ�

} //end of Data_3 Ŭ����

class DefaultValue {
	
	//��� ����
	byte b;
	char c;
	short s;
	int i;
	float f;
	double d;
	boolean bo;
	String str;
	
	DefaultValue() {
		System.out.println("DefaultValueŬ���� �ȿ� �ִ� DefaultValue() �������Դϴ�.");
	}

}