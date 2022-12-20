package com.te.lms.service;

import java.util.List;
import java.util.Optional;

import com.te.lms.dto.ApproveDto;
import com.te.lms.dto.MessageDto;
import com.te.lms.dto.NewBatchDto;
import com.te.lms.dto.NewMentorDto;
import com.te.lms.dto.RejectDto;
import com.te.lms.dto.RequestListDto;

public interface AdminService {

	Optional<String> registerMentor(NewMentorDto mentorDto);

	Optional<String> createBatch(NewBatchDto newBatchDto);

	Optional<String> updateMentor(NewMentorDto newMentorDto);

	Optional<String> deleteMentor(String mentorId);

	Optional<String> updateBatch(NewBatchDto newBatchDto);

	Optional<String> deleteBatchDetails(String batchId);

	Optional<Object> read(String mentorId);

	Optional<Object> readBatch(String batchId);

	Optional<MessageDto> approve(String employeeId, ApproveDto approveDto);

	Optional<List<NewBatchDto>> batchList();

	Optional<List<NewMentorDto>> mentorList();

	Optional<MessageDto> reject(String employeeId, RejectDto rejectDto);

	Optional<List<RequestListDto>> getRequestList();




}
