package com.te.lms.controller;

import java.util.Optional;

import javax.management.Notification;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.NewMentorDto;
import com.te.lms.response.RegistrationResponse;
import com.te.lms.service.AdminService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/admin")
public class AdminController {
	private final AdminService adminService;
	private final Notification notification;

	@PostMapping(path = "/register/mentor")
	public RegistrationResponse<String> registerMentor(@RequestBody NewMentorDto mentorDto) {
		Optional<String> optEmp = adminService.registerMentor(mentorDto);
		if (optEmp.isPresent()) {
			String message="Hello"+mentorDto.getMentorName()+"your role has been updates as an mentor";
			String subject="congratulations";
			String emailId=mentorDto.getMentorEmailId();
			//notification.sendEmail(message,emailId,subject);
			return new RegistrationResponse<String>("mentor has been registered successfully", optEmp.get());
		}

		throw new RuntimeException("Unable to register the mentor");
	}
}
