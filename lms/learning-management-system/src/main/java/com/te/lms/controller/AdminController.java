package com.te.lms.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.NewBatchDto;
import com.te.lms.dto.NewMentorDto;
import com.te.lms.mailssender.MailNotifications;
import com.te.lms.response.GeneralResponse;
import com.te.lms.service.AdminService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/admin")
public class AdminController {
	private final AdminService adminService;
	private final MailNotifications mailNotifications;

	@PostMapping(path = "/register/mentor")
	public GeneralResponse<String> registerMentor(@RequestBody NewMentorDto mentorDto) {
		Optional<String> optEmp = adminService.registerMentor(mentorDto);
		if (optEmp.isPresent()) {
			String message="Hello"+mentorDto.getMentorName()+"your role has been updates as an mentor";
			String subject="congratulations";
			String emailId=mentorDto.getMentorEmailId();
			mailNotifications.sendEmail(message,emailId,subject);
			return new GeneralResponse<String>("mentor has been registered successfully", optEmp.get());
		}

		throw new RuntimeException("Unable to register the mentor");
	}
	
	@PutMapping(path = "/update/mentor")
	public GeneralResponse<String > updateMentor(@RequestBody NewMentorDto newMentorDto) {
		    Optional<String> optEmpId=adminService.updateMentor(newMentorDto);
		    if (optEmpId.isPresent()) {
				return new GeneralResponse<String>("Mentor details updated successfully", optEmpId.get());
			}
		throw new RuntimeException("Unable to update Mentor deatails ");
	}
	
	@PutMapping(path = "/delete/mentor/{mentorId}")
	public GeneralResponse<String> deleteMentor(@PathVariable String mentorId) {
		Optional<String> optEmpId=adminService.deleteMentor(mentorId);
		if (optEmpId.isPresent()) {
			return new GeneralResponse<String>("mentor deleted successfully", mentorId);
		}
		throw new RuntimeException("unable to delete mentor");
	}
	
	

//====================================================================================================================
	@PostMapping(path = "/register/batch")
	public GeneralResponse<String> createBatch(@RequestBody NewBatchDto newBatchDto){
		Optional<String> optBatchId=adminService.createBatch(newBatchDto);
		if (optBatchId.isPresent()) {
			return new GeneralResponse<String>("A New Batch has been created", newBatchDto.getBatchId());
		}
		throw new RuntimeException("Unable to create a new batch");
	}
	
//	@DeleteMapping(path = "/delete/batch/{id}")
//	public GeneralResponse<Integer> deleteBatch(@PathVariable("Id") String Id) {
//		      Optional<String> optBatchId=adminService.deleteBatchDetails(Id);
//		      if (optBatchId.isPresent()) {
//		  		return new GeneralResponse<Integer>("Batch details deleted successfully",null);
//			}
//		throw new RuntimeException("unable to delete Batch Details");
//	}
	
	@PutMapping(path = "/update/batch")
	public GeneralResponse<Integer> updateBatch(@RequestBody NewBatchDto newBatchDto) {
		Optional<Integer> optBatch=adminService.updateBatch(newBatchDto);
		if (optBatch.isPresent()) {
	  		return new GeneralResponse<Integer>("Batch details updated successfully",null);
		}
		throw new RuntimeException("Unable to update Batch deatails ");

	}
	
	
	
	
	
	
	
	
}
