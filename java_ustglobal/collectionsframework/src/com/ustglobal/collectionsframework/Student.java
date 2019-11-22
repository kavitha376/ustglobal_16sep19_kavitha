package com.ustglobal.collectionsframework;

public class Student {

	int id;
	String name;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	double percentage;
	public Student(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	

}
