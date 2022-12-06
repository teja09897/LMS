package com.te.lms.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.te.lms.enums.YearOfExperience;

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
@Table(name = "employee_experience_info")
public class Experience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer experienceId;
	private String companyName;
	private YearOfExperience yearsOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private String designation;
	private String location;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_fk")
	private Employee employee;
}
