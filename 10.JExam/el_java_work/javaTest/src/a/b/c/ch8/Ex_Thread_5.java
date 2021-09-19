package a.b.c.ch8;

public class Ex_Thread_5 extends Thread {

	int seqNum;

	public Ex_Thread_5(int seqNum) {
		this.seqNum = seqNum;
	}

	@Override
	public void run() {
		synchronized (this) {
			System.out.println(this.seqNum + " Thread Start >>> : ");
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
			}
			System.out.println(this.seqNum + " Thread End >>> : ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 20; i++) {
			Ex_Thread_5 tt3 = new Ex_Thread_5(i);
			// System.out.println("tt3 >>> : " + tt3);
			tt3.start();
		}

		System.out.println("main() ³¡ >>> : ");
	}

}
