package a.b.c.ch8;

public class Ex_Thread extends Thread {

	@Override
	public void run() {
		System.out.println("run() �Լ���");
		System.out.println("Thread Ŭ������ �ִ� start()�Լ��� ȣ���ϸ�");
		System.out.println("�ٷ� run()�Լ��� ȣ���Ѵ�.");
		System.out.println("��ũ�� �ɷ��־ �׷���. Thread.start() => run()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread().start();
	}

}
