package org.sbelei.domain;

import java.util.List;

public class Organizarion {
	
	private String address;
	private String name;
	private List<Person> employees;
	private List<Person> managers;
	private List<Organizarion> customers;
	private List<Person> smallCustomers;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Person> employees) {
		this.employees = employees;
	}
	public List<Person> getManagers() {
		return managers;
	}
	public void setManagers(List<Person> managers) {
		this.managers = managers;
	}
	public List<Organizarion> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Organizarion> customers) {
		this.customers = customers;
	}
	public List<Person> getSmallCustomers() {
		return smallCustomers;
	}
	public void setSmallCustomers(List<Person> smallCustomers) {
		this.smallCustomers = smallCustomers;
	}

}
