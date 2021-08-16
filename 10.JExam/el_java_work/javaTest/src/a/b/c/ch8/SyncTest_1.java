package a.b.c.ch8;

import a.b.c.common.DateUtil;

public class SyncTest_1 implements Runnable{
	BankAccount_1 ac1 = new BankAccount_1();
	
	public void run() {
		System.out.println("run()함수 시작 > ");
		
		synchronized (this) {
			System.out.println("synchronized (this) 함수 시작 > ");
			while(ac1.balance > 0) {
				int money =(int)((Math.random()*3)+1)*100;
				ac1.withdraw(money);
				
				System.out.println("balance : " + ac1.balance
									+ " : 출금시간 : "
									+ DateUtil.cTime());
			}
		}
	}
}