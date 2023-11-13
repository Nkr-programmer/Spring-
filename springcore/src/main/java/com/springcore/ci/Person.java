package com.springcore.ci;

import java.util.List;

public class Person {

	private String name;
	private int id;
	private List<String> phone;
	private Certi ob1;
	private Certi0 ob;
	

	public Person(String name, int id, List<String> phone, Certi ob1, Certi0 ob) {
		super();
		this.name = name;
		this.id = id;
		this.phone = phone;
		this.ob1 = ob1;
		this.ob=ob;
	}


	@Override
	public String toString() {
		return this.name+" : "+this.id+" :"+this.phone+" : "+this.ob1+" : "+this.ob;
	}
	
	

}
