//package
package a.b.c.ch3;
//import


public class ExArray_2 {
	//���
	//�������
	//������
	
	//�Լ�

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		//TODO Auto-generated method stub.
		
		System.out.println();

		//�迭 ���� �� �ʱ�ȭ ��� 1
		String str[] = new String[]{"abc", "def", "ghi"};
		System.out.println("str ��� : " + str);
		System.out.println("��Ʈ�� �迭�� ���̸� ��Ÿ���� 'str.length' ��� : " + str.length);

		System.out.println("\n----------------------------------------------------\n");
		//�迭�� ���̸� int�� ���� 'strLen'�� �ʱ�ȭ
		int strLen = str.length;
		//�ݺ������� �迭�� ��Ҹ� ��ȸ�ϱ�
		for (int i=0; i < strLen; i++ )
		{	
			System.out.println("========================================================");
			//�迭�� ��Ҹ� ������� ���
			System.out.println("\n >> str������ ["+i+"]�� ° �� : " + str[i]);
			for (int j=0; j < str[i].length(); j++)
			{
				//���� �ɰ��� : ���ڸ� �ɰ��� ������ ���� 'charAt()' �Լ�
				System.out.print("\n���ڿ� str[i]�� ["+ j +"]��° ���� : " + str[i].charAt(j)+ " | 16������ ���� : 0x");
				//16������ �ٲٱ� : ���ڸ� ���ڷ� �ٲٴ� ���ڵ� �Լ� Integer.toHexString()
				System.out.println(Integer.toHexString(str[i].charAt(j)));
			}
			System.out.println("========================================================");
		}

		System.out.println("\n----------------------------------------------------\n");
		
		//�迭 ���� �� �ʱ�ȭ ��� 2
		String str1[] = {"abc", "def", "ghi"};
		System.out.println("str1 ��� : " + str1);
		System.out.println("��Ʈ�� �迭�� ���̸� ��Ÿ���� 'str1.length'��� : " + str1.length);

		System.out.println("\n----------------------------------------------------\n");
		int str1Len = str1.length;
		for (int i=0; i < str1Len; i++ )
		{
			System.out.println("========================================================");
			System.out.println("\n >> str1������ ["+i+"]�� ° �� : " + str1[i]);
			for (int j=0; j < str1[i].length() ; j++)
			{
				System.out.print("\n���ڿ� str1[i]�� [" + j + "]��° ���� : " + str1[i].charAt(j) + " | 16������ ���� : 0x");
				System.out.println(Integer.toHexString(str1[i].charAt(j)));
			}
			System.out.println("========================================================");
		}



	}
}
