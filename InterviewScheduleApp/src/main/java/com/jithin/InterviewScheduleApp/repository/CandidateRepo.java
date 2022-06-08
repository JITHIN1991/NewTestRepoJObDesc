package com.jithin.InterviewScheduleApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jithin.InterviewScheduleApp.entity.Candidate;

public interface CandidateRepo extends JpaRepository<Candidate, Long> {

}
