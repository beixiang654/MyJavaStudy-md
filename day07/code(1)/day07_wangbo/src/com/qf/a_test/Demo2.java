package com.qf.a_test;

public class Demo2 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,67, 12,45};
		findMaxIndexInArray(arr);
	}
	public static void findMaxIndexInArray (int[] arr) {
		
		int maxIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		System.out.println(maxIndex);
	}
}
