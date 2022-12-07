package com.te.lms.service.implementation;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.te.lms.dto.NewMentorDto;
import com.te.lms.dto.SkillsDto;
import com.te.lms.entity.Mentor;
import com.te.lms.entity.Skills;
import com.te.lms.repository.MentorRepository;
import com.te.lms.service.AdminService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class AdminServiceImpl implements AdminService{
    private final MentorRepository mentorRepository;
	@Override
	public Optional<String> registerMentor(NewMentorDto mentorDto) {
		Mentor mentor=new Mentor();
		BeanUtils.copyProperties(mentorDto, mentor);
		
		List<Skills> skills=Lists.newArrayList();
		
		for (SkillsDto skillsDto : mentorDto.getSkillsDto()) {
			Skills skillsEntity=new Skills();
			BeanUtils.copyProperties(skillsDto, skillsEntity);
			skills.add(skillsEntity);
			skillsEntity.setMentor(mentor);
		}
		mentor.setSkills(skills);
		mentorRepository.save(mentor);
		return Optional.ofNullable(mentor.getMentorId());
	}

}
