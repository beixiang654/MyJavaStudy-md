package com.qf.a_test;

import java.util.Arrays;

public class Demo9 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		//以下是在赋值
		arr[0] = 67;
		arr[1] = 78;
		arr[2] = 12;
		//arr[3] = 89;//ArrayIndexOutOfBoundsException
		System.out.println(arr);//内存地址
		System.out.println(Arrays.toString(arr));//[67, 78, 12]
	}
}
