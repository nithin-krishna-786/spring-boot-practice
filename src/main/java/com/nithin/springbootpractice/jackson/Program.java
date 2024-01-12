package com.nithin.springbootpractice.jackson;

public class Program {
	private String programName;
	private int count;

	public Program(String programName, int count) {
		super();
		this.programName = programName;
		this.count = count;
	}

	public Program() {
		super();
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Program [programName=" + programName + ", count=" + count + "]";
	}
}
