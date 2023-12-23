package com.nithin.springbootpractice.service;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.stereotype.Service;

import com.nithin.springbootpractice.entity.Task;

@Service
public class TaskSchedulerTPEService {

	private ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
	
	public void scheduleTask(Task task)
	{
		System.out.println("Scheduling Task:"+task.getTaskName());
		executor.submit(()->executeTask(task));
	}

	private void executeTask(Task task) {
		System.out.println("Executing Task:"+task.getTaskName());
		
	}
	
}
