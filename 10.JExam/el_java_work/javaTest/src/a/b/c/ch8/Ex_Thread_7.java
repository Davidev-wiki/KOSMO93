package a.b.c.ch8;

import a.b.c.common.DateUtil;

public class Ex_Thread_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new SyncTest_1();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}
}


