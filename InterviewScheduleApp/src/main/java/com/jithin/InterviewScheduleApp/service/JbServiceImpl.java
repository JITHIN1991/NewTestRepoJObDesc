package com.jithin.InterviewScheduleApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jithin.InterviewScheduleApp.entity.Candidate;
import com.jithin.InterviewScheduleApp.entity.JobDescription;
import com.jithin.InterviewScheduleApp.repository.CandidateRepo;
import com.jithin.InterviewScheduleApp.repository.JobDescriptionRepo;

@Service
public class JbServiceImpl implements JobService {

	@Autowired
	private JobDescriptionRepo jobRepo;

	@Autowired
	private CandidateRepo candidateRepo;

	@Override
	@Transactional
	public void addNewJobDescription(JobDescription jobDescription) {
		// TODO Auto-generated method stub

		jobRepo.save(jobDescription);

	}

	@Override
	public void addCandidatesToJobRequirement(Long jobId, Candidate candidate) {

	}

}
