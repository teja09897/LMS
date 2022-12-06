package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(name = "employee_bank_details")
public class BankDetails {
	@Id
	private String accountNum;
	private String bankName;
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	private String ifscCode;
	private String branch;
	private String state;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bank_details_fk")
	private Employee employee;
}
