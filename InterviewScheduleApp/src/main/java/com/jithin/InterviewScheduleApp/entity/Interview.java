package com.jithin.InterviewScheduleApp.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Interview {

	private Long id;
	
	@OneToOne
	@JoinColumn(name = "job")
	private JobDescription job;
	
	@OneToMany(mappedBy = "interview")
	private List<InterviewRound> rounds;
	
	
}
