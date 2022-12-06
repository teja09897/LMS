package com.te.lms.dto;

import java.util.List;

import com.google.common.collect.Lists;
import com.te.lms.entity.Technologies;

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
public class NewMentorDto {
	private String mentorName;
    private String mentorId;
    private String mentorEmailId;
    private List<SkillsDto> skillsDto=Lists.newArrayList();
    
}
