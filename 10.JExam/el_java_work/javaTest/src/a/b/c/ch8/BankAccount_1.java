package a.b.c.ch8;

public class BankAccount_1 {
		int balance = 1000;
		public synchronized void withdraw (int money) {
			System.out.println("synchronized void withdraw() �Լ� ȣ�� >> ");
			if(balance >= money) {
				try {Thread.sleep(1000);} catch(Exception e) {}
				balance -= money;
		}
	}
}