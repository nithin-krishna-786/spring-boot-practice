package com.nithin.springbootpractice.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.nithin.springbootpractice.entity.Task;

@Service
public class TaskSchedulerAsyncService {
	
	@Async
	public void scheduleTask(Task task)
	{
		System.out.println("Scheduling Task:"+task.getTaskName());
		executeTask(task);
	}

	private void executeTask(Task task) {
		System.out.println("Executing Task:"+task.getTaskName());
	}

}
