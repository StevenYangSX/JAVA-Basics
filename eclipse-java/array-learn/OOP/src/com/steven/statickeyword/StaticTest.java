package com.steven.statickeyword;

/*
 * static key word
 * 
 *   property  method  can be static
 *   
 *   3.  use static property: all objects share the static property. When some object changes the static property,
 *   	this specific  property of objects  will also be changed.......
 *   ``
 *   
 *   4.  use static method:
 *   	(1). load with class,     ===>    e.g      class.method()  is good 
 *   	(2). 
 *   
 *   
 *   
 */
public class StaticTest {

	public static void main(String[] args) {
		
		//static property will load when the class is loaded. not object
		Chinese.nation = "Chinese";
			
		//call static method
		Chinese.show();
		
		Chinese c1 = new Chinese();
		c1.name = "YaoMing";
		c1.age = 40;
		
		Chinese c2 = new Chinese();
		c2.name = "Zeze";
		c2.age = 30;
		
		//c1.nation = "CHN";
		
		System.out.print(c2.nation);
		
	}

}


class Chinese {
	String name;
	int age;
	static String nation;
	
	public static void show() {
		System.out.print("I'm a Chinese !!!!!!! ");
	}
}