package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


public class Emp {

	private String name;
	private List<String> phones;
	private Set<String> add;
	private Map<String,String>course;
	private Properties token;

	public String getName() {
		return name;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(String name, List<String> phones, Set<String> add, Map<String, String> course, Properties token) {
	super();
	this.name = name;
	this.phones = phones;
	this.add = add;
	this.course = course;
	this.token = token;
}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAdd() {
		return add;
	}
	public void setAdd(Set<String> add) {
		this.add = add;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Properties getToken() {
		return token;
	}
	public void setToken(Properties token) {
		this.token = token;
	}

}
