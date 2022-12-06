package com.te.lms.dto;

import com.te.lms.enums.MaritalStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString

public class SecondaryInfoDto {
	private String panNum;
	private String aadhaarNum;
	private String fatherName;
	private String motherName;
	private String spouseName;

	private String passportNum;

	private MaritalStatus maritalStatus;

}
