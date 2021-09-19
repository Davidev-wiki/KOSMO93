package a.b.c.ch8;

public class Ex_Thread_2 extends Thread {

	public static void a() {
		System.out.println("난 a()함수에용");
		System.out.println("2초 슬립 시키기");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException i) {

		}
	}

	public void run() {
		System.out.println("Thread로 start()함수를 호출하면 실행되는 run()함수에용");
		System.out.println("3초 슬립");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException i) {

		}
		System.out.println("이제 일어남");

		Ex_Thread_2.a();

		System.out.println("a()함수 호출 잘 됐쥬~?");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Ex_Thread_2().start();

	}

}
