package com.qf.a_test;

import java.util.Arrays;

public class Demo8 {
	public static void main(String[] args) {
		//第二种声明方式   先声明空的数组然后再赋值
		int[] arr = new int[3];//声明了一个空的数组[0,0,0]
		System.out.println(Arrays.toString(arr));//[0, 0, 0]
		//添加数据，咋添加？ 通过下标进行添加
		//[0, 0, 0]
		// 0  1  2  下标一定是有顺序
		arr[0] = 89;//将89赋值给下标为 0位置的数据 [89, 0,0]
		System.out.println(Arrays.toString(arr));
		arr[1] = 76;
		System.out.println(Arrays.toString(arr));
		arr[2] = 26;
		System.out.println(Arrays.toString(arr));//[89, 76, 26]
		//arr[3] = 89;//ava.lang.ArrayIndexOutOfBoundsException: 3
		
		//第三种方式
		int[] arr1 = new int[] {8, 7, 6, 5};
		System.out.println(Arrays.toString(arr1));
		
	}
}
