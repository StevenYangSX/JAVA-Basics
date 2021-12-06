package com.shixin.contact;

public class ArrayLearn {

	public static void main(String[] args) {
		/*
		 * 1d array
		 * 1. 声明和初始化
		 * 2. 掉用元素
		 * 3. 获取长度
		 * 4. 遍历
		 * 5. 默认初始化值
		 * 6. 内存解析
		 */
		int num;
		num = 10;
		int id = 10001;
		int[] ids;// 声明
		ids = new int[] { 1001, 1002, 1003, 1004 };// initialize 1 ,static initialization
		String[] names = new String[5];// initialize 2, dynamic
		// 2. get elements from array
		names[0] = "steven";
		names[1] = "tim";
		names[2] = "TTT";
		names[3] = "Jya";
		names[4] = "Zed";

		// length of array
		int arrLength = names.length;
		System.out.print(arrLength);
		// iterate of array
		for (int i = 0; i < arrLength; i++) {
			System.out.print(names[i]);
		}

	}
}
