package com.springcore.auto.wired.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	
	private Address add;

	public Address getAdd() {
		return add;
	}
	@Autowired
	@Qualifier("add2")
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
