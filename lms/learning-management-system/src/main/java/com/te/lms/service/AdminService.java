package com.te.lms.service;

import java.util.Optional;

import com.te.lms.dto.NewBatchDto;
import com.te.lms.dto.NewMentorDto;

public interface AdminService {

	Optional<String> registerMentor(NewMentorDto mentorDto);

	Optional<String> createBatch(NewBatchDto newBatchDto);

	Optional<String> updateMentor(NewMentorDto newMentorDto);

	Optional<String> deleteMentor(String mentorId);

	Optional<Integer> updateBatch(NewBatchDto newBatchDto);




}
