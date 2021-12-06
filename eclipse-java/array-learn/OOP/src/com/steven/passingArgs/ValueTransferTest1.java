package com.steven.passingArgs;


//方法的形参的传递机制， 数值传递 
// 1. 形参：方法定义的时候，声明的小括号内的参数   -----parameter
// 2. 实参：方法调用的时候，方法内实际的传递的参数/数据   ------argument
//   parameter ： 和 argument，形参和实参
//  3.  传递的机制：
/*
 * 如果参数 是 基本数据类型，arguments will passing real data to the method
 * but if you pass reference of variables, it will work.
 */



public class ValueTransferTest1 {
	public static void main(String[] args) { 
		
		//swap two values
		int m  = 10;
		int n  = 20;
		System.out.println( "m = "+m+",n = "+n);
//		int temp = m ;
//		m = n;
//		n = temp;
		
		ValueTransferTest1 test1 = new ValueTransferTest1();
		test1.swap(m,n);
		System.out.println( "m = "+m+",n = "+n);
	}
	
	
	
	public void swap (int m , int n ) {
		int temp = m ;
		m = n;
		n = temp;
	}
}
