package com.jithin.InterviewScheduleApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jithin.InterviewScheduleApp.entity.JobDescription;

public interface JobDescriptionRepo extends JpaRepository<JobDescription, Long> {

}
