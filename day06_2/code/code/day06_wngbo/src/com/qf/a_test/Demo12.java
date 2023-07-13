package com.qf.a_test;

import java.util.Arrays;

public class Demo12 {
	public static void main(String[] args) {
		int[] arr = new int[6];//[0,0,0,0,0,0]
		setArr(arr);//对空的数组进行赋值
		System.out.println(Arrays.toString(arr));//[34, 35, 36, 37, 38, 39]
	}
	public static void setArr (int[] arr) {
		//对arr进行赋值
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 34 + i;
		}
	}
}
