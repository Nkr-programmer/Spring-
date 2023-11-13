package com.springcore.javaconfig2;


public class Student { 
	
	private Subject sub;
	public Student(Subject sub) {
		super();
		this.sub = sub;
	}
	public void study()
	{
		sub.stud();
		System.out.println("Nowsdays");
	}

}
