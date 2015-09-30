package com.training;

public class BankAccount {
	
	private double balance = 5000;

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + "]";
	}

	public synchronized double  deposit(double amt) {
		
		balance = balance+amt; 
		notify();
		return balance;
		
	}
	public synchronized double  withdraw(double amt) {
		
		if(balance < amt)
		{
			System.out.println("aukat me rah be");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
		balance= balance-amt;
		System.out.println("nikal gya");
		return balance;
		}
	}
