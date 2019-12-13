package com.designpatterns.DesignPatternsEx.factory;

public class AccountFactory {

	public Account getAccountTypes(String account){
		if(account.equalsIgnoreCase("saving")) {
			return new SavingAccount();
		} else if(account.equalsIgnoreCase("current")) {
			return new CurrentAccount();
		}else if(account.equalsIgnoreCase("fixed")) {
			return new FixedAccount();
		}
		
		return null;
	}
}
