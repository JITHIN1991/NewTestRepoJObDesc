package com.jithin.InterviewScheduleApp.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jithin.InterviewScheduleApp.entity.Candidate;
import com.jithin.InterviewScheduleApp.repository.CandidateRepo;
import com.jithin.InterviewScheduleApp.repository.JobDescriptionRepo;

public class CandidateServiceImpl implements CandidateService {

	@Autowired
	private CandidateRepo candidateRepo;

	@Autowired
	private JobDescriptionRepo jobRepo;

	
	@Override
	public void addCandidate(Candidate candidate,Long jobId) {
		

	}

}
