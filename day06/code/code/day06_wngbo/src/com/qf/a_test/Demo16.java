package com.qf.a_test;

public class Demo16 {
	public static void main(String[] args) {
		int[] arr = {3,4,1,2};
		minIndex(arr);
	}
	public static void minIndex (int[] arr) {
		
		//要求 ：  写执行流程
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		System.out.println( minIndex);
	}
}
