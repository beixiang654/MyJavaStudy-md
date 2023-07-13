package com.qf.a_test;

import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) {
		//完成一个方法，删除指定下标的元素，要求从删除位置开始，之后的元素整体前移。【难】
		
		
		//删除下标为2的
		//循环第一次  {1,2,4,4,5}   
		//循环第二次  {1,2,4,5,5}
		//{1,2,4,5,0}
		
		//删除下标为1De
		//循环第一次 {1,3,3,4,5}
		//循环第二次 {1,3,4,4,5}
		//循环第三次{1,3,4,5,5}
		//赋值  {1,3,4,5,0}
		int[] arr = {1,2,3,4,5};
		/**
		 * i=2 2< 4 true
		 * 		arr[2] = arr[3]
		 * 		arr[2] = 4==>{1,2,4,4,5} i++
		 * i=3 3<4 true
		 * 		arr[3] = arr[4]==>{1,2,4,5,5} i++
		 * i=4 4<4 false
		 * 
		 * arr[arr.length - 1] = 0;
		 * arr[4] = 0===>{1,2,4,5,0}
		 */
		for (int i = 2; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = 0;
		System.out.println(Arrays.toString(arr));
 		
	}
}
