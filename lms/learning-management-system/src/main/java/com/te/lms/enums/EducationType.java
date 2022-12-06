package com.te.lms.enums;

public enum EducationType {
	UG("UG"),PG("PG"),PHD("PHD");
	
	private final String educationType;

	private EducationType(String educationType) {
		this.educationType = educationType;
	}

	public String getEducationType() {
		return educationType;
	}
	
	
}
