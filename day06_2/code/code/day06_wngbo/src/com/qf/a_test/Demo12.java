package com.qf.a_test;

import java.util.Arrays;

public class Demo12 {
	public static void main(String[] args) {
		int[] arr = new int[6];//[0,0,0,0,0,0]
		setArr(arr);//�Կյ�������и�ֵ
		System.out.println(Arrays.toString(arr));//[34, 35, 36, 37, 38, 39]
	}
	public static void setArr (int[] arr) {
		//��arr���и�ֵ
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 34 + i;
		}
	}
}
