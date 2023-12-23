package com.nithin.springbootpractice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nithin.springbootpractice.entity.Task;
import com.nithin.springbootpractice.service.TaskSchedulerTPEService;

@RestController
@RequestMapping("/tasks-threadPoolExecutors")
public class TaskControllerTPE {

	@Autowired
	private TaskSchedulerTPEService taskSchedulerTPEService;

	@PostMapping
	public ResponseEntity<String> scheduleTask(@RequestBody Task task) {
		taskSchedulerTPEService.scheduleTask(task);
		return ResponseEntity.ok("Task scheduled successfully");
	}

}
