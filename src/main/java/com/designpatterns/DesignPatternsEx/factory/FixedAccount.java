package com.designpatterns.DesignPatternsEx.factory;

public class FixedAccount implements Account {
int balance=50000;
	public void getBalance() {
		// TODO Auto-generated method stub
		System.out.println("Fixed account balance is" + balance);
		//return balance;
	}

}
