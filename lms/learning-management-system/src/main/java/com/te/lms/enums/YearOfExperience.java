package com.te.lms.enums;

public enum YearOfExperience {
	ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5);
	
	private final Integer yearOfExperience;

	private YearOfExperience(Integer yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public Integer getYearOfExperience() {
		return yearOfExperience;
	}
	
	
}
