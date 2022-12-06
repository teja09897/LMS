package com.te.lms.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.te.lms.enums.ContactType;

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
@Table(name = "employee_contact_info")
public class Contact {
	@Id
	private Long contactNum;
	@Enumerated(EnumType.STRING)
	private ContactType contactType;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_fk")
	private Employee employee;
}
