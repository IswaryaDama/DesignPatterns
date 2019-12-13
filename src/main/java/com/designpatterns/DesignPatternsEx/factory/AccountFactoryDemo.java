package com.designpatterns.DesignPatternsEx.factory;

public class AccountFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      AccountFactory factory = new AccountFactory();
      Account acc1 = factory.getAccountTypes("saving");
      acc1.getBalance();
      Account acc2 = factory.getAccountTypes("current");
      acc2.getBalance();
      Account acc3 = factory.getAccountTypes("fixed");
      acc3.getBalance();
	}

}
