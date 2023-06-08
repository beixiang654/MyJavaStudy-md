package com.qf.a_test;

import java.util.Arrays;

public class Demo11 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 6, 8,10, 0 };
		add(arr, 3, 500);
	}

	public static void add(int[] arr, int index, int number) {
		

		for (int i = arr.length - 1; i > index; i--) {
			arr[i] = arr[i - 1];
		}
		arr[index] = number;
		System.out.println(Arrays.toString(arr));
	}
}
