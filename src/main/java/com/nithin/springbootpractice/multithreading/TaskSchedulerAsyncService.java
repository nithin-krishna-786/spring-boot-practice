package com.nithin.springbootpractice.multithreading;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskSchedulerAsyncService {
	
	@Async
	public void scheduleTask(Task task)
	{
		System.out.println("Scheduling Task:"+task.getTaskName());
		executeTask(task);
	}

	private void executeTask(Task task) {
		for(int i=1;i<=5;i++)
				System.out.println(i);
		System.out.println("Completed Task:"+task.getTaskName());
	}

}
