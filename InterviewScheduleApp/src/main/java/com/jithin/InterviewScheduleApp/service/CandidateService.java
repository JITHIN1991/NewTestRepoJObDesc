package com.jithin.InterviewScheduleApp.service;

import com.jithin.InterviewScheduleApp.entity.Candidate;

public interface CandidateService {
	
	void addCandidate(Candidate candidate,Long jobId);

}
