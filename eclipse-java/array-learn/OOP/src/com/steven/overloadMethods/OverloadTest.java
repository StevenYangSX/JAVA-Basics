package com.steven.overloadMethods;

/*
 * overloading function
 * 1. 定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同就可以
 * 2. 
 */

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void getSum(int i , int j) {
		System.out.print(i+j);
	}
	public void getSum(double d1, double d2) {
		System.out.print(d1+d2);
	}
	public void getSum(int i, String s) {
		System.out.print(i+s);
	}

}
