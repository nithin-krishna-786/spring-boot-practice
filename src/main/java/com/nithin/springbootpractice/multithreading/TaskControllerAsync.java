package com.nithin.springbootpractice.multithreading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks-async")
public class TaskControllerAsync {
	
	@Autowired
	private TaskSchedulerAsyncService taskSchedulerAsyncService;

	@PostMapping
	public ResponseEntity<String> scheduleTask(@RequestBody Task task) {
		taskSchedulerAsyncService.scheduleTask(task);
		return ResponseEntity.ok("Task scheduled successfully");
	}

}
