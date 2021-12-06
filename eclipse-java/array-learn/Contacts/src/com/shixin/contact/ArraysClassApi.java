package com.shixin.contact;

import java.util.Arrays;

public class ArraysClassApi {
	public static void main(String[] args) {
		//1. boolean equals
		int[] arr1 = new int[] {1,2,3,4};
		int[] arr2 = new int[] {1,3,4,5};
		boolean isEquals = Arrays.equals(arr1, arr2);
		System.out.print(isEquals);
		//2. String toString , output array..no need to write for loop ourselves.
		System.out.print(Arrays.toString(arr1));
		//3. fill up array
		Arrays.fill(arr1, 10);
		//4. sort an array
		Arrays.sort(arr2);
		//5. int binarySearch(int[]a, int key), retrun index?
		Arrays.binarySearch(arr2, 5);
	}
}
