package com.springcore.auto.wired;

public class Emp {

	private Address add;

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

	public Emp(Address address) {
		super();
		this.add = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
