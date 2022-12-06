package com.te.lms.enums;

public enum AccountType {
	CURRENT("CURRENT"),SAVINGS("SAVINGS");
	
	private final String accountType;

	private AccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}
	
	
}
