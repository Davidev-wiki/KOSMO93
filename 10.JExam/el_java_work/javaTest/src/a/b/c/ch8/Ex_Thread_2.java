package a.b.c.ch8;

public class Ex_Thread_2 extends Thread {

	public static void a() {
		System.out.println("�� a()�Լ�����");
		System.out.println("2�� ���� ��Ű��");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException i) {

		}
	}

	public void run() {
		System.out.println("Thread�� start()�Լ��� ȣ���ϸ� ����Ǵ� run()�Լ�����");
		System.out.println("3�� ����");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException i) {

		}
		System.out.println("���� �Ͼ");

		Ex_Thread_2.a();

		System.out.println("a()�Լ� ȣ�� �� ����~?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread_2().start();

	}

}
