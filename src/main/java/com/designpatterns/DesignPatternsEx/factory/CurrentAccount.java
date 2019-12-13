package com.designpatterns.DesignPatternsEx.factory;

public class CurrentAccount implements Account {

	int balance = 900;
	public void getBalance() {
		// TODO Auto-generated method stub
     System.out.println("balance in current account is" + balance);
   //  return balance;
	}

}
