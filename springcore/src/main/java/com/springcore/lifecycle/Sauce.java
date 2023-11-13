package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Sauce {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Sauce() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sauce [price=" + price + "]";
	}
	@PostConstruct
	public void init()
	{
		System.out.println("inside sauce : init method");
	}
	@PreDestroy
	public void destroy() 
	{
		System.out.println("inside sauce: destroy method");
	}

}
