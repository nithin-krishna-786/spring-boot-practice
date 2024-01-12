package com.nithin.springbootpractice.jackson;

import java.util.List;

public class RequestModel {
	private boolean proMember;
	private List<Program> programs;
	private List<String> coupons;

	public boolean isProMember() {
		return proMember;
	}

	public void setProMember(boolean proMember) {
		this.proMember = proMember;
	}

	public List<Program> getPrograms() {
		return programs;
	}

	public void setPrograms(List<Program> programs) {
		this.programs = programs;
	}

	public List<String> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<String> coupons) {
		this.coupons = coupons;
	}

	public RequestModel(boolean proMember, List<Program> programs, List<String> coupons) {
		super();
		this.proMember = proMember;
		this.programs = programs;
		this.coupons = coupons;
	}

	public RequestModel() {
		super();
	}

	@Override
	public String toString() {
		return "RequestModel [proMember=" + proMember + ", programs=" + programs + ", coupons=" + coupons + "]";
	}

}
