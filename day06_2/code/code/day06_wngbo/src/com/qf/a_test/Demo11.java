package com.qf.a_test;

public class Demo11 {
	public static void main(String[] args) {
		int[] sbs = {12,3,4,5};
		int[] arr = {1,9,12,89};
		printArr(sbs,arr);//arr 实参
	}
	public static void  printArr (int[] arr, int[] arr1) {//arr 是数组的变量 形参
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
