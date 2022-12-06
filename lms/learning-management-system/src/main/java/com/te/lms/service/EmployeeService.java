package com.te.lms.service;

import java.util.Optional;

import com.te.lms.dto.RegistrationDto;

public interface EmployeeService {

	Optional<String> register(RegistrationDto registrationDto);

}
