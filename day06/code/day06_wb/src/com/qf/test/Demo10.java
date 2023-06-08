package com.qf.test;

public class Demo10 {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		printArr(arr1);
	}
	//方法 的参数  int  a ,   String str   , int[] arr;
	public static void printArr (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	//在main主函数中 声明一个数组变量  这个数组有值，  然后通过方法 printArr 将数组的值(arr1)传递
	//给形参(arr) ,然后在方法中 将arr通过for循环进行遍历
}
