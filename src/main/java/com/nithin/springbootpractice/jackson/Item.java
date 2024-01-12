package com.nithin.springbootpractice.jackson;

import java.util.List;

public class Item {
	private String id;
	private String type;
	private String name;
	private double ppu;
	private Batters batters;
	private List<Topping> topping;

	@Override
	public String toString() {
		return "Item [id=" + id + ", type=" + type + ", name=" + name + ", ppu=" + ppu + ", batters=" + batters
				+ ", topping=" + topping + "]";
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPpu() {
		return ppu;
	}

	public void setPpu(double ppu) {
		this.ppu = ppu;
	}

	public Batters getBatters() {
		return batters;
	}

	public void setBatters(Batters batters) {
		this.batters = batters;
	}

	public List<Topping> getTopping() {
		return topping;
	}

	public void setTopping(List<Topping> topping) {
		this.topping = topping;
	}
}
