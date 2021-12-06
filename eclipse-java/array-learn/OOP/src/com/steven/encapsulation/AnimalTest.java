package com.steven.encapsulation;


/*
 * key word :   private . nothing . protected.  public  
 * 
 * private :  only use-able in a class
 * 
 * default(nothing) :  only use-able in a class or a package 
 * 
 * protected: accessible in  class or the same package or other package's class
 * 
 * public : every where in the project
 */
public class AnimalTest {

	public static void main(String[] args) {
		Animal a = new Animal();
		//a.name = "zeze";
		//a.age = 4;
		//a.legs = 4;
		a.show();
		
		a.setLegs(-6);	
		a.show();
	}

}


class Animal {
	private String name;
	private int age;
	private int legs;
	
	
	public void setLegs(int l) {
		if(l>=0 && l%2 == 0)
			legs = l;
		else
			legs = 0;
	}
	
	public void eat() {
		System.out.println("eating .......");
	}
	
	public void show() {
		System.out.println("name = "+ name +", age = "+age+", legs = "+legs);
	}
}