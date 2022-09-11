package com.java;

public class Employee {
	//change-2 feature to branch feature2Rebase
	//change-1 feature to branch feature2Rebase
	//change-1 master
	// Test upsteam update 2
	//Getters and Setters
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	

}
