// package
package a.b.c.ch4;

// import


public class ExClass_Multi 
{
	// ��� 
	// �������
	// ������
	public ExClass_Multi(){
		System.out.println("ExClass_Multi() ������ >>> : ");
	}

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Interface_A ia = new Interface_AImpl();
		ia.interface_a();
	}
}

/*
������ �ϴ� ���
C:\00.KOSMO93\10.JExam\ch4>javac -d . ExClass_Multi.java Interface_A.java Interface_AImpl.java

���� �ϴ� ��� 
C:\00.KOSMO93\10.JExam\ch4>java a.b.c.ch4.ExClass_Multi
Interface_AImpl.interface_a() �Լ� >>> :

*/