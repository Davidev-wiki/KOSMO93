//package
package a.b.c.ch3;
//import

public class ET
	{
/*
���
�������
������
�Լ�
*/

//main�Լ�
public static void main(String[] args) {
		
	String str[] = {"�ڹ�","��","���̼�","�ڹٽ�ũ��Ʈ","�ȵ���̵�"};
	
	for (String lang : str)
	{
		System.out.println("lang : " + lang);
	}
	
	for (String a : args)
	{
		System.out.println("����� �Է°� a : " + a);
	}

	for (int i=0;i<args.length; i++)
	{
		System.out.println("�Էµ� args�� �迭�� ���� : " + args.length);
		System.out.println("args[" + i  +"] : "+ args[i]);
	}

	}// end of main
}// end of class