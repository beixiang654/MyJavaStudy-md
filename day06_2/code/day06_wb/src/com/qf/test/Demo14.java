package com.qf.test;

import java.util.Arrays;

public class Demo14 {

	public static void main(String[] args) {
		int[] arr = {9, 8, 7, 6};
		int[] arr2 = reverse(arr);
		System.out.println(Arrays.toString(arr2));
	}
	////{1,2,3,4}  =>  {4,3,2,1}
	public static int[] reverse (int[] arr) {
		int[] arr1 = new int[arr.length];//创建了一个空的数组 长度 和 arr一样的
		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
			arr1[j] = arr[i];
		}
		return arr1;
	}
}
