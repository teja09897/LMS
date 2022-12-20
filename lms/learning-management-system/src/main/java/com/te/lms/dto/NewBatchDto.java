package com.te.lms.dto;

import java.time.LocalDate;
import java.util.List;

import com.google.common.collect.Lists;
import com.te.lms.enums.Status;

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

public class NewBatchDto {
	
	private String batchId;
	private String batchName;
	private String mentorName;
	private List<TechnologiesDto> technologiesDto=Lists.newArrayList();
	private LocalDate startDate;
	private LocalDate endDate;
	private Status status;

}
