package com.te.lms.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.checkerframework.common.aliasing.qual.Unique;

import com.te.lms.enums.EmployeeStatus;
import com.te.lms.enums.Gender;

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
@Table(name = "employee_primary_info")
public class Employee {
	@Id
	private String employeeId;
	private String employeeName;
	private LocalDate employeeDOJ;
	private LocalDate employeeDOB;
	
	@Unique
	private String employeeEmail;
	
	private String bloodGroup;
	private String designation;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String employeeNationality;
	@Enumerated(EnumType.STRING)
	private EmployeeStatus employeeStatus;

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private SecondaryInfo secondaryInfo;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<EducationDetails> educationDetails=new ArrayList<EducationDetails>();

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<AddressDetails> addressDetails=new ArrayList<AddressDetails>();

	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private BankDetails bankDetails;

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<TechnicalSkills> technicalSkills=new ArrayList<TechnicalSkills>();

	@OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
	private List<Experience> experience=new ArrayList<Experience>();

	@OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
	private List<Contact> contact=new ArrayList<Contact>();
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Batch batch;
	
	
	
}
