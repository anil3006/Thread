package com.training;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final BankAccount bk1 = new BankAccount();
		
		Thread t1 = new Thread(){
			public void run(){
				bk1.withdraw(100000);
			}
		};
		
		t1.start();
		Thread t2 = new Thread(){
			public void run(){
				bk1.deposit(5001);
			}
		};
		t2.start();
		
	}

}
