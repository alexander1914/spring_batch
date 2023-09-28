package com.spring.batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.stereotype.Component;

@Component
public class FirstJobListener implements JobExecutionListener {

	@Override
	public void beforeJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		System.out.println("Before Job " + jobExecution.getJobInstance().getJobName());
		System.out.println("Job Parameters " + jobExecution.getJobParameters());
		System.out.println("Job Exec Context " + jobExecution.getExecutionContext());
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		// TODO Auto-generated method stub
		System.out.println("After Job " + jobExecution.getJobInstance().getJobName());
		System.out.println("Job Exec Cont " + jobExecution.getJobParameters());
		System.out.println("Step Exec Cont " + jobExecution.getExecutionContext());
	}

}
