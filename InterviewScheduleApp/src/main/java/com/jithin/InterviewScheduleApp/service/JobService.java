package com.jithin.InterviewScheduleApp.service;

import com.jithin.InterviewScheduleApp.entity.Candidate;
import com.jithin.InterviewScheduleApp.entity.JobDescription;

public interface JobService {

	void addNewJobDescription(JobDescription jobDescription);
	
	void addCandidatesToJobRequirement(Long jobId, Candidate candidate);
	
	
}
