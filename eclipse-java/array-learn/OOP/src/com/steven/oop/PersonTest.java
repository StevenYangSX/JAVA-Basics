package com.steven.oop;

public class PersonTest {
	public static void main(String[] args) {
		 //get an instance of Person class
		Person steven = new Person();
		
		//use instance methods
		steven.name = "Steven";
		steven.isMale = true;
		steven.age = 22;
		steven.eat();
		steven.sleep();
		steven.talk("Chinese!");
		
		
		Person jim = new Person();
		
		//use instance methods
		jim.name = "Jim";
		jim.isMale = true;
		jim.age = 21;
		jim.eat();
		jim.sleep();
		jim.talk(" English+Chinese!");
		
	}

}

 
class Person {
	
	// properties
	String name;
	int age;
	boolean isMale;
	
	//methods
	public void eat() {
		System.out.print("eat...");
	}
	public void sleep() {
		System.out.print("sleep...");
	}
	public void talk(String language) {
		System.out.print("I can speak" + language);
	}
}