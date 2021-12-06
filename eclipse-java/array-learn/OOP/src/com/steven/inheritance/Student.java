package com.steven.inheritance;

public class Student extends Person{
	
	
	String major;
	
	public Student() {
		
	}
	
	public Student(String name , int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	

	public void learn() {
		System.out.print("learn......");
	
	}


}