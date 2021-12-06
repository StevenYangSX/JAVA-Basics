package com.steven.overloadMethods;

public class MethodArgsVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodArgsVarTest test = new MethodArgsVarTest();
		test.show("str1","str2","...");
	}
	
	
	//这个  ... 表示可变个数形参
	public void show(String ... strs) {
		
		System.out.print("show (String ... strs---->)"+ strs.toString());
	}

}
  	 