package com.te.lms.service.implementation;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.te.lms.entity.Employee;
import com.te.lms.entity.RequestList;
import com.te.lms.repository.EmployeeRepository;
import com.te.lms.repository.RequestListRepository;
import com.te.lms.service.RequestListService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RequestListServiceImpl implements RequestListService {
	
	private final EmployeeRepository employeeRepository;
	private final RequestListRepository requestListRepository;
	
	
	@Override
	public void addToList(String employeeId) {
		Optional<Employee> optEmployee = employeeRepository.findById(employeeId);
		if (optEmployee.isPresent()) {
			Employee employee=optEmployee.get();
			RequestList requestList=new RequestList();
			requestList.setEmployeeId(employee.getEmployeeId());
			requestList.setEmployeeName(employee.getEmployeeName());
			requestList.setEmployeePercentage(employee.getEducationDetails().get(0).getPercentage());
			requestList.setEmployeeYOP(employee.getEducationDetails().get(0).getYearOfPassing().getYear());
			requestList.setContactNumber(employee.getContact().get(0).getContactNum());
			Optional<Integer> totalExperiece = employeeRepository.getTotalExperiece(employeeId);
			requestList.setExperience(totalExperiece.get());
			requestListRepository.save(requestList);
		}
		
	}

	
	

}
