package com.qf.a_test;

public class Demo15 {
	public static void main(String[] args) {
		int[] arr = {3,4,2,5};//目标数组
		int minIndex = 0;//用来接收最小值的下标
		/**
		 * i=1 1<4 true
		 * 		if (arr[minIndex] > arr[i])
		 * 		if (arr[0] >arr[1])
		 * 		if (3 > 4) false 
		 * 		minIndex = 0
		 * 		i++
		 * i=2 2<4 true
		 * 		if (arr[minIndex] > arr[i])
		 * 		if (arr[0] > arr[2])
		 * 		if (3 > 2) true 
		 * 		minIndex = 2
		 * 		i++
		 * i=3 3<4 true
		 * 		if (arr[minIndex] > arr[i])
		 * 		if (arr[2] > arr[3])
		 * 		if (2 > 5) false
		 * \	minIndex = 2
		 * 		i++
		 * i=4  4<4 false
		 * 	循环结束
		 * 
		 * minIndex = 2;
		 */
		for (int i = 1; i < arr.length; i++) {
			if (arr[minIndex] > arr[i]) {
				minIndex = i;
			}
		}
		System.out.println(minIndex);
		
		
	}
}
