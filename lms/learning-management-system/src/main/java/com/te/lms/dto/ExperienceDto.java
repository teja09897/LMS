package com.te.lms.dto;

import java.time.LocalDate;

import com.te.lms.enums.YearOfExperience;

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

public class ExperienceDto {
	
	private Integer experienceId;
	private String companyName;
	private YearOfExperience yearsOfExperience;
	private LocalDate dateOfJoining;
	private LocalDate dateOfRelieving;
	private String designation;
	private String location;
	
}
