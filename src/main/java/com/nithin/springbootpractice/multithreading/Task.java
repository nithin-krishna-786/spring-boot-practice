package com.nithin.springbootpractice.multithreading;

import lombok.Data;

public class Task {
	private String taskId;
	private String taskName;

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
