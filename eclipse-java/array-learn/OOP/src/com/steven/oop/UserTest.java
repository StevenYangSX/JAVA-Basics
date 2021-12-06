package com.steven.oop;
/*
 * 属性 vs 局部变量
 * 1. 相同点
 * 		 （1）格式一样
 * 
 * 
 * 
 * 2.不同点
 * 		（1）声明的位置的不同
 * 			属性：定义在类的{}中
 * 			局部变量：声明在方法内，方法形参，代码块内，构造器形参，构造器内部变量	
 */
public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	class User {
		String name;
		int age;
		boolean isMale;
		
		public void talk(String language) {    //形参 
			System.out.print("我们使用"+ language);
		}
		
		public void eat() {
			String food = "pizza";    //局部变量
			System.out.println("喜欢吃"+food);
		}
	}

}
