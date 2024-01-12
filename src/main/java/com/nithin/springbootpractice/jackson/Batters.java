package com.nithin.springbootpractice.jackson;

import java.util.List;

public class Batters {
	private List<Batter> batter;

	public List<Batter> getBatter() {
		return batter;
	}

	public void setBatter(List<Batter> batter) {
		this.batter = batter;
	}

	@Override
	public String toString() {
		return "Batters [batter=" + batter + "]";
	}
}
