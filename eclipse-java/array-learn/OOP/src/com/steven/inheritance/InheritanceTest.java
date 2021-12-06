package com.steven.inheritance;

public class InheritanceTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setAge(21);
		p1.setName("Steven");
		p1.eat();
		
		
		Student p2 = new Student();
		p2.setAge(21);
		p2.setName("Steven");
		p2.learn();
		
		
	}

}



/*
			inheritance  rules     

a parent class can have multiple children classes 

a child class can only have ONE parent class 



*/