package com.nithin.springbootpractice.jackson;

public class Topping {
	private String id;
	private String type;

	@Override
	public String toString() {
		return "Topping [id=" + id + ", type=" + type + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
