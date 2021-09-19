package a.b.c.ch8;

public class Ex_Thread_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable r = new SyncTest();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}

class BankAccount {
	
	int balance = 1000;
	
	public void withdraw (int money) {
		
		if(balance >= money) {
			try {Thread.sleep(1000);} catch(Exception e) {}
			balance -= money;
		}		
	} //withdraw
}

class SyncTest implements Runnable{
	BankAccount ac = new BankAccount();
	
	public void run() {
		while(ac.balance > 0) {
			int money = (int) (Math.random()*3+1) * 100;
			ac.withdraw(money);
			System.out.println("balance : " + ac.balance);
		}
	}
	
}