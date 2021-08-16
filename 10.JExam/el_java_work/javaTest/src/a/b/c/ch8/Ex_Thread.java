package a.b.c.ch8;

public class Ex_Thread extends Thread {

	@Override
	public void run() {
		System.out.println("run() 함수당");
		System.out.println("Thread 클래스에 있는 start()함수를 호출하면");
		System.out.println("바로 run()함수를 호출한다.");
		System.out.println("링크가 걸려있어서 그렇다. Thread.start() => run()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread().start();
	}

}
