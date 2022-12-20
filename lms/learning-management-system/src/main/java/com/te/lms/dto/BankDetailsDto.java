package com.te.lms.dto;

import com.te.lms.enums.AccountType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder


public class BankDetailsDto {
	
	private String accountNum;
	private String bankName;
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;
}
