package com.te.lms.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;
import com.te.lms.dto.AddressDetailsDto;
import com.te.lms.dto.ContactDto;
import com.te.lms.dto.EducationDetailsDto;
import com.te.lms.dto.ExperienceDto;
import com.te.lms.dto.RegistrationDto;
import com.te.lms.dto.TechnicalSkillsDto;
import com.te.lms.entity.AddressDetails;
import com.te.lms.entity.BankDetails;
import com.te.lms.entity.Contact;
import com.te.lms.entity.EducationDetails;
import com.te.lms.entity.Employee;
import com.te.lms.entity.Experience;
import com.te.lms.entity.SecondaryInfo;
import com.te.lms.entity.TechnicalSkills;
import com.te.lms.repository.EmployeeRepository;
import com.te.lms.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Override
	public Optional<String> register(RegistrationDto registrationDto) {
		Employee employee = new Employee();
		SecondaryInfo secondaryInfo = new SecondaryInfo();
		BankDetails bankDetails = new BankDetails();
		List<EducationDetails>educationDetails=Lists.newArrayList(); 
		List<AddressDetails> addressDetails = Lists.newArrayList();
		List<Experience> experience = Lists.newArrayList();
		List<Contact> contacts = Lists.newArrayList();
		List<TechnicalSkills> technicalSkills = Lists.newArrayList();

		BeanUtils.copyProperties(registrationDto, employee);

		BeanUtils.copyProperties(registrationDto.getSecondaryInfoDto(), secondaryInfo);	
		employee.setSecondaryInfo(secondaryInfo);
		secondaryInfo.setEmployee(employee);
		
		BeanUtils.copyProperties(registrationDto.getBankDetailsDto(), bankDetails);
		employee.setBankDetails(bankDetails);
		bankDetails.setEmployee(employee);

		
		
		for (EducationDetailsDto educationDetailsDto:registrationDto.getEducationDetailsDto()) {
			EducationDetails educationDetailsEntity=new EducationDetails();
			BeanUtils.copyProperties(educationDetailsDto, educationDetailsEntity);
			educationDetailsEntity.setEmployee(employee);
			educationDetails.add(educationDetailsEntity);
			}
		employee.setEducationDetails(educationDetails);
		
		for (AddressDetailsDto addressDetailsDto:registrationDto.getAddressDetailsDto()) {
			AddressDetails addressDetailsEntity=new AddressDetails();
			BeanUtils.copyProperties(addressDetailsDto, addressDetailsEntity);
			addressDetailsEntity.setEmployee(employee);
			addressDetails.add(addressDetailsEntity);
		}
		employee.setAddressDetails(addressDetails);
		
		for (ExperienceDto experienceDto:registrationDto.getExperienceDto()) {
			Experience experienceEntity=new Experience();
			BeanUtils.copyProperties(experienceDto, experienceEntity);
			experienceEntity.setEmployee(employee);
			experience.add(experienceEntity);
		}
		employee.setExperience(experience);
		
		for (TechnicalSkillsDto technicalSkillsDto:registrationDto.getTechnicalSkillsDto()) {
			TechnicalSkills technicalSkillsEntity=new TechnicalSkills();
			BeanUtils.copyProperties(technicalSkillsDto, technicalSkillsEntity);
			technicalSkillsEntity.setEmployee(employee);
			technicalSkills.add(technicalSkillsEntity);
		}
		employee.setTechnicalSkills(technicalSkills);
		

		for (ContactDto contactDto:registrationDto.getContactDto()) {
			Contact contactEntity=new Contact();
			BeanUtils.copyProperties(contactDto, contactEntity);
			contactEntity.setEmployee(employee);
			contacts.add(contactEntity);
		}
          employee.setContact(contacts);

	
		employeeRepository.save(employee);
		
		return Optional.ofNullable(employee.getEmployeeId());
	}

}
