package com.te.lms.enums;

public enum Action {
	APPROVE("APPROVE"),REJECT("REJECT");
	
	private final String action;
	
	private Action(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}
	
	
}
