package com.te.lms.dto;

import com.te.lms.enums.SkillRating;
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

public class TechnicalSkillsDto {
	private Integer technicalId;
	private String skillType;
	private SkillRating skillRating;
	private YearOfExperience yearOfExperience;
}
