package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.checkerframework.common.aliasing.qual.Unique;

import com.te.lms.enums.MaritalStatus;

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
@Table(name = "employee_secondary_info")
public class SecondaryInfo {
	@Id
	private String panNum;
	@Unique
	private String aadhaarNum;
	private String fatherName;
	private String motherName;
	private String spouseName;
	@Unique
	private String passportNum;
	@Enumerated(EnumType.STRING)
	private MaritalStatus maritalStatus;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_fk")
	private Employee employee;
}
