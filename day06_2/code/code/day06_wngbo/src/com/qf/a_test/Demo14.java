package com.qf.a_test;

import java.util.Arrays;

public class Demo14 {
	public static void main(String[] args) {

		// 定义一个数组 目标数组
		int[] arr = {21, 829, 291};
		int[] arr1 = new int[arr.length];//创建了一个空的数组 和上面的数组的长度是一样de
		System.out.println(Arrays.toString(test(arr , arr1)));

	}
	// 需求: 使用方法将数组{1,2,3} 转为另外一个数组 {3,2,1}
	public static int[] test ( int[] arr, int[] arr1) {
		//arr1 是干嘛？颠倒之后的新的数组
				/**
				 * i=0,j=2  0<3 true 
				 * 		{21, 829, 291};
				 * 		arr1[2] = arr[0];    把21 赋值给下标为  2的位置的arr1数组
				 *      arr1=>  [0,0,21]   i++ j--
				 * i=1 j=1 1<3 true
				 * 		arr1[j] = arr[i];
				 * 		arr1[1] = arr[1];
				 * 		arr1[1] = 829;
				 * 		[0,0,21]===>[0, 829, 21] i++ j--
				 * i=2 j=0  2<3 true
				 * 		arr1[j] = arr[i];
				 * 		arr1[j] = arr[2];
				 * 		arr1[j] = 291;
				 * 		arr1[0] = 291;
				 * 		[0, 829, 21]==>[291, 829, 21] i++ j--
				 * i=3 j=-1 3<3false
				 * 		老的数组  从第一个拿出来数据
				 * 		塞到新的数组中 最后一个，挨个排着塞
				 */
				for (int i = 0,  j = arr.length - 1; i < arr.length; i++, j--) {
					arr1[j] = arr[i];
				}
				return arr1;
				
	}
}
