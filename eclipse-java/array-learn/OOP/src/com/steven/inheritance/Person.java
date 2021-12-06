package com.steven.inheritance;

public class Person extends Creature {
	
	String name;
	int age;
	
	public Person() {
		
	}
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
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
	
	
	public void eat() {
		System.out.print("eat......");
	}
	public void sleep() {
		System.out.print("sleep......");
	}
	
}
