package com.qf.a_test;

import java.util.Arrays;

public class Demo13 {
	public static void main(String[] args) {
		// 找出数组中最小的元素，放到下标为0的位置 交换一下
		int[] arr = { 7, 9, 3, 11 };
		// {3, 9, 7,11}
		int minIndex = 0;
		/**
		 * 自己写注释
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		// 以上循环在求最小值的索引下标！！！
		//System.out.println(minIndex);
		// {3,9,3,11}
		// 咋交换 将下标为2De数据给下标为0 的位置， 下标为0的位置的数据给下标为2位置
		// 中间变量
		int temp = arr[minIndex];// 将3 赋值给一个变量 temp
		arr[minIndex] = arr[0];// {7, 9, 7, 11}
		arr[0] = temp;// {3, 9, 7, 11}
		System.out.println(Arrays.toString(arr));// [3, 9, 7, 11]
		// 找最小值的下标。然后通过下标进行交换
		//然后接下来找 [9, 7, 11]的最小值的下标 然后和下标为1De地方进行交换
		int minIndex1 = 1;//下标为0De已经处理过了,所以从1开始
		for (int i = 2; i < arr.length; i++) {
			if (arr[minIndex1] > arr[i]) {
				minIndex1 = i;
			}
		}
		System.out.println(minIndex1);
		//开始交换
		int temp1 = arr[minIndex1];//7给temp1
		arr[minIndex1] = arr[1];//{3,9,9,11}
		arr[1] = temp1;//{3, 7, 9, 11}
		
		
		
	}
}
