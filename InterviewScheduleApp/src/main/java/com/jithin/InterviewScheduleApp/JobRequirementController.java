package com.jithin.InterviewScheduleApp;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jithin.InterviewScheduleApp.entity.Candidate;
import com.jithin.InterviewScheduleApp.entity.JobDescription;
import com.jithin.InterviewScheduleApp.service.JobService;

@RestController
public class JobRequirementController {

	@Autowired
	private JobService jobService;

	@PostMapping("job")
	public ResponseEntity<JobDescription> addNewJD(@RequestBody @Valid JobDescription jobDescription) {

		jobService.addNewJobDescription(jobDescription);

		return ResponseEntity.ok(jobDescription);

	}
	
	@PutMapping("job/{jobId}/candidate")
	public void addCandidates(@RequestBody Candidate candidate) {
		
		
	}
}
