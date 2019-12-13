package com.designpatterns.DesignPatternsEx.factory;

public class SavingAccount implements Account {
int balance = 10000;
	public void getBalance() {
		// TODO Auto-generated method stub		
		System.out.println("Balance in Savings account is" + balance);
		//return balance;
	}

}
