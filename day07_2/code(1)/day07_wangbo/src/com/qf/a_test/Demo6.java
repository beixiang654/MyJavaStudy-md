package com.qf.a_test;

import java.util.Arrays;

public class Demo6 {
	public static void main(String[] args) {
		int[] arr = {1,2,3,2,4,2,5};
		findAll(arr, 3);
	}
	public static void findAll(int[] arr, int find) {
		
		int count = 0;//统计次数
		int[] indexes = new int[arr.length];//接收下标的数组
		
		for (int i = 0; i < arr.length; i++) {
			if(find == arr[i]) {
				indexes[count++] = i;
			}
		}
		int[] newIndexes = new int[count];
		for (int i = 0; i < newIndexes.length; i++) {
			newIndexes[i] = indexes[i];
		}
		System.out.println(Arrays.toString(newIndexes));
		
	}
}
