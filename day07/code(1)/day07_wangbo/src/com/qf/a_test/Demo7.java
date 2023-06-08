package com.qf.a_test;

import java.util.Arrays;

public class Demo7 {
	public static void main(String[] args) {
		//5. 完成一个方法，替换掉数组中所有元素为0的元素，替换为指定元素  [1,2,3,0,0,0]
		int[] arr = {1,2,3,0,0,0,0};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				arr[i] = 250;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
